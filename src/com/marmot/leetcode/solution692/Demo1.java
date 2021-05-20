package com.marmot.leetcode.solution692;

import java.util.*;

/**
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * <p>
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * <p>
 * 示例 1：
 * <p>
 * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 * 注意，按字母顺序 "i" 在 "love" 之前。
 *  
 * <p>
 * 示例 2：
 * <p>
 * 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * 输出: ["the", "is", "sunny", "day"]
 * 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
 * 出现次数依次为 4, 3, 2 和 1 次。
 *  
 * <p>
 * 注意：
 * <p>
 * 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
 * 输入的单词均由小写字母组成。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author: guotianyu
 * @description:
 * @create: 2021/05/20 21:27
 */
public class Demo1 {

    public static void main(String[] args) {

        String[] strings = new String[]{"i", "love", "leetcode", "i", "love", "coding"};

        Demo1 demo1 = new Demo1();
        List<String> list = demo1.topKFrequent(strings, 2);

        System.out.println(list);
    }


    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>(16);
        for (String word : words) {
            if (map.get(word) == null) {
                map.put(word, 1);
            } else {
                Integer count = map.get(word);
                map.put(word, ++count);
            }
        }
        List<String> rec = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            rec.add(entry.getKey());
        }
        Collections.sort(rec, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return map.get(word1).equals(map.get(word2)) ? word1.compareTo(word2) : map.get(word2) - map.get(word1);
            }
        });
        return rec.subList(0, k);

    }
}
