import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePathWithJump(1,1,n,m,"");
    }
    public static void printMazePathWithJump(int sr,int sc,int dr,int dc,String path){
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        for (int ms = 1; ms <=dc-sc ; ms++) {
            printMazePathWithJump(sr,sc+1,dr,dc,path+"h"+ms);
        }
        for (int ms = 1; ms <=dr-sr ; ms++) {
            printMazePathWithJump(sr+1,sc,dr,dc,path+"v"+ms);
        }
        for (int ms = 1; ms <=dc-sc &&ms<=dr-sr ; ms++) {
            printMazePathWithJump(sr+ms,sc+ms,dr,dc,path+"d"+ms);
        }
    }
}
