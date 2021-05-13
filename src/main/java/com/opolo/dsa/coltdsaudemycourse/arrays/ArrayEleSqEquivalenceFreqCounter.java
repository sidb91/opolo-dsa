package com.opolo.dsa.coltdsaudemycourse.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayEleSqEquivalenceFreqCounter {
    
    static boolean arraySqEquivalence(int[] arr1,int[] arr2){

        Map<Integer,Integer> freq1 = new HashMap<>();
        Map<Integer,Integer> freq2 = new HashMap<>();

        if(arr1.length != arr2.length){
            return false;
        }

        //O(n)
        for(Integer i : arr1){
            if(freq1.containsKey(i)){
                int prevValue = freq1.get(i);
                freq1.put(i, ++prevValue);
            }else{
                freq1.put(i, 1);
            }
        }

        freq1.forEach((k,v) -> {System.out.println(String.format("%s : %s",k,v));});

        //O(n)
        for(Integer i : arr2){
            if(freq2.containsKey(i)){
                int prevValue = freq2.get(i);
                freq2.put(i, ++prevValue);
            }else{
                freq2.put(i, 1);
            }
        }
        freq2.forEach((k,v) -> {System.out.println(String.format("%s : %s",k,v));});

        for(Integer i : freq1.keySet()){
            if(!(freq2.keySet().contains(i*i))){
                return false;
            }

            if(freq1.get(i) != freq2.get(i*i)){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{2,4,5,4,3};
        int[] arr2 = new int[]{16,4,9,16,25};

        System.out.println("Array Equivalence = "+arraySqEquivalence(arr1,arr2));
    }
}
