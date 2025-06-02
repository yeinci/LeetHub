class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }
        int[] points = new int[max + 1];
        for (int num : nums) {
            points[num] += num;
        }
        
        int prev = 0;
        int curr = 0;
        for (int point : points) {
            int next = Math.max(curr, prev + point);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}