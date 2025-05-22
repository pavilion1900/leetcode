package org.example.trees.task;

public class MinimumDepthOfBinaryTree {

//    111. Minimum Depth of Binary Tree
//    Easy
//
//    Given a binary tree, find its minimum depth.
//
//    The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
//
//    Note: A leaf is a node with no children.

    public static void main(String[] args) {
        TreeNode5 node1 = new TreeNode5(15);
        TreeNode5 node2 = new TreeNode5(7);
        TreeNode5 node3 = new TreeNode5(20, node1, node2);
        TreeNode5 node4 = new TreeNode5(9);
        TreeNode5 node5 = new TreeNode5(3, node4, node3);
        System.out.println(minDepth(node5)); // 2

        TreeNode5 node6 = new TreeNode5(6);
        TreeNode5 node7 = new TreeNode5(5, null, node6);
        TreeNode5 node8 = new TreeNode5(4, null, node7);
        TreeNode5 node9 = new TreeNode5(3, null, node8);
        TreeNode5 node10 = new TreeNode5(2, null, node9);
        System.out.println(minDepth(node10)); // 5
    }

    public static int minDepth(TreeNode5 root) {
        return -1;
    }
}

class TreeNode5 {

    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5() {
    }

    TreeNode5(int val) {
        this.val = val;
    }

    TreeNode5(int val, TreeNode5 left, TreeNode5 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
