package _26_LinkedList;

public class _3_Reverse_list {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // add
    public void addEle(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL\n");
    }

    // reverse
    public void reverseUsingIterative(){
        if(head == null || head.next == null){
            return;
        }
        Node previNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = previNode;

            // update
            previNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = previNode;
    }

    // using recursive
    public Node reverseRecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args){
        _3_Reverse_list list = new _3_Reverse_list();
        list.addEle(5);
        list.addEle(30);
        list.addEle(56);
        list.addEle(2);

        list.printList();
        // list.reverseUsingIterative();
        list.printList();

        list.head = list.reverseRecursion(list.head);
        list.printList();
    }
}
