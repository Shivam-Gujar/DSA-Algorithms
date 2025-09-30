package com.shiv;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 3, 16, 28, 36, 76, 99};
        int target = 76;
        System.out.println(bs(arr, target, 0, arr.length-1));

    }
    static int bs(int[] arr, int target, int s, int e) {
        if (s > e) return -1;

        int m = (s+e) / 2;

        if (arr[m] == target) return m;

        if (arr[m] > target) return bs(arr, target, s, m - 1);

        return bs(arr, target, m + 1, e);
    }
}
