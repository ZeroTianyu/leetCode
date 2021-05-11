package com.marmot.interview;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/11 16:17
 */
public class Interview16_17 {
    public static void main(String[] args) {

    }


    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];

        for (int num : nums) {
            pre = Math.max(pre + num, num);
            maxAns = Math.max(pre, maxAns);
        }

        return maxAns;
    }
}
