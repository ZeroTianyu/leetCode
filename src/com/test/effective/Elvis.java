package com.test.effective;

/**
 * @author 郭天宇
 * @Description
 * @create 2020-04-03 15:57
 */
public class Elvis {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
    }
}
