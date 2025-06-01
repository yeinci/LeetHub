class Solution {
    public long distributeCandies(int n, int limit) {
        if (n > 3 * limit) return 0;
        limit = Math.min(limit, n);
        long result = 0;
        for (int i = 0; i <= limit; i++) {
            int candy = n - i;
            int min = Math.max(0, candy - limit);
            int max = Math.min(limit, candy);
            result += Math.max(0, max - min + 1);
        }
        return result;
    }
}