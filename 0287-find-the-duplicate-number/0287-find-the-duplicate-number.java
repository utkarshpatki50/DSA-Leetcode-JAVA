class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int slow = nums[0], fast = nums[0];

        do {
            slow = nums[slow];   //move by one
            fast = nums[nums[fast]];   //move by two

        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}