package com.marmot.leetcode.solution088;


/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * <p>
 * 思路：先把数全部放到一个数组里面，然后在排序
 * 执行用时 : 7 ms, 在Merge Sorted Array的Java提交中击败了9.05% 的用户
 * 内存消耗 : 34.9 MB, 在Merge Sorted Array的Java提交中击败了93.19% 的用户
 *
 * @author GuoTy
 * @Date 2019/5/16 11:28
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 4, 5, 6, 0};
        int[] num2 = {3};
        Demo1 demo1 = new Demo1();
        demo1.merge(num1, 5, num2, 1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        if (nums2.length <= 0 || n <= 0) {
            return;
        }
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }

        for (int i = 0; i < nums1.length; i++) {
            for (int k = 0; k < nums1.length - 1 - i; k++) {
                if (nums1[k] > nums1[k + 1]) {
                    int temp = nums1[k];
                    nums1[k] = nums1[k + 1];
                    nums1[k + 1] = temp;
                }
            }
        }
    }
}