package org.example.trees.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

//    145. Binary Tree Postorder Traversal
//    Easy
//
//    Given the root of a binary tree, return the postorder traversal of its nodes' values.

    public static void main(String[] args) {
        TreeNode2 node1 = new TreeNode2(3);
        TreeNode2 node2 = new TreeNode2(2, node1, null);
        TreeNode2 node3 = new TreeNode2(1, null, node2);
        postorderTraversal(node3)
                .forEach(num -> System.out.print(num + " ")); // 3 2 1
        System.out.println();

        TreeNode2 node4 = new TreeNode2(6);
        TreeNode2 node5 = new TreeNode2(7);
        TreeNode2 node6 = new TreeNode2(5, node4, node5);
        TreeNode2 node7 = new TreeNode2(4);
        TreeNode2 node8 = new TreeNode2(2, node7, node6);
        TreeNode2 node9 = new TreeNode2(9);
        TreeNode2 node10 = new TreeNode2(8, node9, null);
        TreeNode2 node11 = new TreeNode2(3, null, node10);
        TreeNode2 node12 = new TreeNode2(1, node8, node11);
        postorderTraversal(node12)
                .forEach(num -> System.out.print(num + " ")); // 4 6 7 5 2 9 8 3 1
        System.out.println();

        TreeNode2 node13 = null;
        postorderTraversal(node13)
                .forEach(num -> System.out.print(num + " ")); //
        System.out.println();

        TreeNode2 node14 = new TreeNode2(1);
        postorderTraversal(node14)
                .forEach(num -> System.out.print(num + " ")); // 1
        System.out.println();
    }

    public static List<Integer> postorderTraversal(TreeNode2 root) {
        List<Integer> rsl = new ArrayList<>();
        helper(root, rsl);
        return rsl;
    }

    private static void helper(TreeNode2 root, List<Integer> rsl) {
        if (root != null) {
            helper(root.left, rsl);
            helper(root.right, rsl);
            rsl.add(root.val);
        }
    }
}

class TreeNode2 {

    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2() {
    }

    TreeNode2(int val) {
        this.val = val;
    }

    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
