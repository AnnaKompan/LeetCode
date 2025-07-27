// Compile first: javac DeepestLeavesSum.java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class DeepestLeavesSum {
    static int maxHeight = 0;
    static int maxSum = 0;

    public static int deepestSum(TreeNode root) {
        maxHeight = 0;
        maxSum = 0;
        dfs(root, 0);
        return maxSum;
    }

    public static void dfs(TreeNode node, int height) {
        if (node == null) {
            return;
        }

        height++;

        if (maxHeight < height) {
            maxHeight = height;
            maxSum = node.val;
        } else if (maxHeight == height) {
            maxSum += node.val;
        }

        dfs(node.left, height);
        dfs(node.right, height);
    }
    public static void main(String[] args) {
        TreeNode root= new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        
        int sum = deepestSum(root);
        System.out.println("Deepest leaves sum is: " + sum);
    }
}
