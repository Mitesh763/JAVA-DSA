/**
 * 
 * Implements STACK using LinkedList
 * --Operation - PUSH, POP, PEEK
 * 
 * 
 */

class _1_Using_LL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isEmpty() {
        return head == null;
    }

    // PUSH operation
    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // POP operation
    public static boolean pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return false;
        }
        head = head.next;
        return true;
    }

    // PEEk operation
    public static void peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        _1_Using_LL stack = new _1_Using_LL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        boolean pop;
        do {
            stack.peek();
            pop = stack.pop();
        } while (pop);
    }
}