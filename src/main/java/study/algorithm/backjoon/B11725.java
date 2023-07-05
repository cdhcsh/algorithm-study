package study.algorithm.backjoon;

/**
 * 트리의 부모 찾기
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11725 {
    static int N;
    static ArrayList<Integer>[] tree;
    static boolean[] visit;
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        parent = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
        for (int i = 1; i <= N; i++) {
            dfs(i);
        }
        for (int i = 2; i <= N; i++) {
            bw.write(parent[i]+"\n");
        }
        bw.close();

    }
    static void dfs(int p){
        visit[p] = true;
        for (int c : tree[p]){
            if(!visit[c]){
                parent[c] = p;
                dfs(c);
            }
        }
    }
}
