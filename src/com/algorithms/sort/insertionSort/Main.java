package com.algorithms.sort.insertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {3, 4, 2};
        int[] arr2 = {10, 9, 8, 7, 3, 6, 5, 4, 3, 2, 1};
        int size = arr2.length;

        //int[] result = insertionSort(arr, size);
        int[] result = insertionSortSimplified(arr2, size);

        System.out.println("Array sorted: " + Arrays.toString(result));

    }

    private static int[] insertionSort(int[] arr, int size) {

        for (int i = 1; i < arr.length; i++) {
            for ( int k = 0; k < i; k++) {
                if (arr[i] < arr[k]) {
                    int aux = arr[i];
                    for (int z = i; z > k; z--) {
                        arr[z] = arr[z-1];
                    }
                    arr[k] = aux;
                }
            }

// not an insertion, but a good solution --> I think it's bubble sort
//            for (int k = 0; k < i; k++) {
//                if (arr[i] < arr[k]) {
//                    int aux = arr[k];
//                    arr[k] = arr[i];
//                    arr[i] = aux;
//                }
//            }

        }
        return arr;
    }

    private static int[] insertionSortSimplified(int[] arr, int size) {

        for(int i = 1; i < size; i++) {
            int key = arr[i];

            int j = i -1;
            for ( ; j >= 0 && arr[j] > key; j-- ) {
                arr[j+1] = arr[j];
                arr[j] = key;
            }
        }
        return arr;
    }
}
