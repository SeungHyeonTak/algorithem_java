package com;

import com.programmers.level1.PlayerNotFinishRace;

public class Main {
    public static void main(String[] args) {
        PlayerNotFinishRace play = new PlayerNotFinishRace();
//        String[] participant = {"leo", "kiki", "eden"};
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"eden", "kiki"};
        String[] completion = {"stanko", "ana", "mislav"};
        play.solution(participant, completion);
    }
}
