/**
 * Conditional Statement
 */

import java.util.Scanner;

public class _3_Conditional_state {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if (age>18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

        // TASK-1 :- ODD / EVEN
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is EVEN");
        } else {
            System.out.println("Number is ODD");
        }

        // two number Comparison :- a & b
        System.out.print("Enter Number A: ");
        int a = sc.nextInt();
        System.out.print("Enter Number B: ");
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("Number are eqal");
        }else if(a>b){
            System.out.println("A is Grater number");
        }else{
            System.out.println("B is Grater number");
        }
        
        // SWITCH 
        System.out.print("Press Button (1 & 2 & 3) :");
        int BTN = sc.nextInt();
        switch(BTN){
            case 1: System.out.println("Hello!");
                    break;
            case 2: System.out.println("Namaste");
                    break;
            case 3: System.out.println("Bonjour");
                    break;
            default:System.out.println("Press Valid Button");
        }
    }
}
