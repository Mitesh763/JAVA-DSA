/**
 *        1 
 *        0 1 
 *        1 0 1 
 *        0 1 0 1 
 *        1 0 1 0 1 
 */


class _10_0_1_Triangle{
    public static void main(String[] args) {
      int n = 5; 
      for(int i = 0; i <= n; i++){
        for(int j = 0; j < i ; j++){
            if((i+j)%2 == 0){ //even
                System.out.print( 0 + " ");
            }else{  //  odd
                System.out.print(1 + " ");
            }
        }
        System.out.println();
      }  
    }
}