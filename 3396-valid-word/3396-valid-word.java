class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if (n < 3) return false;
        boolean hasVowel = false, hasConsonant = false;
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) continue;
            else if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if ("aeiou".indexOf(ch) != -1) hasVowel = true;
                else hasConsonant = true;
            } else return false;
        }
        return hasVowel && hasConsonant;
    }
}