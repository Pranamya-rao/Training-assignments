import java.util.LinkedList;
import java.util.Queue;

// Binary Tree implementation with Preorder Traversal
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BTPRE {
    Node root;

    // Preorder Traversal: Root -> Left -> Right
    void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Visit root
        System.out.print(node.data + " ");

        // Traverse left subtree
        preorderTraversal(node.left);

        // Traverse right subtree
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BTPRE tree = new BTPRE();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal of Binary Tree:");
        tree.preorderTraversal(tree.root);
    }
}
