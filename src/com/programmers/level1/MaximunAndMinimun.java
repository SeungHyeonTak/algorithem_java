package com.programmers.level1;

import java.util.Arrays;

// 최대공약수와 최소공배수
public class MaximunAndMinimun {
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max, min;

        if (n <= m) {
            max = m;
            min = n;
        } else {
            max = n;
            min = m;
        }

        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];
//        int commonDivisor = 0;
//        int valueA = 0;
//        int valueB = 0;
//
//        if (n < m) {
//            commonDivisor = m % n;
//            valueA = n;
//            valueB = m;
//        } else {
//            commonDivisor = n % m;
//            valueA = m;
//            valueB = n;
//        }
//
//        if (commonDivisor != 0) {
//            while (valueA % commonDivisor != 0 && valueB % commonDivisor != 0) {
//                commonDivisor = valueA % commonDivisor;
//            }
//            valueA /= commonDivisor;
//            valueB /= commonDivisor;
//        } else {
//            commonDivisor = valueA;
//            valueB /= valueA;
//            valueA /= valueA;
//        }
//        answer[0] = commonDivisor;
//        answer[1] = commonDivisor * valueA * valueB;

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
