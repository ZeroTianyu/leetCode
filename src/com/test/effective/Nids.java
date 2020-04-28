package com.test.effective;

/**
 * @Description
 * @Author GuoTy
 * @Create 2020-04-17 18:08
 **/
public class Nids {
    public static void main(String[] args) {
        Abs absExtens = new AbsExtens();
        String handler = absExtens.handler(0.14d);
        System.out.println(handler);


    }
}
