class Solution {
    public boolean isPowerOfFour(int n) {
        int x = 1;
        for (int i = 0; i < 16; i++) {
            if (x == n) return true;
            x *= 4;
        }
        return false;
    }
}