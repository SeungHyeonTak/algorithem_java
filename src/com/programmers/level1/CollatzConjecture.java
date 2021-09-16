package com.programmers.level1;

// 콜라츠 추측
// 1. 입력된 수가 짝수라면 2로 나눈다.
// 2. 입력된 수가 홀수라면 3을 곱하고 1을 더한다.
// 3. 결과로 나온 수에 같은 작업을 1이 될때까지 반복한다.
public class CollatzConjecture {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (answer == 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer += 1;
        }
        return answer;
    }
}
