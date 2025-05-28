package org.example.trees.example;

public class ValidateBinarySearchTree {

//    98. Validate Binary Search Tree
//    Medium
//
//    Given the root of a binary tree, determine if it is a valid binary search tree (BST).
//
//    A valid BST is defined as follows:
//
//    The left subtree of a node contains only nodes with keys less than the node's key.
//    The right subtree of a node contains only nodes with keys greater than the node's key.
//    Both the left and right subtrees must also be binary search trees.

    public static void main(String[] args) {
        TreeNode10 node1 = new TreeNode10(1);
        TreeNode10 node2 = new TreeNode10(3);
        TreeNode10 node3 = new TreeNode10(2, node1, node2);
        System.out.println(isValidBST(node3)); // true

        TreeNode10 node4 = new TreeNode10(1);
        TreeNode10 node5 = new TreeNode10(3);
        TreeNode10 node6 = new TreeNode10(6);
        TreeNode10 node7 = new TreeNode10(4, node5, node6);
        TreeNode10 node8 = new TreeNode10(5, node4, node7);
        System.out.println(isValidBST(node8)); // false
    }

    public static boolean isValidBST(TreeNode10 root) {
        return isValid(root, null, null);
    }

    private static boolean isValid(TreeNode10 root, Integer left, Integer right) {
        if (root == null) {
            return true;
        }
        if ((left != null && root.val >= left) || (right != null && root.val <= right)) {
            return false;
        }
        return isValid(root.left, root.val, right) && isValid(root.right, left, root.val);
    }
}

class TreeNode10 {

    int val;
    TreeNode10 left;
    TreeNode10 right;

    TreeNode10() {
    }

    TreeNode10(int val) {
        this.val = val;
    }

    TreeNode10(int val, TreeNode10 left, TreeNode10 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
