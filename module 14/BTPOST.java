import java.util.LinkedList;
import java.util.Queue;
// Binary Tree implementation with Postorder Traversal
class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BTPOST {
    Node root;

    // Postorder Traversal: Left -> Right -> Root
    void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }

        // Traverse left subtree
        postorderTraversal(node.left);

        // Traverse right subtree
        postorderTraversal(node.right);

        // Visit root
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        BTPOST tree = new BTPOST();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Postorder Traversal of Binary Tree:");
        tree.postorderTraversal(tree.root);
    }
}
