class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length, res = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) return 0;
            res *= signFunc(nums[i]);
        }
        return res;
    }
    private int signFunc(int x) {
        if (x < 0) return -1;
        else if (x > 0) return 1;
        else return 0;
    }
}