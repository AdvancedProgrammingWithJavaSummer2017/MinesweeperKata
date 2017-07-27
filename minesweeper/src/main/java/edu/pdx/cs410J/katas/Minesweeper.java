package edu.pdx.cs410J.katas;

public class Minesweeper  {

  private final int rowCount;
  private final int columnCount;

  public Minesweeper(int rowCount, int columnCount) {
    if (rowCount == 0 || columnCount == 0) {
      throw new ZeroSizedBoardException();
    }

    this.rowCount = rowCount;
    this.columnCount = columnCount;
  }

  public void addRow(String row) {
    if (row.length() != columnCount) {
      throw new RaggedBoardException();
    }
  }

  public String solve() {
    return null;
  }
}
