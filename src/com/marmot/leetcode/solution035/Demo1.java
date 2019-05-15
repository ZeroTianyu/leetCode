package com.marmot.leetcode.solution035;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 0
 *
 * @author GuoTy
 * @Date 2019/5/6 14:28
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int[] nums = {1, 3, 5, 6};
        int i = 7;
        int num = demo1.searchInsert(nums, i);
        System.out.println(num);
    }

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
