public class _10_Deletion_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

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

    // inorder traversal
    public static void inOrder(Node root) {
        if (root == null) {
            // System.out.println("Empty Tree");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // deletion
    public static Node deletion(Node root, int key) {
        if (root.data > key) {
            root.left = deletion(root.left, key);
        } else if (root.data < key) {
            root.right = deletion(root.right, key);
        } else { // delete root
                 // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : one child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // case 3 : two child
            Node successor = inOrderSuccessor(root.right);
            root.data = successor.data;
            root.right = deletion(root.right, successor.data);
        }
        return root;
    }

    public static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.print("\nIn-order : ");
        inOrder(root);

        deletion(root, 3);
        System.out.print("\nIn-order : ");
        inOrder(root);

    }
}