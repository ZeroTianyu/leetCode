package com.marmot.leetcode.solution257;

import com.marmot.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guotianyu
 * @description: 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class Demo1 {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);

        treeNode.right = new TreeNode(3);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(5);


        Demo1 demo1 = new Demo1();

        List<String> list = demo1.binaryTreePaths(treeNode);
        System.out.println(list);
    }


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        constructPaths(root, "", paths);
        return paths;
    }

    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(root.val);
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }


}
