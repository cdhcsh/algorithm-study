package study.algorithm.programmers;

/**
 * 숫자 카드 나누기
 */

public class P0092 {
    public int solution(int[] arrayA, int[] arrayB) {
        return Math.max(getMaxNumber(arrayA,arrayB),
                getMaxNumber(arrayB,arrayA));
    }
    int getMaxNumber(int[] arrayA, int[] arrayB) {
        int r = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            int a = arrayA[i];
            while(a%r!=0){
                int temp = a%r;
                a = r;
                r = temp;
            }
        }
        for (int i : arrayB) {
            if(i%r==0) return 0;
        }
        return r;
    }
}
