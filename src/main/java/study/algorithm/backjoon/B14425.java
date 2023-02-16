package study.algorithm.backjoon;

/**
 * 문자열 집합
 */

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nLength = Integer.parseInt(st.nextToken());
        int mLength = Integer.parseInt(st.nextToken());
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < nLength; i++) {
            map.put(br.readLine(),1);
        }
        for (int i = 0; i < mLength; i++) {
            if(map.containsKey(br.readLine())) answer++;
        }
        bw.write(answer+"");
        bw.close();
    }
}
