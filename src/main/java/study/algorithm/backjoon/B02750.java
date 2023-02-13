package study.algorithm.backjoon;

/**
 * 정렬
 */

import java.io.*;

public class B02750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(br.readLine());
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(arr);
        for (int j : arr) {
            bw.write(j + "\n");
        }
        bw.close();

    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);

    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) swap(arr, i, j);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0; j--)
                if (arr[j] > key)
                    arr[j + 1] = arr[j];
                else
                    break;
            arr[j + 1] = key;
        }
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

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
