package com.opolo.dsa.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given two arrays A and B of equal size N, the task is to find if
 * given arrays are equal or not. Two arrays are said to be equal if
 * both of them contain same set of elements, arrangements (or permutation)
 * of elements may be different though.
 * Note : If there are repetitions, then counts of repeated elements
 * must also be same for two array to be equal.
 * 
 */
public class CheckArrayEquality {

    // single hash map
    static boolean equalArraysWithOneMap(int[] arr1, int[] arr2) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (Integer i : arr1) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i).intValue() + 1);
            } else {
                freq.put(i, 1);
            }
        }

        for (Integer i : arr2) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i).intValue() - 1);
            } else {
                freq.put(i, 1);
            }
        }

        return freq.values().stream().collect(Collectors.toList()).stream().allMatch(num -> num == 0);

    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 2, 4, 5, 4, 3, 16, 16, 25, 9 };
        int[] arr2 = new int[] { 2, 4, 16, 4, 9, 16, 25, 3, 5 };

        System.out.println("Array Equivalence = "+equalArraysWithOneMap(arr1,arr2));
    }
}
