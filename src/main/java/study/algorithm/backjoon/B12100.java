package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class B12100 {
    static int[] check = new int[5];
    static int[][] values;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        values = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                values[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solve(0));

    }

    public static Node[][] getNewNodes() {
        Node[][] nodes = new Node[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Node node = new Node(values[i][j]);
                nodes[i][j] = node;
                if (i == 0) node.set(3, null);
                if (i == N - 1) node.set(2, null);
                if (i > 0) node.connect(3, nodes[i - 1][j]);
                if (j == 0) node.set(1, null);
                if (j == N - 1) node.set(0, null);
                if (j > 0) node.connect(1, nodes[i][j - 1]);
            }
        }
        return nodes;
    }

    public static int solve(int n) {
        if (n == 5) {
            return solve();
        }
        int max = 0;
        for (int i = 0; i < 5; i++) {
            check[n] = i - 1;
            max = Math.max(max, solve(n+1));
        }
        return max;
    }

    public static int solve() {
        Node[][] nodes = getNewNodes();
        for (int i = 0; i < 5; i++) {
            move(nodes, check[i]);
        }
        int max = 0;
        for (Node node = nodes[0][0]; node != null; node = node.next(0)) {
            for (Node head = node; head != null; head = head.next(2)) {
                max = Math.max(head.getValue(), max);
            }
        }
        return max;
    }


    public static void move(Node[][] nodes, int d) {
        if (d < 0) return;
        int k = ((d < 2) ? 2 : 0) + (d % 2);
        int m = k % 2 == 0 ? 0 : (N - 1);
        for (Node node = nodes[m][m]; node != null; node = node.next(k)) {
            for (Node head = node; head != null; head = head.next(d)) {
                if (head.getValue() == 0) continue;
                Node tmp = head;
                while (tmp.prev(d) != null && tmp.prev(d).getValue() == 0) {
                    tmp = tmp.prev(d);
                }
                if (tmp.prev(d) != null && tmp.prev(d).getValue() == head.getValue() && tmp.prev(d).isBlock()) {
                    tmp = tmp.prev(d);
                    tmp.setValue(tmp.getValue() * 2);
                    tmp.setBlock(false);
                    head.setValue(0);
                    head = tmp;
                } else if (tmp.getValue() == 0) {
                    tmp.setValue(head.getValue());
                    head.setValue(0);
                    head = tmp;
                }
            }
            for (Node tmp = node; tmp != null; tmp = tmp.next(d)) tmp.setBlock(true);
        }
    }

    static class Node {
        private final Node[] connects = new Node[4];
        private int value;
        private boolean block = true;

        public Node(int value) {
            this.value = value;
        }

        public boolean isBlock() {
            return block;
        }

        public void setBlock(boolean block) {
            this.block = block;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void set(int d, Node node) {
            connects[d] = node;
        }

        public void connect(int d, Node node) {
            set(d, node);
            if (node != null) node.set(reverse(d), this);
        }

        public Node next(int d) {
            return connects[d];
        }

        public static int reverse(int d) {
            return (d >= 2 ? 2 : 0) + (1 - (d % 2));
        }

        public Node prev(int d) {
            return connects[reverse(d)];
        }
    }
}
