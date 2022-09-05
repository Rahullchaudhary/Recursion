import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n,String src,String helper,String des){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+src+" to "+des );
            return ;
        }
        towerOfHanoi(n-1,src, des, helper);
        System.out.println("Transfer disk "+ n+ " from "+src+ " to "+ des);
        towerOfHanoi(n-1,helper,src,des);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        towerOfHanoi(n,"S","h","D");
    }
}
