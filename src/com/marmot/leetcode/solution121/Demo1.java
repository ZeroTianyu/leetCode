package com.marmot.leetcode.solution121;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/10 17:13
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.maxProfit(nums));
    }

    /**
     * 暴力法
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                if (temp > profit) {
                    profit = temp;
                }
            }
        }
        return profit;
    }

    /**
     * 一次遍历
     *
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }

        return maxPrice;
    }
}
