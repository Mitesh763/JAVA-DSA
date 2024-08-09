/**
 * Calculate total path from (0,0) to (n,m)
 * TIME COMPLEXITY : O(n*m)
 */

package _17_18_19_Recursion;

class _9_Total_path_matrix{
    public static int claculatePath(int i, int j, int n, int m){
        if( i == n || j == m ){
            return 0;
        }
        if( i == n-1 && j == m-1 ){
            return 1;
        }

        // down move
        int downMove = claculatePath(i+1, j, n, m);

        int rightMove = claculatePath(i, j+1, n, m);
        // right move
        return downMove+rightMove;

    }
    public static void main(String[] args) {
        int n= 4,m = 3;
        int path = claculatePath(0,0,n,m);
        System.out.println(path);
    }
}