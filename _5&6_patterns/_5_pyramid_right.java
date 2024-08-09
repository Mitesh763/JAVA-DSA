/**
 *        *
 *       **
 *      ***
 *     ****
 *    *****
 */

public class _5_pyramid_right {
    public static void main(String[] args){
        int n =4;
        for (int i = 0; i < n; i++) {

            // inner loop for space
            for(int j = n-2; j > i-1 ;j--){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j= 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
