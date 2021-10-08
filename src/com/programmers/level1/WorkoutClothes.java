package com.programmers.level1;

import java.util.Arrays;

public class WorkoutClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int numStu = 0;
        int count = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    numStu++; // 여분있었는데 도난 당한 학생 수
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] - 1 == lost[i] || reserve[j] + 1 == lost[i]) {
                    count++; // 여분 빌린 학생수
                    reserve[j] = -1;
                    break;
                }
            }
        }

        answer = n - lost.length + numStu + count;

        return answer;
    }
}
