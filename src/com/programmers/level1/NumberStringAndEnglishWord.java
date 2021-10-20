package com.programmers.level1;

// 숫자 문자열과 영단어
public class NumberStringAndEnglishWord {
    // 영문 + 숫자 -> 숫자
    public int solution(String s) {
        int answer = 0;
        StringBuilder temp = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) sb.append(s.split("")[i]);
            else temp.append(s.split("")[i]);

            switch (temp.toString()) {
                case "zero" -> {
                    sb.append(0);
                    temp = new StringBuilder();
                }
                case "one" -> {
                    sb.append(1);
                    temp = new StringBuilder();
                }
                case "two" -> {
                    sb.append(2);
                    temp = new StringBuilder();
                }
                case "three" -> {
                    sb.append(3);
                    temp = new StringBuilder();
                }
                case "four" -> {
                    sb.append(4);
                    temp = new StringBuilder();
                }
                case "five" -> {
                    sb.append(5);
                    temp = new StringBuilder();
                }
                case "six" -> {
                    sb.append(6);
                    temp = new StringBuilder();
                }
                case "seven" -> {
                    sb.append(7);
                    temp = new StringBuilder();
                }
                case "eight" -> {
                    sb.append(8);
                    temp = new StringBuilder();
                }
                case "nine" -> {
                    sb.append(9);
                    temp = new StringBuilder();
                }
            }
        }

        answer = Integer.parseInt(sb.toString());
        return answer;
    }
}
