class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, List<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            ans.add(new ArrayList<>(tmp));
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(nums[i]))
                continue;
            tmp.add(nums[i]);
            backtrack(ans, tmp, nums);
            tmp.remove(tmp.size() - 1);
        }
    }
}