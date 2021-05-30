package com.marmot.leetcode.solution1523;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/29 15:15
 */
public class Demo1 {
    public static void main(String[] args) {

    }


    public int countOdds(int low, int high) {
        return pre(high) - pre(low - 1);
    }

    public int pre(int x) {
        return (x + 1) >> 1;
    }

}
