/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int level = 0;
    int value = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValueHelper(root, 1);
        return value;
    }
    
    private void findBottomLeftValueHelper(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        
        if (level > this.level) {
            this.value = node.val;
            this.level = level;
        }
        
        findBottomLeftValueHelper(node.left, level+1);
        findBottomLeftValueHelper(node.right, level+1);
    }
}