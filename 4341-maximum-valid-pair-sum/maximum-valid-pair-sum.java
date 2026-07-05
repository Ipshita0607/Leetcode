class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans=0;
        int maxleft=0;
        for(int j=k;j<nums.length;j++){
            maxleft=Math.max(maxleft,nums[j-k]);
            ans=Math.max(ans,maxleft+nums[j]);
        }
        return ans;
    }
}