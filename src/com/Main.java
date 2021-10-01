package com;

import com.programmers.level1.BoxerSorting;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BoxerSorting bs = new BoxerSorting();
        int[] weights = {50, 82, 75, 120};
//        int[] weights = {145,92,86};
//        int[] weights = {160,70,60};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};
//        String[] head2head = {"NLW","WNL","LWN"};
//        String[] head2head = {"NNN","NNN","NNN"};
        bs.solution(weights, head2head);
    }
}
