package com.marmot.leetcode.solution069;

/**
 * 牛顿迭代法
 *
 * @author GuoTy
 * @Date 2019/5/15 16:44
 */
public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        int i = demo3.mySqrt(8);
        System.out.println(i);
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        double last = 0;
        double res = 1;
        while (res != last) {
            last = res;
            res = (res + x / res) / 2;
        }
        return (int) res;
    }
}
