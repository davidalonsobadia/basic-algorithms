package com.algorithms.sort.bubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {3, 4, 2};
        int[] arr2 = {10, 9, 8, 7, 3, 6, 5, 4, 3, 2, 1, 156, 33, -2};
        int size = arr2.length;

        int[] result = bubbleSort(arr2, size);

        System.out.println("Array sorted: " + Arrays.toString(result));

    }

    // TODO: review algorithm. Not sure if it's OK
    private static int[] bubbleSort(int[] arr, int size) {

        for (int i = 1; i < size; i++) {

            for (int k = 0; k < i; k++) {
                if (arr[i] < arr[k]) {
                    int aux = arr[k];
                    arr[k] = arr[i];
                    arr[i] = aux;
                }
            }
        }
        return arr;
    }
}

