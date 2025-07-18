class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int x0 = coordinates[1][0] - coordinates[0][0];
        int y0 = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0] - coordinates[i - 1][0];
            int y = coordinates[i][1] - coordinates[i - 1][1];
            
            if (x0 * y != y0 * x) return false;
        }
        return true;
    }
}