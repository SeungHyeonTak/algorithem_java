package com.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 나누어 떨어지는 숫자 배열
public class NumberArray {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        int count = 0;
        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
                count++;
            }
        }


        if (count != 0) {
            answer = new int[list.size()];
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        } else {
            answer = new int[]{-1};
        }

        return answer;
    }
}
