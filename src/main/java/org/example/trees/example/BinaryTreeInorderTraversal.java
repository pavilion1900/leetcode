package org.example.trees.example;

import java.util.ArrayList;
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

//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> rsl = new ArrayList<>();
//        helper(root, rsl);
//        return rsl;
//    }
//
//    private static void helper(TreeNode root, List<Integer> rsl) {
//        if (root != null) {
//            helper(root.left, rsl);
//            rsl.add(root.val);
//            helper(root.right, rsl);
//        }
//    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rsl = new ArrayList<>();
        TreeNode curr = root;
        TreeNode prev;
        while (curr != null) {
            if (curr.left == null) {
                rsl.add(curr.val);
                curr = curr.right;
            } else {
                prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    rsl.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return rsl;
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
