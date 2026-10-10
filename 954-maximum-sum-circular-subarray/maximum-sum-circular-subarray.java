class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxsum=nums[0];
        int minsum=nums[0];
        int currmax=0;
        int currmin=0;
        for(int i=0;i<nums.length;i++){
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(nums[i],currmin+nums[i]);
            minsum=Math.min(minsum,currmin);
            total+=nums[i];
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}