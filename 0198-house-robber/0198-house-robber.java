class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev3 = 0;
        int prev2 = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            curr += prev2 > prev3 ? prev2 : prev3;
            prev3 = prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev > prev2 ? prev : prev2;
    }
}