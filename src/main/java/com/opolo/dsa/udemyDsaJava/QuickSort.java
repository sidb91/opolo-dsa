package com.opolo.dsa.udemyDsaJava;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };
        quickSort(array, 0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int i = start;
        int j = end;
        int pivot = input[start];

        while (i < j) {

            // empty loop
            while (i < j && input[--j] >= pivot)
                ;
            if (i < j) {
                input[i] = input[j];
            }

            // empty loop
            while (i < j && input[++i] <= pivot)
                ;
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;

        return j;
    }
}
