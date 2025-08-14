class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length(), res = -1;
        char prev2 = num.charAt(0);
        char prev = num.charAt(1);
        for (int i = 2; i < n; i++) {
            char curr = num.charAt(i);
            if (prev2 == prev && prev == curr) {
                res = Math.max(res, curr - '0');
            }
            prev2 = prev;
            prev = curr;
        }
        if (res == -1) return "";

        return String.valueOf(res).repeat(3);
    }
}