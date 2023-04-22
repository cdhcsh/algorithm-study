package study.algorithm.backjoon;

/**
 * 치킨 TOP N
 */

import java.io.*;
import java.util.StringTokenizer;

public class B11582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] tmp = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int k = Integer.parseInt(br.readLine());
        int d = n/k;
        for (int i = 0; i < n; i+=d) {
            System.out.println(i + "," + (i+d-1));
            mergeSort(arr,tmp,i,i+d-1);
        }
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }
        bw.close();
    }
    static void mergeSort(int[] arr, int[] tmp, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        mergeSort(arr, tmp, left, mid);
        mergeSort(arr, tmp, mid + 1, right);
        merge(arr, tmp, left, mid, right);
        return;
    }

    static void merge(int[] arr, int[] tmp, int left, int mid, int right) {
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
            arr[j] = tmp[j];
        }
    }
}
