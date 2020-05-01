class Solution {
     int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         dfs(root);
        return max;
        
    }
    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftMax = dfs(node.left);
        int rightMax = dfs(node.right);

        int triangleSum = leftMax + node.val + rightMax;
        int leftSum = leftMax + node.val;
        int rightSum = rightMax + node.val;

        int maxAtNode = Math.max(node.val, Math.max(leftSum, rightSum));
        max = Math.max(max, Math.max(triangleSum, maxAtNode));

        return maxAtNode;
    }
}
