package study.algorithm.softeer;

/**
 * 금고 털기
 */

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class S0001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bag = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());
        HashMap<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine());
            long weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            map.put(price, map.getOrDefault(price, 0l) + weight);
        }
        int[] prices = map.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i).toArray();

        long answer = 0L;
        for (int price : prices) {
            if (bag <= 0) break;
            long weight = map.get(price);
            if (bag >= weight) {
                bag -= weight;
                answer += weight * price;
            } else {
                answer += bag * price;
                bag = 0;
            }
        }
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}
