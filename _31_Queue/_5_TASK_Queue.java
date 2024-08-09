
/**
 * Implement QUEUE using 2 STACKS
 * 
 */

import java.util.Stack;

public class _5_TASK_Queue {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) {
            // 1. move all stack1 to stack2
            while (!isEmpty()) {
                s2.push(s1.pop());
            }

            // push into stack 1
            s1.push(data);

            // move all stack2 to stack1
            while (isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(3);
        q.add(2);
        q.add(6);
        q.add(1);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.print("  " + q.peek());
            q.remove();
        }
    }
}
