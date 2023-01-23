package study.algorithm.backjoon;

/**
 * 임스의 미니게임
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B25757
{
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        int m = s.equals("Y") ? 2 : s.equals("F") ? 3 : 4;
        //logic
        Set<String> set = new HashSet<>();
        //output
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        System.out.println(set.size()/(m-1));

    }
}
