package com.opolo.dsa.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraySubsetOfOtherArray {

    public static void main(String[] args) {

        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("arr2 is a subset of arr1");
        else
            System.out.println("arr2 is not a subset of arr1");
    }

    public static boolean isSubset(int[] a1, int[] a2, int m, int n) {

        Set<Integer> hashSet = new HashSet<>();

        // hashset stores all values of array 1
        for (int i = 0; i < m; i++) {
            if (!hashSet.contains(Integer.valueOf(a1[i]))) {
                hashSet.add(a1[i]);
            }
        }

        System.out.println("----- hashset elements --------");
        for (Integer i : hashSet) {
            System.out.print(i + " ");
        }
        System.out.println();

        // loop to check whether all elements of array 2 also are in array 1
        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(a2[i])) {
                return false;
            }
        }

        return true;
    }
}
