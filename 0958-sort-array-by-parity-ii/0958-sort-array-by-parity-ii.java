class Solution {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int evenIndex = 0, oddIndex = 1;
        while (evenIndex < n && oddIndex < n) {

            if (nums[evenIndex] % 2 != 0 && nums[oddIndex] % 2 == 0) {
                swap(nums, evenIndex, oddIndex);
            }

            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            if (nums[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }
        }
        return nums;
    }
}