/**
 * PERMUTATION
 * TIME COMPLEXITY : O(n*n!)
 */

package _17_18_19_Recursion;

public class _8_Permutations {
    public static void printPermuation(String str,String permutationStr){
        if(str.length() == 0){
            System.out.println(permutationStr);
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermuation(newStr, permutationStr+currChar);            
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermuation(str, "");
    }
}
