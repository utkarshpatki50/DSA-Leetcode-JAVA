class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer> st= new Stack<>();
        int [] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i= 2* n-1; i>= 0; i--){
            int num= nums[i % n];
            while(!st.empty() && st.peek() <= num){
                st.pop();
            }

            if(i< n && !st.empty()){
                ans[i]= st.peek();
            }

            st.push(num);
        }

        return ans;
    }
}