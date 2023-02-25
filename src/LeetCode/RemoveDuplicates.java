package LeetCode;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int index = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[index] == nums[i]){
                nums[i] = -999;
            }else{
                index = i;
            }
        }
        System.out.println(Arrays.toString(nums));

        index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != -999){
                nums[index] = nums[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return index;
    }

}
