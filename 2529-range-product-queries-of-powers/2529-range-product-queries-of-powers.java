class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = 1_000_000_007;
        ArrayList<Integer> powers = new ArrayList<>();
        
        // n'in 2'nin kuvvetlerine ayrılması
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                powers.add(1 << i);
            }
        }

        // Prefix product array
        int m = powers.size();
        long[] prefix = new long[m + 1];
        prefix[0] = 1;
        for (int i = 0; i < m; i++) {
            prefix[i + 1] = (prefix[i] * powers.get(i)) % MOD;
        }

        // Sorguları cevapla
        int len = queries.length;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = (int)(prefix[r + 1] * modInverse(prefix[l], MOD) % MOD);
        }

        return res;
    }

    // Modular inverse (Fermat's Little Theorem)
    private long modInverse(long a, int mod) {
        return modPow(a, mod - 2, mod);
    }

    private long modPow(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
