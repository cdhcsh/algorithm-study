package study.algorithm.backjoon;

/**
 * 트리
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B01068 {
    static HashMap<Integer, Node> map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        map = new HashMap<>();

        map.put(-1, new Node(null));
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n ; i++){
            map.put(i,new Node(null));
        }
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            map.get(m).addChild(i);
        }
        deleteNode(Integer.parseInt(br.readLine()));

        Node root = map.get(-1);
        int answer = 0;
        if (!root.children.isEmpty())
            answer = root.getCount();
        System.out.println(answer);
    }

    static void deleteNode(int no) {
        Node delete = map.get(no);
        delete.parent.deleteChild(delete);
    }

    static class Node {
        Node parent;
        ArrayList<Node> children = new ArrayList<>();

        Node(Node parent) {
            this.parent = parent;
        }

        void addChild(int i) {
            Node child = map.get(i);
            child.parent = this;
            children.add(child);
        }

        void deleteChild(Node node) {
            children.remove(node);
        }
        int getCount() {
            int count = 0;
            if (children.isEmpty()) count = 1;
            for (Node child : children) {
                count += child.getCount();
            }
            return count;
        }
    }
}
