package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 커트라인
 */

public class B25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[l];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < l; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0; j--)
                if (arr[j] < key)
                    arr[j + 1] = arr[j];
                else
                    break;
            arr[j + 1] = key;
        }
        bw.write(arr[c-1]+"");
        bw.close();

    }
}
