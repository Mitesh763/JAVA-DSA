public class _6_Diadmeter_with_two_approach {
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

    // built Tree
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

    // height of tree:
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        // System.out.print("\nleft Tree : " + leftHeight + " At " + root.data + "\n");
        // // print left height
        int rightHeight = heightOfTree(root.right);
        // System.out.print("\nright Tree : " + rightHeight + " At " + root.data +
        // "\n"); // print right height
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /////////// APPROACH - 1 [ TC:O(n^2) ] //////////////
    // diameter of tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        int daim = Math.max(Math.max(dia1, dia2), dia3);
        return daim;
    }

    /////////// APPROACH - 1 [ TC:O(n^2) ] //////////////
    public static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

    }

    public static TreeInfo diameeter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameeter2(root.left);
        TreeInfo right = diameeter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int dia1 = left.diam;
        int dia2 = right.diam;
        int dia3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(dia1, dia2), dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(nodes);
        System.out.print("\nHeight of Tree : " + heightOfTree(root) + "\n");
        System.out.print("\nDiameter of Tree approach -1 : " + diameter(root) + "\n");
        System.out.print("\nDiameter of Tree approach -2 : " + diameeter2(root).diam + "\n");
    }
}
