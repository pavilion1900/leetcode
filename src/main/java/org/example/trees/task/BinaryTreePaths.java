package org.example.trees.task;

import java.util.List;

public class BinaryTreePaths {

//    257. Binary Tree Paths
//    Easy
//
//    Given the root of a binary tree, return all root-to-leaf paths in any order.
//
//    A leaf is a node with no children.

    public static void main(String[] args) {
        TreeNode9 node1 = new TreeNode9(5);
        TreeNode9 node2 = new TreeNode9(2, null, node1);
        TreeNode9 node3 = new TreeNode9(3);
        TreeNode9 node4 = new TreeNode9(1, node2, node3);
        System.out.println(binaryTreePaths(node4)); // ["1->2->5", "1->3"]

        TreeNode9 node5 = new TreeNode9(1);
        System.out.println(binaryTreePaths(node5)); // ["1"]
    }

    public static List<String> binaryTreePaths(TreeNode9 root) {
        return null;
    }
}

class TreeNode9 {

    int val;
    TreeNode9 left;
    TreeNode9 right;

    TreeNode9() {
    }

    TreeNode9(int val) {
        this.val = val;
    }

    TreeNode9(int val, TreeNode9 left, TreeNode9 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
