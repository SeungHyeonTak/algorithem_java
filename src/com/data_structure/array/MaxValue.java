package com.data_structure.array;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        // 백준 - 최댓값
        Scanner sc = new Scanner(System.in);
        int n = 9;
        Integer[] i_arr = new Integer[n];
        int max = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            i_arr[i] = sc.nextInt();
            if (max < i_arr[i]) {
                max = i_arr[i];
                index = i + 1;
            }
        }
        sc.close();
        System.out.println(max + "\n" + index);
    }
}
