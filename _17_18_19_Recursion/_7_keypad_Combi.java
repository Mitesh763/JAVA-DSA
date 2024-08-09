/**
 * print keypad combinations
 */
package _17_18_19_Recursion;
// package _17_18_19_Recursion;

public class _7_keypad_Combi {

    public static String[] keypad = {"." , "abc" , "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKeyCombination(String str,int idx, String combiStr){
        if(idx == str.length()){
            System.out.println(combiStr);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i < mapping.length();i++){
            printKeyCombination(str, idx+1, combiStr+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "123";
        printKeyCombination(str, 0, "");
    }
}
