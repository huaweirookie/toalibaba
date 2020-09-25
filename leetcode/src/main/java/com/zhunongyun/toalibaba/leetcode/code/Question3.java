package com.zhunongyun.toalibaba.leetcode.code;

import java.util.HashMap;
import java.util.Map;

public class Question3 {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     *
     * 示例 2:
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例 3:
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     */

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap(s.length());
        int start = 0;
        int end = 0;
        int result = 0;

        for (; end < chars.length; end++) {
            if (map.containsKey(chars[end])) {
                start = Math.max(start, map.get(chars[end]));
            }

            map.put(chars[end], end + 1);
            result = Math.max(result, end - start + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        System.out.println(question3.lengthOfLongestSubstring("dvdf") == 3);
        System.out.println(question3.lengthOfLongestSubstring("dvdf") == 3);
        System.out.println(question3.lengthOfLongestSubstring("pwwkew") == 3);
        System.out.println(question3.lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(question3.lengthOfLongestSubstring(" ") == 1);
        System.out.println(question3.lengthOfLongestSubstring("") == 0);
    }
}