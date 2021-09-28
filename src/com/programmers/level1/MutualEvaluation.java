package com.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 상호 평가
public class MutualEvaluation {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        ArrayList<Integer> iArr = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            int max;
            int min;
            int imaxDel = 0;
            int iminDel = 0;
            double exValue = 0;
            int division = scores.length;

            for (int[] score : scores) iArr.add(score[i]);

            for (int k = 0; k < iArr.size(); k++) {
                max = Collections.max(iArr);
                min = Collections.min(iArr);
                if (max == iArr.get(i) && Collections.frequency(iArr, max) == 1) {
                    imaxDel = iArr.get(i);
                }
                if (min == iArr.get(i) && Collections.frequency(iArr, min) == 1) {
                    iminDel = iArr.get(i);
                }
                exValue += iArr.get(k);
            }
            if (imaxDel != 0) {
                exValue -= imaxDel;
                division -= 1;
            }
            if (iminDel != 0) {
                exValue -= iminDel;
                division -= 1;
            }

            exValue /= division;

            if (exValue >= 90) {
                answer.append("A");
            } else if (exValue >= 80) {
                answer.append("B");
            } else if (exValue >= 70) {
                answer.append("C");
            } else if (exValue >= 50) {
                answer.append("D");
            } else {
                answer.append("F");
            }
            iArr = new ArrayList<>();
        }
        return answer.toString();
    }
}
