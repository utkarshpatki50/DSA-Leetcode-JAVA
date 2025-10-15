class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder word = new StringBuilder();
        Stack<String> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    st.push(word.toString());
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            st.push(word.toString());

        }

        StringBuilder ans = new StringBuilder();

        while (!st.empty()) {
            ans.append(st.peek());
            st.pop();

            if(!st.empty()){
                ans.append(' ');
            }
        }

            return ans.toString();
    }
}