package study.algorithm.backjoon;

/**
 * 팰린드롬 만들기
 */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B01213 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] chars = str.toCharArray();
        int l = chars.length - 1;
        boolean b = false;
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= l; ) {
            char p = chars[l - i];
            int c = 0;
            for (; c + i <= l; c++) {
                if (chars[l - (c + i)] != p) break;
            }
            if (c % 2 != 0) {
                if (!b) {
                    sb.insert(sb.length() / 2, p);
                    b = true;
                } else {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
            for (int j = c; j > 1; j -= 2) {
                sb.append(p);
                sb.insert(0, p);
            }
            i += c;
        }
        System.out.println(sb);

//        Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
//
//        for (int i = 0; i < str.length(); i++) {
//            int c = str.charAt(i) - 'A';
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        StringBuilder sb = new StringBuilder();
//        int[] list = map.values().stream().mapToInt(i->i).toArray();
//        sb.append(list)
//        for (int i = 1; i < list.length; i++) {
//            if(list[i] % 2 != 0){
//                System.out.println("I'm Sorry Hansoo");
//                return;
//            }
//        }

    }
}
