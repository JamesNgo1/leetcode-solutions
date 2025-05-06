import java.util.LinkedList;
import java.util.Queue;
import DataStructures.TreeNode;

public class Leetcode297 {

    public String serialize(TreeNode root) {
        // if root is empty or non existing
        if (root == null) {
            return "N";
        }

        // if valid binary tree , then perform a BFS

        StringBuilder result = new StringBuilder();

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode popNode = queue.poll();

                if (popNode == null) {
                    result.append("N");
                } else {
                    result.append(popNode.val);
                    queue.add(popNode.left);
                    queue.add(popNode.right);
                }

                result.append(",");
            }
        }

        return result.toString();
    }

    public TreeNode deserialize(String data) {

        String[] chars = data.split(",");

        // uses .equals as we are comparing strings
        if (chars[0].equals("N")) {
            return null; // essentially empty tree
        }

        // otherwise we have a valid tree that we need to deserialize
        TreeNode root = new TreeNode(Integer.parseInt(chars[0]));

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        int index = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!chars[index].equals("N")) {
                node.left = new TreeNode(Integer.parseInt(chars[index]));
                queue.add(node.left);
            }
            index++;

            // right
            if (!chars[index].equals("N")) {
                node.right = new TreeNode(Integer.parseInt(chars[index]));
                queue.add(node.right);
            }
            index++;
        }

        return root;

    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}