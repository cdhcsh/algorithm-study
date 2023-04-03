package study.algorithm.backjoon;

/**
 * 영단어 암기는 외로워
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class B20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() >= m)
                map.put(s, map.getOrDefault(s, 0) + 1);
        }
        String str = map.keySet().stream()
                .sorted((s1, s2) ->
                {
                    if (map.get(s1) == map.get(s2)) {
                        if (s1.length() == s2.length()) {
                            return s1.compareTo(s2);
                        } else return s2.length() - s1.length();
                    } else return map.get(s2) - map.get(s1);
                })
                .collect(Collectors.joining("\n"));
        bw.write(str);
        bw.close();


    }
}
