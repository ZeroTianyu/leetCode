package com.marmot.leetcode.solution92;

import com.marmot.leetcode.datastructure.ListNode;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/3/18 17:51
 */
public class Demo {

    public static void main(String[] args) {

    }


    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head.next != null) {
            return head;
        }
        ListNode firstHead = head;


        int index = 1;

        ListNode leftNode = null;

        while (head.next != null) {
            index++;
            if (left == index) {

            }
            head = head.next;
        }


        return null;
    }
}
