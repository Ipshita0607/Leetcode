class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        long upperCount = 0;
        long lowerCount = 0;

        // Count pairs with sum <= upper
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if ((long) nums[left] + nums[right] <= upper) {
                upperCount += (right - left);
                left++;
            } else {
                right--;
            }
        }

        // Count pairs with sum < lower
        left = 0;
        right = nums.length - 1;

        while (left < right) {

            if ((long) nums[left] + nums[right] < lower) {
                lowerCount += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return upperCount - lowerCount;
    
    }
}