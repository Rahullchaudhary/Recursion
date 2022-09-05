import java.util.Scanner;

public class LastIndex {
    public static int lastIndexOfArray(int[] arr,int idx,int x){
        if(arr.length==idx){
            return -1;
        }
        int liisa=lastIndexOfArray(arr,idx+1,x);
        if(liisa==-1){
            {
                if (arr[idx] == x) {
                    return idx;
                } else {
                    return -1;
                }
            }
        }
        else
        {
            return liisa;
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
        System.out.println(lastIndexOfArray(arr,0,a));
    }
}
