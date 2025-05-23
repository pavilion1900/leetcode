package org.example.trees.example;

public class PathSum {

//    112. Path Sum
//    Easy
//
//    Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such
//    that adding up all the values along the path equals targetSum.
//
//    A leaf is a node with no children.

    public static void main(String[] args) {
        TreeNode6 node1 = new TreeNode6(7);
        TreeNode6 node2 = new TreeNode6(2);
        TreeNode6 node3 = new TreeNode6(11, node1, node2);
        TreeNode6 node4 = new TreeNode6(4, node3, null);
        TreeNode6 node5 = new TreeNode6(1);
        TreeNode6 node6 = new TreeNode6(4, null, node5);
        TreeNode6 node7 = new TreeNode6(13);
        TreeNode6 node8 = new TreeNode6(8, node7, node6);
        TreeNode6 node9 = new TreeNode6(5, node4, node8);
        System.out.println(hasPathSum(node9, 22)); // true

        TreeNode6 node10 = new TreeNode6(2);
        TreeNode6 node11 = new TreeNode6(3);
        TreeNode6 node12 = new TreeNode6(1, node10, node11);
        System.out.println(hasPathSum(node12, 5)); // false

        TreeNode6 node13 = null;
        System.out.println(hasPathSum(node13, 0)); // false
    }

    public static boolean hasPathSum(TreeNode6 root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            return sum == 0;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}

class TreeNode6 {

    int val;
    TreeNode6 left;
    TreeNode6 right;

    TreeNode6() {
    }

    TreeNode6(int val) {
        this.val = val;
    }

    TreeNode6(int val, TreeNode6 left, TreeNode6 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
