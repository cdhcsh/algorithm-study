package study.algorithm.programmers;

/**
 * 숫자 변환하기
 */

public class P0089 {
    public int solution(int x, int y, int n) {
        int max = Integer.MAX_VALUE;
        int[] d = new int[y+1];
        d[x] = 0;
        for(int i = x+1 ; i < d.length ; i++){
            int a = max;
            int b = max;
            int c = max;
            if(i/2 >= x && i%2 == 0) a = d[i/2];
            if(i/3 >= x && i%3 == 0) b = d[i/3];
            if(i-n >= x) c = d[i-n];

            int min = Math.min(a,Math.min(b,c));
            d[i] = (min < max) ? min+1 : max;
        }
        return d[y] < max ? d[y] : -1;
    }

}
