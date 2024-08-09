package _17_18_19_Recursion;

public class _10_tiles_placement {

    public static int countPlacement(int n , int m ){
        if( n== m ){
            return  2;
        }
        if( n < m){
            return 1;
        }
         
        // vertically
        int vertical = countPlacement(n- m , m);

        // horizontally
        int horizontal = countPlacement(n-1 , m);
        return vertical+horizontal;
    }
    public static void main(String[] args){
        int n = 4, m = 3;
        int tilesPlace = countPlacement(n,m);
        System.out.print("Total way to placement tiles 6: " + tilesPlace); 
    }
}
