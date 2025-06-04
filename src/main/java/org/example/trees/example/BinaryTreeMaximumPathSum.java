package org.example.trees.example;

public class BinaryTreeMaximumPathSum {

//    124. Binary Tree Maximum Path Sum
//    Hard
//
//    A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has
//    an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need
//    to pass through the root.
//
//    The path sum of a path is the sum of the node's values in the path.
//
//    Given the root of a binary tree, return the maximum path sum of any non-empty path.

    public static void main(String[] args) {
        TreeNode14 node1 = new TreeNode14(2);
        TreeNode14 node2 = new TreeNode14(3);
        TreeNode14 node3 = new TreeNode14(1, node1, node2);
        System.out.println(maxPathSum(node3)); // 6

        TreeNode14 node4 = new TreeNode14(9);
        TreeNode14 node5 = new TreeNode14(15);
        TreeNode14 node6 = new TreeNode14(7);
        TreeNode14 node7 = new TreeNode14(20, node5, node6);
        TreeNode14 node8 = new TreeNode14(-10, node4, node7);
        System.out.println(maxPathSum(node8)); // 42
    }

    private static int maxSum;

    public static int maxPathSum(TreeNode14 root) {
        maxSum = Integer.MIN_VALUE;
        helper(root);
        return maxSum;
    }

    private static int helper(TreeNode14 root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);
        maxSum = Math.max(maxSum, left + right + root.val);
        return Math.max(left + root.val, right + root.val);
    }
}

class TreeNode14 {

    int val;
    TreeNode14 left;
    TreeNode14 right;

    TreeNode14() {
    }

    TreeNode14(int val) {
        this.val = val;
    }

    TreeNode14(int val, TreeNode14 left, TreeNode14 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
