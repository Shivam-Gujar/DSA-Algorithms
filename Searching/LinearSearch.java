package com.shiv;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 9, 12, 25};
        int target = 12;
        System.out.println(ls(arr, target));
    }
    static int ls(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
