class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.size(), res = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                if (res == 0) continue;
                else return res;
            }
            res++;
        }
        return res;
    }
};