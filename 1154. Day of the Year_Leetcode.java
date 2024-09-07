/*
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
*/

class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int days=0;
        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);

        //Leap year
        boolean is_leap_year = false;
        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        } else
            is_leap_year = false;
        for(int i=1;i<=month;i++){
            if(i==month){
                days+=day;
            }else if(i%2 !=0 && i<=7){
                days+=31;
            }else if(i%2 ==0 && i==2){
                if(is_leap_year){
                    days+=29;
                }else{
                    days+=28;
                }
            }else if(i%2 ==0 && i<=7){
                days+=30;
            }else if(i%2 ==0 && i>7){
                days+=31;
            }else if(i%2 !=0 && i>7){
                days+=30;
            }
        }
        return days;
    }
}
