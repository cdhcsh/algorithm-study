package study.algorithm.backjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 수 정렬하기 2
 */
public class B02757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arr);
        for (int i : arr) {
            bw.write(i+"\n");
        }
        bw.close();
    }
    static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    static void mergeSort(int[] arr, int[] temp, int left, int right) {
        for(int i = 1; i <= right; i += i) {
            for(int j = 0; j <= right - i; j += (2 * i)) {
                int low = j;
                int mid = j + i - 1;
                int high = Math.min(j + (2 * i) - 1, right);
                merge(arr,temp, low, mid, high);
            }
        }
    }
    static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int i = left;
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[i] = arr[l];
                i++;
                l++;
            } else {
                temp[i] = arr[r];
                i++;
                r++;
            }
        }
        if (l > mid) {
            while (r <= right) {
                temp[i] = arr[r];
                i++;
                r++;
            }
        } else {
            while (l <= mid) {
                temp[i] = arr[l];
                i++;
                l++;
            }
        }
        for(i = left ; i<= right ; i++){
            arr[i] = temp[i];
        }
    }
}
