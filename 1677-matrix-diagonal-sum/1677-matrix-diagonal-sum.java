class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0, j = 0; i < n; i++, j++) {
            sum += mat[i][j];
        }
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            sum += mat[i][j];
        }
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}