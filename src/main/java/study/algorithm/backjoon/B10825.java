package study.algorithm.backjoon;

/**
 * 국영수
 */

import java.io.*;
import java.util.StringTokenizer;

public class B10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Score[] scores = new Score[n];
        Score[] temp = new Score[n];
        for (int i = 0; i < scores.length; i++) {
            st = new StringTokenizer(br.readLine());
            scores[i] = new Score(st.nextToken()
                    , Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken()));
        }
        int right = n-1;
        for(int i = 1; i <= right; i += i) {
            for(int j = 0; j <= right - i; j += (2 * i)) {
                int low = j;
                int mid = j + i - 1;
                int high = Math.min(j + (2 * i) - 1, right);
                merge(scores,temp, low, mid, high);
            }
        }

        for (Score score : scores) {
            bw.write(score.name+"\n");
        }
        bw.close();

    }
    static void merge(Score[] scores,Score[] temp,int left, int mid, int right){
        int l = left;
        int r = mid+1;
        int i = l;

        while (l <= mid && r <= right)
            if(scores[l].compareTo(scores[r]) > 0)
                temp[i++] = scores[l++];
            else
                temp[i++] = scores[r++];
        while (l <= mid)
            temp[i++] = scores[l++];
        while (r <= right)
            temp[i++] = scores[r++];
        for(int k = left; k <= right; k++)
            scores[k] = temp[k];
    }

    static class Score implements Comparable<Score> {
        String name;
        int score1;
        int score2;
        int score3;

        public Score(String name, int score1, int score2, int score3) {
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }

        @Override
        public int compareTo(Score o) {
            Score s = (Score) o;
            if (this.score1 != s.score1) return this.score1 - s.score1;
            else if (this.score2 != s.score2) return s.score2 - this.score2;
            else if (this.score3 != s.score3) return this.score3 - s.score3;
            else return s.name.compareTo(this.name);
        }
    }
}
