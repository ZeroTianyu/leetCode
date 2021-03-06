package com.marmot.leetcode.solution066;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321
 *
 * @author GuoTy
 * @Date 2019/5/8 17:47
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {9};
        int[] ints = plusOne(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        for (int j = digits.length - 1; j >= 0; j--) {
            int cur = digits[j] + carry;
            carry = cur / 10;
            digits[j] = cur % 10;
        }

        if (carry > 0) {
            int array[] = new int[digits.length + 1];
            array[0] = carry;
            for (int i = 1; i < array.length; i++) {
                array[i] = digits[i - 1];
            }
            return array;
        }
        return digits;
    }
}
