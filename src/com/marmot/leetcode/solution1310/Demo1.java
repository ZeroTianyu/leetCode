package com.marmot.leetcode.solution1310;

/**
 * @author: guotianyu
 * @description: 有一个正整数数组 arr，现给你一个对应的查询数组 queries，其中 queries[i] = [Li, Ri]。
 * <p>
 * 对于每个查询 i，请你计算从 Li 到 Ri 的 XOR 值（即 arr[Li] xor arr[Li+1] xor ... xor arr[Ri]）作为本次查询的结果。
 * <p>
 * 并返回一个包含给定查询 queries 所有结果的数组。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
 * 输出：[2,7,14,8]
 * 解释：
 * 数组中元素的二进制表示形式是：
 * 1 = 0001
 * 3 = 0011
 * 4 = 0100
 * 8 = 1000
 * 查询的 XOR 值为：
 * [0,1] = 1 xor 3 = 2
 * [1,2] = 3 xor 4 = 7
 * [0,3] = 1 xor 3 xor 4 xor 8 = 14
 * [3,3] = 8
 * 示例 2：
 * <p>
 * 输入：arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
 * 输出：[8,0,4,4]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 3 * 10^4
 * 1 <= arr[i] <= 10^9
 * 1 <= queries.length <= 3 * 10^4
 * queries[i].length == 2
 * 0 <= queries[i][0] <= queries[i][1] < arr.length
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xor-queries-of-a-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @create: 2021/05/13 09:22
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        int[] arr = new int[]{1, 3, 4, 8};
        int[][] queries = new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] xorQueries = demo1.xorQueries(arr, queries);
        for (int i = 0; i < xorQueries.length; i++) {
            System.out.println(xorQueries[i]);
        }
    }


    public int[] xorQueries(int[] arr, int[][] queries) {

        int[] nums = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int[] ints = queries[q];
            int xorNum = 0;
            for (int i = ints[0]; i <= ints[1]; i++) {
                if (xorNum == 0) {
                    xorNum = arr[i];
                } else {
                    xorNum = xorNum ^ arr[i];
                }
            }

            nums[q] = xorNum;
        }
        return nums;
    }
}
