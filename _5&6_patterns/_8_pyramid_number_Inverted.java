public class _8_pyramid_number_Inverted {
    public static void main(String[] args){
        int  n = 5;

        /**
         * 5 4 3 2 1
         * 5 4 3 2 
         * 5 4 3 
         * 5 4  
         * 5
         */
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = n-1 ; j >= i ;j--){
        //         System.out.print((j+1)  + " ");
        //     }
        //     System.out.println();
        // }
        

        /**
            * 1 2 3 4 5
            * 1 2 3 4 
            * 1 2 3 
            * 1 2 
            * 1
        */
        for(int i = n-1; i >= 0 ; i--){
            for(int j= 0; j <= i ; j++){
                System.out.print((j+1)  + " ");
        }
            System.out.println();
        }
    }
}
