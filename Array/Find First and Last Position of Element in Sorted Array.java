class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{i,j};
            }
            return new int[]{-1,-1};
        }
        while(i<=j){
            if(target!=nums[i]){
                i++;
            }
            if(target!=nums[j]){
                j--;
            }
            if(target==nums[i] && target==nums[j] ){
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}