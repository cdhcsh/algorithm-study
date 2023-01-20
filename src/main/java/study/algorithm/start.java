package study.algorithm;

import study.algorithm.programmers.*;

import java.util.Arrays;
import java.util.Optional;


public class start {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new P0078().solution(
                new int[][]{{40, 10000}, {25, 10000}},
                new int[]{7000, 9000}
        )));
    }
}