// Binary Tree Level Order Traversal

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelOrder(result, root, 0);
        return result;
    }

    private void levelOrder(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }
        
        // Initialize the list for a level if there isn't one already
        if (level >= list.size()) {
            list.add(new ArrayList<Integer>());
        }
        
        // Traverse the right and then the left subtrees
        levelOrder(list, root.left, level+1);
        levelOrder(list, root.right, level+1);
        
        // Add the value of the current subtree
        List<Integer> current = list.get(level);
        current.add(root.val);
        list.set(level, current);            
    }
}