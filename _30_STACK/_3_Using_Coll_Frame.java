
import java.util.Stack;

public class _3_Using_Coll_Frame {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // push
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.print("\n " + s);

        // pop
        s.pop();
        System.out.print("\n " + s);
        s.pop();
        System.out.print("\n " + s);

        // peek
        System.out.print("\n " + s.peek());
    }
}
