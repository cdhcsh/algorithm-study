package study.algorithm.programmers;

/**
 * 옹알이(2)
 */

public class P0008 {
        public static int solution(String[] babbling) {
            int answer = 0;
            String[] songs = {"aya","ye","woo","ma"};
            for(int i = 0 ; i < babbling.length ; i++) {
                for (int j = 0 ; j < 4 ; j++) {
                    babbling[i] = babbling[i].replaceAll(songs[j],""+j);
                }
                if (babbling[i].matches("^[0-9]+$")){
                    for(int j = 0 ; j < babbling[i].length()-1 ; j++){
                        if(babbling[i].charAt(j)==babbling[i].charAt(j+1)){
                            babbling[i] = "";
                            break;
                        }
                    }
                }
                else babbling[i] = "";
                answer += babbling[i].equals("") ? 0 : 1;
            }
            return answer;
        }
}
