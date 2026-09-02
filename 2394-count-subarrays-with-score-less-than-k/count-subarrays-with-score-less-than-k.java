class Solution {
    public long countSubarrays(int[] nums, long k) {

        int left = 0;
        long sum = 0;
        long count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element
            sum += nums[right];

            // Shrink window while score is invalid
            while (left <= right && sum * (right - left + 1L) >= k) {
                sum -= nums[left];
                left++;
            }

            // All subarrays ending at right are valid
            count += right - left + 1L;
        }

        return count;
    }
}