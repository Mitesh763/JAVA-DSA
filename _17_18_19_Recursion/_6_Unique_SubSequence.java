 /**
 * Find All unique subSeqence of given String 
 * Time Complexity : O(2^n)
 */
 
package _17_18_19_Recursion;

import java.util.HashSet;
public class _6_Unique_SubSequence {

    public static void subSequence(String str, int idx, String newStr,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.print("\n"+newStr);
                set.add(newStr);
                return;
            }    
        }

        char currChar = str.charAt(idx);
        subSequence(str, idx+1, newStr+currChar,set); // char add into sub string
        subSequence(str, idx+1, newStr,set); // char not add into sub string
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "782";
        subSequence(str,0,"",set);
    }
}

