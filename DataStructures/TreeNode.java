package DataStructures;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    // multiple constructors for java is called constructor overloading
    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
