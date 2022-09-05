import java.util.Scanner;

public class ReverseString {
    public static void printReverse(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));
        printReverse(str,idx-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        printReverse(str,str.length()-1);

    }
}
