class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = roman.get(s.charAt(i));

            int next = 0;
            if (i + 1 < s.length()) {
                next = roman.get(s.charAt(i + 1));
            }

            if (curr < next) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        return ans;
    }
}