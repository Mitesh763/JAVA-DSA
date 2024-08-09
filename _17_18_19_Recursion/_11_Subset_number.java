/**
 * print all subset of input number 
 * exmple n= 3
 *    321
 * 32
 * 31
 * 3
 * 21
 * 2
 * 1
 * 
 * 
 * TIME COMPLEXITY : O(2^n)
 */

package _17_18_19_Recursion;

public class _11_Subset_number {

    public static void produce_Subset(int n,String subset){
        if(n == 0){
            System.out.println( " " +subset);
            return;
        }
        produce_Subset(n-1, subset+n);
        produce_Subset(n-1, subset);
         
    }
    public static void main(String[] args){
        int n = 4;
        produce_Subset(n, "");
    }
}
