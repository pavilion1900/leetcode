package org.example.trees.example;

public class MaximumDepthOfBinaryTree {

//    104. Maximum Depth of Binary Tree
//    Easy
//
//    Given the root of a binary tree, return its maximum depth.
//
//    A binary tree's maximum depth is the number of nodes along the longest path from the root node down
//    to the farthest leaf node.

    public static void main(String[] args) {
        TreeNode4 node1 = new TreeNode4(15);
        TreeNode4 node2 = new TreeNode4(7);
        TreeNode4 node3 = new TreeNode4(20, node1, node2);
        TreeNode4 node4 = new TreeNode4(9);
        TreeNode4 node5 = new TreeNode4(3, node4, node3);
        System.out.println(maxDepth(node5)); // 3

        TreeNode4 node6 = new TreeNode4(2);
        TreeNode4 node7 = new TreeNode4(1, null, node6);
        System.out.println(maxDepth(node7)); // 2
    }

    public static int maxDepth(TreeNode4 root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}

class TreeNode4 {

    int val;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4() {
    }

    TreeNode4(int val) {
        this.val = val;
    }

    TreeNode4(int val, TreeNode4 left, TreeNode4 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
