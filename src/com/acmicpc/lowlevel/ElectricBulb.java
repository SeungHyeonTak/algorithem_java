package com.acmicpc.lowlevel;

import java.util.Scanner;

// 전구
public class ElectricBulb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int a, b, c;
        StringBuilder answer = new StringBuilder();

        n = sc.nextInt();
        m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if (a == 1) {
                arr[b - 1] = c;
            } else {
                for (int j = b; j <= c; j++) {
                    if (a == 2) {
                        if (arr[j - 1] == 0) arr[j - 1] = 1;
                        else arr[j - 1] = 0;
                    } else if (a == 3) arr[j - 1] = 0;
                    else if (a == 4) arr[j - 1] = 1;
                }
            }
        }

        for (int j : arr) answer.append(j).append(" ");

        System.out.println(answer);
    }
}
