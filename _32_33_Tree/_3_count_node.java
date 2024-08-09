/**
 * Total NOde of tree
 * TC : O(n)
 */

public class _3_count_node {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
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
    }

    // count nodes
    public static int countNode(Node root) {
        if (root == null) {
            // System.out.print(("\n Empty TREE \n"));
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        // System.out.println("Number of node in tree : " + root.data);
        System.out.println("Number of node in tree : " + countNode(root));
    }
}
