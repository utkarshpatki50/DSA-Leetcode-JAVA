class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();

        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;

        while (i < l1 || j < l2) {
            if (i < l1) {
                ans.append(word1.charAt(i++));
            }

            if (j < l2) {
                ans.append(word2.charAt(j++));
            }
        }
        return ans.toString();
    }
}