import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        ArrayList<String> paths=getMazePathWithJump(1,1,n,m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePathWithJump(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths=new ArrayList<>();
        //horizontal
        for (int ms = 1; ms <=dc-sc ; ms++) {
            ArrayList<String> hpaths=getMazePathWithJump(sr,sc+ms,dr,dc);
            for (String hpath:hpaths) {
                paths.add("h"+ms+hpath);
            }
        }
        //vertical
        for (int ms = 1; ms <=dr-sr ; ms++) {
            ArrayList<String> vpaths=getMazePathWithJump(sr+ms,sc,dr,dc);
            for (String vpath:vpaths) {
                paths.add("v"+ms+vpath);
            }
        }
        for (int ms = 1; ms <=dr-sr && ms<=dc-sc; ms++) {
            ArrayList<String> dpaths = getMazePathWithJump(sr + ms, sc+ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}
