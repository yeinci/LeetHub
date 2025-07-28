class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length, res = 0;
        
        int x = 0; // 0: equal/justStarted -1: decreasing 1: increasing
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                if (x == -1) res++;
                x = 1; 
            } else if (nums[i] < nums[i - 1]) {
                if (x == 1) res++;
                x = -1;
            }
        }
        return res;
    }
}