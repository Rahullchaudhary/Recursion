public class MazePath {
    public static int  printMazePath(int i,int j,int n,int m){
        if(i==n ||j==n){
            return  0;
        }
        if(i==n-1 || j==m-1){
            return  1;
        }
        //move downwards
        int downwards = printMazePath(i+1,j,n,m);
        //move right
        int rightpaths = printMazePath(i,j+1,n,m);
        return downwards+rightpaths;
    }
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(printMazePath(0,0,n,m));
    }
}
