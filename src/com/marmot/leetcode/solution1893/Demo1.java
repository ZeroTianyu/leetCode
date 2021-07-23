package com.marmot.leetcode.solution1893;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/07/23 14:21
 */
public class Demo1 {
    public static void main(String[] args) {
        int[][] num = new int[][]{{1, 1}};
        Demo1 demo1 = new Demo1();
        boolean covered = demo1.isCovered(num, 1, 50);
        System.out.println(covered);
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];   // 差分数组
        for (int[] range : ranges) {
            ++diff[range[0]];
            --diff[range[1] + 1];
        }
        // 前缀和
        int curr = 0;
        for (int i = 1; i <= 50; ++i) {
            curr += diff[i];
            if (i >= left && i <= right && curr <= 0) {
                return false;
            }
        }
        return true;
    }
}
