class Solution {

    // General Rule:
    // For nums[mid] == 2: Don’t increment mid after swapping, because the swapped
    // value might not be in its correct position and requires re-evaluation.
    // For nums[mid] == 0 or 1: You always increment mid, as their placement is
    // final after processing.

    //DUTCH-NATIONAL FLAG ALGORITHM

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }

            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}