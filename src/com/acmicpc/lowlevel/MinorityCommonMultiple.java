package com.acmicpc.lowlevel;

import java.util.Scanner;

public class MinorityCommonMultiple {
    public static boolean sosu(long arr) {
        for (int i = 2; i < Math.sqrt(arr); i++) {
            if (arr % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 최대 공약수
    public static long gcd(long x, long y) {
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    // 최소 공배수
    public static long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 1;

        for (int i = 0; i < n; i++) {
            long a = sc.nextInt();
            if (sosu(a)) {
                ans = lcm(ans, a);
            }
        }

        if (ans == 1) System.out.println(-1);
        else System.out.println(ans);
    }
}
