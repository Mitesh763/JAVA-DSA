import java.util.Scanner;

public class _4_delete_Nth_ele {
    Node head;
    private int size;

    _4_delete_Nth_ele() {
        size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    // add ele
    public void addEles(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    // print
    public void printEle() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("Null\n");
    }

    // find and delete Nth ele from last
    public void deleteEle(int n) {
        if (size < n) {
            System.out.println("You Entered bigger number then size!");
        } else if (n == size) {
            head = head.next;
        } else {
            size--;
            int nDFS1 = (size - n) + 1;
            System.out.println(nDFS1);
            Node currNode = head;
            Node previNode = head.next;
            for (int i = 0; i < nDFS1 - 1; i++) {
                currNode = currNode.next;
                previNode = previNode.next;
            }
            currNode.next = previNode.next;
            System.out.println(currNode.data);
            System.out.println(previNode.data);
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        _4_delete_Nth_ele list = new _4_delete_Nth_ele();
        list.addEles(10);
        list.addEles(12);
        list.addEles(5);
        list.addEles(58);
        list.addEles(4);
        list.addEles(44);
        list.printEle();
        int size = list.getSize();
        System.out.println("Size : " + list.getSize());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numver Which you want to delete : ");
        int n = sc.nextInt();
        list.deleteEle(n);

        list.printEle();
        // int size = list.getSize();
        System.out.println("Size : " + list.getSize());
        // int nDFS = size - n + 1;
    }
}
