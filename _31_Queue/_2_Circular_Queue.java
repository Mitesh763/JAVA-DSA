public class _2_Circular_Queue {
    static class CirQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        CirQueue(int n) {
            this.arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            // first element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CirQueue cirQ = new CirQueue(5);
        cirQ.add(1);
        cirQ.add(2);
        cirQ.add(3);
        cirQ.add(4);
        cirQ.add(5);

        System.out.print("\nREMOVE : " + cirQ.remove());
        System.out.print("\nREMOVE : " + cirQ.remove());

        while (!cirQ.isEmpty()) {
            System.out.println("\nElement are: " + cirQ.peek());
            cirQ.remove();
        }

        System.out.print("\nREMOVE :  " + cirQ.remove());
    }
}
