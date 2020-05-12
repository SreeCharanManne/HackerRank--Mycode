/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer>a=new ArrayList<Integer>();
        inorder(root,a);
        TreeNode b=new TreeNode(0),c=b;
        for(int v:a){
            c.right=new TreeNode(v);
            c=c.right;
        }
        return b.right;
    }
    public void inorder(TreeNode root,List<Integer>val){
        if(root==null)return ;
        inorder(root.left,val);
        val.add(root.val);
        inorder(root.right,val);
    }
}
