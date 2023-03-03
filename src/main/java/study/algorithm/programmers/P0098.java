package study.algorithm.programmers;

/**
 * 카드 뭉치
 */

import java.io.*;
import java.util.StringTokenizer;

public class P0098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        String[] cards1 = new String[n];
        String[] cards2 = new String[m];
        String[] goal = new String[g];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards1.length; i++) {
            cards1[i] = st.nextToken();
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cards2.length; i++) {
            cards2[i] = st.nextToken();
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < goal.length; i++) {
            goal[i] = st.nextToken();
        }
        System.out.println(new P0098().solution(cards1,cards2,goal));

    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;

        for (String s : goal) {
            if (i < cards1.length && cards1[i].equals(s)) i++;
            else if (j < cards2.length && cards2[j].equals(s)) j++;
            else return "No";
        }
        return "Yes";
    }
}
