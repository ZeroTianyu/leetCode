package com.marmot.leetcode.solution554;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/05/13 11:13
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        List<List<Integer>> wall = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(1);
        list2.add(2);


        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);

        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(4);

        List<Integer> list5 = new ArrayList<>();
        list5.add(3);
        list5.add(1);
        list5.add(2);

        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(3);
        list6.add(1);
        list6.add(1);

        wall.add(list1);
        wall.add(list2);
        wall.add(list3);
        wall.add(list4);
        wall.add(list5);
        wall.add(list6);

        System.out.println(demo1.leastBricks(wall));
    }


    public int leastBricks(List<List<Integer>> wall) {


        int lineLength = wall.get(0).size();

        int minCount = Integer.MAX_VALUE;

        int minIndex = 1;

        for (int i = 0; i < lineLength; i++) {
            int count = 0;
            for (List<Integer> integers : wall) {
                if (i < integers.size()) {
                    count += integers.get(i) == null ? 0 : integers.get(i);
                }
            }
            if (count < minCount) {
                minIndex = i + 1;
                minCount = count;
            }
        }
        return minIndex;
    }
}
