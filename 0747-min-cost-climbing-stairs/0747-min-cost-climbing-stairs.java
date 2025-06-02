class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = cost[0], curr = cost[1];
        for (int i = 2; i < n; i++) {
            int next = cost[i] + Math.min(prev, curr);
            prev = curr;
            curr = next;
        }
        return Math.min(curr, prev);
    }
}