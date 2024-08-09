public class _6_loop_In_List {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    // Check wether has a loop?
    public boolean checkLoop() {
        if (head == null) {
            return false;
        }
        Node fast = head; // hare
        Node slow = head; // turtle

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        _6_loop_In_List list = new _6_loop_In_List();
        list.addEle(5);
        list.addEle(23);
        list.addEle(77);
        list.addEle(2);
        list.addEle(37);
        list.addEle(12);
        list.printList();

        // has a loop?
        boolean loop = list.checkLoop();
        if (loop) {
            System.out.println("\nLoop find in List");
        } else {
            System.out.println("\nThere is no Loop List");
        }
    }
}
