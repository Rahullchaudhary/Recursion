import java.util.Scanner;

public class Factorial {
    public static int printfact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact =printfact(n-1);
        int fact_n=n*fact;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number:");
        int n=sc.nextInt();
        int m=printfact(n);
        System.out.println(m);
    }
}
