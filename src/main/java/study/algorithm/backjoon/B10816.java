package study.algorithm.backjoon;

/**
 * 숫자 카드 2
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        HashMap<String, Integer> map = new HashMap<>();
        int length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            String s = st.nextToken();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            bw.write(map.getOrDefault(st.nextToken(), 0) + " ");
        }
        bw.close();
    }
}
