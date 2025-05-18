package org.example.trees.task;

import java.util.List;

public class BinaryTreePreorderTraversal {

//    144. Binary Tree Preorder Traversal
//    Easy
//
//    Given the root of a binary tree, return the preorder traversal of its nodes' values.

    public static void main(String[] args) {
        TreeNode1 node1 = new TreeNode1(3);
        TreeNode1 node2 = new TreeNode1(2, node1, null);
        TreeNode1 node3 = new TreeNode1(1, null, node2);
        preorderTraversal(node3)
                .forEach(num -> System.out.print(num + " ")); // 1 2 3
        System.out.println();

        TreeNode1 node4 = new TreeNode1(6);
        TreeNode1 node5 = new TreeNode1(7);
        TreeNode1 node6 = new TreeNode1(5, node4, node5);
        TreeNode1 node7 = new TreeNode1(4);
        TreeNode1 node8 = new TreeNode1(2, node7, node6);
        TreeNode1 node9 = new TreeNode1(9);
        TreeNode1 node10 = new TreeNode1(8, node9, null);
        TreeNode1 node11 = new TreeNode1(3, null, node10);
        TreeNode1 node12 = new TreeNode1(1, node8, node11);
        preorderTraversal(node12)
                .forEach(num -> System.out.print(num + " ")); // 1 2 4 5 6 7 3 8 9
        System.out.println();

        TreeNode1 node13 = null;
        preorderTraversal(node13)
                .forEach(num -> System.out.print(num + " ")); //
        System.out.println();

        TreeNode1 node14 = new TreeNode1(1);
        preorderTraversal(node14)
                .forEach(num -> System.out.print(num + " ")); // 1
        System.out.println();
    }

    public static List<Integer> preorderTraversal(TreeNode1 root) {
        return null;
    }
}

class TreeNode1 {

    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
