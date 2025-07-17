class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray(), tChars = t.toCharArray();
        int[] freq = new int[26];
        for (char ch : sChars) {
            freq[ch - 'a']++;
        }
        for (char ch : tChars) {
            freq[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }
}