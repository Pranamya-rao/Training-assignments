import java.util.LinkedList;
import java.util.Queue;

// Binary Tree implementation with Node Count
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BNodes {
    Node root;

    int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        // Count current node + left subtree + right subtree
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BNodes tree = new BNodes();

        // Create nodes
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Number of nodes in Binary Tree: " + tree.countNodes(tree.root));
    }
}
