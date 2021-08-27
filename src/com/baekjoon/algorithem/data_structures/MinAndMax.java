package com.baekjoon.algorithem.data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        // 백준 - 최소, 최대
        // 메모리도 많이 잡아먹고 시간도 오래걸림
        // 메모리 324204 / 시간 2804 ms
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] i_arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            i_arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(i_arr);
        System.out.println(i_arr[0] + " " + i_arr[n - 1]);
    }
}
