package com.programmers.level1;

import java.util.Arrays;

public class SortStringYouWant {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
