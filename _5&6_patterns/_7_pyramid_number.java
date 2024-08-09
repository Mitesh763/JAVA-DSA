/**
 *    1
 *    12
 *    123
 *    1234
 *    12345
 *    123456
 */


public class _7_pyramid_number {
    public _7_pyramid_number() {
    }
 
    public static void main(String[] var0) {
       int n = 5;
 
       for(int i = 0; i < n; i++) {
          for(int j = 0; j <= i; j++) {
             System.out.print((j + 1) + " ");
          }
 
          System.out.println();
       }
 
    }
 }
 