class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int n = bills.size(), fiveDB = 0, tenDB = 0;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) fiveDB++;
            else if (bills[i] == 10) {
                if (fiveDB == 0) return false;
                tenDB++;
                fiveDB--;
            } else {
                if (tenDB == 0) {
                    if (fiveDB < 3) return false;
                    fiveDB -= 3;
                } else {
                    if (fiveDB == 0) return false;
                    tenDB--;
                    fiveDB--;
                }
            }
        }
        return true;
    }
};