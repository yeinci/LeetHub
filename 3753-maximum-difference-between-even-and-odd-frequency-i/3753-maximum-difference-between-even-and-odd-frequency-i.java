class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f % 2 == 0 && f != 0) {
                if (f < minEven) {
                    minEven = f;
                }
            } else {
                if (f > maxOdd) {
                    maxOdd = f;
                }
            }
        }
        return maxOdd - minEven;
    }
}