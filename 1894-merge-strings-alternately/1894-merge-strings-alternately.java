class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(n, m); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if (n > m) sb.append(word1, m, n);
        if (m > n) sb.append(word2, n, m);
        return sb.toString();
    }
}