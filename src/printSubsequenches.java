import java.util.Scanner;

public class printSubsequenches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        PrintSubsequenches(str,"");
    }
    public static void PrintSubsequenches(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String roq=ques.substring(1);
        PrintSubsequenches(roq,ans+ch);
        PrintSubsequenches(roq,ans+"");
    }
}
