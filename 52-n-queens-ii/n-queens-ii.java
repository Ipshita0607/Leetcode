class Solution {

    int count = 0;

    void f(int col, char[][] board,
           boolean[] rowFlag,
           boolean[] upperDiagonal,
           boolean[] lowerDiagonal,
           int n) {

        if (col == n) {
            count++;
            return;
        }

        for (int row = 0; row < n; row++) {

            if (!rowFlag[row]
                    && !upperDiagonal[row + col]
                    && !lowerDiagonal[n + row - col]) {

                board[row][col] = 'Q';

                rowFlag[row] = true;
                upperDiagonal[row + col] = true;
                lowerDiagonal[n + row - col] = true;

                f(col + 1, board,
                  rowFlag,
                  upperDiagonal,
                  lowerDiagonal,
                  n);

                board[row][col] = '.';

                rowFlag[row] = false;
                upperDiagonal[row + col] = false;
                lowerDiagonal[n + row - col] = false;
            }
        }
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        boolean[] rowFlag = new boolean[n];
        boolean[] upperDiagonal = new boolean[2 * n];
        boolean[] lowerDiagonal = new boolean[2 * n];

        f(0, board,
          rowFlag,
          upperDiagonal,
          lowerDiagonal,
          n);

        return count;
    }
}