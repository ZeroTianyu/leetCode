package com.marmot.leetcode.solution038;

/**
 * @author GuoTy
 * @Date 2019/5/6 22:17
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(countAndSay(3));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);

        StringBuilder ret = new StringBuilder();
        int count = 1;
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {

                    ret = ret.append(count).append(str.charAt(i));
                    i = j - 1;
                    count = 1;
                    break;

                }
            }
        }
        ret = ret.append(count).append(str.charAt(len - 1));
        return ret.toString();
    }
}
