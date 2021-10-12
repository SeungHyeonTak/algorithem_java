package com;

import com.programmers.level1.DotProduct;

public class Main {
    public static void main(String[] args) {
        DotProduct dp = new DotProduct();
//        int[] a = {1, 2, 3, 4};
        int[] a = {-1, 0, 1};
//        int[] b = {-3, -1, 0, 2};
        int[] b = {1, 0, -1};
        dp.solution(a, b);
    }
}
