package study.algorithm.backjoon;

import java.io.IOException;
import java.util.Scanner;

public class B02292 {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        //logic
            int m = scanner.nextInt();
            int cnt = 1;
            long p = 1;
            //output
            while (m > p) {
                p+= (cnt++ * 6);
                System.out.println(p);
            }
        System.out.println(cnt);


    }
}
