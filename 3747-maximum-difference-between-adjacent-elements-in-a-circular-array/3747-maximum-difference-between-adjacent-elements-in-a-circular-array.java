class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int maxDiff = 0;
        int prev = nums[n - 1];
        for (int i = 0; i < n; i++) {
            int newDiff = Math.abs(nums[i] - prev);
            if (newDiff > maxDiff) maxDiff = newDiff;
            prev = nums[i];
        }
        return maxDiff;
    }
}