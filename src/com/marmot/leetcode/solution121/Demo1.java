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

    public int maxProfit(int[] prices) {
        int profit = 0;

        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > current) {
                profit += prices[i] - current;
                current = prices[++i];
            } else if (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
                i += 1;
            }
        }

        return profit;
    }
}
