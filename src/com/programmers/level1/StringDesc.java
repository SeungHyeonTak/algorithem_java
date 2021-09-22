package com.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순으로 배치하기
public class StringDesc {
    public String solution(String s) {
        String[] answer = new String[s.length()];
        String result = "";

        for (int i = 0; i < answer.length; i++) {
            answer[i] = s.split("")[i];
        }
        Arrays.sort(answer, Collections.reverseOrder());

        for (String value : answer) {
            result += value;
        }
        return result;
    }
}
