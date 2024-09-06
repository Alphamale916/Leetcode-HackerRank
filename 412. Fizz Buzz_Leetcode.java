/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<String>();
        for(int i=0;i<n;i++){
            if((i+1)%3 ==0 && (i+1)%5 == 0){
                arr.add(i,"FizzBuzz");
            }else if((i+1)%3 ==0){
                 arr.add(i,"Fizz");
            }else if((i+1)%5 ==0){
                 arr.add(i,"Buzz");
            }else{
                 arr.add(i,Integer.toString(i+1));
            }
        }

        return arr;
    }
}
