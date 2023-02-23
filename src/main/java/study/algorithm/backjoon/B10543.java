package study.algorithm.backjoon;

/**
 * 문서 검색
 */

import java.io.*;

public class B10543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String target = br.readLine();
        String object = br.readLine();

        int d = object.length();
        int left = 0;
        int answer = 0;
        while (left <= target.length() - d) {
            int right = left + d;
            if (target.substring(left, right).equals(object)) {
                answer++;
                left = right;
            }
            else left++;
        }
//        bw.write(test(target, object) + "");
        bw.write(answer+"");
        bw.close();
    }

    static int test(String target, String object) {
        int answer = 0;
        int length = object.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            if (count == 0) sb = new StringBuilder();
            if (object.charAt(count) == target.charAt(i)) {
                sb.append(target.charAt(i));
                count++;
            } else count = 0;
            if (count == length) {
                answer++;
                count = 0;
            }
        }
        return answer;
    }
}
