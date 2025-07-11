class Solution {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size();
        if (n == 1) return 1;

        vector<int> candies(n, 1);

        int prev = ratings[0];
        for (int i = 1; i < n; i++) {
            int curr = ratings[i];
            if (curr > prev) {
                candies[i] = candies[i - 1] + 1;
            }
            prev = curr;
        }
        for (int i = n - 2; i >= 0; i--) {
            int curr = ratings[i];
            if (curr > prev) {
                candies[i] = max(candies[i], candies[i + 1] + 1);
            }
            prev = curr;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += candies[i];
        }
        return res;
    }
};