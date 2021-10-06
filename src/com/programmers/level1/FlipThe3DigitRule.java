package com.programmers.level1;

// 3진법 뒤집기
public class FlipThe3DigitRule {
    public int solution(int n) {
        int answer = 0;
        StringBuilder result = new StringBuilder();

        while (true) {
            if (n < 3) {
                result.append(n);
                break;
            }
            result.append(n % 3);
            n /= 3;
        }

        for (int i = 0; i < result.length(); i++) {
            char c = result.toString().toCharArray()[i];
            int a = Integer.parseInt(String.valueOf(c));
            answer += a * Math.pow(3, result.length() - i - 1);
        }
        System.out.println(answer);
        return answer;
    }
}
