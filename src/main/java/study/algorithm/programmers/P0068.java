package study.algorithm.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P0068 {

    public int[] solution(int n, long k) {
        n = 3;
        k = 6;
        int[] answer = new int[n];
        long[] fac = new long[n];
        int c = 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i==1) fac[i-1]=1;
            else fac[i-1] = fac[i-2] * i;
            list.add(i);
        }
        while(k > 0 && n > c){
            int d = (int)((k-1)/fac[n-1-c]);
            answer[c-1] = list.remove(d);
            k=k-fac[n-1-c]*d;
            c++;
        }
        while(!list.isEmpty())
            answer[c++-1] = list.remove(0);
        return answer;
    }
}
