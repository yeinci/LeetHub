class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, index = 0;
        ArrayList<Integer> numsArr = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }
        for (int i = index; i < n; i++) {
            nums[i] = 0;
        }
    }
}