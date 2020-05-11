package com.marmot.everyday;

import com.marmot.leetcode.datastructure.TreeNode;

import java.util.*;

/**
 * @Description: 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 * <p>
 * 示例 1:
 * 给定的树 s:
 * <p>
 * 3
 * / \
 * 4   5
 * / \
 * 1   2
 * 给定的树 t：
 * <p>
 * 4
 * / \
 * 1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: 18465
 * @Create: 2020-05-07 16:03
 */
public class Demo20200507 {

    public static void main(String[] args) {
        //[3,4,5,1,2,null,null,0]
        //[4,1,2]
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode0 = new TreeNode(2);
        TreeNode treeNoden1 = new TreeNode(null);
        TreeNode treeNoden2 = new TreeNode(null);

        Demo20200507 demo20200507 = new Demo20200507();

    }


    public boolean isSubtree(TreeNode s, TreeNode t) {
        List<Integer> integers = inorderTraversalNonCur(s);

        List<Integer> integers1 = inorderTraversalNonCur(t);
        StringBuilder stringBuilder = new StringBuilder("");

        integers.forEach(integer -> {
            stringBuilder.append(integer);
        });

        StringBuilder stringBuilder2 = new StringBuilder("");
        integers1.forEach(integer -> {
            stringBuilder2.append(integer);
        });


        boolean contains = stringBuilder.toString().contains(stringBuilder2.toString());
        return contains;
    }

    /**
     * 遍历二叉树
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalNonCur(TreeNode root) {
        List<Integer> visitedList = new ArrayList<>();
        Map<TreeNode, Integer> visitedNodeMap = new HashMap<>();//保存已访问的节点
        Stack<TreeNode> toBeVisitedNodes = new Stack<>();//待访问的节点
        if (root == null)
            return visitedList;
        toBeVisitedNodes.push(root);
        while (!toBeVisitedNodes.isEmpty()) {
            TreeNode tempNode = toBeVisitedNodes.peek(); //注意这里是peek而不是pop
            while (tempNode.left != null) { //如果该节点的左节点还未被访问，则需先访问其左节点
                if (visitedNodeMap.get(tempNode.left) != null) //该节点已经被访问（不存在某个节点已被访问但其左节点还未被访问的情况）
                    break;
                toBeVisitedNodes.push(tempNode.left);
                tempNode = tempNode.left;
            }
            tempNode = toBeVisitedNodes.pop();//访问节点
            visitedList.add(tempNode.val);
            visitedNodeMap.put(tempNode, 1);//将节点加入已访问map
            if (tempNode.right != null) //将右结点入栈
                toBeVisitedNodes.push(tempNode.right);
        }
        return visitedList;

    }
}
