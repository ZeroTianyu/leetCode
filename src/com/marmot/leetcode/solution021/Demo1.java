package com.marmot.leetcode.solution021;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author GuoTy
 * @Date 2019/4/18 15:48
 */
public class Demo1 {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(4);

        ListNode b1 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode b3 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;


        b1.next = b2;
        b2.next = b3;
        mergeTwoLists(a1, b1);

    }

    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        final ListNode mockHeadNode = new ListNode(0);
        ListNode currNode = mockHeadNode;
        while (headA != null || headB != null) {
            if (headA == null) {
                currNode.next = headB;
                break;
            }
            if (headB == null) {
                currNode.next = headA;
                break;
            }

            if (headA.val <= headB.val) {
                currNode.next = headA;
                headA = headA.next;
            } else {
                currNode.next = headB;
                headB = headB.next;
            }
            currNode = currNode.next;


        }

        return mockHeadNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
