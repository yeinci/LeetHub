class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length, x = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                if (x == -1) return false;
                x = 1;
            } else if (nums[i] < nums[i - 1]) {
                if (x == 1) return false;
                x = -1;
            }
        }
        return true;
    }
}