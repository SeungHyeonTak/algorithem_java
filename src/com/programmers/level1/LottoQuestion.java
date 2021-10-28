package com.programmers.level1;

public class LottoQuestion {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero_count = 0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int lotto : lottos) {
                if (win_nums[i] == lotto) count++;
            }
            if (lottos[i] == 0) zero_count++;
        }
        int first = this.rank(count + zero_count);
        int last = this.rank(count);
        answer[0] = first;
        answer[1] = last;

        return answer;
    }

    public int rank(int count) {
        return switch (count) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
