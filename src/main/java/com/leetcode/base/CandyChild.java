package com.leetcode.base;

import java.util.ArrayList;
import java.util.List;

public class CandyChild {
    public  static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> result = new ArrayList<>();
        for (int i = 1; i < candies.length; i++) {
//            if (max < candies[i]){
//                max = candies[i];
//            }
            max = Math.max(max, candies[i]);

        }
        for (int i = 0; i < candies.length; i++) {
            result.add(max <= candies[i] + extraCandies);
        }
        return result;
    }

    public static void main(String[] args) {
//        kidsWithCandies(new int[]{2,3,5,1,3},3);
//        kidsWithCandies(new int[]{4,2,1,1,2},1);
        kidsWithCandies(new int[]{12,1,12},10);
    }
}
