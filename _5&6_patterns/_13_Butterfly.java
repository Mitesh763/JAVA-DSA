/**
 *              *      *
 *              **    **
 *              ***  ***
 *              ********
 *              ********
 *              ***  ***
 *              **    **
 *              *      *
 */

public class _13_Butterfly {
    public static void main(String[] args) {
        int n = 4;

        // Upper half 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            // System.out.print(space);
            for(int j= 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            int space = 2 * (n-i);
            // System.out.print(space);
            for(int j= 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
