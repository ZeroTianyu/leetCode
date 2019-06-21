package com.marmot.leetcode.solution169;

import java.util.HashMap;
import java.util.Map;

/**
 * create by GuoTy on 2019/6/21
 * copyright © 2017-2019 Legym Technology Co.,Ltd. All rights reserved.
 * file description:
 * last update by {} on {}
 * update description:
 *
 * @author GuoTy
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        Demo1 demo1 = new Demo1();
        int i = demo1.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer integer = map.get(num);
            if (integer != null) {
                map.put(num, integer + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            Integer count = map.get(integer);
            if (count > majorityCount) {
                return integer;
            }
        }
        return -1;
    }
}
