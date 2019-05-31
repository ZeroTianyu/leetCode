package com.marmot.leetcode.solution112;

import com.marmot.leetcode.datastructure.TreeNode;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 * create by GuoTy on 2019/5/28
 * copyright © 2017-2019 Legym Technology Co.,Ltd. All rights reserved.
 * file description:
 * last update by {} on {}
 * update description:
 *
 * @author GuoTy
 */
public class Demo1 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(4);
        TreeNode root3 = new TreeNode(8);
        TreeNode root4 = new TreeNode(11);
        TreeNode root5 = new TreeNode(13);
        TreeNode root6 = new TreeNode(4);
        TreeNode root7 = new TreeNode(7);
        TreeNode root8 = new TreeNode(2);
        TreeNode root9 = new TreeNode(1);

        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root3.left = root5;
        root3.right = root6;
        root4.left = root7;
        root4.right = root8;
        root6.right = root9;

        boolean b = hasPathSum(root1, 22);
        System.out.println(b);
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
