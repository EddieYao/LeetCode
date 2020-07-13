package com.leetcode.base;

import java.util.HashSet;
import java.util.Set;

public class Stone {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> preSet = new HashSet<>();
        for (int i = 0; i < J.toCharArray().length; i++) {
            preSet.add(J.toCharArray()[i]);
        }
        int count = 0;
        for (int i = 0; i < S.toCharArray().length; i++) {
            if (preSet.contains(S.toCharArray()[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        numJewelsInStones("z", "ZZ");
    }
}
