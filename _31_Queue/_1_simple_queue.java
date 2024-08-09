// package _31_Queue;

public class _1_simple_queue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue
        // O(1)
        public static void enQueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue - O(n)
        public static int deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty;");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek operation - O(n)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty;");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.deQueue();
        }
    }
}