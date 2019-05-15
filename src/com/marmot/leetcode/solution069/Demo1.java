package com.marmot.leetcode.solution069;

/**
 * 思路简单，i一直做++操作，直到满足条件
 * 但是存在超时的问题，复杂度高
 *
 * @author GuoTy
 * @Date 2019/5/15 14:19
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.mySqrt(8);
    }

    public int mySqrt(int x) {
        int i = 0;
        while (true) {
            if (i * i == x) {
                break;
            } else if (i * i > x) {
                i--;
                break;
            } else {
                i++;
            }
        }
        return i;
    }
}
