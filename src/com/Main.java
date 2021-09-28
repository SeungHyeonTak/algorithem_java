package com;

import com.programmers.level1.NotEnoughMoney;

public class Main {
    public static void main(String[] args) {
        NotEnoughMoney ne = new NotEnoughMoney();
        int price = 3;
        int money = 20;
        int count = 4;
        ne.solution(price, money, count);
    }
}
