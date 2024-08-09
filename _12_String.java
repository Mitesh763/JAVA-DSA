
/**
 * String
 */

import java.util.*;

class _12_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // imput- output
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.print("Your name : " + name);

        // concat
        String s1 = "Mitesh";
        String s2 = "Vaghela";
        String s3 = s1.concat(s2);
        System.out.print(s3);

        // Length
        String s4 = "Vaghela Mitesh Rameshbhai.";
        System.out.print("Length : " + s4.length());

        // charAt
        String s5 = "Vaghela Mitesh Rameshbhai.";
        for (int i = 0; i < s5.length(); i++) {
            System.out.println(s5.charAt(i));
        }

        // comparison
        String s6 = "mitesh";
        String s7 = "mitesh";
        /**
         * s6 > s7 --> +ve value
         * s6 = s7 --> zero
         * s6 > s7 --> -ve value
         */
        if (s6.equals(s7)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // SubString
        String s8 = "Hello from my side!";
        System.out.println("SubString :  " + s8.substring(5));
    }
}