class Solution {
    public boolean isRobotBounded(String instructions) {
        int n = instructions.length();
        int dir = 0; // 0 North, 1 East, 2 South, 3 West
        int posx = 0, posy = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < n; i++) {
                if (instructions.charAt(i) == 'G') {
                    if (dir == 0) posy++;
                    else if (dir == 1) posx++;
                    else if (dir == 2) posy--;
                    else posx--;
                } else if (instructions.charAt(i) == 'L') {
                    dir = (dir + 3) % 4;
                } else {
                    dir = (dir + 1) % 4;
                }
            }
            if (posx == 0 && posy == 0 && dir == 0) return true;
        }
        return false;
    }
}