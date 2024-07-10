package DSA.BinarySearchTree.BST_problems;

class Node {
    int key;
    Node right, left;

    public Node(int key) {
        this.key = key;
        right = left = null;
    }
}

public class BST_Invert {
    Node root;

    public Node invertTree(Node root) {

        if (root == null) {
            return root;
        }
        TreeNode temp;

        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;

    }

    public void inorder() {
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST_Invert i = new BST_Invert();
        Node root = new Node(7);
        root.left = new Node(5);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(10);
        i.inorder(root);
        i.invertTree(root);
        i.inorder(root);

    }
}
