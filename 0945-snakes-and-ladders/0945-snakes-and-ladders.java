class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int max = n * n;
        int[] boardLin = makeBoardLineer(board);
        boolean[] isVisited = new boolean[max];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        isVisited[0] = true;

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();

                if (curr == max - 1) return steps;

                for (int move = 1; move <= 6; move++) {
                    int next = curr + move;
                    if (next >= max) continue;

                    int dest = (boardLin[next] != -1) ? boardLin[next] - 1 : next;
                    if (!isVisited[dest]) {
                        isVisited[dest] = true;
                        queue.offer(dest);
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    public static int[] makeBoardLineer(int[][] board) {
        int n = board.length;
        int[] res = new int[n * n];
        int index = 0;
        boolean leftToRight = true;

        for (int i = n - 1; i >= 0; i--) {
            if (leftToRight) {
                for (int j = 0; j < n; j++) {
                    res[index++] = board[i][j];
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    res[index++] = board[i][j];
                }
            }
            leftToRight = !leftToRight;
        }

        return res;
    }
}