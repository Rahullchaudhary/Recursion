import java.util.Scanner;

public class StackHeightLogn {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        if(n%2==0){
           return  calcpower(x,n/2)*calcpower(x,n/2);
        }
        else
        {
            return calcpower(x,n/2)*calcpower(x,n/2)*x;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base number:");
        int x=sc.nextInt();
        System.out.println("Enter a  power number:");
        int n= sc.nextInt();
        System.out.println(calcpower(x,n));
    }
}
