package study.algorithm.backjoon;

/**
 * 손익 분기점
 */

import java.io.IOException;
import java.util.Scanner;

public class B01712 {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        //logic
        int base = scanner.nextInt();
        int prod = scanner.nextInt();
        int price= scanner.nextInt();

        if(price-prod <= 0) System.out.println(-1);
        else System.out.println(base/ (price-prod)+1);
        //output

    }
}
