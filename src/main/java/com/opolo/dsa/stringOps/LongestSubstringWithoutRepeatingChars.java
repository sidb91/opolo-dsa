package com.opolo.dsa.stringOps;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    // Driver code
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("The input String is " + s);
        int length = longestUniqueSubsttr(s);
        System.out.println("The length of the longest non-repeating character substring is " + length);
    }

    private static int longestUniqueSubsttr(String str) {

        // Creating a set to store the last positions of occurrence
        Map<Character, Integer> seen = new HashMap<>();

        // starting the initial point of window to index 0
        int start = 0;
        int maximumLength = 0;

        for (int end = 0; end < str.length(); end++) {

            // Checking if we have already seen the element or not
            if (seen.containsKey(str.charAt(end))) {

                // If we have seen the number, move the start pointer
                // to position after the last occurrence
                start = Math.max(start, seen.get(str.charAt(end)) + 1);
            }

            // Updating the last seen value of the character
            seen.put(str.charAt(end), end);

            maximumLength = Math.max(maximumLength, end - start + 1);
        }

        return maximumLength;
    }

}
