public class tilingProblem {
    public static int solveTiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int horizontalTail = solveTiling(n-2);
        int verticalTail = solveTiling(n-1);
        int totalTiles = horizontalTail + verticalTail;

        return totalTiles;
    }
    
    public static void main(String args[]){
        int n = 4;
        int ans = solveTiling(n);
        System.out.println(ans);
    }
}
