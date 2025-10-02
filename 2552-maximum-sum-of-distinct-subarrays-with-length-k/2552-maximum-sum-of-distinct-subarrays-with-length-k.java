class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long windowSum = 0, maxSum = 0;
        int left = 0;
        Set<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(nums[right])) {
                windowSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);
            windowSum += nums[right];

            if (right - left + 1 == k) {
                maxSum= Math.max(maxSum, windowSum);
                windowSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return maxSum;
    }
}