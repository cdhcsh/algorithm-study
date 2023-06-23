package study.algorithm.backjoon;

/**
 * 베스트셀러
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B01302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String,Book> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String title = br.readLine();
            if(map.containsKey(title))map.get(title).add();
            else map.put(title, new Book(title));
        }
        System.out.println(map.values().stream().sorted().findFirst().get().title);
    }
    static class Book implements Comparable<Book>{
        String title;
        int cnt = 0;

        public Book(String title) {
            this.title = title;
        }
        public void add(){
            cnt++;
        }

        @Override
        public int compareTo(Book o) {
            if(this.cnt == o.cnt) return this.title.compareTo(o.title);
            else return o.cnt - this.cnt;
        }
    }
}
