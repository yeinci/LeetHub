class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, zeroCount = 0;
        ArrayList<Integer> numsArr = new ArrayList<>();
        for (int num : nums) {
            if (num == 0) zeroCount++;
            else numsArr.add(num);
        }
        for (int i = 0; i < zeroCount; i++) {
            numsArr.add(0);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = numsArr.get(i);
        }
    }
}