class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}