/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int i=0,j=0,count=0,n1=jewels.length(),n2=stones.length();
       while(i<n1){
        if(jewels.charAt(i) == stones.charAt(j)){
            count++;
        }
        j++;
        if(j==n2){
            i++;
            j=0;
        }
       }

       return count;
    }
}
