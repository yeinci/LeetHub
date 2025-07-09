class Solution {
public:
    int snakesAndLadders(vector<vector<int>>& board) {
        int n = board.size(), res = 1;
        int* arr = boustrophedonToArray(board);
        vector<bool> isVisited(n*n, false);
        queue<int> curr, next;

        curr.push(0);
        isVisited[0] = true;
        while (!curr.empty()) {
            int x = curr.front();
            curr.pop();
            for (int i = 1; i < min(7, n*n - x); i++) {
                int dest = arr[x + i] == -1 ? x + i: arr[x + i] - 1;
                if (dest == n*n - 1) {
                    delete[] arr;
                    return res;
                }
                if (isVisited[dest]) continue;
                
                isVisited[dest] = true;
                next.push(dest);
            }
            if (curr.empty()) {
                res++;
                curr = move(next);
            }
        }
        delete[] arr;
        return -1;
    }

    int* boustrophedonToArray(vector<vector<int>>& board) {
        int n = board.size(), index = 0;
        int* arr = new int[n*n];
        bool leftToRight = true;
        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    arr[index] = board[i][j];
                    index++;
                }  
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[index] = board[i][j];
                    index++;
                } 
            }
            leftToRight = !leftToRight;
        }
        return arr;
    }
};