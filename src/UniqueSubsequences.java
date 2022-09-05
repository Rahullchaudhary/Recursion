import java.util.HashSet;

public class UniqueSubsequences {
    public static void subsequenches(String str, int idx, String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar=str.charAt(idx);
        subsequenches(str,idx+1,newString+currChar,set);
        subsequenches(str,idx+1,newString,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        subsequenches(str,0,"",set);
    }
}
