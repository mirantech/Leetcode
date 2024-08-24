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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<String> tree1=new ArrayList<>();
        List<String> tree2=new ArrayList<>();
        pre(tree1,p);
        pre(tree2,q);
       if(tree1.equals(tree2)){
        return true;
       }
       return false;
    }
    public static void pre(List<String> list,TreeNode root){
        if(root==null){
            list.add("null");
            return;
        }
        list.add(root.val+"");
        pre(list,root.left);
        pre(list,root.right);
    }
}