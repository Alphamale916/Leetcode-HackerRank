/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        int a=97,i=0;
        while(a<123){
            if(sentence.charAt(i) == a){
                a++;
                i=-1;
            }
            i++;
            if(i==sentence.length()){
                
                return false;
            }
            
        }
        
        return true;
    }
}
