package maze_project;

import edu.du.dudraw.DUDraw;

/** Ryan Young - 5/7/2021
 * Driver for the Maze class
 */

import java.awt.Color;
public class MazeDriver {

	public static void main(String[] args) {
//		Maze maze = new Maze(95, 45); // num of cols, num of rows
//		Maze maze = new Maze(45, 15); // num of cols, num of rows
		Maze maze = new Maze(91, 49); // num of cols, num of rows
		maze.generateMaze();
		maze.solveMaze();
		maze.draw();
		maze.removeDeadEnds();
		System.out.println();
		maze.processStatsForNerds();
		System.out.println((int)(maze.getPercentChecked()*100) + "%");
		System.out.println((int)(maze.getPercentOpen()*100) + "%");
		System.out.println((int)(maze.getPathSize()*100) + "%");
		
//		maze.showStats();
		

	}

}
