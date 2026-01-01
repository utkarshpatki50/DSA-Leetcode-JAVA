class Solution {
    public int maxSubArray(int[] nums) {
        int maxi= nums[0], currsum= nums[0];
        int n= nums.length;

        for(int i=1; i<n; i++){
            currsum= Math.max( nums[i], currsum+ nums[i]);
            maxi= Math.max(maxi, currsum);
        }
        return maxi;
    }
}