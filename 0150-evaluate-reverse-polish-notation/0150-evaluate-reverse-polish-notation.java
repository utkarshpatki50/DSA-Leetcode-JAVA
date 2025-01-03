class Solution {

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String ch = tokens[i];

            if (isOperator(ch)) {
                int ans = 0;
                int b = st.pop();
                int a = st.pop();

                if (ch.equals("+")) {
                    ans = a + b;
                } else if (ch.equals("-")) {
                    ans = a - b;
                } else if (ch.equals("*")) {
                    ans = a * b;
                } else if (ch.equals("/")) {
                    ans = a / b;
                }

                st.push(ans);
            } else {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}