package com.opolo.dsa.udemy.sorting;

//Time Complexity = O(n^2)
//default ascending order sort - 
//check the unsorted portion of the array with the sorted positions.
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        for (int firstunsortedindex = 1; firstunsortedindex <= array.length - 1; firstunsortedindex++) {
            int newElement = array[firstunsortedindex];

            int i;

            for (i = firstunsortedindex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }

            array[i] = newElement;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
