class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m - 1, up = 0, down = n - 1;

        while (right >= left && down >= up) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (right < left || down < up) continue;

            for (int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i >= up; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}