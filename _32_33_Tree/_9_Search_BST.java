/**
 * 
 * Search in BST
 * 
 * TC : O(H)
 * 
 */

public class _9_Search_BST {
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
        }
        root.right = insert(root.right, val);
        return root;
    }

    // Search
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            System.out.println("Key is : " + root.data);
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        if (search(root, 1)) {
            System.out.println("Key is Found!");
        } else {
            System.out.println("Key is NOT Found");
        }
    }
}
