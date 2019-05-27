package com.marmot.leetcode.solution142;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * create by GuoTy on 2019/5/27
 * copyright © 2017-2019 Legym Technology Co.,Ltd. All rights reserved.
 * file description:
 * last update by {} on {}
 * update description:
 */
public class MinStack {
    private List<Integer> arrList = new ArrayList<>();

    public MinStack() {

    }

    public void push(int x) {
        arrList.add(x);
    }

    public void pop() {
        arrList.remove(arrList.size() - 1);
    }

    public int top() {
        return arrList.get(arrList.size() - 1);
    }

    public int getMin() {
        int min = arrList.get(0);
        for (Integer integer : arrList) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }
}
