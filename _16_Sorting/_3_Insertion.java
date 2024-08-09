/**
 * Insertion Sort
 */


import java.util.Scanner;

public class _3_Insertion {
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
        for(int i=1; i < array.length;i++){  // for unsorted list
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        // After Sorting
        System.out.print("\nElement After Sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
