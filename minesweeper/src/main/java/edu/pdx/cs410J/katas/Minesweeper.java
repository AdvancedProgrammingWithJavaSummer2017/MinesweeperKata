package edu.pdx.cs410J.katas;

public class Minesweeper {
    int row;
    int column;

    char[][] board;

    int indexRow = 0;

    public Minesweeper(int row, int column) throws ZeroSizedBoardException {
        if (row == 0 || column == 0)
            throw new ZeroSizedBoardException();
        this.row = row;
        this.column = column;

        board = new char[row][column];
    }

    public void addRow(String row) throws RaggedBoardException {
        if (row.length() != this.column) {
            throw new RaggedBoardException();
        }
        for (int z = 0; z < this.column; ++z) {
            board[indexRow][z] = row.charAt(z);
        }
        ++indexRow;

    }

    public String solve() {
        StringBuilder sb = new StringBuilder();
        for (int rowCount = 0; rowCount < this.row; rowCount++) {
            for (int columnCount = 0; columnCount < this.column; columnCount++) {
                //if (board[rowCount][columnCount] == '.') {
                  //  sb.append(checkMines(rowCount, columnCount));
                //} else {
                    sb.append(board[rowCount][columnCount]);
                //}
            }
            if (rowCount > 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /*
    private int checkMines(int rowCount, int columnCount) {
        int numberOfSurroundingMines = 0;

        for (int rowCheckPos = rowCount - 1; rowCheckPos <= rowCount + 1; rowCheckPos++) {
            if (rowCheckPos < 0 || rowCheckPos > this.row) {
                continue;
            } else {
                for (int colCheckPos = columnCount - 1; colCheckPos <= columnCount + 1; colCheckPos++) {
                    if (colCheckPos < 0 || colCheckPos > this.column) {
                        continue;
                    } else if (board[rowCheckPos][colCheckPos] == '*') {
                        numberOfSurroundingMines++;
                    }
                }
            }
        }
        return numberOfSurroundingMines;
    }
    */
}
