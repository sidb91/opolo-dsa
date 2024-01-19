package com.opolo.dsa.leetcode.arrays;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

//import java.util.ArrayList;
//import java.util.List;

// Java Program to Remove Duplicate Elements
public class RemoveArrayDuplicateElements {

    public static void main(String[] args) {
        int a[] = { 1, 1, 3, 4, 4, 5, 6, 2, 2, 2, 3, 6, 7, 8};
        int n = a.length;

        // Printing The array elements
        System.out.println("----duplicate elements-----");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
  
        //n = removeduplicates1(a, n);
        //removeDuplicates2(a);
        removeDuplicates3(a);
  
    }

    //Using Hashmap
    public static void removeDuplicates3(int[] a){

        Map<Integer,Boolean> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i], true);
            }
        }

        System.out.println("----unique elements-----");
        map.forEach((k,v) -> System.out.print(String.format("%s ", k,v)));
    }

    //LinkedHashSet
    public static void removeDuplicates2(int[] a){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(Integer.valueOf(a[i]));
        }
        System.out.println(set);
    }

    //O(n) - From the Array using extra space
    public static int removeduplicates1(int a[],int n){

        //List<Integer> aList = new ArrayList<>();

        if(n==0 || n==1){
            return n;
        }

        /*for(int i=0;i<a.length;i++){
            aList.add(Integer.valueOf(a[i]));
        }

        aList.stream().forEach(System.out::println);*/

        int[] temp = new int[n];
        int j = 0;

        for(int i=0;i<n-1;i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];

        for(int i=0;i<j;i++){
            a[i] = temp[i];
        }

        return j;
    }
}
