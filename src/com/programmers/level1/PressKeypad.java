package com.programmers.level1;

// 2020 카카오 인턴십 - 키패드 누르기
public class PressKeypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftLoc = 10;  // *
        int rightLoc = 12;  // #

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                leftLoc = number;
                answer.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                rightLoc = number;
                answer.append("R");
            } else {
                int leftLength = getLength(leftLoc, number);
                int rightLength = getLength(rightLoc, number);

                if (leftLength > rightLength) {
                    answer.append("R");
                    rightLoc = number;
                } else if (leftLength < rightLength) {
                    answer.append("L");
                    leftLoc = number;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightLoc = number;
                    } else {
                        answer.append("L");
                        leftLoc = number;
                    }
                }
            }
        }
        System.out.println(answer.toString());
        return answer.toString();
    }

    public static int getLength(int index, int number) {
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x - numberX) + Math.abs(y - numberY);
    }
}
