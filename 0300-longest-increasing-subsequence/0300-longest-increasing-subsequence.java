class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int dp[] = new  int[n];
        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    x = Math.max(x, dp[j]);
                }
            }
            dp[i] = ++x;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp[i]);
        }
        return result;
    }
}