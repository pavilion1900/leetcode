package org.example.trees.task;

public class SymmetricTree {

//    101. Symmetric Tree
//    Easy
//
//    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    public static void main(String[] args) {
        TreeNode7 node1 = new TreeNode7(3);
        TreeNode7 node2 = new TreeNode7(4);
        TreeNode7 node3 = new TreeNode7(2, node1, node2);
        TreeNode7 node4 = new TreeNode7(4);
        TreeNode7 node5 = new TreeNode7(3);
        TreeNode7 node6 = new TreeNode7(2, node4, node5);
        TreeNode7 node7 = new TreeNode7(1, node3, node6);
        System.out.println(isSymmetric(node7)); // true

        TreeNode7 node8 = new TreeNode7(3);
        TreeNode7 node9 = new TreeNode7(2, null, node8);
        TreeNode7 node10 = new TreeNode7(3);
        TreeNode7 node11 = new TreeNode7(2, null, node10);
        TreeNode7 node12 = new TreeNode7(1, node9, node11);
        System.out.println(isSymmetric(node12)); // false

    }

    public static boolean isSymmetric(TreeNode7 root) {
        return false;
    }
}

class TreeNode7 {

    int val;
    TreeNode7 left;
    TreeNode7 right;

    TreeNode7() {
    }

    TreeNode7(int val) {
        this.val = val;
    }

    TreeNode7(int val, TreeNode7 left, TreeNode7 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
