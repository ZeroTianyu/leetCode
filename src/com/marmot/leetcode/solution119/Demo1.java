package com.marmot.leetcode.solution119;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: [1,3,3,1]
 * <p>
 * 进阶：
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 * <p>
 * <p>
 * create by GuoTy on 2019/5/28
 * copyright © 2017-2019 Legym Technology Co.,Ltd. All rights reserved.
 * file description:
 * last update by {} on {}
 * update description:
 *
 * @author GuoTy
 */
public class Demo1 {
    public static void main(String[] args) {

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> triangle = new ArrayList<Integer>();
        if (rowIndex == 0) {
            return triangle;
        }
        triangle.add(1);
        for (int rowNum = 1; rowNum < rowIndex; rowNum++) {
            for (int i = 0; i < rowNum; i++) {

            }
        }
        return triangle;
    }
}
