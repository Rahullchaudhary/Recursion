import java.util.Scanner;

public class StackHeight {
    public static int  calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowN=calcPower(x,n-1);
        int Pow=x*xPowN;
        return Pow;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base number:");
        int x=sc.nextInt();
        System.out.println("Enter a  power number:");
        int n= sc.nextInt();
        System.out.println(calcPower(x,n));
    }
}
