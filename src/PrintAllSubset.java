import java.util.ArrayList;

public class PrintAllSubset {
    public static void Printsubset(ArrayList<Integer> subset){
        for (int i = 0; i <subset.size() ; i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            Printsubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        printSubset(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        printSubset(n-1,subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        printSubset(n,subset);
    }
}
