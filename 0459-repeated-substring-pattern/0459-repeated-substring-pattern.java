class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i != 0) continue;

            boolean done = true;
            String sub = s.substring(0, i);

            for (int j = i; j <= n - i; j += i) {
                if (sub.equals(s.substring(j, j + i))) continue;
                done = false;
                break;
            }
            if (done) return true;
        }
        return false;
    }
}