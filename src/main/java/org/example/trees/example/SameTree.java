package org.example.trees.example;

public class SameTree {

//    100. Same Tree
//    Easy
//
//    Given the roots of two binary trees p and q, write a function to check if they are the same or not.
//
//    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    public static void main(String[] args) {
        TreeNode8 node1 = new TreeNode8(2);
        TreeNode8 node2 = new TreeNode8(3);
        TreeNode8 node3 = new TreeNode8(1, node1, node2);
        TreeNode8 node4 = new TreeNode8(2);
        TreeNode8 node5 = new TreeNode8(3);
        TreeNode8 node6 = new TreeNode8(1, node4, node5);
        System.out.println(isSameTree(node3, node6)); // true

        TreeNode8 node7 = new TreeNode8(2);
        TreeNode8 node8 = new TreeNode8(1, node7, null);
        TreeNode8 node9 = new TreeNode8(2);
        TreeNode8 node10 = new TreeNode8(1, null, node9);
        System.out.println(isSameTree(node8, node10)); // false

        TreeNode8 node11 = new TreeNode8(2);
        TreeNode8 node12 = new TreeNode8(1);
        TreeNode8 node13 = new TreeNode8(1, node11, node12);
        TreeNode8 node14 = new TreeNode8(1);
        TreeNode8 node15 = new TreeNode8(2);
        TreeNode8 node16 = new TreeNode8(1, node14, node15);
        System.out.println(isSameTree(node13, node16)); // false
    }

    public static boolean isSameTree(TreeNode8 root1, TreeNode8 root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}

class TreeNode8 {

    int val;
    TreeNode8 left;
    TreeNode8 right;

    TreeNode8() {
    }

    TreeNode8(int val) {
        this.val = val;
    }

    TreeNode8(int val, TreeNode8 left, TreeNode8 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
