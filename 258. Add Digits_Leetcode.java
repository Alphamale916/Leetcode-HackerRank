/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 
*/


class Solution {
    public int addDigits(int num) {
        int temp=num,res=0;
        while(temp!=0){
            res+=(temp%10);
            temp/=10;
            if(temp==0){
                if(res<10)
                break;
                temp=res;
                res=0;
            }
        }

        return res;
    }
}
