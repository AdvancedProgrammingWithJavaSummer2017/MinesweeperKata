package edu.pdx.cs410J.katas;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper  {

  private final int rowCount;
  private final int columnCount;
  private final List<String> rows = new ArrayList<>();

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

    if (this.rows.size() == rowCount) {
      throw new RaggedBoardException();
    }
    this.rows.add(row);
  }

  public String solve() {
    String row = this.rows.get(0);
    if (row.equals("*")) {
      return "*";

    } else if (row.equals(".")) {
      return "0";
    }
    throw new UnsupportedOperationException();
  }
}
