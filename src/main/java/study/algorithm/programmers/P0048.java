package study.algorithm.programmers;

/**
 * 거리두기 확인하기
 */

public class P0048 {
    char[][] map; // 대기실
    boolean[][] visit; // 방문여부
    int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 이동 방향
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int i = 0 ; i < 5 ; i++){
            answer[i] = isDistance(places[i]);
        }
        return answer;
    }
    public int isDistance(String[] place){
        map = stringArrayToCharArrays(place);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == 'P') {
                    visit = new boolean[5][5];
                    if(dfs(i,j,0))
                        return 0;
                }
            }
        }
        return 1;
    }
    public boolean dfs(int x, int y, int cnt) {
        if(x < 0 || x >= 5 || y < 0 || y >= 5) return false; // 배열 범위 초과
        if (cnt > 2) return false; // 거리 2 초과
        if (visit[x][y]) return false; // 이미 방문한 자리
        if (map[x][y] == 'X') return false; // 파티션으로 막혀있어 더이상 확인 필요 X
        if (cnt > 0 && map[x][y] == 'P') return true; // ** 거리 2 내에 다른 응시자가 있으므로 true **
        visit[x][y] = true; // 방문 true
        boolean bool = false;
        for (int[] d : directions){
            bool = bool | dfs(x+d[0],y+d[1],cnt+1); // 4방향 탐색하여 거리두기 결과 병합
        }
        visit[x][y] = false; // 방문 false
        return bool;
    }

    public char[][] stringArrayToCharArrays(String[] arr) {
        char[][] chars = new char[5][];
        for (int i = 0; i < 5; i++) {
            chars[i] = arr[i].toCharArray();
        }
        return chars;
    }
}
