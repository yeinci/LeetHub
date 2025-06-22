class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            int point = questions[i][0];
            int skip = questions[i][1];

            int next = i + skip + 1;

            long take = point + (next < n ? dp[next] : 0);
            long notTake = (i + 1 < n ? dp[i + 1] : 0);

            dp[i] = Math.max(take, notTake);
        }
        return dp[0];
    }
}