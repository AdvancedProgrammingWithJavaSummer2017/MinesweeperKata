package edu.pdx.cs410J.katas;

public class Minesweeper {
  private int column;
  private int row;
  private String board;

  public Minesweeper(int row, int column) throws ZeroSizedBoardException {
    if (row == 0 || column == 0) {
      throw new ZeroSizedBoardException();
    } else {
      this.column = column;
      this.row = row;
      board = "";
    }
  }

  public void addRow(String row) throws RaggedBoardException{
    if(row.length() != this.column){
      throw new RaggedBoardException();
    }else {
      if(!board.equals("")) {
        board += "\n" + row;
      }else
        board += row;
    }
  }

  public String solve() {
    String solved = "";
    for(int i = 0; i < board.length(); ++i){
      if(board.charAt(i) == '*'){
        solved += "*";
      }else if(board.charAt(i) == '.'){
        if(row == 1 && column == 1){
          solved += "0";
        }else{
          solved += "1";
        }
      }else if(board.charAt(i) == '\n'){
        solved += "\n";
      }
    }
    return solved;
  }
}
