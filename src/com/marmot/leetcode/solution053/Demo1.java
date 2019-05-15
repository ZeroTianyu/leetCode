package com.marmot.leetcode.solution053;

/**
 * @author GuoTy
 * @Date 2019/5/7 12:58
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int total = nums[0];
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }

            if (total < sum) {
                total = sum;
            }
        }
        return total;
    }
}
