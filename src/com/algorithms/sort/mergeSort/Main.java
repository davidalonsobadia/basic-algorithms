package com.algorithms.sort.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {10, 9, 8, 7, 3, 6, 5, 4, 3, 2, 1, -56};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array sorted: " + Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int left, int right) {

        // si no condicion base
        if ( left < right) {
            int med = left + ((right - left) / 2);
            // mergeSort izq
            mergeSort(arr, left, med);
            //mergeSort drc
            mergeSort(arr, med + 1, right);
            //merge
            merge(arr, left, med, right);
        } else {
            return;
        }
    }

    private static void merge(int[] arr, int init, int med, int fin) {

        int[] aux = new int[fin - init + 1];

        int r = med + 1;
        int l = init;
        int i = 0;
        while ( l <= med && r <= fin) {

            if (arr[l] < arr[r]) {
                aux[i] = arr[l];
                l++;
            } else {
                aux[i] = arr[r];
                r++;
            }
            i++;
        }

        while ( l <= med ) {
            aux[i] = arr[l];
            l++;
            i++;
        }

        while ( r <= fin) {
            aux[i] = arr[r];
            r++;
            i++;
        }

        for (int k = init, iAux = 0; k <= fin; k++, iAux++) {
            arr[k] = aux[iAux];
        }
    }
}

