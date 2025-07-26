class Solution {
public:
    int romanToInt(string s) {
        int n = s.size(), sum = 0;

        for (int i = 0; i < n; i++) {
            char ch = s[i];
            if (ch == 'I') {
                if ((i + 1 != n) && (s[i+1] == 'V' || s[i+1] == 'X')) sum--;
                else sum++;
            } else if (ch == 'V') sum += 5;
            else if (ch == 'X') {
                if (i + 1 != n && (s[i+1] == 'L' || s[i+1] == 'C')) sum -= 10;
                else sum += 10;
            } else if (ch == 'L') sum += 50;
            else if (ch == 'C') {
                if (i + 1 != n && (s[i+1] == 'D' || s[i+1] == 'M')) sum -= 100;
                else sum += 100;
            } else if (ch == 'D') sum += 500;
            else if (ch == 'M') sum += 1000;
        }
        return sum;
    }
};