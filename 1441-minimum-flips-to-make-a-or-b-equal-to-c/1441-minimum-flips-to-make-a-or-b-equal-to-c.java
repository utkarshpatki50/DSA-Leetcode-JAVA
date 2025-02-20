class Solution {

    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a > 0 || b > 0 || c > 0) {
            int abit = a & 1;
            int bbit = b & 1;
            int cbit = c & 1;

            // If c_bit == 0, both a_bit and b_bit must be 0 to satisfy (a OR b == c).
            // Flip each 1 in a_bit or b_bit to 0, so the number of flips needed is (a_bit + b_bit).

            if (cbit == 0) {
                flips += abit + bbit;
            }
             else {
                if (abit == 0 && bbit == 0) {
                    flips += 1;
                }
            }

            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return flips;
    }
}
