class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> res;
        
        vector<int> prev = {1};
        res.push_back(prev);
        for (int i = 1; i < numRows; i++) {
            vector<int> curr = {1};
            for (int j = 1; j < i; j++) {
                curr.push_back(prev[j - 1] + prev[j]);
            }
            curr.push_back(1);
            res.push_back(curr);
            prev = curr;
        }
        return res;
    }
};