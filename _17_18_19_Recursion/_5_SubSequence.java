/**
 * Find All subSeqence of given String 
 * Time Complexity : O(2^n)
 */
 
package _17_18_19_Recursion;

public class _5_SubSequence {
    public static void subSequence(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.print("\n"+newStr);
            return;
        }

        char currChar = str.charAt(idx);
        subSequence(str, idx+1, newStr+currChar); // char add into sub string
        subSequence(str, idx+1, newStr); // char not add into sub string
    }
    public static void main(String[] args) {
        String str = "abcd";
        subSequence(str,0,"");
    }
}
