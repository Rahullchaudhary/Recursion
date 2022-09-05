import java.util.Scanner;

public class DispayReverseArray {
    public static void displayReverseArray(int[] arr,int idx){
        if(idx==0)
        {
            System.out.println(arr[0]);
            return ;
        }
        System.out.println(arr[idx]);
        displayReverseArray(arr,idx-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter array element:");
            arr[i]= sc.nextInt();
        }
        displayReverseArray(arr,n-1);
    }
}
