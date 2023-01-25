package study.algorithm.programmers;

/**
 * 타겟 넘버
 */
public class P0079 {
    public int solution(int[] numbers, int target) {
        return dfs(0, numbers, target, 0);

    }

    public int dfs(int i, int[] arr, int target, int sum) {
        if(i == arr.length) {
            if(target == sum) {
                return 1;
            }
            else  return 0;
        }
        int count = 0;
        count += dfs(i + 1, arr, target, sum + arr[i]);
        count += dfs(i + 1, arr, target, sum - arr[i]);
        return count;
    }
}
