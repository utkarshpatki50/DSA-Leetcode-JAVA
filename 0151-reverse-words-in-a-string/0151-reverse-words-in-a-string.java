class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<String> st = new Stack<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
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

        while (!st.empty()) {
            ans.append(st.peek());
            st.pop();

            if (!st.empty()) {
                ans.append(' ');
            }
        }

        return ans.toString();
    }
}