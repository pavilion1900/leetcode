package org.example.trees.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees {

//    652. Find Duplicate Subtrees
//    Medium
//
//    Given the root of a binary tree, return all duplicate subtrees.
//
//    For each kind of duplicate subtrees, you only need to return the root node of any one of them.
//
//    Two trees are duplicate if they have the same structure with the same node values.

    public static void main(String[] args) {
        TreeNode13 node1 = new TreeNode13(4);
        TreeNode13 node2 = new TreeNode13(2, node1, null);
        TreeNode13 node3 = new TreeNode13(4);
        TreeNode13 node4 = new TreeNode13(2, node3, null);
        TreeNode13 node5 = new TreeNode13(3, node4, node3);
        TreeNode13 node6 = new TreeNode13(1, node2, node5);
        System.out.println(findDuplicateSubtrees(node6)); // [[4], [2, 4]]

        TreeNode13 node7 = new TreeNode13(1);
        TreeNode13 node8 = new TreeNode13(1);
        TreeNode13 node9 = new TreeNode13(2, node8, node7);
        System.out.println(findDuplicateSubtrees(node9)); // [[1]]

        TreeNode13 node10 = new TreeNode13(3);
        TreeNode13 node11 = new TreeNode13(2, node10, null);
        TreeNode13 node12 = new TreeNode13(3);
        TreeNode13 node13 = new TreeNode13(2, node12, null);
        TreeNode13 node14 = new TreeNode13(2, node13, node11);
        System.out.println(findDuplicateSubtrees(node14)); // [[3], [2, 3]]
    }

//    public static List<TreeNode13> findDuplicateSubtrees(TreeNode13 root) {
//        List<TreeNode13> rsl = new ArrayList<>();
//        traverse(root, rsl, new HashMap<>());
//        return rsl;
//    }
//
//    private static String traverse(TreeNode13 root, List<TreeNode13> rsl, Map<String, Integer> strs) {
//        if (root == null) {
//            return "";
//        }
//        String str = "(" + traverse(root.left, rsl, strs) + ")" + root.val
//                + "(" + traverse(root.right, rsl, strs) + ")";
//        strs.put(str, strs.getOrDefault(str, 0) + 1);
//        if (strs.get(str) == 2) {
//            rsl.add(root);
//        }
//        return str;
//    }

    public static List<TreeNode13> findDuplicateSubtrees(TreeNode13 root) {
        List<TreeNode13> rsl = new ArrayList<>();
        traverse(root, rsl, new HashMap<>(), new HashMap<>());
        return rsl;
    }

    private static Integer traverse(TreeNode13 root, List<TreeNode13> rsl, Map<String, Integer> strs, Map<Integer, Integer> ids) {
        if (root == null) {
            return 0;
        }
        String str = traverse(root.left, rsl, strs, ids) + "," + root.val
                + "," + traverse(root.right, rsl, strs, ids);
        if (!strs.containsKey(str)) {
            strs.put(str, strs.size() + 1);
        }
        int id = strs.get(str);
        ids.put(id, ids.getOrDefault(id, 0) + 1);
        if (ids.get(id) == 2) {
            rsl.add(root);
        }
        return id;
    }
}


class TreeNode13 {

    int val;
    TreeNode13 left;
    TreeNode13 right;

    TreeNode13() {
    }

    TreeNode13(int val) {
        this.val = val;
    }

    TreeNode13(int val, TreeNode13 left, TreeNode13 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "["
                + val
                + (left != null ? ", " + left.val : "")
                + (right != null ? ", " + right.val : "")
                + ']';
    }
}
