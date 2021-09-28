package com;

import com.programmers.level1.SecretMap;

public class Main {
    public static void main(String[] args) {
        SecretMap sp = new SecretMap();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
//        int n = 6;
//        int[] arr1 = {46, 33, 33, 22, 31, 50};
//        int[] arr2 = {27, 56, 19, 14, 14, 10};
        sp.solution(n, arr1, arr2);
    }
}
