package study.algorithm.backjoon;

/**
 * 달팽이는 올라가고 싶다
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B02869
{
    public static void main(String[] args) throws IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        //logic
        int up = Integer.parseInt(str.nextToken());
        int down = Integer.parseInt(str.nextToken());
        int top = Integer.parseInt(str.nextToken());
        System.out.println((int) Math.ceil((top-up+0.0)/(up-down))+1);

    }
}
