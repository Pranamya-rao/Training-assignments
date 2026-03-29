// Check if a Binary Tree is a valid BST
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;
    boolean isValidBST(Node node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }
        if ((min != null && node.data <= min) || (max != null && node.data >= max)) {
            return false;
        }

        // Recursively check left and right subtrees
        return isValidBST(node.left, min, node.data) &&
               isValidBST(node.right, node.data, max);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Construct a valid BST
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(70);
        bst.root.left.left = new Node(20);
        bst.root.left.right = new Node(40);
        bst.root.right.left = new Node(60);
        bst.root.right.right = new Node(80);

        System.out.println("Is the tree a valid BST? " + bst.isValidBST(bst.root, null, null));

        // Construct an invalid BST (violates property)
        BinarySearchTree invalidTree = new BinarySearchTree();
        invalidTree.root = new Node(10);
        invalidTree.root.left = new Node(5);
        invalidTree.root.right = new Node(20);
        invalidTree.root.left.right = new Node(15); // ❌ violates BST rule

        System.out.println("Is the tree a valid BST? " + invalidTree.isValidBST(invalidTree.root, null, null));
    }
}
