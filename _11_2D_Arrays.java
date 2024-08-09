/**
 * 2D arrays
 */

import java.util.*;

public class _11_2D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int row = sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int cols = sc.nextInt();
        int[][] marks = new int[row][cols];

        System.out.print("Enter marks : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter Search element : ");
        int search = sc.nextInt();
    
        // System.out.print("Your marks : \n");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                if(marks[i][j] == search){
                    System.out.print("Found at : " + i + "," + j);
                }
                // System.out.print(i + ","+j + " : " + marks[i][j] + " ---- ");
            }
            System.out.println();
        }
    }
}
