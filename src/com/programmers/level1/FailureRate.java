package com.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 실패율
public class FailureRate {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        ArrayList<Double> d_list = new ArrayList<>();
        int pre_temp = 0;
        int len = stages.length;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            int len_count = 0;
            double result;
            for (int stage : stages) {
                if (i == stage) count++;
                if (pre_temp == stage) len_count++;
            }
            len -= len_count;
            result = (double) count / len;
            if (Double.isNaN(result)) result = 0.0;
            pre_temp = i;
            d_list.add(result);
        }

        ArrayList<Double> copy_list = new ArrayList<>(d_list);
        d_list.sort(Collections.reverseOrder());

        for (int i = 0; i < d_list.size(); i++) {
            for (int j = 0; j < copy_list.size(); j++) {
                if (d_list.get(i).equals(copy_list.get(j))) {
                    answer[i] = j + 1;
                    copy_list.set(j, -1.0);
                    break;
                }
            }
        }
        return answer;
    }
}
