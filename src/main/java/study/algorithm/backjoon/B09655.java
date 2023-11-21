package study.algorithm.backjoon;

/**
 * 돌 게임
 */

import java.io.*;

public class B09655 {
    public static void main(String[] args) throws IOException {
        System.out.println(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())%2==0 ? "CY" : "SK");
    }
}
