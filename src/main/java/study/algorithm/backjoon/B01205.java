package study.algorithm.backjoon;

/**
 * 등수 구하기
 */

import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01205 {
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        map.keySet().stream().sorted(Comparator.reverseOrder()).mapToInt(i->i).toArray();
        int length = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int maxRank = Integer.parseInt(st.nextToken());
        //logic
        int rank = 1;
        int temp = 1;
        if (length > 0)
            st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > score) rank++;
            if (n >= score) temp++;
        }
        if (rank > maxRank) rank = -1;
        else if (temp > maxRank) rank = -1;
        bw.write(rank + "");
        bw.close();
    }
}
