package com.opolo.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice. 
 * You can return the answer in any order.
 * 
 * Only one valid answer exists.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class AddToTargetSum {

    public static int[] twoSumToTarget(int[] nums, int target){
        int complement = 0;
        Map<Integer, Integer> passMap = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            complement = target - nums[i];
            if(passMap.containsKey(complement)){
                return new int[] {i, passMap.get(complement)};
            }
            passMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(twoSumToTarget(new int[]{2,7,11,15}, 9));
    }
    
}
