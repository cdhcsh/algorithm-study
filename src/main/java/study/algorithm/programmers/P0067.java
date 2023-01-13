package study.algorithm.programmers;

import java.util.Arrays;

public class P0067 {
    public int[] solution(int n) {
        int[] answer = new int[(1+n)*n/2];
        int cursor = 0;
        int num = 1;
        for(int i = 0 ; i < n ; i++){
            switch (i%3){
                case 0 : // 내려가기
                    for(int j = i ; j < n ; j++){
                       cursor += (j - i/3);
                        answer[cursor] = num++;
                    }
                    break;
                case 1 : // 나란히가기
                    for(int j = i ; j < n ; j++){
                        answer[++cursor] = num++;
                    }
                    break;
                case 2 : // 올라가기
                    for(int j = 0 ; j < n - i ; j++){
                        cursor -=((n-j) - i/3);
                        answer[cursor] = num++;
                    }
                    break;
            }
        }
        return answer;
    }
}
