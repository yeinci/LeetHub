class Solution {
    public double soupServings(int n) {
        if (n > 4800) return 1.0; // İstatistiksel olarak artık A'nın ilk bitme ihtimali neredeyse %100
        int N = (int) Math.ceil(n / 25.0); // 25 ml birimleriyle işlem yapılır

        Double[][] memo = new Double[N + 1][N + 1];
        return dfs(N, N, memo);
    }

    private double dfs(int a, int b, Double[][] memo) {
        if (a <= 0 && b <= 0) return 0.5;
        if (a <= 0) return 1.0;
        if (b <= 0) return 0.0;
        if (memo[a][b] != null) return memo[a][b];

        // Her durumda %25 olasılık var
        memo[a][b] = 0.25 * (
            dfs(Math.max(0, a - 4), b, memo) +
            dfs(Math.max(0, a - 3), Math.max(0, b - 1), memo) +
            dfs(Math.max(0, a - 2), Math.max(0, b - 2), memo) +
            dfs(Math.max(0, a - 1), Math.max(0, b - 3), memo)
        );

        return memo[a][b];
    }
}