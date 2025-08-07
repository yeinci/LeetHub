class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length, res = 0;

        for (int i = 0; i < n; i++) {
            res += fruits[i][i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    if (i + j >= n - 1) {
                        int a = (i != 0) ? fruits[i - 1][j - 1] : 0;
                        int b = (i != 0) ? fruits[i - 1][j] : 0;
                        int c = (i != 0) && (j != n - 1) ? fruits[i - 1][j + 1] : 0;
                        fruits[i][j] += Math.max(Math.max(a, b), c);
                    }
                    else fruits[i][j] = 0;
                }
            }
        }
        res += fruits[n - 2][n - 1];

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (i > j) {
                    if (i + j >= n - 1) {
                        int a = (j != 0) ? fruits[i - 1][j - 1] : 0;
                        int b = (j != 0) ? fruits[i][j - 1] : 0;
                        int c = (j != 0) && (i != n - 1) ? fruits[i + 1][j - 1] : 0;
                        fruits[i][j] += Math.max(Math.max(a, b), c);
                    }
                    else fruits[i][j] = 0;
                }
            }
        }
        res += fruits[n - 1][n - 2];

        return res;
    }
}