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
        int[] num1 = {1, 3, 5, 7, 8};
        int[] num2 = {2, 4, 6};
        findMedianSortedArrays(num1, num2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums2.length + nums1.length;
        int[] num = new int[totalLength];
        int indexNum1 = 0, indexNum2 = 0;
        for (int i = 0; i < totalLength; i++) {
            if (indexNum1 < nums1.length && indexNum2 < nums2.length) {
                if (nums1[indexNum1] > nums2[indexNum2]) {
                    num[i] = nums2[indexNum2++];
                } else {
                    num[i] = nums1[indexNum1++];
                }
            }else {

            }
        }

        return 0;
    }
}
