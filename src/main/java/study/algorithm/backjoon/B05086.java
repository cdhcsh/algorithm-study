package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B05086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[] answers = {"neither","multiple","factor"};

        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0 || m == 0)
                break;
            bw.write(answers[(n%m==0 ? 1 : 0) + (m%n == 0 ? 2 : 0)]+"\n");
        }
        bw.close();

    }
}
