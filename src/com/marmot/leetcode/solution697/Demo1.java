package com.marmot.leetcode.solution697;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        Demo1 demo1 = new Demo1();
        int shortestSubArray = demo1.findShortestSubArray(nums);
        System.out.println(shortestSubArray);

    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap(),
                right = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) {
                left.put(x, i);
            }
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
