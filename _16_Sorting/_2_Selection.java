/**
 * Selection Sort
 */

import java.util.Scanner;
public class _2_Selection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // input from user 
        System.out.print("Enter Number Of element : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("\nEnter elements : ");
        for(int i = 0; i < size; i++){
        array[i] = sc.nextInt();
        }

        //  Before sorting
        System.out.print("\nElement before Sorting: ");
        for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
        }

        // Sort
        for(int i=0; i < array.length-1;i++){
            int min = i;
            for(int j = i+1; j < array.length;j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            // swap
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        // After Sorting
        System.out.print("\nElement After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
