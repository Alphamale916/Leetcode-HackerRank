/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int i=nums.length-2,a=nums.length-1;
        while(i>=0){
            if(nums[i]==0){
                swap(nums,i,a--); 
            }
            i--;
        }
        
        
    }

    public void swap(int[] arr,int start,int end){
        for(int k=start;k<end;k++){
            arr[k]  = arr[k] + arr[k+1];
            arr[k+1]  = arr[k] - arr[k];
            arr[k]  = arr[k] - arr[k+1];
        }
    }
}
