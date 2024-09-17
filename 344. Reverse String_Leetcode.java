/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

class Solution {
    public void reverseString(char[] s) {
        int len=s.length-1;
        for(int i=0;i<(s.length/2);i++){
            s[i]  =(char)((int)s[i]+(int)s[len]);
            s[len]=(char)((int)s[i]-(int)s[len]);
            s[i]  =(char)((int)s[i]-(int)s[len]);
            len--;
        }
    }
}
