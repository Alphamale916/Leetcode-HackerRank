/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int i=0,j=0,flag=0;
        while(i<nums.length){
            if(i!=j && nums[i]==nums[j]){
                arr[0]=nums[i];
            }
            if((i+1)==nums[j]){
                flag++;
            }
            j++;
            if(j==nums.length){
                if(flag==0){
                    arr[1]=(i+1);
                }
                flag=0;
                i++;
                j=0;
                
            }
        }


        return arr;
    }
}
