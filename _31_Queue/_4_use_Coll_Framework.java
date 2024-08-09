
import java.util.ArrayDeque;
import java.util.Queue;

public class _4_use_Coll_Framework {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new PriorityQueue<>();
        Queue<Integer> q = new ArrayDeque<>();
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
