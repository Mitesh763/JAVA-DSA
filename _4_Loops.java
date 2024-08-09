/**
 * LOOP:- 
 * for
 * while
 * Do-while
*/

import java.util.Scanner;

public class _4_Loops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // FOR Loop
        // for(int i= 0; i<10 ; i++){
        //     System.out.println(9 + " * " + (i+1) + " = " + 9*(i+1));
        // }

        // // while loop
        // int i=0;
        // while(i<10){
        //     System.out.println(9 + " * " + (i+1) + " = " + 9*(i+1));
        //     i++;
        // }

        // // do-while
        // int j=0;
        // do { 
        //     System.out.println(9 + " * " + (j+1) + " = " + 9*(j+1));
        //     j++;
        // } while (j<10);

        // //  TASK-1 :- sum of first n natural number
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        // int sum= 0;
        // for(int k = 1 ; k <= n ;k++){
        //     sum += k;
        // }
        // System.out.println(sum);

        // TASK-2 :- TAble of number
        for (int l = 1; l <= 10; l++) {
            System.out.println(n + " * " + l + " = " + n*l);
        }
    }
}
