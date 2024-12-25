class Solution {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            n = sumOfSquares(n);
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);
        }
        return true;
    }

    public int sumOfSquares(int n) {
        int sumSquares = 0;
        while (n > 0) {
            int dig = n % 10;
            sumSquares += dig * dig;
            n /= 10;
        }
        return sumSquares;
    }
}
