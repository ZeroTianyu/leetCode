package com.marmot.leetcode.solution1711;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/07/07 15:19
 */
public class Demo1 {
    public static void main(String[] args) {

        int[] nums = new int[]{2160, 1936, 3, 29, 27, 5, 2503, 1593, 2, 0, 16, 0, 3860, 28908, 6, 2, 15, 49, 6246, 1946, 23, 105, 7996, 196, 0, 2, 55, 457, 5, 3, 924, 7268, 16, 48, 4, 0, 12, 116, 2628, 1468};

        Demo1 demo1 = new Demo1();
        System.out.println(demo1.countPairs(nums));
    }


    public int countPairs(int[] deliciousness) {
        List<Integer> delicacy = new ArrayList<>();
        for (int i = 0; i < deliciousness.length; i++) {
            for (int j = i + 1; j < deliciousness.length; j++) {
                int delicious = deliciousness[i] + deliciousness[j];

                if (delicious > 0 && (delicious & delicious - 1) == 0) {
                    delicacy.add(delicious);
                }
            }
        }
        return delicacy.size();
    }
}
