import java.util.Scanner;

public class PrintNumbers1 {
    public static void printNumbers(int n){
        if(n==6)
            return;
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        printNumbers(n);
    }
}
