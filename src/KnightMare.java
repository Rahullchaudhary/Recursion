import java.util.Scanner;

public class KnightMare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[n][n];
        printKnightTour(arr,r,c,1);
    }
    public static void printKnightTour(int[][] chess,int r,int c,int move){
        if(r<0||c<0||r>=chess.length||c>= chess.length||chess[r][c]>0){
            return;
        }
        else if(move==chess.length* chess.length){
            chess[r][c]=move;
        }
        chess[r][c]=move;
        printKnightTour(chess,r-2,c+1,move+1);
        printKnightTour(chess,r-1,c+2,move+1);
        printKnightTour(chess,r+1,c+2,move+1);
        printKnightTour(chess,r+2,c+1,move+1);
        printKnightTour(chess,r+2,c-1,move+1);
        printKnightTour(chess,r+1,c-2,move+1);
        printKnightTour(chess,r-1,c-2,move+1);
        printKnightTour(chess,r-2,c-1,move+1);
        chess[r][c]=0;
    }
    public static void displayBoard(int[][] chess){
        for (int i = 0; i < chess.length ; i++) {
            for (int j = 0; j < chess[0].length ; j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
