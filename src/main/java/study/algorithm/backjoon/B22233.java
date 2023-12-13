package study.algorithm.backjoon;

/**
 * 가희와 키워드
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B22233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(),0);
        }
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), ",");
            while (st.hasMoreTokens()) {
                map.remove(st.nextToken());
            }
            bw.write(map.size()+"\n");
        }
        bw.close();
    }
}
