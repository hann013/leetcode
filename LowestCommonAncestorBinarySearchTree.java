// Lowest Common Ancestor of a Binary Search Tree

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
	// initial (slow) solution, without knowledge that in BSTs, left node < root < right node
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
    	if (root == null) {
    		return null;
    	}

    	TreeNode lca = lowestCommonAncestor1(root.left, p, q);

    	if (lca == null) {
	    	lca = lowestCommonAncestor1(root.right, p, q);
    	}

    	if (lca != null) {
    		return lca;
    	}

    	if (isDescendant(root, p) && isDescendant(root, q)) {
    		return root;
    	}

    	return null;
    }

    boolean isDescendant(TreeNode root, TreeNode n) {
    	if (root == null || n == null) {
    		return root == n;
    	}

    	return root == n || isDescendant(root.left, n) || isDescendant(root.right, n);
    } 

    // optimized solution
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
    	if (root == null) {
    		return null;
    	}

    	if (p.val < root.val && q.val < root.val) {
    		return lowestCommonAncestor2(root.left, p, q);
    	} 
    	if (p.val > root.val && q.val > root.val) {
    		return lowestCommonAncestor2(root.right, p, q);
    	}
    	
    	return root;
	}
}