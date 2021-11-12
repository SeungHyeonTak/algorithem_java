package com.programmers.level2;

public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        s = s.toLowerCase();
        answer.append(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') answer.append(" ");
            else if (s.charAt(i - 1) == ' ') answer.append(Character.toUpperCase(s.charAt(i)));
            else answer.append(s.charAt(i));
        }

        return answer.toString();
    }
}
