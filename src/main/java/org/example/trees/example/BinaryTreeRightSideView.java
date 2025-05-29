package org.example.trees.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

//    199. Binary Tree Right Side View
//    Medium
//
//    Given the root of a binary tree, imagine yourself standing on the right side of it, return the values
//    of the nodes you can see ordered from top to bottom.

    public static void main(String[] args) {
        TreeNode12 node1 = new TreeNode12(5);
        TreeNode12 node2 = new TreeNode12(2, null, node1);
        TreeNode12 node3 = new TreeNode12(4);
        TreeNode12 node4 = new TreeNode12(3, null, node3);
        TreeNode12 node5 = new TreeNode12(1, node2, node4);
        System.out.println(rightSideView(node5)); // [1, 3, 4]

        TreeNode12 node6 = new TreeNode12(5);
        TreeNode12 node7 = new TreeNode12(4, node6, null);
        TreeNode12 node8 = new TreeNode12(2, node7, null);
        TreeNode12 node9 = new TreeNode12(3);
        TreeNode12 node10 = new TreeNode12(1, node8, node9);
        System.out.println(rightSideView(node10)); // [1, 3, 4, 5]

        TreeNode12 node11 = new TreeNode12(3);
        TreeNode12 node12 = new TreeNode12(1, null, node11);
        System.out.println(rightSideView(node12)); // [1, 3]

        TreeNode12 node13 = null;
        System.out.println(rightSideView(node13)); // []
    }

    public static List<Integer> rightSideView(TreeNode12 root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> rsl = new ArrayList<>();
        Queue<TreeNode12> currLvl = new ArrayDeque<>();
        Queue<TreeNode12> nextLvl = new ArrayDeque<>();
        nextLvl.offer(root);
        TreeNode12 node = new TreeNode12();
        while (!nextLvl.isEmpty()) {
            currLvl = nextLvl;
            nextLvl = new ArrayDeque<>();
            while (!currLvl.isEmpty()) {
                node = currLvl.poll();
                if (node.left != null) {
                    nextLvl.offer(node.left);
                }
                if (node.right != null) {
                    nextLvl.offer(node.right);
                }
            }
            rsl.add(node.val);
        }
        return rsl;
    }
}

class TreeNode12 {

    int val;
    TreeNode12 left;
    TreeNode12 right;

    TreeNode12() {
    }

    TreeNode12(int val) {
        this.val = val;
    }

    TreeNode12(int val, TreeNode12 left, TreeNode12 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
