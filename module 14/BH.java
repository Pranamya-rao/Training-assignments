// Binary Tree implementation with Height Calculation
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BH {
    Node root;

    // Function to calculate height of binary tree
    int height(Node node) {
        if (node == null) {
            return 0;
        }

        // Recursively find height of left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Height of tree is max of left/right subtree heights + 1
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BH tree = new BH();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);

        System.out.println("Height of Binary Tree: " + tree.height(tree.root));
    }
}
