package org.example.trees.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

//    102. Binary Tree Level Order Traversal
//    Medium
//
//    Given the root of a binary tree, return the level order traversal of its nodes' values.
//    (i.e., from left to right, level by level).

    public static void main(String[] args) {
        TreeNode3 node1 = new TreeNode3(15);
        TreeNode3 node2 = new TreeNode3(7);
        TreeNode3 node3 = new TreeNode3(20, node1, node2);
        TreeNode3 node4 = new TreeNode3(9);
        TreeNode3 node5 = new TreeNode3(3, node4, node3);
        System.out.println(levelOrder(node5)); // [[3], [9, 20], [15, 7]]

        TreeNode3 node6 = new TreeNode3(1);
        System.out.println(levelOrder(node6)); // [[1]]

        TreeNode3 node7 = null;
        System.out.println(levelOrder(node7)); // []
    }

    public static List<List<Integer>> levelOrder(TreeNode3 root) {
        List<List<Integer>> rsl = new ArrayList<>();
        helper(rsl, root, 0);
        return rsl;
    }

    private static void helper(List<List<Integer>> rsl, TreeNode3 root, Integer level) {
        if (root != null) {
            if (rsl.size() == level) {
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                rsl.add(list);
            } else {
                rsl.get(level).add(root.val);
            }
            helper(rsl, root.left, level + 1);
            helper(rsl, root.right, level + 1);
        }
    }
}

class TreeNode3 {

    int val;
    TreeNode3 left;
    TreeNode3 right;

    TreeNode3() {
    }

    TreeNode3(int val) {
        this.val = val;
    }

    TreeNode3(int val, TreeNode3 left, TreeNode3 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
