package com.opolo.dsa.udemyDsaJava;

//Time Complexity = O(n^2)
//default ascending order sort - bubbling highest elements to end
public class BubbleSort {

    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnSortedIndex = array.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }

            }
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
