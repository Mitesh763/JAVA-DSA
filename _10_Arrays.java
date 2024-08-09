
import java.util.*;

class _10_Arrays{
    public static void main(String[] args) {

        //1
        // int[] marks = new int[5];

        // 2
        // int age[];
        // age = new int[1];

        // 3
        // String[] names = {"jaypal","Dhruv"};

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Size of array :");
        int size = sc.nextInt();
        int num[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter numbers of array :");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter value which is search: ");
        int search = sc.nextInt();


        int index = 0;
        for(int i = 0; i < size; i++){
            if(search == num[i]){
                index = i;
                break;
            }else{
            }
        }
        if(index == 0){
            System.out.print("Search not found!");
        }else{
            System.out.print("Index of searched value : " + index);
        }
    }
}