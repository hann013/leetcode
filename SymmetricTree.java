// Symmetric Tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return checkSymmetry(root.left, root.right);
    }
    
    boolean checkSymmetry(TreeNode node1, TreeNode node2) {
        if (node1 == null || node2 == null) {
            return node1 == node2;
        }
        
        boolean isSymmetrical = node1.val == node2.val;
        return isSymmetrical && checkSymmetry(node1.left, node2.right) && checkSymmetry(node1.right, node2.left);
    }
}