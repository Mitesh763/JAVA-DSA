// package _8_Pracices_set;

import java.util.Scanner;

public class _1_GCD {

    // function
    public static int calculateGCD(int a, int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number1 : ");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1,num2);
        System.out.println("GCD OF two given input : " + gcd);
    }
}
