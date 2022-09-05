import java.util.Scanner;

public class PrintIncrease {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=c.nextInt();
        printIncDec(n);
    }
    public static void printIncDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
}
