package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 복서 정렬하기
public class BoxerSorting {
    static class Player implements Comparable<Player> {
        int num, weight, overWin;
        double winRate;

        public Player(int num, int weight, int overWin, double winRate) {
            this.num = num;
            this.weight = weight;
            this.overWin = overWin;
            this.winRate = winRate;
        }

        @Override
        public int compareTo(Player o) {
            if (this.winRate > o.winRate) {
                return -1;
            } else if (this.winRate == o.winRate) {
                if (this.overWin > o.overWin) {
                    return -1;
                } else if (this.overWin == o.overWin) {
                    if (this.weight > o.weight) {
                        return -1;
                    } else if (this.weight == o.weight) {
                        if (o.num > this.num) {
                            return -1;
                        }
                        return 1;
                    }
                    return 1;
                } else {
                    return 1;
                }
            }
            return 1;
        }
    }

    public int[] solution(int[] weights, String[] head2head) {
        int total = weights.length;
        List<Player> list = new ArrayList<>();

        for (int i = 0; i < total; i++) {
            int playCount = 0, winCount = 0, overWinCount = 0;
            String score = head2head[i];
            for (int j = 0; j < total; j++) {
                if (i == j || score.charAt(j) == 'N') continue;
                playCount++;
                if (score.charAt(j) == 'W') {
                    winCount++;
                    if (weights[j] > weights[i]) {
                        overWinCount++;
                    }
                }
            }
            double cal = 0;
            if (playCount > 0) {
                cal = winCount / (double) playCount;
            }
            list.add(new Player(i + 1, weights[i], overWinCount, cal));
        }
        Collections.sort(list);
        int[] answer = new int[total];
        for (int i = 0; i < total; i++) {
            answer[i] = list.get(i).num;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
