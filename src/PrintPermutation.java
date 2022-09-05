import java.util.Scanner;

public class PrintPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printpermutation(str,"");
    }
    public static void printpermutation(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String q1part=ques.substring(0,i);
            String q2part=ques.substring(i+1);
            String roq=q1part+q2part;
            printpermutation(roq,ans+ch);
        }

    }
}
