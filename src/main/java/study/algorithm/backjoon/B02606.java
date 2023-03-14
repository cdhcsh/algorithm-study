package study.algorithm.backjoon;

/**
 * 바이러스
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B02606 {
    static Computer[] computers;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        computers = new Computer[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            computers[i] = new Computer(i);
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            computers[a].network.add(computers[b]);
            computers[b].network.add(computers[a]);
        }
        bw.write(dfs(0) - 1 + "");
        bw.close();

    }

    static int dfs(int num) {
        visit[num] = true;
        int cnt = 1;
        for (Computer c : computers[num].network)
            if (!visit[c.num]) cnt += dfs(c.num);
        return cnt;
    }

    static class Computer {
        int num;
        ArrayList<Computer> network = new ArrayList<>();

        Computer(int num) {
            this.num = num;
        }
    }
}
