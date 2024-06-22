package DSA.BinarySearchTree;

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BST_delete {

    Node root;

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        } else if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minVal(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    public int minVal(Node root) {
        int minval = root.key;
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }

    public static void main(String[] args) {
        BST_delete b = new BST_delete();
        Node root = new Node(7);
        root.left = new Node(5);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.right.right = new Node(10);

        System.out.println("The tree is:");
        b.inorder(root);
        System.out.println();

        System.out.println("Enter the key element to be deleted");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        b.delete(root, key);

        // System.out.println("Enter the key element to be deleted");
        // int key2 = sc.nextInt();
        // b.delete(root, key2);

        System.out.println("The tree is:");
        b.inorder(root);
        System.out.println();

    }
}
