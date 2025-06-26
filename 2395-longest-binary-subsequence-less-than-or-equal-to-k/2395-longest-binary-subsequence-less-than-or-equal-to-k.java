class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length(), oneCnt = 0, res = 0;
        for (int i = n - 1; i >= Math.max(0, n - 31); i--) {
            if (s.charAt(i) == '1') {
                String sub = s.substring(i, n);
                if (Integer.parseInt(sub, 2) <= k) {
                    oneCnt++;
                } else {
                    break;
                }
            }
        }
        res += oneCnt;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                res++;
            }
        }
        return res;
    }
}