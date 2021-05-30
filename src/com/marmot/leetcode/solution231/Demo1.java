package com.marmot.leetcode.solution231;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/30 12:53
 */
public class Demo1 {
    public static void main(String[] args) {

    }


    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
