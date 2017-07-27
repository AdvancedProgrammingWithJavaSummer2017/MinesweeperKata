package edu.pdx.cs410J.katas;

public class Minesweeper  {

    private char[][] inputBoard;
    private char[][] outputBoard;

    int rowsFilledIn = 0;

    public Minesweeper(int row, int column) throws ZeroSizedBoardException {
        if (row == 0 || column == 0) {
            throw new ZeroSizedBoardException();
        }
        this.inputBoard = new char[row][column];
    }

    public void addRow(String rowToCopy) throws RaggedBoardException {
        if (rowToCopy.length() != inputBoard[0].length) {
            throw new RaggedBoardException();
        }

        if (rowsFilledIn == inputBoard.length) {
            System.out.println("Board is full.");
        } else {
            rowToCopy.getChars(0, rowToCopy.length(), inputBoard[rowsFilledIn], 0);
            ++this.rowsFilledIn;
        }
    }

    public String solve() {
//        for (int i = 0; i < inputBoard.length; i++) {
//            for (int j = 0; j < inputBoard[0].length; j++) {
//
//            }
//        }
        return null;
    }
}
