package com.marmot.leetcode.solution014;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 在真实的面试中遇到过这道题？
 *
 * @author 18465
 * @Date 2019/4/15 23:24
 */
public class Demo1 {
    public static void main(String[] args) {
        String[] strings = {"a"};

        String s = longestCommonPrefix(strings);
        System.out.println(s);

    }

    public static String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        //以第一个字符为基准
        String string = strings[0];
        String substring = "";

        //要返回的字符
        String returnString = "";

        for (int i = 0; i <= string.length(); i++) {

            substring = string.substring(0, i);
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].startsWith(substring)) {
                    returnString = substring;
                } else {
                    returnString = returnString.substring(0, returnString.length() - 1);
                    return returnString;
                }

            }

        }
        return returnString;
    }
}
