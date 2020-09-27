package com.zhunongyun.toalibaba.leetcode.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Offer3 {

    /**
     * 找出数组中重复的数字。
     *
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * 示例 1：
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     *
     *
     *
     * 限制：
     * 2 <= n <= 100000
     */

    public int findRepeatNumber(int[] nums) {
        /**
         * 野蛮办法,遍历集合放入 set 中,通过 set 来判定是否重复
         */
//        if (null == nums || nums.length < 2 || nums.length > 100000) {
//            return -1;
//        }
//
//        Set<Integer> set = new HashSet<>();
//        for (int data : nums) {
//            if (set.contains(data)) {
//                return data;
//            }
//            set.add(data);
//        }
//        return -1;
        /**
         * 先排序, 再前后两两对比是否相等
         */
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Offer3 offer3 = new Offer3();
        System.out.println(offer3.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
}
