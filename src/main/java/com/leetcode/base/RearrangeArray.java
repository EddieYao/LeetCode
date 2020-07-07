package com.leetcode.base;

public class RearrangeArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int[] prefixArray = new int[n];
        int[] lastArray = new int[n];
        for (int i = 0; i < n; i++) {
            prefixArray[i] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            lastArray[i] = nums[i + n];
        }
        System.out.println(result[0]);
        for (int i = 1; i < nums.length; i++) {
            result[i] = i % 2 == 0 ? prefixArray[i / 2] : lastArray[i / 2];
            System.out.println(result[i]);
        }
        return result;
    }

    public static int[] shuffle2(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int i = 0;
        int j = n;
        while (i < n && j < 2 * n) {
            arr[i + i] = nums[i];
            arr[i + i + 1] = nums[j];
            i++;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        // 1 2 1 2
        shuffle(new int[]{1, 1, 2, 2}, 2);
        shuffle2(new int[]{1, 1, 2, 2}, 2);
    }
}
