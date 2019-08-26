package com.marmot.leetcode.solution697;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * create by GuoTy on 2019/7/19
 * copyright © 2017-2019 Legym Technology Co.,Ltd. All rights reserved.
 * file description:
 * last update by {} on {}
 * update description:
 *
 * @author GuoTy
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 7};

        findShortestSubArray(nums);

    }

    public static int findShortestSubArray(int[] nums) {
        int maxLength = getMaxLength(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxLength) {
                list.add(i);
            }
        }
        int shortData = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                if ((list.get(i) - list.get(i + 1)) < shortData) {
                    shortData = Math.abs((list.get(i) - list.get(i + 1))) + 1;
                }
            }
        }
        return shortData;
    }

    public static int getMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(16);

        Integer maxLength = 0;
        for (int i : nums) {
            Integer integer = hashMap.get(i);
            if (integer == null) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, ++integer);
                Integer temp = hashMap.get(i);
                if (temp > maxLength) {
                    maxLength = temp;
                }
            }
        }
        return maxLength;
    }
}
