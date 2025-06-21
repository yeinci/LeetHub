class Solution {
    public int minimumDeletions(String word, int k) {
        int n = word.length(), ans = Integer.MAX_VALUE;
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int f1 : freq) {
            int curr = 0;
            for (int f2 : freq) {
                curr += (f2 < f1) ? f2 : Math.max(0, f2 - (f1 + k));
            }
            ans = Math.min(ans, curr);
        }
        return ans;
    }
}