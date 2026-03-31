// Given an array of positive integers nums and a positive integer target,
// return the minimal length of a subarray whose sum is greater than or equal to target. 
// If there is no such subarray, return 0 instead.

 
// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int low=0;
//         int high=0;
//         int res=Integer.MAX_VALUE;
//         int sum=0;
//         boolean check=false;
//         while(high < nums.length){
//             sum=sum+nums[high];
//             while(sum>=target){
//                 check=true;
//                 int len=high-low+1;
//                 res=Math.min(res,len);
//                 sum=sum-nums[low];
//                 low++;
//             }
//             high++;
//         }
//         if(check==true){
//             return res;
//         }
//         else{
//             return 0;
//         }
//     }
// }