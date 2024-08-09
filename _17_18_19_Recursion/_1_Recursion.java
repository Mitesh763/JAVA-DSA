package _17_18_19_Recursion;

public class _1_Recursion {

    // 1. sum of n natural number
    public static void printSum(int i, int n, int sum){
        if(i == n){
            System.out.print(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n , sum);
    }

    // 2. factorial
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact =  n * factorial(n-1);
        return fact;
    }

    // 3. Fibonacci
    public static void fibonaci(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(" " + c);
        fibonaci(b, c, n-1);
    }

    // 4. X^n
    public static int calXPowN(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = calXPowN(x, n-1);
        int xPownm = x * xPownm1;
        return xPownm;
    }


    // 5. reverse string
    public static void reverseStr(String str , int idx){
        if(idx == 0 ){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseStr(str,idx-1);
    } 


    // 6. First and Last occurence of element
    public static int first = -1;
    public static int last = -1;
    public static void occurenceEle(String str, char ch ,int idx){
        if(idx == str.length()){
            System.out.print("\n" + first);
            System.out.print("\n" + last);
            return; 
        }
        Character currentChar = str.charAt(idx);
        if(currentChar == ch){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        occurenceEle(str, ch, idx+1);
    }


    // 7. strickly increasible sorted array
    // TC = O(n)
    public static boolean stricklySort(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return stricklySort(arr, idx+1);
    }
    public static void main(String[] args){
        
        // 1.
        printSum(1,5,0);

        // 2.
         int fact = factorial(5);
        System.out.print("Factorial: " + fact);

        // 3.
        int a =0, b=1;
        System.out.print(a);
        System.out.print(" " + b);
        int n =7;
        fibonaci(a,b,n-2);

        // 4.
        int xpowN = calXPowN(2, 5);
        System.out.print(xpowN);

        // 5.
        String str = "Mitesh";
        reverseStr(str, str.length()-1);

        // 6. 
        String str2 = "adjhfduhaaauyayaaaf";
        occurenceEle(str2, 'a', 0);

        // 7.
        int arr[] = {1,2,3,4,5,6};
        boolean sorted = stricklySort(arr, 0);
        if(sorted){
            System.out.print("Strickly sorted");
        }else{
            System.out.print(" not Strickly sorted");
        }
    }
}
