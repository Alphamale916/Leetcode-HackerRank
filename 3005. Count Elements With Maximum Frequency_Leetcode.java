/*
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
*/
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int temp=nums[0],max=0,currentfrequency=1,sum=0;
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                currentfrequency++;
            }else{
                if(currentfrequency > max){
                    max=currentfrequency;
                }
                currentfrequency=1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                currentfrequency++;
            }else{
                if(currentfrequency == max){
                    sum+=max;
                }
                currentfrequency=1;
            }
        }
        return sum;
    }
}
