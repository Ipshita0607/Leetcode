class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        // Find maximum element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            for (int num : nums) {
                sum += (num + mid - 1) / mid;   // ceil(num/mid)
            }

            if (sum <= threshold) {
                ans = mid;          // valid divisor
                high = mid - 1;     // try smaller divisor
            } else {
                low = mid + 1;      // divisor too small
            }
        }

        return ans;
    }
}