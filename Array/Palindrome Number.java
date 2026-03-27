// Given an integer x, return true if x is a palindrome, and false otherwise.


//TIME COMPLEXITY ---> O(n)


class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int check=0;
        while(x>0){
            int ld=x%10;
            check=check*10+ld;
            x=x/10;
        }
        if(temp==check){
            return true;
        }
        else{
            return false;
        }
    }
}