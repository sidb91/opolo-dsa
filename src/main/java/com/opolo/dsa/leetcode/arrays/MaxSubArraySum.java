package com.opolo.dsa.leetcode.arrays;

//Sliding window pattern
public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] a = new int[] { 2, 6, 9, 2, 1, 8, 5, 6, 3 };

        System.out.println("Start time for brute force: " + System.currentTimeMillis());
        int maxSubArraySumBruteForce = maxSubArraySumBruteForce(a, 3);
        System.out.println("End time for brute force: " + System.currentTimeMillis());
        System.out.println("Max Sub Array Sum for brute force: " + maxSubArraySumBruteForce);

        System.out.println("Start time for sliding window: " + System.currentTimeMillis());
        int maxSubArraySumSlidingWindow = maxSubArraySumSlidingWindow(a, 3);
        System.out.println("End time for sliding window: " + System.currentTimeMillis());
        System.out.println("Max Sub Array Sum for sliding window: " + maxSubArraySumSlidingWindow);

    }

    // O(n)
    public static int maxSubArraySumSlidingWindow(int[] a, int num) {

        int tempSum = 0;
        int maxSum = 0;

        if (num > a.length) {
            return -1;
        }

        for (int i = 0; i < num; i++) {
            maxSum += a[i];
        }

        tempSum = maxSum;

        for (int i = num; i < a.length; i++) {
            tempSum = tempSum + a[i] - a[i - num];
            maxSum = Math.max(maxSum, tempSum);
        }

        return maxSum;
    }

    // O(n*k)
    public static int maxSubArraySumBruteForce(int[] a, int num) {
        int temp = 0;
        Integer max = Integer.MIN_VALUE;

        if (num > a.length) {
            return -1;
        }

        for (int i = 0; i <= a.length - num; i++) {
            temp = 0;
            for (int j = 0; j < num; j++) {
                temp += a[i + j];
            }
            if (temp > max) {
                max = temp;
            }
        }

        return max;
    }

}
