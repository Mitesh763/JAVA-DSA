/**
 * String Builder
 */

 import java.util.*;

public class _13_StringBuilder {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Mitesh");
        System.out.print(sb);

        // replace
        sb.setCharAt(0, 'R');
        System.out.println(sb);

        // insert
        sb.insert(1,'v');
        System.out.println(sb);

        // delete
        sb.delete(1,2);
        System.out.println(sb);

        // append
        sb.append('v');
        sb.append('a');
        sb.append('g');
        sb.append('h');
        System.out.println(sb);

        // reverse string
        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back =sb.length() - 1 -i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.print(sb);

    }
}
