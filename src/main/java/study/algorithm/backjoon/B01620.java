package study.algorithm.backjoon;

/**
 * 나는야 포켓몬 마스터 이다솜
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            map.put(s,i+1);
            arr[i] = s;
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(s.matches("^([0-9]+)$"))
                bw.write(arr[Integer.parseInt(s)-1]+"\n");
            else
                bw.write(map.get(s)+"\n");
        }
        bw.close();
    }
}
