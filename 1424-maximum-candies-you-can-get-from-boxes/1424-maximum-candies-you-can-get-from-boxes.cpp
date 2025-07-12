class Solution {
public:
    int maxCandies(vector<int>& status, vector<int>& candies, vector<vector<int>>& keys, vector<vector<int>>& containedBoxes, vector<int>& initialBoxes) {
        int n = status.size(), candy = 0;
        vector<int> boxes;
        boxes.resize(n);
        for (int i = 0; i < n; i++) {
            boxes[i] = 0;
        }
        for (int i = 0; i < initialBoxes.size(); i++) {
            boxes[initialBoxes[i]] = 1;
        }
        
        for (int i = 0; i < initialBoxes.size(); i++) {
            int box = initialBoxes[i];
            if (status[box] && boxes[box]) {
                status[box] = 0;
                boxes[box] = 0;
                candy += openBox(box, status, boxes, candies, keys, containedBoxes);
                
            }
        }
        return candy;
    }
    int openBox (int box, vector<int>& status, vector<int>& boxes, vector<int>& candies, vector<vector<int>>& keys, vector<vector<int>>& containedBoxes) {
        int candy = candies[box];
        for (int j = 0; j < keys[box].size(); j++) {
            int box_ = keys[box][j];
            if (boxes[box_] == 1) {
                status[box_] = 0;
                boxes[box_] = 0;
                candy += openBox(box_, status, boxes, candies, keys, containedBoxes);
            } else {
                status[box_] = 1;
            }
        }
        for (int j = 0; j < containedBoxes[box].size(); j++) {
            int box_ = containedBoxes[box][j];
            if (status[box_] == 1) {
                status[box_] = 0;
                boxes[box_] = 0;
                candy += openBox(box_, status, boxes, candies, keys, containedBoxes);
            } else {
                boxes[box_] = 1;
            }
        }
        return candy;
    }
};