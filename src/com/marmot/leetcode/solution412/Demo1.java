package com.marmot.leetcode.solution412;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: guotianyu
 * @Description:
 * @Date: 2021/10/13
 **/
public class Demo1 {

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                list.add(fizzBuzz);
            }else if (i % 3==0){
                list.add(fizz);
            }else if (i % 5==0){
                list.add(buzz);
            }else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
