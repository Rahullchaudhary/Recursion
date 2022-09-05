import java.util.Scanner;

public class spanOfArray {
    public static int spanOf_Array(int[] arr,int idx, int a){
        if(arr.length==idx){
            return -1;
        }
        if(a==arr[idx]){
            return idx;
        }
        else{
            int firstOccur=spanOf_Array(arr,idx+1,a);
            return firstOccur;
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n= s.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter "+(i+1)+" Array Element:");
            arr[i]=s.nextInt();
        }
        System.out.println("Enter a searching element:");
        int a=s.nextInt();
        System.out.println(spanOf_Array(arr,0,a));
    }
}
