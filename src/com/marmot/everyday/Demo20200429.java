package com.marmot.everyday;

/**
 * 给你一个 山脉数组 mountainArr，请你返回能够使得 mountainArr.get(index) 等于 target 最小 的下标 index 值。
 * <p>
 * 如果不存在这样的下标 index，就请返回 -1。
 * 何为山脉数组？如果数组 A 是一个山脉数组的话，那它满足如下条件：
 * <p>
 * 首先，A.length >= 3
 * <p>
 * 其次，在 0 < i < A.length - 1 条件下，存在 i 使得：
 * <p>
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *  
 * <p>
 * 你将 不能直接访问该山脉数组，必须通过 MountainArray 接口来获取数据：
 * <p>
 * MountainArray.get(k) - 会返回数组中索引为k 的元素（下标从 0 开始）
 * MountainArray.length() - 会返回该数组的长度
 *  
 * <p>
 * 注意：
 * <p>
 * 对 MountainArray.get 发起超过 100 次调用的提交将被视为错误答案。此外，任何试图规避判题系统的解决方案都将会导致比赛资格被取消。
 * <p>
 * 为了帮助大家更好地理解交互式问题，我们准备了一个样例 “答案”：https://leetcode-cn.com/playground/RKhe3ave，请注意这 不是一个正确答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：array = [1,2,3,4,5,3,1], target = 3
 * 输出：2
 * 解释：3 在数组中出现了两次，下标分别为 2 和 5，我们返回最小的下标 2。
 * 示例 2：
 * <p>
 * 输入：array = [0,1,2,4,2,1], target = 3
 * 输出：-1
 * 解释：3 在数组中没有出现，返回 -1。
 *
 * @Description 山脉数组
 * @Author GuoTy
 * @Create 2020-04-29 9:41
 **/
public class Demo20200429 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3, 1};

        MountainArray mountainArray = new MountainArrayImpl(nums);

        Demo20200429 demo20200429 = new Demo20200429();
        int inMountainArray = demo20200429.findInMountainArray(3, mountainArray);

        System.out.println(inMountainArray);

    }


    public int findInMountainArray(int target, MountainArray mountainArr) {
        int pIdx = peakIndex(mountainArr);
        int res = binarySearch(target, mountainArr, 0, pIdx, true);
        return res >= 0 ? res : binarySearch(target, mountainArr, pIdx, mountainArr.length() - 1, false);

    }


    private int binarySearch(int target, MountainArray mountainArr, int begin, int end, boolean mode) {
        while (begin < end) {
            int mid = (begin + end) >> 1;
            Integer mid_val = mountainArr.get(mid);
            if (mid_val == target) return mid;
            if (mid_val > target == mode) end = mid - 1;
            else begin = mid + 1;
        }
        return mountainArr.get(begin) == target ? begin : -1;
    }


    private int peakIndex(MountainArray mountainArr) {
        int low = 0, high = mountainArr.length() - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (mid == 0) return 1;
            if (mid == mountainArr.length() - 1) return mountainArr.length() - 2;
            Integer mid_val = mountainArr.get(mid),
                    left_val = mountainArr.get(mid - 1),
                    right_val = mountainArr.get(mid + 1);
            if (mid_val > left_val && mid_val > right_val) return mid;
            if (left_val - mid_val > 0) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }


}

interface MountainArray {
    int get(int index);

    int length();
}


class MountainArrayImpl implements MountainArray {
    private int[] arr;
    private int size;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
        this.size = this.arr.length;
    }

    @Override
    public int get(int index) {
        return this.arr[index];
    }

    @Override
    public int length() {
        return this.size;
    }

}


