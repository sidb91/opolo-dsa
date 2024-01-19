package com.opolo.dsa.udemy.sorting;

//Time Complexity = O(n^2)
//default ascending order sort - 
//find the maximum element and move it to end
public class SelectionSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnSortedIndex = array.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnSortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastUnSortedIndex);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
