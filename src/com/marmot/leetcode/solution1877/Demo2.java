package com.marmot.leetcode.solution1877;

import java.util.regex.Pattern;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/07/20 15:19
 */
public class Demo2 {
    public static void main(String[] args) {
        String pattern = "^(?![&、_-])(?!.*?[-]$)[\\u4e00-\\u9fa5_a-zA-Z-0-9()（）、&]{0,30}$";
        String content = "dasda、、_&?-";

        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }
}
