// Maximum Depth of a Binary Tree

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
    public int maxDepth(TreeNode root) {
        if (root == null) {
        	return 0;
        }

        // add 1 for current node, plus the maximum depth of its children 
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}