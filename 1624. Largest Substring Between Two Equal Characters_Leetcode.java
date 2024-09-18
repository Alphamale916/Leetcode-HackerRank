/*
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s
*/

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        for (int i = 0; i < firstIndex.length; i++) {
            firstIndex[i] = -1;
        }
        
        int maxLength = -1;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 'a';

            if (firstIndex[index] == -1) {
                firstIndex[index] = i;
            } else {
                int length = i - firstIndex[index] - 1;
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}
