package edu.pdx.cs410J.katas;

public class Minesweeper  {

  private int row;
  private int column;
  private int currentRow;

  public Minesweeper(int row, int column) throws ZeroSizedBoardException {
    if((row == 0) || (column == 0)) {
      throw new ZeroSizedBoardException();
    }
    currentRow = 1;
  }

  public void addRow(String inputRow) {
    if(inputRow.length() != column || (currentRow > row)){
      throw new RaggedBoardException();
    }
    currentRow++;
  }

  public String solve() {
    return null;
  }
}
