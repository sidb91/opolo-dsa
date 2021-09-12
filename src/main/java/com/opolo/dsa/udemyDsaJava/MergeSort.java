package com.opolo.dsa.udemyDsaJava;

//recursion
public class MergeSort {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        // sorting the left array recursively
        mergeSort(arr, start, mid);

        // sorting the right array recursively
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        // left and right array already sorted - if everything in left array
        // is less than everything in right array, then keep the order
        // as it is...no need to merge
        // optimization
        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        // optimization - copy left over elements of left array to original array
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);

        // copy only temp array elements to original array
        System.arraycopy(temp, 0, arr, start, tempIndex);

    }

}
