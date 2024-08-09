/**
 *       1
 *       2 3
 *       4 5 6
 *       7 8 9 10
 *       11 12 13 14 15
 */


public class _9_Floyd_Triangle {
 
    public static void main(String[] var0) {
       int n = 5;
       int c= 0;
 
       for(int i = 0; i < n; i++) {
          for(int j = 0; j <= i; j++) {
            c++;
             System.out.print(c+ " ");
          }
 
          System.out.println();
       }
 
    }
 
}
