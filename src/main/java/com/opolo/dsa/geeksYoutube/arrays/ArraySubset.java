package com.opolo.dsa.geeksYoutube.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySubset {

    public static void main(String[] args) {
        int[] arr1 = { 11, 1, 13, 21, 3, 7 };
        int[] arr2 = { 11, 3, 7, 21};

        Set<Integer> set1 = removeDuplicates(arr1);
        Set<Integer> set2 = removeDuplicates(arr2);

        System.out.println(isSubset(set1, set2));
    }

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2){
        Map<Integer, Integer> counters = new HashMap<>();

        //frequency counter for first array
        set1.forEach(value -> {
            if(!counters.containsKey(value)){
                counters.put(value, 1);
            } else{
                counters.put(value, counters.get(value)+1);
            }
        });

        //check if every element in second array has a frequency in first array
        for(Integer value : set2){
            if(counters.get(value) == null || !(counters.get(value) > 0)){
                return false;
            }
        }

        return true;
    }

    public static Set<Integer> removeDuplicates(int[] arr){
        Set<Integer> unique = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
            }
        }

        return unique;
    }
    
}
