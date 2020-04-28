package com.marmot.everyday;

import java.util.*;

/**
 * @Description 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * @Author GuoTy
 * @Create 2020-04-28 11:48
 **/
public class Demo20200428 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 4, 6};

        Demo20200428 demo20200428 = new Demo20200428();
        int[] ints = demo20200428.singleNumbers(nums);
        System.out.println(ints);
    }


    public int[] singleNumbers(int[] nums) {
        List<Integer> arrayList = new ArrayList<>(16);
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            if (arrayList.contains(num)) {
                arrayList.remove(num);
            } else {
                arrayList.add(num);
            }
        }

        int[] ints = arrayList.stream().mapToInt(Integer::valueOf).toArray();

        return ints;
    }
}
