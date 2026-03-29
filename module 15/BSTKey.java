import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BSTKey {
    Node root;

    // Insert a new node into BST
    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // Search for a key in BST
    boolean search(Node node, int key) {
        if (node == null) {
            return false; // key not found
        }
        if (node.data == key) {
            return true; // key found
        }
        if (key < node.data) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
    }

    public static void main(String[] args) {
        BSTKey bst = new BSTKey();

        // Insert elements
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);
        int key1 = 40;
        int key2 = 25;

        System.out.println("Searching for " + key1 + ": " + bst.search(bst.root, key1));
        System.out.println("Searching for " + key2 + ": " + bst.search(bst.root, key2));
    }
}
