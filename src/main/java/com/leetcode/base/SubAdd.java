package com.leetcode.base;

public class SubAdd {
    public static int subtractProductAndSum(int n) {
        int sw = n / 100000;
        int w = n / 10000 % 10;
        int q = n / 1000 % 10;
        int b = n / 100 % 10;
        int s = n / 10 % 10;
        int g = n % 10;
        int result = (sw == 0 ? 1 : sw) * (w == 0 && sw == 0 ? 1 : w) * (q == 0 & w == 0 && sw == 0 ? 1 : q)
                * (b == 0 && q == 0 & w == 0 && sw == 0 ? 1 : b) * (s == 0 && b == 0 && q == 0 & w == 0 && sw == 0 ? 1 : s)
                * (g == 0 && s == 0 && b == 0 && q == 0 & w == 0 && sw == 0 ? 1 : g) - (sw + w + q + b + s + g);
        System.out.println(result);
        return result;
    }
    public static int subtractProductAndSum2(int n) {
        int addNum = 0;
        int mulNum = 1;
        while (n > 0){
            addNum += n%10;
            mulNum *= n%10;
            n /= 10;
        }
        return mulNum - addNum;
    }

    public static void main(String[] args) {
        subtractProductAndSum(705);
        subtractProductAndSum(705);
    }
}
