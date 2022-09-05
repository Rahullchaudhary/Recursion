import java.util.Scanner;

public class fibonacci {
    static int n1=0,n2=1;
    public static void fibo(int n1,int n2,int n ){
        if(n==0){
            return ;
        }
        int c=n1+n2;
        System.out.println(c);
        fibo(n2,c,n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        fibo(n1,n2,n-2);
    }
}
