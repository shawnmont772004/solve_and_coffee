class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class IBT {

    public TreeNode invert(TreeNode t) {
        if (t == null) {
            return t;
        }
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;

        invert(t.left);
        invert(t.right);

        return t;
    }

    public void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }

    }

    public static void main(String[] args) {
        IBT i = new IBT();
        TreeNode t = new TreeNode(8);
        t.left = new TreeNode(4);
        t.left.left = new TreeNode(1);
        t.left.right = new TreeNode(6);
        t.right = new TreeNode(12);
        t.right.left = new TreeNode(9);
        t.right.right = new TreeNode(13);

        System.out.println("The original tree(Inorder):");
        i.printTree(t);
        i.invert(t);
        System.out.println("The inverted tree(Inorder):");
        i.printTree(t);
    }
}