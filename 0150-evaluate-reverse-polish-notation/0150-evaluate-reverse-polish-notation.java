class Solution {

    public boolean isOperator(String ch) {
        if (ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")) {
            return true;
        }
        return false;
    }

    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int ans = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            String ch = tokens[i];
            if (isOperator(ch) == true) {
                int a = st.pop();
                int b = st.pop();

                if (ch.equals("+")) {
                    ans = a + b;
                } else if (ch.equals("-")) {
                    ans = b - a;
                } else if (ch.equals("*")) {
                    ans = a * b;
                } else if (ch.equals("/")) {
                    ans = b / a;
                }
                st.push(ans);
            } else {
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}