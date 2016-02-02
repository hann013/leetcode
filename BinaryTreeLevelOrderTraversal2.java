// Binary Tree Level Order Traversal II

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        levelOrderBottom(result, root, 1);
        return result;
    }
    
    void levelOrderBottom(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null) {
            return;
        }

        // initialize new list for current level if there isn't one already
        if (list.size() - level < 0) {
            list.add(0, new ArrayList<Integer>());
        }
        
        // order children
        levelOrderBottom(list, root.left, level+1);
        levelOrderBottom(list, root.right, level+1);

        // add current node to its corresponding list
        int index = list.size() - level;
        List<Integer> current = list.get(index);
        current.add(root.val);
        list.set(index, current);
    }
}