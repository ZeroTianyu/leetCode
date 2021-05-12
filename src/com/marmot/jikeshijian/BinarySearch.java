package com.marmot.jikeshijian;

/**
 * @author: guotianyu
 * @description: 二分查找
 * @create: 2021/05/12 14:53
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.recursionSearch(nums, 6));
        ;
    }

    /**
     * 二分查找循环实现
     *
     * @param nums
     * @param value
     * @return
     */
    public int search(int[] nums, int value) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == value) {
                return mid;
            } else if (nums[mid] > value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找递归实现
     *
     * @param a
     * @param value
     * @return
     */
    public int recursionSearch(int[] a, int value) {
        return bSearchInternally(a, 0, a.length - 1, value);
    }

    /**
     * 二分查找递归实现
     *
     * @param a
     * @param low
     * @param high
     * @param value
     * @return
     */
    public int bSearchInternally(int[] a, int low, int high, int value) {
        int mid = (low + high) / 2;
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return bSearchInternally(a, low, mid - 1, value);
        } else {
            return bSearchInternally(a, low + 1, mid, value);
        }


    }


    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
