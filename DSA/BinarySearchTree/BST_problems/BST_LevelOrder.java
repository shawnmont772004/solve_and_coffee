package DSA.BinarySearchTree.BST_problems;

class Node {
    int key;
    Node right, left;

    public Node(int key) {
        this.key = key;
        right = left = null;
    }
}

public class BST_LevelOrder {

    public void levelorder(Node root) {
        int height = levelheight(root);
        for (int i = 1; i <= height; i++) {
            System.out.print("Level " + i + " : ");
            printlevel(root, i);
            System.out.println();
        }
    }

    public int levelheight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int lh = levelheight(root.left);
            int rh = levelheight(root.right);

            if (lh > rh) {
                return (lh + 1);
            } else
                return (rh + 1);
        }

    }

    public void printlevel(Node root, int level) {
        if (root == null) {
            return;
        } else if (level == 1) {
            System.out.print(root.key + " ");
        } else {
            printlevel(root.left, level - 1);
            printlevel(root.right, level - 1);
        }

    }

    public static void main(String[] args) {
        BST_LevelOrder t = new BST_LevelOrder();
        Node root = new Node(7);
        root.left = new Node(4);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left.left = new Node(1);
        root.right = new Node(9);
        root.right.left = new Node(8);
        root.right.right = new Node(13);

        t.levelorder(root);

    }
}
