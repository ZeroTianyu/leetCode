package com.guoty.leetcode.solution007;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * @author 18465
 * @Date 2019/4/9 17:12
 */
public class Demo1 {
    public static void main(String[] args) {
        int num = 789;
        int reverse = reverse(num);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            boolean flag = rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7);
            if (flag) {
                return 0;
            }
            if (flag) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
