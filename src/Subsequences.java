public class Subsequences {
     public static void subsequenches(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

         char currChar=str.charAt(idx);
         subsequenches(str,idx+1,newString+currChar);
         subsequenches(str,idx+1,newString);
     }

    public static void main(String[] args) {
         String str="abc";
         subsequenches(str,0,"");
    }
}
