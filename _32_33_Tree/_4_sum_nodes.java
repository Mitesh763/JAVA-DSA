/**
 * Sum of all Node in given tree
 * TC : O(n)
 */

public class _4_sum_nodes {
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

    static class BinaryTree {
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
        // sum of number
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = sumOfNodes(root.left);
        int rightNode = sumOfNodes(root.right);

        return leftNode + rightNode + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        // System.out.print("Root element is : " + root.data);
        System.out.print("Sum of All Node in Tree : " + sumOfNodes(root));
    }
}
