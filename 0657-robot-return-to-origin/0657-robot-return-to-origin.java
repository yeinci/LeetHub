class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        char[] movesArray = moves.toCharArray();
        for (char ch : movesArray) {
            if (ch == 'R') x++;
            else if (ch == 'L') x--;
            else if (ch == 'U') y++;
            else y--;
        }
        return x == 0 && y == 0;
    }
}