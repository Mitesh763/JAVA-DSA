// package _8_Pracices_set;


import java.util.Scanner;

public class _2_Fibonaci {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int t1 = 0, t2 = 1;
        if(num == 0 ){
            System.out.print("Invalid Number");
        }
        else if( num == 1){
            System.out.print(t1);
        }else{
            System.out.print(t1 + " " + t2 + " ");
            for(int i = 2; i < num ; i++){
                int temp = t2;
                t2 = t1 + t2;
                t1 = temp;
                System.out.print(t2 + " ");
            }
        }
   } 
}
