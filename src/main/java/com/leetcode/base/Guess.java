package com.leetcode.base;

public class Guess {
    public static int game(int[] guess, int[] answer) {
        int count = 0;
        int i = 0;
        while (i < guess.length) {
            count = guess[i] == answer[i] ? ++count : count;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        game(new int[]{2,2,3}, new int[]{3,2,1});
    }
}
