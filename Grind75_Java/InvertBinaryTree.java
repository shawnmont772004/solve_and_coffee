class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class InvertBinaryTree {

    public TreeNode Invert(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        Invert(root.left);
        Invert(root.right);

        return root;

    }

    public void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(4);

        t.left = new TreeNode(2);
        t.left.left = new TreeNode(1);
        t.left.right = new TreeNode(3);

        t.right = new TreeNode(7);
        t.right.left = new TreeNode(6);
        t.right.right = new TreeNode(9);

        InvertBinaryTree ibt = new InvertBinaryTree();
        System.out.println("Original Tree (In-order):");
        ibt.printTree(t);
        System.out.println();

        ibt.Invert(t);

        System.out.println("Inverted binary Tree (In-order):");
        ibt.printTree(t);

    }
}
