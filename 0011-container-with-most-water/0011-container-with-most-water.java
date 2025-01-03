class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n = height.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);

         // Width will always be right - left.. if width reduced, area will reduce.
         //to maximize height
         //if height[l] is smaller, find bigger height to its just right  => left++
         //if height[r] is smaller, find bigger height to its just left   => right--

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}