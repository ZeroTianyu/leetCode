package com.marmot.leetcode.solution342;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/31 19:15
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(32));
    }


    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & n - 1) == 0 && n % 3 == 1;
    }
}
