class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] freq = countDigits(n);

        for (int i = 0; i < 31; i++) {
            int pow = 1 << i;
            if (Arrays.equals(freq, countDigits(pow))) {
                return true;
            }
        }
        return false;
    }

    private int[] countDigits(int x) {
        int[] count = new int[10];
        while (x > 0) {
            count[x % 10]++;
            x /= 10;
        }
        return count;
    }
}