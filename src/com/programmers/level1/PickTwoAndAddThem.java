package com.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// 두 개 뽑아서 더하기
public class PickTwoAndAddThem {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int result;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    result = numbers[i] + numbers[j];
                    if (!list.contains(result)) {
                        list.add(result);
                    }
                }
            }
        }

        Collections.sort(list);
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);

        return answer;
    }
}
