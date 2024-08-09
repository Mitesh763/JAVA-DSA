public class _5_Palindrome {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            // this.next = next;
        }
    }

    // add
    public void addEle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    // check - palindrome

    // reverse second ha!lf
    Node reverseSecHalf(Node middleNext) {
        Node prev = null;
        Node currNode = middleNext;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }
        return prev;
    }

    // find middle node using turtlr-hare approach
    Node findMidddle(Node head) {
        Node Hare = head;
        Node Turtle = head;

        while (Hare.next != null && Hare.next.next != null) {
            Hare = Hare.next.next;
            Turtle = Turtle.next;
        }
        return Turtle;
    }

    public boolean checkPalindrome() {
        Node middle = findMidddle(head);
        Node secondHalf = reverseSecHalf(middle.next);
        Node currNode = head;
        while (secondHalf != null) {
            if (currNode.data != secondHalf.data) {
                return false;
            }
            currNode = currNode.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        _5_Palindrome list = new _5_Palindrome();
        list.addEle(30);
        list.addEle(23);
        list.addEle(14);
        // list.addEle(14);
        list.addEle(23);
        list.addEle(30);
        list.printList();

        // check palindrome
        boolean check = list.checkPalindrome();
        if (check) {
            System.out.println("\nList is Palindrome");
        } else {
            System.out.println("\nList is not Palindrome");
        }
    }
}
