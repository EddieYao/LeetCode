package com.leetcode.base;

public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] resultNum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            resultNum[i] = nums[i];
                resultNum[i] = nums[i];
            if (i != 0) {
                resultNum[i] += resultNum[i-1];
            }
        }
        return resultNum;
    }

    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1,2,3,4}));
    }
}
