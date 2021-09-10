package com.algorithms.search.linearSearch;

public class Main {

    public static void main(String[] args) {
        int K = 2;
        int arr[] = {1, 2, 4, 5, 6, 8, 90, 93};
        int N = arr.length;

        int result = searchLinear(arr, N, K);

        System.out.println("The result is: " + result);
    }

    private static int searchLinear(int[] arr, int n, int k) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                return i;
        }
        return -1;
    }
}
