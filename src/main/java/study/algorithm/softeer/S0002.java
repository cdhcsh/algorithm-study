package study.algorithm.softeer;

/**
 * 성적 평가
 */

import java.util.*;
import java.io.*;


public class S0002
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Pair[] finalScore = new Pair[n];
        for(int i = 0 ; i < n ; i++){
            finalScore[i] = new Pair(0,i);
        }
        for(int i = 0 ; i < 3 ; i++){
            st = new StringTokenizer(br.readLine());
            Pair[] scores = new Pair[n];
            for(int j = 0 ; j < n ; j++){
                scores[j] = new Pair(Integer.parseInt(st.nextToken()),i);
                finalScore[j].setScore(finalScore[j].getScore()+scores[j].getScore());
            }
            writeRanks(getRanks(scores),bw);
            bw.write("\n");
        }
        writeRanks(getRanks(finalScore),bw);
        bw.flush();
        bw.close();
    }
    static class Pair {
        int score;
        int num;
        Pair(int score,int num){
            this.score = score;
            this.num = num;
        }
        int getScore(){
            return score;
        }
        int getNum(){
            return num;
        }
        void setScore(int score){
            this.score = score;
        }
        void setNum(int num){
            this.num = num;
        }
    }
    static void swap(Pair[] arr, int idx1, int idx2) {
        Pair temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    static int[] getRanks(Pair[] scores){
        int[] ranks = new int[scores.length];
        Arrays.sort(scores,Comparator.comparingInt(Pair::getScore).reversed());
        for(int i = 0 ; i < scores.length ; i++){
            int rank = 1;
            int score = scores[i].getScore();
            for(int j = i-1 ; j >= 0 ; j--){
                if(scores[j].getScore() > score) rank++;
            }
            ranks[scores[i].getNum()] = rank;

        }
        return ranks;
    }
    static void writeRanks(int[] ranks,BufferedWriter bw) throws IOException{
        for(int rank : ranks)
            bw.write(rank+" ");
    }
}