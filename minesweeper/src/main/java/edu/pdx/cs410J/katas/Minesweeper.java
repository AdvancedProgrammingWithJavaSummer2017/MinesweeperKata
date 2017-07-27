package edu.pdx.cs410J.katas;

public class Minesweeper  {

  private final Integer rowCount;
  private final Integer columnCount;

  public Minesweeper(int rowCount, int columnCount) {
    if (rowCount == 0 || columnCount == 0)
        throw new ZeroSizedBoardException();

    this.rowCount = rowCount;
    this.columnCount = columnCount;
  }

  public void addRow(String row) {

  }

  public String solve() {
    return null;
  }
}
