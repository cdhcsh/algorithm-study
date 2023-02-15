package study.algorithm.backjoon;

/**
 * 알고리즘 수업 - 병합 정렬 1
 */

import java.io.*;
import java.util.StringTokenizer;

public class B24060 {
    static int cnt = 0;
    static int answer = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr,k);
        bw.write(answer+"\n");
        bw.close();
    }

    static void mergeSort(int[] arr,int k) {
        int[] tmp = new int[arr.length];
        mergeSort(arr, tmp, 0, arr.length - 1,k);
    }

    static void mergeSort(int[] arr, int[] tmp, int left, int right,int k) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, tmp, left, mid,k);
        mergeSort(arr, tmp, mid + 1, right,k);
        merge(arr, tmp, left, mid, right,k);
        return;
    }

    static void merge(int[] arr, int[] tmp, int left, int mid, int right,int k) {
        int l = left;
        int r = mid + 1;
        int i = left;
        while (r <= right && l <= mid)
            if (arr[l] < arr[r])
                tmp[i++] = arr[l++];
            else
                tmp[i++] = arr[r++];
        while (l <= mid)
            tmp[i++] = arr[l++];
        while (r <= right)
            tmp[i++] = arr[r++];
        for (int j = left; j <= right; j++){
            if(++cnt == k) answer = tmp[j];
            arr[j] = tmp[j];
        }
    }
}
