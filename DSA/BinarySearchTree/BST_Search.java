package DSA.BinarySearchTree;

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int x) {
        key = x;
        left = right = null;
    }
}

public class BST_Search {

    Node root;

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        } else if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
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

    public boolean search(int key) {
        return searchRec(root, key);
    }

    public boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        } else {
            if (key == root.key) {
                return true;
            } else if (key < root.key) {
                return searchRec(root.left, key);
            } else {
                return searchRec(root.right, key);
            }
        }
    }

    public static void main(String[] args) {

        BST_Search b = new BST_Search();
        b.insert(7);
        b.insert(2);
        b.insert(1);
        b.insert(9);
        b.insert(11);

        b.inorder();
        System.out.println();
        System.out.println("Enter the key element to be searched:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean status = b.search(key);
        if (status == true) {
            System.out.println("key element found in BST");
        } else {
            System.out.println("key element not found in BST");
        }

    }
}
