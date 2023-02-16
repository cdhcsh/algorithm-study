package study.algorithm.backjoon;

/**
 * 대칭 차집합
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map.put(st.nextToken(),1);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            String s = st.nextToken();
            if(map.containsKey(s)) map.remove(s);
            else map.put(s,1);
        }
        bw.write(map.size()+"");
        bw.close();

    }
}
