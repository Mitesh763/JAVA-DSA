
/**
 * Traversal
 * 
 * 1. Pre order --> O(n)
 * 2. in order --> O(n)
 * 3. Past order --> O(n)
 * 4. Level order ( BFS ) --> O(n)
 */

import java.util.LinkedList;
import java.util.Queue;

public class _2_Traversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node builtTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
    }

    // Pre-Order Traversal
    public static void preOrder(Node root) {
        if (root == null) {
            // System.out.print("-1 "); // print -1 as null Node
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // In-Order Traversal
    public static void inOrder(Node root) {
        if (root == null) {
            // System.out.print("-1 "); // print -1 as null Node
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Post-Order Traversal
    public static void postOrder(Node root) {
        if (root == null) {
            // System.out.print("-1 "); // print -1 as null Node
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // level order Traversal
    public static void levelOrder(Node root) {
        if (root == null) {
            // System.out.print("-1 "); // print -1 as null Node
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            // currNode is null then goto next
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else { // currNode is not null then print
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.println(root.data);
        System.out.print("\nPre-Order Traversal :");
        preOrder(root);

        System.out.print("\nIn-Order Traversal :");
        inOrder(root);

        System.out.print("\nPost-Order Traversal :");
        postOrder(root);

        System.out.print("\nLevel-Order Traversal : \n");
        levelOrder(root);
    }
}
