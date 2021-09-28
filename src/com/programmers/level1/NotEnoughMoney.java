package com.programmers.level1;

public class NotEnoughMoney {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) answer += (long) i * price;

        if (answer > money) return answer - money;
        else return 0;
    }
}
