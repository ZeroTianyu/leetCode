package com.marmot.leetcode.solution004;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * <p>
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * <p>
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * <p>
 * 示例 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 则中位数是 2.0
 * 示例 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * @author GuoTy
 * @Date 2019/5/11 17:35
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        double medianSortedArrays = findMedianSortedArrays(num1, num2);
        System.out.println(medianSortedArrays);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;
        int[] nums = new int[totalSize];

        int numsIndex1 = 0;
        int numsIndex2 = 0;

        for (int i = 0; i < totalSize; i++) {
            if (numsIndex1 == nums1.length) {
                nums[i] = nums2[numsIndex2];
                numsIndex2++;
                continue;
            }

            if (numsIndex2 == nums2.length) {
                nums[i] = nums1[numsIndex1];
                numsIndex1++;
                continue;
            }

            if (nums1[numsIndex1] < nums2[numsIndex2]) {
                nums[i] = nums1[numsIndex1];
                numsIndex1++;
            } else {
                nums[i] = nums2[numsIndex2];
                numsIndex2++;
            }
        }

        int index = totalSize / 2;
        if (totalSize % 2 == 0) {

            return (double) ((nums[index - 1] + nums[index])) / 2;
        } else {

            return nums[index];
        }
    }
}
