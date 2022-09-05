import java.util.Scanner;

public class DisplayArray {
    public static void displayArray(int[] arr,int idx){
        if(arr.length==idx){
            return ;
        }
        System.out.println(arr[idx]);
        displayArray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter Array Element:");
            arr[i]=sc.nextInt();
        }
        displayArray(arr,0);
        System.out.println("Thank you:");
    }
}
