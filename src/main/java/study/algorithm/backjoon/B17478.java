package study.algorithm.backjoon;

/**
 * 재귀함수가 뭔가요?
 */

import java.io.*;

public class B17478 {
    static int N;
    static StringBuilder answer = new StringBuilder();
    static String start = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
    static String prefix = "\"재귀함수가 뭔가요?\"\n";
    static String[] templates = {
            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"
    };
    static String result = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
    static String suffix = "라고 답변하였지.\n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        answer.append(start);
        solve(N);
        bw.write(answer.toString());
        bw.close();
    }

    static void solve(int n) {
        int k = N - n;
        append(k, prefix);
        if (n > 0) {
            for (String s : templates)
                append(k, s);
            solve(n - 1);
        }
        else append(k, result);
        append(k, suffix);
    }

    static void append(int k, String str) {
        answer.append("____".repeat(k));
        answer.append(str);
    }
}
