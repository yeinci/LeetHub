class Solution {
    public boolean isPowerOfThree(int n) {
        int x = 1;
        for (int i = 0; i < 20; i++) {
            if (x == n) return true;
            x *= 3;
        }
        return false;
    }
}