package com.programmers.level1;

public class YearIs2016 {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDate = 0;

        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }

        allDate += (b);  // -1을 안하면 1월1일도 하루 지난걸로 계산됨
        answer = day[allDate % 7];
        return answer;
    }
}
