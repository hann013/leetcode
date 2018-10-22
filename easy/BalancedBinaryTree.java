// Balanced Binary Tree

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
    public boolean isBalanced(TreeNode root) {
        // empty tree
        if (root == null) {
            return true;
        }
        
        // check current node
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
            return false;
        }
        
        // check subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}