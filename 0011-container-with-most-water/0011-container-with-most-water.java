class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}