class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int len = (n % k == 0) ? n / k : n / k + 1;
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            if (i * k + k <= n) {
                res[i] = s.substring(i * k, i * k + k);
            } else {
                res[i] = s.substring(i * k);
                for (int j = res[i].length(); j < k; j++) {
                    res[i] = res[i] + fill;
                }
            }
        }
        return res;
    }
}