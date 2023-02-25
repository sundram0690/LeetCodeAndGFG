package LeetCode;

import java.util.HashMap;
/*
Problem 1

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> elements = new HashMap<>();

        int[] arr = {-1,-1};

        for(int i=0;i<nums.length;i++){

            int diff = target - nums[i];
            if(elements.get(diff)==null){
                elements.put(nums[i],i);
            }else{
                arr[1] = i;
                arr[0]= elements.get(diff);
                break;
            }
        }
        return arr;
    }
}
