package com.marmot.leetcode.solution024;

import com.marmot.leetcode.datastructure.ListNode;

/**
 * @author 郭天宇
 * @Description
 * @create 2020-03-11 18:13
 */
public class Demo1 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);

        ListNode node = listNode1;
        while (listNode1.next != null) {
            ListNode next = node.next;
            System.out.println(next.val);
            node = next.next;
        }

    }
}
