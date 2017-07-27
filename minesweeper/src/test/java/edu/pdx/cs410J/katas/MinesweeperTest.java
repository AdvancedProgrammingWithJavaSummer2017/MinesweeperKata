package edu.pdx.cs410J.katas;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the {@link Minesweeper} class.
 */
public class MinesweeperTest {


  @Test(expected = ZeroSizedBoardException.class)
  public void zeroSizedBoardThrowException() throws ZeroSizedBoardException{
    new Minesweeper(0, 0);
  }


  @Test(expected = ZeroSizedBoardException.class)
  public void boardWithZeroRowsThrowsException() throws ZeroSizedBoardException{
    new Minesweeper(0, 5);
  }


  @Test(expected = ZeroSizedBoardException.class)
  public void boardWithZeroColumnsThrowsException() throws ZeroSizedBoardException {
    new Minesweeper(5, 0);
  }


  @Test(expected = RaggedBoardException.class)
  public void raggedInputRowThrowsException() throws ZeroSizedBoardException,RaggedBoardException {
    Minesweeper board = new Minesweeper(1, 2);
    board.addRow(".");
  }

  @Test(expected = RaggedBoardException.class)
  public void raggedInputColumnThrowsException() throws ZeroSizedBoardException, RaggedBoardException{
    Minesweeper board = new Minesweeper(2, 1);
    board.addRow(".");
    board.addRow("..");
  }

  @Test
  public void oneSquareWithMine() throws ZeroSizedBoardException, RaggedBoardException{
    Minesweeper board = new Minesweeper(1, 1);
    board.addRow("*");

    String solved = board.solve();
    assertThat(solved, equalTo("*"));
  }


  @Test
  public void oneSquareWithNoMine() throws ZeroSizedBoardException, RaggedBoardException{
    Minesweeper board = new Minesweeper(1, 1);
    board.addRow(".");

    String solved = board.solve();
    assertThat(solved, equalTo("0"));
  }

  @Ignore
  @Test
  public void twoByTwoBoardWithMineAtZeroZero() throws ZeroSizedBoardException,RaggedBoardException {
    Minesweeper board = new Minesweeper(2, 2);
    board.addRow("*.");
    board.addRow("..");

    String solved = board.solve();
    assertThat(solved, equalTo("*1\n11"));

  }

}
