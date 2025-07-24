class Solution {
public:
    string addBinary(string a, string b) {
        string res = "";
        int n = a.size() - 1, m = b.size() - 1;

        int carry = 0;
        while (n >= 0 || m >= 0 || carry) {
            int sum = 0;
            sum += carry;
            if (n >= 0) sum+= a[n] - '0';
            if (m >= 0) sum+= b[m] - '0';

            res += (sum % 2) + '0';
            carry = sum / 2;

            n--, m--;
        }
        reverse(res.begin(), res.end());
        return res;
    }
};