package com.marmot.leetcode.solution1598;

/**
 * 每当用户执行变更文件夹操作时，LeetCode 文件系统都会保存一条日志记录。
 * <p>
 * 下面给出对变更操作的说明：
 * <p>
 * "../" ：移动到当前文件夹的父文件夹。如果已经在主文件夹下，则 继续停留在当前文件夹 。
 * "./" ：继续停留在当前文件夹。
 * "x/" ：移动到名为 x 的子文件夹中。题目数据 保证总是存在文件夹 x 。
 * 给你一个字符串列表 logs ，其中 logs[i] 是用户在 ith 步执行的操作。
 * <p>
 * 文件系统启动时位于主文件夹，然后执行 logs 中的操作。
 * <p>
 * 执行完所有变更文件夹操作后，请你找出 返回主文件夹所需的最小步数 。
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：logs = ["d1/","d2/","../","d21/","./"]
 * 输出：2
 * 解释：执行 "../" 操作变更文件夹 2 次，即可回到主文件夹
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：logs = ["d1/","d2/","./","d3/","../","d31/"]
 * 输出：3
 * 示例 3：
 * <p>
 * 输入：logs = ["d1/","../","../","../"]
 * 输出：0
 *
 * @author: guotianyu
 * @description:
 * @create: 2021/06/01 22:37
 */
public class Demo1 {
    public static void main(String[] args) {

    }

    /**
     * @param logs
     * @return
     */
    public int minOperations(String[] logs) {
        int count = 0;
        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            } else if (log.equals("../")) {
                if (count > 0) {
                    count--;
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
