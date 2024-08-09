package _26_LinkedList;

public class _1_Sigular_LL {
    Node head;
    private int size;

    _1_Sigular_LL(){
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add - first, last
    public void addFirst(String data) {

        Node newNode = new Node(data);
        // newNode.data = data;
        // newNode.next = null;
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at last
    public void addAtLast(String data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            newNode = head;
            return;
        }
        Node currNode = head;
        while( currNode.next != null ){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.next = null;
    }

    // print
    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode= currNode.next;
        }
        System.out.println("NULL");
    }
    

    // delete - First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
        }
        size--;
        head = head.next;
    }

    // delete - last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLastNode = head;
        Node LastNode = head.next;
        while (LastNode.next != null) { 
            LastNode = LastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

    }

    public  int getSize(){
        return  size;
    }

    public static void main(String args[]) {
        _1_Sigular_LL ll1 = new _1_Sigular_LL();
        ll1.addFirst("a");
        ll1.printList();

        ll1.addFirst("is");
        ll1.printList();

        ll1.addFirst("thiS");
        ll1.printList();

        ll1.addAtLast("hello");
        ll1.printList();

        ll1.deleteFirst();
        ll1.printList();

        ll1.addAtLast("and");
        ll1.printList();

        ll1.deleteLast();
        ll1.printList();

        ll1.deleteLast();
        ll1.printList();

        // size
        System.out.println("Size of list :  " + ll1.getSize());

        ll1.addAtLast("hey");
        ll1.printList();

        System.out.println("Size of list :  " + ll1.getSize());

    }
}
