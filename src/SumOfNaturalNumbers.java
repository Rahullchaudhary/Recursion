import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void printsum(int i,int n,int sum){
        if(i==n){sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i+1,n,sum);
        //System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        printsum(1,n,0);
    }
}
