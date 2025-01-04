class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0, equal = 0, more = 0;
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans[less++] = nums[i];
            }
        }

        equal = less;
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                ans[equal++] = nums[i];
            }
        }

        more = equal;
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                ans[more++] = nums[i];
            }
        }

        return ans;
    }
}