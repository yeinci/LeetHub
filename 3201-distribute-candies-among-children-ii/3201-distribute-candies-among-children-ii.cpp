class Solution {
public:
    long long distributeCandies(int n, int limit) {
        long long res = 0;
        for (int i = 0; i <= min(n, limit); i++) {
            int rem = n - i;
            int mini = max(0, rem - limit);
            int maxi = min(limit, rem);
            res += max(0, maxi - mini + 1);
        }
        return res;
    }
};