package org.example.trees.task;

public class LowestCommonAncestorOfABinaryTree {

//    236. Lowest Common Ancestor of a Binary Tree
//    Medium
//
//    Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//
//    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes
//    p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be
//    a descendant of itself).”

    public static void main(String[] args) {
        TreeNode11 node1 = new TreeNode11(7);
        TreeNode11 node2 = new TreeNode11(4);
        TreeNode11 node3 = new TreeNode11(2, node1, node2);
        TreeNode11 node4 = new TreeNode11(6);
        TreeNode11 node5 = new TreeNode11(5, node4, node3);
        TreeNode11 node6 = new TreeNode11(0);
        TreeNode11 node7 = new TreeNode11(8);
        TreeNode11 node8 = new TreeNode11(1, node6, node7);
        TreeNode11 node9 = new TreeNode11(3, node5, node8);
        System.out.println(lowestCommonAncestor(node9, node5, node8).val);   // 3

        System.out.println(lowestCommonAncestor(node9, node5, node2).val);   // 5

        TreeNode11 node10 = new TreeNode11(2);
        TreeNode11 node11 = new TreeNode11(1, node10, null);
        System.out.println(lowestCommonAncestor(node11, node11, node10).val); // 1
    }

    public static TreeNode11 lowestCommonAncestor(TreeNode11 root, TreeNode11 first, TreeNode11 second) {
        return null;
    }
}

class TreeNode11 {

    int val;
    TreeNode11 left;
    TreeNode11 right;

    TreeNode11(int x) {
        val = x;
    }

    TreeNode11(int x, TreeNode11 left, TreeNode11 right) {
        val = x;
        this.left = left;
        this.right = right;
    }
}
