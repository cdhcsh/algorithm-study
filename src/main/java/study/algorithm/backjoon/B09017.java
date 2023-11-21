package study.algorithm.backjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B09017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (; T > 0; T--) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = 200;
            Team[] teams = new Team[c];
            int[] goalTeams = new int[n];
            for (int i = 0; i < c; i++) {
                teams[i] = new Team(i + 1);
            }
            for (int i = 0; i < n; i++) {
                int t = Integer.parseInt(st.nextToken()) - 1;
                teams[t].count++;
                goalTeams[i] = t;
            }
            int score = 1;
            for (int i = 0; i < n; i++) {
                int t = goalTeams[i];
                Team team = teams[t];
                if (team.count < 6) continue;
                if (team.sequence == 4)
                    team.subScore = score;
                if (team.sequence < 4)
                    team.score += score;
                team.sequence++;
                score++;
            }
            Arrays.sort(teams);
            bw.write(teams[0].no + "\n");
        }
        bw.close();
    }

    static class Team implements Comparable<Team> {
        int no;
        int score = 0;
        int subScore;
        int count = 0;
        int sequence = 0;

        public Team(int no) {
            this.no = no;
        }

        @Override
        public int compareTo(Team o) {
            if (this.count < 6) return 1;
            else if (o.count < 6) return -1;
            else if (this.score == o.score) return this.subScore - o.subScore;
            return this.score - o.score;
        }
    }
}
