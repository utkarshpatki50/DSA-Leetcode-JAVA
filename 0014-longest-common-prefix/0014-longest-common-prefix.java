class Solution {

    public String longestCommonPrefix(String[] s) {
        String ans = "";
        int n = s.length;
        
        if(s== null || n==0){
            return "";
        }
        
        Arrays.sort(s);
        String first = s[0];
        String last = s[n - 1];

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                ans += first.charAt(i);
            }
        }
        return ans;
    }
}
