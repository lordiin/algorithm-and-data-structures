package com.algorithms;

public class BinarySearch {
    public static int iterativeSearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] > x) {
                return recursiveSearch(arr, l, m - 1, x);
            }
            return recursiveSearch(arr, m + 1, r, x);
        }
        return -1;
    }
}
