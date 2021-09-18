package com.programmers.level1;

import java.util.Arrays;
import java.util.Locale;

public class WeirdText {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split("");
        int count = 0;
        for (String value : str) {
            if (value.equals(" ")) {
                count = 0;
                answer.append(" ");
                continue;
            }
            if (count % 2 == 0) {
                answer.append(value.toUpperCase());
            } else {
                answer.append(value.toLowerCase());
            }
            count++;
        }
        System.out.println(answer.toString());
        return answer.toString();
    }
}
