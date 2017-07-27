package edu.pdx.cs410J.katas;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper  {
  private int row, column;
  private List<Character> board = new ArrayList<>();

  public Minesweeper(int row, int column) throws ZeroSizedBoardException{
    if(row == 0 || column == 0){
      throw new ZeroSizedBoardException();
    }
    this.row = row;
    this.column = column;
  }

  public void addRow(String row) throws RaggedBoardException{

    if(row.length() != this.column){
      throw new RaggedBoardException();
    }
    for(int i = 0; i<row.length(); i++){
      this.board.add(row.charAt(i));
    }

  }

  public String solve() {
    String solved = "";
    for(char c: this.board){
      if(c == '*'){
        solved += "*";
      }
      else if(c == '.'){
        solved += "0";
      }
    }
    return solved;
  }
}
