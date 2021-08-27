package com.opolo.dsa.arrays;

import java.util.LinkedHashSet;

//import java.util.ArrayList;
//import java.util.List;

// Java Program to Remove Duplicate Elements
public class RemoveArrayDuplicateElements {

    public static void main(String[] args) {
        int a[] = { 1, 1,  3, 4, 4, 5, 6, 2, 2, 2, 3, 6, 7, 8};
        int n = a.length;
  
        //n = removeduplicates1(a, n);
        //removeDuplicates2(a);
        removeDuplicates3(a);
  
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    //Using Hashmap
    public static void removeDuplicates3(int[] a){
        
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
