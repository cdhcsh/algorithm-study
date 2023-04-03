package study.algorithm.backjoon;

/**
 * 전쟁 - 땅따먹기
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01270 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < t; i++) {
            System.gc();
            int value = 0;
            long idx = -1;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            map.clear();
            for (int j = 0; j < n; j++) {
                long k = Long.parseLong(st.nextToken());
                map.put(k, map.getOrDefault(k, 0) + 1);
                int tmp = map.get(k);
                if (tmp > value) {
                    idx = k;
                    value = tmp;
                }
            }
            if (value > n / 2) {
                bw.write(idx + "\n");
            } else bw.write("SYJKGW\n");
        }
        bw.close();


    }

}
