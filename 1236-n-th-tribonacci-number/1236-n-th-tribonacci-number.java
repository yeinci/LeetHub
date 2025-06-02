class Solution {
    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int prev2 = 0, prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int next = curr + prev + prev2;
            prev2 = prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}