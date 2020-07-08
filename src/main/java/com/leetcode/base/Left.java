package com.leetcode.base;

public class Left {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        reverseLeftWords("lrloseumgh", 6);
    }
}
