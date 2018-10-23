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
    List<Integer> largestVals;
    
    public List<Integer> largestValues(TreeNode root) {
        this.largestVals = new ArrayList<>();
        findLargestValues(root, 0);
        return this.largestVals;
    }
    
    public void findLargestValues(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        
        if (this.largestVals.size() == depth) {
            this.largestVals.add(node.val);
        } else if (this.largestVals.get(depth) < node.val) {
            this.largestVals.set(depth, node.val);            
        }
        
        findLargestValues(node.left, depth+1);
        findLargestValues(node.right, depth+1);
    }
}