package com.marmot.leetcode.solution009;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 * @author 18465
 * @Date 2019/4/14 21:32
 */
public class Demo1 {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(567898765);

        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        int temp = 0;
        int tempX = x;
        int i = 0;
        while (x > 0) {
            temp = x % 10;
            x = x / 10;
            i = i * 10 + temp;
        }
        return i == tempX ? true : false;
    }
}
