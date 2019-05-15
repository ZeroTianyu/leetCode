package com.marmot.leetcode.solution058;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 *
 * @author GuoTy
 * @Date 2019/5/8 16:57
 */
public class Demo1 {
    public static void main(String[] args) {
        int hello_world = lengthOfLastWord("adsada bv");
        System.out.println(hello_world);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();

        int len = s.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return len - i;
            }
        }
        return len + 1;
    }
}
