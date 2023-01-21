package study.algorithm.programmers;

/**
 * 이모티노 할인 행사
 */
public class P0078 {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        for(int i = 0 ; i < Math.pow(4,emoticons.length) ; i++){
            int temp = i;
            int[] result = new int[2];
            int[] sales = new int[4];

            for (int emoticon : emoticons) {
                int m = temp % 4;
                sales[m] += emoticon * (10 - m - 1) / 10;
                temp /= 4;
            }
            for (int[] user : users) {
                int sum = 0;
                int cap = user[0];
                int max = user[1];
                for (int k = 0; k < 4; k++) {
                    if((k+1)*10 >= cap) sum+=sales[k];
                }
                if(sum >= max)
                    result[0]++;
                else
                    result[1] += sum;
            }

            if(result[0] > answer[0]){
                answer[0] = result[0];
                answer[1] = result[1];
            }
            else if(result[0] == answer[0] && result[1] > answer[1]){
                answer[0] = result[0];
                answer[1] = result[1];
            }
        }
        return answer;
    }
}
