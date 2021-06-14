package com.marmot.leetcode.pav;

class NumArray {

    private int[] nums;


    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;

    }
//["NumArray","sumRange","sumRange","sumRange"]
//        [[[-2,0,3,-5,2,-1]],[0,2],[2,5],[0,5]]

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));

    }
}