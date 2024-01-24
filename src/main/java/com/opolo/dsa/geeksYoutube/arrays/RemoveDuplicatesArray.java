package com.opolo.dsa.geeksYoutube.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicatesArray{

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
        //removeDuplicates(arr);
        frequencyCounter(arr);
    }

    //Time Complexity: O(N)
    //Auxiliary Space: O(N)
    public static void removeDuplicates(int[] arr){
        Set<Integer> unique = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
            }
        }

        unique.forEach(System.out::println);
    }

    public static void frequencyCounter(int[] arr){
        Map<Integer, Integer> counters = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(counters.containsKey(arr[i])){
                counters.put(arr[i], counters.get(arr[i])+1);
            } else {
                counters.put(arr[i], 1);
            }
            
        }

        counters.forEach((k,v) -> {
            System.out.println(k+", "+v);
        });
    }
}