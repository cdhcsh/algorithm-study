package study.algorithm.backjoon;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B01764 {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        //logic


        HashMap<String,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            map.put(scanner.nextLine(),1);
        }
        for (int i = 0; i < m; i++) {
            String s = scanner.nextLine();
            map.put(s, map.getOrDefault(s,0)+1);
        }
        //output
        List<String> list = map.keySet().stream().filter(s -> map.get(s) >= 2).sorted().collect(Collectors.toList());
        System.out.println(list.size());
        list.forEach(System.out::println);

    }
}
