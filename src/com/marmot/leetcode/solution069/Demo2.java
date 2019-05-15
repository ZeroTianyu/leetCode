package com.marmot.leetcode.solution069;

/**
 * 优化第一种，使用神奇函数0x5f3759df
 *
 * @author GuoTy
 * @Date 2019/5/15 16:08
 */
public class Demo2 {
    public static void main(String[] args) {
        mySqrt(4561246);
    }

    public static int mySqrt(int x) {
        long t = x;
        t = 0x5f3759df - (t >> 1);
        while (!(t * t <= x && (t + 1) * (t + 1) > x)) {
            t = (x / t + t) / 2;
        }
        return (int) t;
    }
}
