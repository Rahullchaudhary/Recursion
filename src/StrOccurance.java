import java.util.Scanner;

public class StrOccurance {
     static int first=-1;
     static int last=-1;
    public static void lastOccurance(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else
                last=idx;
        }
        lastOccurance(str,idx+1,element);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a String:");
        //String str=sc.nextLine();
        String str="rahul";
        lastOccurance(str,0,'a');
    }
}
