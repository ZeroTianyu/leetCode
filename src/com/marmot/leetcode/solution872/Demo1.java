package com.marmot.leetcode.solution872;

import com.marmot.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/10 09:49
 */
public class Demo1 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);


        Demo1 demo1 = new Demo1();
        System.out.println(demo1.leafSimilar(treeNode, treeNode));
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        dfs(root1, seq1);

        List<Integer> seq2 = new ArrayList<>();
        dfs(root2, seq2);

        return seq1.equals(seq2);
    }


    public void dfs(TreeNode node, List<Integer> seq) {
        if (node.right == null && node.left == null) {
            seq.add(node.val);
        } else {
            if (node.left != null) {
                dfs(node.left, seq);
            }
            if (node.right != null) {
                dfs(node.right, seq);
            }
        }
    }
}
