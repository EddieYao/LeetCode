package com.leetcode.base;

public class ValidBrackets {

    public static int longestValidParentheses(String s) {
        String validBra = "()";
        int findCharLength = validBra.length();
        int length = s.length();
        int count = 0;
        int i = 0;
        while (i < length) {
            if (length < findCharLength + i) {
                break;
            }
            String result = s.substring(i, i + findCharLength);
            i++;
            if (validBra.indexOf(result) != -1) {
                i = 0;
                s = s.replace(validBra, "");
                count += length - s.length();
                length = length - (length - s.length());
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(()"));
    }

}
