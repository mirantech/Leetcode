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
        post(tree1,p);
        post(tree2,q);
       if(tree1.equals(tree2)){
        return true;
       }
       return false;
    }
  public static void post(List<String> list, TreeNode root) {
    if (root == null) {
        list.add("null");
        return;
    }
    post(list, root.left);   // For inorder, this should come first
    post(list, root.right);  // Then this for inorder
    list.add(root.val + ""); // Add the root last for postorder
}
}