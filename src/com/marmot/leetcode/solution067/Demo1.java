package com.marmot.leetcode.solution067;

/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author GuoTy
 * @Date 2019/5/15 10:56
 */
public class Demo1 {

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int index = 0;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (index < a.length() || index < b.length()) {
            int c1 = index < a.length() ? a.charAt(a.length() - 1 - index) - '0' : 0;
            int c2 = index < b.length() ? b.charAt(b.length() - 1 - index) - '0' : 0;
            int r = c1 + c2 + carry;
            if (r > 1) {
                carry = 1;
                if (r == 2) {
                    res.append(0);
                } else {
                    res.append(1);
                }
            } else {
                carry = 0;
                if (r == 0) {
                    res.append(0);
                } else {
                    res.append(1);
                }
            }
            index++;
        }
        if (carry != 0) {
            res.append(1);
        }
        return res.reverse().toString();
    }


}
