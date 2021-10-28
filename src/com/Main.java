package com;

import com.programmers.level1.LottoQuestion;

public class Main {
    public static void main(String[] args) {
        LottoQuestion lq = new LottoQuestion();
//        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        lq.solution(lottos, win_nums);
    }
}
