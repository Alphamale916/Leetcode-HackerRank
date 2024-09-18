/*
Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
*/

class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length(),i=0,j=0;
        StringBuilder sb = new StringBuilder();
        for(i=0;i<n;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        StringBuilder res = new StringBuilder();
        for(i=0;i<n;i++){
            if(!Character.isAlphabetic(s.charAt(i))){
                res.append(s.charAt(i));
            }
            else{
                res.append(sb.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}
