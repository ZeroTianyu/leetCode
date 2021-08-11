package com.marmot.leetcode.solution1317;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/08/11 16:51
 */
public class Demo1 {
    public static void main(String[] args) {
        getNoZeroIntegers(2);
    }


    public static int[] getNoZeroIntegers(int n) {
        for (int A = 1; A < n; A++) {
            int B = n - A;

            if (!(Integer.valueOf(A).toString() + Integer.valueOf(B)).contains("0")) {
                return new int[]{A, B};
            }

        }

        return new int[]{};
    }
}
