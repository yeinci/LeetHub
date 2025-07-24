class Solution {
    public String tictactoe(int[][] moves) {
        int n = moves.length;
        char[][] board = new char[3][3];
        char turn = 'A';

        for (int i = 0; i < n; i++) {
            board[moves[i][0]][moves[i][1]] = turn;

            if (turn == 'A') turn = 'B';
            else turn = 'A';
        }

        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '\0' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return String.valueOf(board[i][0]);
            if (board[0][i] != '\0' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return String.valueOf(board[0][i]);
        }
        if (board[0][0] != '\0' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return String.valueOf(board[0][0]);
        if (board[0][2] != '\0' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return String.valueOf(board[0][2]);

        if (n == 9) return "Draw";
        return "Pending";
    }
}