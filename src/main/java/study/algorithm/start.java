package study.algorithm;

import study.algorithm.programmers.*;

import java.util.Arrays;
import java.util.Optional;


public class start {
    public static void main(String[] args) {
        int n = 20;
        int p = 1;
        int s = 0;
        int[] solution = new P0067().solution(n);
        for(int i = 0 ; i < solution.length ; i++){
            System.out.printf("%4d ",solution[i]);
            s++;
            if(s%p==0){
                p++;
                s=0;
                System.out.println();
            }
        }
    }
}