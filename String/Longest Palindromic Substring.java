// Given a string s, return the longest palindromic substring in s.

 

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.


import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int start=0 ,end=0;
        for(int i=0 ;i<s.length()-1 ;i++){
            int len1=checkpalindrome(s,i,i);  //odd length
            int len2=checkpalindrome(s,i,i+1); //even length

            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int checkpalindrome(String s,int low ,int high){
        while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)){
            low--;
            high++;
        }
        return high-low-1;
    }
}