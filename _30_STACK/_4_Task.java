import java.util.*;

public class _4_Task {

    // Task - 1:
    public static void stackPushBot(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        stackPushBot(data, s);
        s.push(top);
    }

    // Task - 2:
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        stackPushBot(top, s);
    }

    public static void main(String[] args) {
        /**
         * 7
         * TASK - 1
         * 
         * PerFOrm PUSH operation, with push ele on Bottom of the stack
         */
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s);
        // stackPushBot(4, s); // task-1
        reverse(s); // task - 2
        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
