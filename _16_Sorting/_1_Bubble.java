/**
 * Bubble Sort
 */

import java.util.*;
class _1_Bubble {
    public static void main(String[] args) {
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

        // Do sorting
        // long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // long afterTime = System.currentTimeMillis();

        // System.out.print("\nTime Complexity : " + (afterTime-beforeTime));
        //  After sorting
        System.out.print("\nElement After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}