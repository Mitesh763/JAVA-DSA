
/** 
 *  OUTPUT
 * variables
 * datatypes
 * input
*/

import java.util.Scanner;

class _1_2_Intro {
    public static void main(String[] args) {
        // output
        System.out.println("hello");

        // variables
        int a = 10;
        int b = 5;
        int sum = (a * b) / (a - b);
        System.out.println(sum);

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println(num);
    }
}