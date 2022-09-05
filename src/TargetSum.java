import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        targetSum(arr,0,"",0,tar);
    }
    public static void targetSum(int[] arr,int idx,String set,int sum,int tar){
        if(idx==arr.length){
            if(sum==tar){
                System.out.println(set);
            }
            return;
        }
        targetSum(arr,idx+1,set+arr[idx]+",",sum+arr[idx],tar);
        targetSum(arr,idx+1,set,sum,tar);
    }
}
