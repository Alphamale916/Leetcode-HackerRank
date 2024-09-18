/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
*/

class Solution {
    public String toLowerCase(String s) {
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                char ch=(char)((int)s.charAt(i) + 32);
                s=s.substring(0,i)+ch+s.substring(i+1);
            }
        }

        return s;
    }
}
