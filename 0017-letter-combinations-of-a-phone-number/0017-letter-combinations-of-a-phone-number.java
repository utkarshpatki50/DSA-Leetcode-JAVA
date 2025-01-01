class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] mapping = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        List<String> result = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), result, mapping);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder current, List<String> result, String[] mapping) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(digits, index + 1, current, result, mapping);
            current.deleteCharAt(current.length() - 1); // Backtrack
        }
    }
}
