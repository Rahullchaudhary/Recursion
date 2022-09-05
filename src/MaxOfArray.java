import java.util.Scanner;

public class MaxOfArray {
    //static int max=0;
    public static int maxOfArray(int[] arr,int idx){
        if(arr.length-1 ==idx){
            return arr[idx];
        }
       int  max=maxOfArray(arr,idx+1);
        if(max>arr[idx]){
            return max;

        }
        return arr[idx];

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter "+(i+1)+" Array Element:");
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }
}
