class Solution {
    public int partitionArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 1;

        int prev = nums[0];
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            if (prev + k < curr) {
                res++;
                prev = curr;
            }
        }
        return res;
    }
}