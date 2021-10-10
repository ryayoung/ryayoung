package maze_project;

import edu.du.dudraw.DUDraw;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/** Ryan Young - 5/7/2021
 * This class can build and solve a maze.
 * Since it generates mazes with lots of 2x1 mini-dead-ends,
 * I've added a feature that will prevent these dead ends from being
 * colored when solving to make the animation easier to understand. */

public class Maze {

	private enum CellValue {WALL, OPEN, PATH, CHECKED};

	private int cols;
	private int rows;
	
	private int pixelsPerCell;
	
	private CellValue[][] maze;

	private boolean finished;
	private DecimalFormat df;
	private double percentChecked;
	private double percentOpen;
	private double pathSize;
	
	
	public Maze(int cols_, int rows_) {
		cols = cols_;
		rows = rows_;
		
		finished = false;
		
		pixelsPerCell = 20;
		
		maze = new CellValue[rows][cols];
		
		// Fill maze with walls
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				maze[i][j] = CellValue.WALL;

		// Set up DUDraw
		DUDraw.setCanvasSize(cols*pixelsPerCell, rows*pixelsPerCell);
		DUDraw.setXscale(0, cols);
		DUDraw.setYscale(0, rows);
		DUDraw.enableDoubleBuffering();

	}
	
	/** Clear the screen and draw the maze based on their values */
	public void draw() {
		DUDraw.clear();
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Set Color
				DUDraw.setPenColor(DUDraw.DARK_GRAY);

				if (maze[i][j] == CellValue.OPEN)
					DUDraw.setPenColor(DUDraw.WHITE);
				else if (maze[i][j] == CellValue.PATH) {
					DUDraw.setPenColor(DUDraw.MAGENTA);
					if (finished) DUDraw.setPenColor(240, 185, 0);
				}	
				else if (maze[i][j] == CellValue.CHECKED)
					DUDraw.setPenColor(200,200,200);

				if (i == rows-2 && j == cols-2)
					DUDraw.setPenColor(DUDraw.RED);
				if (i == 1 && j == 1)
					DUDraw.setPenColor(DUDraw.GREEN);
				
				DUDraw.filledSquare(j + 0.5, i + 0.5, .5);
			}
		}
		
		DUDraw.show();
	}
	
	/** Generate maze using Depth First Search */
	public void generateMaze() {
		StackSLL<Cell> cells = new StackSLL<>();
		Cell currentCell = new Cell(1, 1);
		maze[currentCell.row][currentCell.col] = CellValue.OPEN;
		cells.push(currentCell);
		while (!cells.isEmpty()) {
			currentCell = cells.pop();
			ArrayList<Cell> neighbors = new ArrayList<>();
			int r = currentCell.row;
			int c = currentCell.col;
			// North
			if (r + 2 < rows) {
				if (maze[r+2][c] != CellValue.OPEN) {
					neighbors.add(new Cell(r+2, c));
					maze[r+2][c] = CellValue.OPEN;
					maze[r+1][c] = CellValue.OPEN;
				}
			}
			// East
			if (c + 2 < cols) {
				if (maze[r][c+2] != CellValue.OPEN) {
					neighbors.add(new Cell(r, c+2));
					maze[r][c+2] = CellValue.OPEN;
					maze[r][c+1] = CellValue.OPEN;
				}
			}
			// South
			if (r - 2 >= 0) {
				if (maze[r - 2][c] != CellValue.OPEN) {
					neighbors.add(new Cell(r-2, c));
					maze[r-2][c] = CellValue.OPEN;
					maze[r-1][c] = CellValue.OPEN;
				}
			}
			// West
			if (c - 2 >= 0) {
				if (maze[r][c-2] != CellValue.OPEN) {
					neighbors.add(new Cell(r, c-2));
					maze[r][c-2] = CellValue.OPEN;
					maze[r][c-1] = CellValue.OPEN;
				}
			}
			
			// Randomize the order in which neighbors are pushed onto the stack
			Collections.shuffle(neighbors);

			// Enqueue the neighboring cells
			for (Cell cell : neighbors)
				cells.push(cell);
			
		}
		
		draw();

	}
	
	/** Solve maze using Breadth First Search */
	public void solveMaze() {
		QueueDLL<Cell> cells = new QueueDLL<>();
		Cell start = new Cell(1,1);
		Cell goal = new Cell(rows-2, cols-2);

		Cell currentCell = start;
		maze[currentCell.row][currentCell.col] = CellValue.PATH;
		cells.enqueue(currentCell);

		while (!cells.isEmpty()) {
			currentCell = cells.dequeue();
			ArrayList<Cell> neighbors = new ArrayList<>();
			int r = currentCell.row;
			int c = currentCell.col;

			// Check if finished
			if (currentCell.row == goal.row && currentCell.col == goal.col)
				return;
			// North
			if (maze[r+1][c] == CellValue.OPEN) {
				neighbors.add(new Cell(r+1, c));
				setValue(r+1, c);
			}
			// East
			if (maze[r][c+1] == CellValue.OPEN) {
				neighbors.add(new Cell(r, c+1));
				setValue(r, c+1);
			}
			// South
			if (maze[r - 1][c] == CellValue.OPEN) {
				neighbors.add(new Cell(r-1, c));
				setValue(r-1, c);
			}
			// West
			if (maze[r][c-1] == CellValue.OPEN) {
				neighbors.add(new Cell(r, c-1));
				setValue(r, c-1);
			}
			
			// Enqueue the neighboring cells
			for (Cell cell : neighbors)
				cells.enqueue(cell);
			
			draw();

		}
		
	}
	
	/** This class uses checkIfStuckInHole() to avoid coloring cells 
	 * that are in a 2x1 corner, or "mini-dead-end" you might call it, since
	 * it's obvious that this is not the right path. */
	public void setValue(int r, int c) {
		// Check if a cornered cell was returned
		if (checkIfStuckInHole(r, c) != null && !(r == rows-2 && c == cols-2)) {
			int prevRow = checkIfStuckInHole(r, c).row;
			int prevCol = checkIfStuckInHole(r, c).col;
			maze[r][c] = CellValue.CHECKED;
			maze[prevRow][prevCol] = CellValue.CHECKED;
		}
		else
			maze[r][c] = CellValue.PATH;
//			DUDraw.pause(2);
//			draw();
	}
	

	/** Used by setValue() to check if a cell is at a dead end.
	 * If 3 of the 4 neighboring cells are walls, this method will
	 * return the one neighboring Cell that is NOT a wall.
	 * If not, return null. */
	private Cell checkIfStuckInHole(int r, int c) {
		int wallCount = 0;
		Cell returnCell = null;

		if (maze[r+1][c] == CellValue.WALL)
			wallCount++;
		else
			returnCell = new Cell(r+1, c);

		if (maze[r-1][c] == CellValue.WALL)
			wallCount++;
		else
			returnCell = new Cell(r-1, c);

		if (maze[r][c+1] == CellValue.WALL)
			wallCount++;
		else
			returnCell = new Cell(r, c+1);

		if (maze[r][c-1] == CellValue.WALL)
			wallCount++;
		else
			returnCell = new Cell(r, c-1);
		
		if (wallCount >= 3)
			return returnCell;

		return null;
	}
	
	/** Changes all cell values that are not part of the correct path
	 * from EXPLORED to CHECKED, so only the correct path is colored.
	 * For each EXPLROED cell in the maze, count how many of its neighboring
	 * cells are also EXPLORED. If only ONE neighbor is EXPLORED, we've found a dead end.*/
	public void removeDeadEnds() {
		boolean removed = true;
		while (removed == true) {
			removed = false;
			for (int i = 1; i < rows-1; i++) {
				for (int j = 1; j < cols-1; j++) {
					int countConnections = 0;
					if (maze[i][j] == CellValue.PATH) {
						if (maze[i+1][j] == CellValue.PATH)
							countConnections++;
						if (maze[i][j+1] == CellValue.PATH)
							countConnections++;
						if (maze[i-1][j] == CellValue.PATH)
							countConnections++;
						if (maze[i][j-1] == CellValue.PATH)
							countConnections++;
						if (countConnections == 1
								&& !(i == rows-2 && j == cols-2)
								&& !(i == 1 && j == 1)) {
							maze[i][j] = CellValue.CHECKED;
							removed = true;
						}
					}
				}
			}
			draw();
		}
		// Little animation to indicate we've found the correct path.
		for (int i = 0; i < 5; i++) {
			finished = false;
			draw();
			DUDraw.pause(200);
			finished = true;
			draw();
			DUDraw.pause(200);
		}
	}
	
	public boolean processStatsForNerds() {
		df = new DecimalFormat("###.###");
		int countOpen = 0;
		int countChecked = 0;
		int countPath = 0;
		int mazeSize = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (maze[i][j] == CellValue.CHECKED
						|| maze[i][j] == CellValue.PATH)
					countChecked++;
				else if (maze[i][j] == CellValue.OPEN)
					countOpen++;
				
				if (maze[i][j] == CellValue.PATH)
					countPath++;
			}
		}
		
		mazeSize = countOpen + countChecked;
		percentChecked = (double) countChecked / mazeSize;
		percentOpen = (double) countOpen / mazeSize;
		pathSize = (double) countPath / mazeSize;

		
		if (percentChecked < 0.0001) return false;
		return true;
	}
	
	public void showStats() {
		DUDraw.setPenColor(DUDraw.MAGENTA);
		DUDraw.setPenRadius(3);
		DUDraw.rectangle(cols/5, rows/1.2, cols/8, rows/8);
		DUDraw.setPenColor(DUDraw.WHITE);
		DUDraw.filledRectangle(cols/5, rows/1.2, cols/8, rows/8);
		DUDraw.show();
	}
	
	public double getPercentChecked() {
		return Double.parseDouble(df.format(percentChecked));
	}
	public double getPercentOpen() {
		return Double.parseDouble(df.format(percentOpen));
	}
	public double getPathSize() {
		return Double.parseDouble(df.format(pathSize));
	}
	
	
	private class Cell {
		private int row;
		private int col;
		
		public Cell(int row_, int col_) {
			row = row_;
			col = col_;
		}
		
		public String toString() {
			return "[" + row + "]" + "[" + col + "]";
		}
	}
	
	

}
