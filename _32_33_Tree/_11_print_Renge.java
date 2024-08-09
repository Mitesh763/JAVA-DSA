public class _11_print_Renge {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // insert
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // renge
    public static void printRengeEle(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printRengeEle(root.left, X, Y);
            System.out.print(root.data + " ");
            printRengeEle(root.right, X, Y);
        } else if (root.data > X) {
            printRengeEle(root.left, X, Y);
        } else {
            printRengeEle(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.print("\nInorder Element : ");
        inorder(root);

        System.err.println("Renged element : ");
        printRengeEle(root, 6, 10);
    }
}
