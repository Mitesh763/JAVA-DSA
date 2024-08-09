/**
 * Remove all duplicate Elements
 * TC : O(n )
 */


package _17_18_19_Recursion;

public class _4_remove_duplicate {
    public static boolean[] map = new boolean[26];
    public static String newString = "";
    public static void removeDuplicate(String str,int idx){
        if(idx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicate(str, idx+1);
        }else{
            newString += currChar;
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "abbcddbacdcd";
        removeDuplicate(str,0);
    }
}
