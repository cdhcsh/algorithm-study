package study.algorithm.backjoon;

/**
 * 감소하는 수
 */

import java.io.*;
import java.util.ArrayList;

public class B01038 {
    static ArrayList<Long> list;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n > 1022) bw.write("-1");
        else {
            list = new ArrayList<>();
            for (long i = 0; i < 10; i++) {
                dfs(i, 1);
            }
            list.sort(Long::compareTo);

            bw.write(list.get(n)+"");
        }
        bw.close();
    }

    static void dfs(long n, int c) {
        if (c > 10) return;
        list.add(n);
        for (int i = 0; i < n % 10; i++) {
            dfs(n*10+i,c+1);
        }
    }
}
