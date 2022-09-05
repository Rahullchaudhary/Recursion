import java.util.Scanner;

public class printMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        PrintMazePath(1,1,n,m,"");
    }
    public static void PrintMazePath(int sr,int sc,int dr,int dc,String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if(sc>dc ||sr>dr){
            return;
        }
        PrintMazePath( sr,sc+1,dr,dc,psf+"h");
        PrintMazePath(sr+1, sc,dr,dc,psf+"v");



    }
}
