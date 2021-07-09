package com.marmot.interview;

/**
 * @author: guotianyu
 * @description: 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * <p>
 * 返回的长度需要从小到大排列。
 * <p>
 * 示例 1
 * <p>
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： [3,4,5,6]
 * 解释：
 * 可以使用 3 次 shorter，得到结果 3；使用 2 次 shorter 和 1 次 longer，得到结果 4 。以此类推，得到最终结果
 * @create: 2021/07/09 08:48
 */
public class Interview16_11 {
    public static void main(String[] args) {
        Interview16_11 interview16_11 = new Interview16_11();
        int[] ints = interview16_11.divingBoard(1, 1, 100000);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[]{};
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int index = shorter * k;
        int[] res = new int[k + 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = index;
            index -= shorter;
            index += longer;
        }
        return res;
    }
}
