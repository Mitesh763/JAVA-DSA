import  java.util.Scanner;

public class _7_function_method {

    // sum
    public static int calculateSum(int a, int b){
        return a+b;
    }

    // factorial
    public  static void printFactorial(int num){
        if(num<0){
            System.err.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i = num; i >=1; i--) {
            fact = fact * i;
        }
        System.err.println(fact);
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SUM
        System.out.print("Enter value of A:");
        int a= sc.nextInt();
        System.out.print("Enter value of A:");
        int b= sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.print("Sum : " + sum);

        // FACTORIAL
        System.out.print("Enter Positive number : ");
        int num = sc.nextInt();
        printFactorial(num);
    }
}
