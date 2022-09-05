public class floorTiles {
    public static int countTiles(int n,int m){
        if(n==m){
            return 2;

        }
        if(n<m){
            return 1;
        }

        //vertically
        int verticalPlacements = countTiles(n-m,m);
        //horizontal
        int horizontalPlacements=countTiles(n-1,m);
        return verticalPlacements+horizontalPlacements;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        System.out.println(countTiles(n,m));
    }
}
