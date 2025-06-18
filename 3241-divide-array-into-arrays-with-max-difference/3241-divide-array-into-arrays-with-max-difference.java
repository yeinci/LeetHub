class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] res = new int[n/3][3];
        Arrays.sort(nums);

        int[] arr = new int[3];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            int mod = i % 3;
            if (mod == 0) {
                res[i / 3 - 1] = arr;
                arr = new int[3];
            } else {
                if (arr[0] + k < curr) {
                    return new int[0][0];
                }
            }
            arr[mod] = curr;
        }
        res[n / 3 - 1] = arr;
        return res;
    }
}