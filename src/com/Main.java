package com;

import com.programmers.level1.RecommendNewID;

public class Main {
    public static void main(String[] args) {
        RecommendNewID rn = new RecommendNewID();
//        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String new_id = "~!@#$%&*()=+[{]}:?,<>/";
        rn.solution(new_id);
    }
}
