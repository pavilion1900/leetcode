package org.example.trees.task;

import java.util.List;

public class BinaryTreeInorderTraversal {

//    94. Binary Tree Inorder Traversal
//    Easy
//
//    Given the root of a binary tree, return the inorder traversal of its nodes' values.

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, null);
        TreeNode node3 = new TreeNode(1, null, node2);
        inorderTraversal(node3)
                .forEach(num -> System.out.print(num + " ")); // 1 3 2
        System.out.println();

        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(5, node4, node5);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(2, node7, node6);
        TreeNode node9 = new TreeNode(9);
        TreeNode node10 = new TreeNode(8, node9, null);
        TreeNode node11 = new TreeNode(3, null, node10);
        TreeNode node12 = new TreeNode(1, node8, node11);
        inorderTraversal(node12)
                .forEach(num -> System.out.print(num + " ")); // 4 2 6 5 7 1 3 9 8
        System.out.println();

        TreeNode node13 = null;
        inorderTraversal(node13)
                .forEach(num -> System.out.print(num + " ")); //
        System.out.println();

        TreeNode node14 = new TreeNode(1);
        inorderTraversal(node14)
                .forEach(num -> System.out.print(num + " ")); // 1
        System.out.println();
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        return null;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
