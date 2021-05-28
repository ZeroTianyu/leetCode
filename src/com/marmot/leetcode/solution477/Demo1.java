package com.marmot.leetcode.solution477;

/**
 * @author: guotianyu
 * @description: 暴力统计
 * @create: 2021/05/28 22:10
 */
public class Demo1 {
    public static void main(String[] args) {

    }


    public int totalHammingDistance(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += Integer.bitCount(nums[i] ^ nums[j]);
            }
        }
        return count;

    }
}
