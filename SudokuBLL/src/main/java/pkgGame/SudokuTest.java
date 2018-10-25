package pkgGame;

import static org.junit.Assert.*;
import java.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {

	@Test
		public void isValidColumnValue_Test() {
		int[][] puzzle = { {1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		// Test which values 1-4 would work in column 2
	try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isValidColumnValue(2, 1));
			assertTrue(s1.isValidColumnValue(2, 2));
			assertFalse(s1.isValidColumnValue(2, 3));
			assertTrue(s1.isValidColumnValue(2, 4));

	} catch (Exception e) {
		fail("Test failed to build a Sudoku");
		}

	}
	@Test
	public void isValidRowValue_Test() {
		int[][] puzzle = { {1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		// Test which values 1-4 would work in row 1
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isValidRowValue(1, 1));
			assertFalse(s1.isValidRowValue(1, 2));
			assertTrue(s1.isValidRowValue(1, 3));
			assertTrue(s1.isValidRowValue(1, 4));

		} catch (Exception e) {
		fail("Test failed to build a Sudoku");
		}
//
	}
	@Test
	public void isValidRegionValue_Test() {
		int[][] puzzle = { {1,1,2,2}, {1,1,2,2}, {3,3,4,4}, {3,3,4,4}};
		// Test which values 1-4 would work in row 3 column 2 (region 3)
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isValidRegionValue(3, 2, 1));
			assertTrue(s1.isValidRegionValue(3, 2, 2));
		assertTrue(s1.isValidRegionValue(3, 2, 3));
		assertFalse(s1.isValidRegionValue(3, 2, 4));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}

	@Test
	public void buildCellSet_Test1() {
		int[][] puzzle = { {1,2,0,0}, {3,4,0,0}, {0,0,4,1}, {0,0,2,3}};
		try {
		Sudoku s1 = new Sudoku(puzzle);
			s1.PrintPuzzle();
			System.out.print(s1.getAllValidCellValues(0,0));
			System.out.print(s1.getAllValidCellValues(0,1));
			System.out.print(s1.getAllValidCellValues(0,2));
			System.out.print(s1.getAllValidCellValues(0,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(1,0));
		System.out.print(s1.getAllValidCellValues(1,1));
		System.out.print(s1.getAllValidCellValues(1,2));
			System.out.print(s1.getAllValidCellValues(1,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(2,0));
			System.out.print(s1.getAllValidCellValues(2,1));
			System.out.print(s1.getAllValidCellValues(2,2));
			System.out.print(s1.getAllValidCellValues(2,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(3,0));
			System.out.print(s1.getAllValidCellValues(3,1));
			System.out.print(s1.getAllValidCellValues(3,2));
			System.out.print(s1.getAllValidCellValues(3,3));
			
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}		

	}
	@Test
	public void buildCellSet_Test2() {
		int[][] puzzle = { {1,2,0,0}, {3,4,0,0}, {0,0,4,1}, {0,0,2,3}};
		try {
			Sudoku s1 = new Sudoku(4);
			s1.FillDiagonalRegions();
			s1.PrintPuzzle();
			System.out.print(s1.getAllValidCellValues(0,0));
			System.out.print(s1.getAllValidCellValues(0,1));
			System.out.print(s1.getAllValidCellValues(0,2));
			System.out.print(s1.getAllValidCellValues(0,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(1,0));
			System.out.print(s1.getAllValidCellValues(1,1));
			System.out.print(s1.getAllValidCellValues(1,2));
			System.out.print(s1.getAllValidCellValues(1,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(2,0));
			System.out.print(s1.getAllValidCellValues(2,1));
			System.out.print(s1.getAllValidCellValues(2,2));
			System.out.print(s1.getAllValidCellValues(2,3));
			System.out.println();
			System.out.print(s1.getAllValidCellValues(3,0));
			System.out.print(s1.getAllValidCellValues(3,1));
			System.out.print(s1.getAllValidCellValues(3,2));
			System.out.print(s1.getAllValidCellValues(3,3));
			
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		

	}
	@Test
	public void setCell_Test1() {
		int[][] puzzle = { {1,2,0,0}, {3,4,0,0}, {0,0,4,1}, {0,0,2,3}};
		try {
			Sudoku s1 = new Sudoku(puzzle);
			//s1.FillDiagonalRegions();
			s1.PrintPuzzle();
			s1.SetCells();
			System.out.println(s1.Cell.keySet());
			System.out.println(s1.Cell.get(0).getiRow());

			
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		

	}
	





}
}
