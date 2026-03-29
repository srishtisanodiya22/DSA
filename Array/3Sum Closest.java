//  Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

//  Return the sum of the three integers.

//  You may assume that each input would have exactly one solution.//  


//class Solution {
//    public int threeSumClosest(int[] nums, int target) {
//        int current;
//        int closestSum=nums[0]+nums[1]+nums[2];
//        Arrays.sort(nums);
//        for(int i=0 ;i<nums.length-2 ;i++){
//            int j=i+1,k=nums.length-1;
//            while(j<k){
//                current=nums[i]+nums[j]+nums[k];
//                
//                if(Math.abs(current-target)<Math.abs(closestSum-target)){
//                    closestSum=current;
//                }
//
//                if(current<target){
//                    j++;
//                }
//                else if(current>target){
//                    k--;
//                }
//                else{
//                    return current;
//                }
//            }
//        }
//        
//        return closestSum;
//    }
//}