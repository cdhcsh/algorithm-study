package study.algorithm;

/**
 * 중력 큐
 */

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B28078 {
    static LinkedList<Integer> deque = new LinkedList() {
    };
    static int mode = 0;
    static int ballCount = 0;
    static int wallCount = 0;
    /*
    0 -> 뒤 - 앞 ..1,2,3 시계방향회전
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                String sub = st.nextToken();
                if(sub.equals("b") && mode != 3 && !deque.isEmpty()) {
                    deque.add(0);
                    ballCount++;
                }
                else {
                    deque.add(1);
                    wallCount++;
                }
            }else if(command.equals("rotate")){
                String sub = st.nextToken();
                if(sub.equals("r")) mode = (mode+1)%4;
                else mode = (mode+3)%4;
                rotating();
            } else if (command.equals("count")) {
                String sub = st.nextToken();
                if(sub.equals("b")) bw.write(ballCount+"\n");
                else bw.write(wallCount+"\n");
            } else if (command.equals("pop")) {
                if(!deque.isEmpty()) {
                    if(deque.poll()==0)ballCount--;
                    else wallCount--;
                    rotating();
                }
            }
        }
        bw.close();
    }
    public static void rotating(){
        if(mode == 1){
            while(!deque.isEmpty() && deque.peek()==0){
                ballCount--;
                deque.remove();
            }
        }
        else if (mode == 3){
            while(!deque.isEmpty() && deque.peekLast()==0){
                ballCount--;
                deque.removeLast();
            }
        }
    }
    public static int count(int c){
        return (int) deque.stream().filter(i->i==c).count();
    }
}
