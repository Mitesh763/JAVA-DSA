package _17_18_19_Recursion;
// package _17_18_19_Recursion;


public class _3_move_eleAT_LAST {

    // 8. Move all X to last of String
    // TC = O(n)
    public static String newString = "";
    public static void moveAllX(String str, int idx, int count){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
        }else{
            newString += currChar;
        }
        moveAllX(str, idx+1, count);
    }
    public static void main(String[] args) {
         String str = "axbcxxd";
         moveAllX(str,0,0);
    }
}
