package com.algorithms.search.binarysearch;

public class Main {

    public static void main(String[] args) {

        int K = 2;
        int arr[] = {1, 2, 4, 5, 6, 8, 90, 93};
        int N = arr.length;

        int result = searchInSorted(arr, N, K);

        System.out.println("The result is: " + result);

    }


    public static int searchInSorted(int arr[], int N, int K) {

        int indexLeft = 0;
        int indexRight = N - 1;
        int indexMiddle = indexRight / 2;

        // when either indexLeft or indexRight == indexMiddle, we reach the end of the search --> return -1
        while (indexLeft <= indexMiddle && indexMiddle <= indexRight) {

            // you found it!
            if(arr[indexMiddle] == K) {
                return indexMiddle;
            }

            // go left
            if (arr[indexMiddle] > K) {
                indexRight = indexMiddle - 1;
                indexMiddle = ((indexLeft - indexMiddle - 1 ) / 2) + indexMiddle;
            }

            // go right
            else if (arr[indexMiddle] < K) {
                indexLeft = indexMiddle + 1;
                indexMiddle = ((indexRight - indexMiddle + 1)/ 2) + indexMiddle;
            }
        }
        // we have not found it
        return -1;

    }
}
