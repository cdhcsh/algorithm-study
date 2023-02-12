package study.algorithm.backjoon;

/**
 * 큰 수 A+B
 */

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B10757 {
    public static void solution(String a, String b) {
        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);
        System.out.println("result : "+bigIntegerA.add(bigIntegerB).toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder builder = new StringBuilder();
        final int MAX_LENGTH = 1112;
        final int MAX_VALUE = 1000000000;
        int[] valueA = new int[MAX_LENGTH];
        int[] valueB = new int[MAX_LENGTH];

        int to = a.length();
        int c = 0;
        do {
            int from = Math.max(0,to-9);
            valueA[c++] = Integer.parseInt(a.substring(from,to));
            to = from;
        }while (to > 0);
        to = b.length();
        c = 0;

        do {
            int from = Math.max(0,to-9);
            valueB[c++] = Integer.parseInt(b.substring(from,to));
            to = from;
        }while (to > 0);


        int over = 0;
        for (int i = 0; i < MAX_LENGTH; i++) {
            int n = valueA[i];
            int m = valueB[i];

            int result = n + m + over;
            if (result >= MAX_VALUE){
                over = 1;
                result %= MAX_VALUE;
            }
            else over = 0;
            builder.insert(0, String.format("%09d", result));
        }
        if (over > 0) builder.insert(0, String.format("%d", over));

        String answer = builder.toString().replaceAll("^0+","");;
        bw.write(answer);
        bw.close();
    }
}
