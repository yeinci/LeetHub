class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0, n = accounts.length, m = accounts[0].length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }
}