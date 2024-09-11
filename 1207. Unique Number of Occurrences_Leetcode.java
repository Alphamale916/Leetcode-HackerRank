/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
*/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int count=1,len=0;
        int arr1[]=new int[arr.length];
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
            count++;
            }else{
                arr1[len]=count;
                count=1;
                len++; 
            }
        }
        
        Arrays.sort(arr1,0,len);
        for(int i=1;i<len;i++){
            if(arr1[i] == arr1[i-1]){
                return false;
            }
        }

        return true;
    }
}
