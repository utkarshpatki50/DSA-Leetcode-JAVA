class Solution {
    public int removeElement(int[] nums, int val) {
        int ans = 0;

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }
}
