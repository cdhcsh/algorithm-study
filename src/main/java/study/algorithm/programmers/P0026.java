package study.algorithm.programmers;

/**
 * 키패드 누르기
 */

public class P0026 {
    public static String solution(int[] numbers, String hand) {
        int l = 9, r = 11;
        char result;
        StringBuffer sb = new StringBuffer();
        for (int n : numbers) {
            n--;
            if (n % 3 == 0) { // 1,4,7 일때
                l = n;
                result = 'L';
            } else if (n % 3 == 2) { // 3,6,9 일때
                r = n;
                result = 'R';
            } else { // 2,5,8,0 일때
                int ld = getDistance(l, n);
                int rd = getDistance(r, n);

                if (ld < rd) {
                    l = n;
                    result = 'L';
                } else if (ld > rd) {
                    r = n;
                    result = 'R';
                } else if (hand.equals("right")) {
                    r = n;
                    result = 'R';
                } else {
                    l = n;
                    result = 'L';
                }
            }
            sb.append(result);
        }

        return sb.toString();
    }
    public static int getDistance(int from, int to){
        // 0 은 키패드 11로 취급
        if(from < 0) from = 10;
        if(to < 0) to = 10;
        // 나머지의 차 -> 좌우 이동횟수, 몫의 차 -> 상하 이동횟수
        return Math.abs(from%3 - to%3) + Math.abs(from/3-to/3);
    }
}
