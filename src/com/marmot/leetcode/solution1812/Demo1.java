package com.marmot.leetcode.solution1812;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/25 10:35
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.squareIsWhite("h3"));
    }

    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0) - '0';
        int b = coordinates.charAt(1) - '0';
        return (a + b) % 2 != 0;
    }

}
