package com.marmot.leetcode.solution664;

import java.util.HashSet;
import java.util.Set;

/**
 * 有台奇怪的打印机有以下两个特殊要求：
 * <p>
 * 打印机每次只能打印由 同一个字符 组成的序列。
 * 每次可以在任意起始和结束位置打印新字符，并且会覆盖掉原来已有的字符。
 * 给你一个字符串 s ，你的任务是计算这个打印机打印它需要的最少打印次数。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：s = "aaabbb"
 * 输出：2
 * 解释：首先打印 "aaa" 然后打印 "bbb"。
 * 示例 2：
 * <p>
 * 输入：s = "aba"
 * 输出：2
 * 解释：首先打印 "aaa" 然后在第二个位置打印 "b" 覆盖掉原来的字符 'a'。
 *
 * @author guotianyu
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.strangePrinter("aaabbb"));
    }

    public int strangePrinter(String s) {
        char[] chars = s.toCharArray();
        Set<String> set = new HashSet<>();
        for (char a : chars) {
            if (!set.contains(a)) {
                set.add(String.valueOf(a));
            }
        }
        return set.size();
    }
}
