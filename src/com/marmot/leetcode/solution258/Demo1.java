package com.marmot.leetcode.solution258;


//给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
//
// 示例:
//
// 输入: 38
//输出: 2
//解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
//
//
// 进阶:
//你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
// Related Topics 数学
// 👍 333 👎 0

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/04/26 09:41
 */
public class Demo1 {


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.addDigits(10));
    }

    public int addDigits(int num) {
        if (num >= 10) {
            int i = num % 10;

            return addDigits(i + addDigits(num / 10));
        }
        return num;
    }
}
