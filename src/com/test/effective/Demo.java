package com.test.effective;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.function.Supplier;

/**
 * @author 郭天宇
 * @Description
 * @create 2020-04-03 15:58
 */
public class Demo {
    public static void main(String[] args) {
        Elvis instance = Elvis.getInstance();
        instance.getName();
        Runnable getInstance = Elvis::getInstance;

        Supplier<Elvis> d = null;
        Elvis elvis = d.get();
        RomanNumerals.isRomanNumeral("");
        try (InputStream inputStream = new FileInputStream("")) {

        } catch (Exception e) {

        }


    }

}
