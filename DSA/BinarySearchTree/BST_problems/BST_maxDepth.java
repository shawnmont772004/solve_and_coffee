package DSA.BinarySearchTree.BST_problems;

class Node {
    int key;
    Node right, left;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BST_maxDepth {

    public void maxDepth(Node root) {
        int max = maxRec(root);
        System.out.println("The maximum depth is:" + max);
    }

    public int maxRec(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lheight = maxRec(root.left);
            int rheight = maxRec(root.right);

            if (lheight > rheight) {
                return lheight + 1;
            } else {
                return rheight + 1;
            }
        }
    }

    public static void main(String[] args) {
        BST_maxDepth t = new BST_maxDepth();
        Node root = new Node(7);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left.left = new Node(1);
        root.right = new Node(9);
        root.right.left = new Node(8);
        root.right.right = new Node(13);

        t.maxDepth(root);

    }
}
