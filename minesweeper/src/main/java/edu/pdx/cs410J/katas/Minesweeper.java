package edu.pdx.cs410J.katas;

public class Minesweeper  {
  private char[][] board;
  private int row;
  private int col;
  private int currentEmptyRow;
  public Minesweeper(int row, int col) throws ZeroSizedBoardException {
    if (row * col == 0) {
      throw new ZeroSizedBoardException();
    }
    this.row = row;
    this.col = col;
    board = new char[row][col];
  }

  public void addRow(String row) throws RaggedBoardException {
    if (row.length() != board[0].length) {
      throw new RaggedBoardException();
    }
    for (int i = 0; i < col; i++) {
      board[currentEmptyRow][i] = row.charAt(i);
    }
    currentEmptyRow++;
  }

  public String solve() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (board[i][j] != '*') {
          board[i][j] = (char) (countMines(i, j) + 48);
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sb.append(board[i][j]);
      }
      if (i != row - 1) {
        sb.append("\n");
      }
    }
    return sb.toString();
  }
  private int countMines(int row, int col) {
    int count = 0;
    if (row - 1 >= 0 && col - 1 >= 0 && board[row - 1][col - 1] == '*') {
      count++;
    }
    if (row - 1 >= 0 && board[row - 1][col] == '*') {
      count++;
    }
    if (row - 1 >= 0 && col + 1 < this.col && board[row - 1][col + 1] == '*') {
      count++;
    }
    if (col + 1 < this.col && board[row][col + 1] == '*') {
      count++;
    }
    if (row + 1 < this.row && col + 1 < this.col && board[row + 1][col + 1] == '*') {
      count++;
    }
    if (row + 1 < this.row && board[row + 1][col] == '*') {
      count++;
    }
    if (row + 1 < this.row && col - 1 >= 0 && board[row + 1][col - 1] == '*') {
      count++;
    }
    if (col - 1 >= 0 && board[row][col - 1] == '*') {
      count++;
    }
    return count;
  }

}
