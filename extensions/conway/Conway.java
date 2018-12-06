package conway;

import java.util.HashMap;
import java.util.Map;

import sedgewick.StdDraw;

/**
 * 
 *
 */
public class Conway {
	
	private int rows;
	private int cols;
	private int[][] loc = new int[rows][cols];
	private Map<String, Boolean> game = new HashMap<String, Boolean>();

	public Conway(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
	}


	public int getRows(){
		return this.rows;             // FIXME
	}

	public int getColumns(){
		return this.cols;             // FIXME
	}

	/**
	 * Sets the current status of the cell at (row, col)
	 * @param b if true, the cell is alive; if false, the cell is dead 
	 * @param row
	 * @param col
	 */
	public void setLiveness(boolean b, int row, int col){
		String loc = Integer.toString(row) + ", " + Integer.toString(col);
		game.put(loc, b);
	}


	/**
	 *  
	 * @param row
	 * @param col
	 * @return whether or not a cell at a specific row and column is alive. 
	 *    If row or col is out of bounds, you must return false.
	 */
	public boolean isAlive(int row, int col){
		String loc = Integer.toString(row) + ", " + Integer.toString(col);
		if(!game.containsKey(loc)) {
			return false;
		}
		else {
			return game.get(loc);
		}
	}


	/**
	 * Make every cell not alive
	 */
	public void clear(){
		for(String location: game.keySet()) {
			game.put(location, false);
		}
	}


	/**
	 * Consider the 3x3 cell array that has the cell at (row, col) at its center.
	 * Let's call all cells but that center cell the neighbors of that center cell.
	 * This method returns the number of neighbors that are alive.
	 * 
	 *   n  n  n
	 *   n  c  n
	 *   n  n  n
	 *   
	 *  Above, if c represents the cell at (row, col), each n is
	 *  a neighbor of c, according to the above definition.
	 *  The result is at most 8 and at least 0.
	 * 
	 * @param row
	 * @param col
	 * @return the number of living neighbors
	 */
	public int countLivingNeighbors(int row, int col){
		int ans = 0;
		// part 1
		String loc1 = Integer.toString(row-1) + ", " + Integer.toString(col-1);
		String loc2 = Integer.toString(row-1) + ", " + Integer.toString(col);
		String loc3 = Integer.toString(row-1) + ", " + Integer.toString(col+1);
		String loc4 = Integer.toString(row) + ", " + Integer.toString(col-1);
		String loc5 = Integer.toString(row) + ", " + Integer.toString(col+1);
		String loc6 = Integer.toString(row+1) + ", " + Integer.toString(col-1);
		String loc7 = Integer.toString(row+1) + ", " + Integer.toString(col);
		String loc8 = Integer.toString(row+1) + ", " + Integer.toString(col+1);
		if(game.get(loc1)!=null) {
			if(game.get(loc1)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc2)!=null) {
			if(game.get(loc2)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc3)!=null) {
			if(game.get(loc3)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc4)!=null) {
			if(game.get(loc4)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc5)!=null) {
			if(game.get(loc5)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc6)!=null) {
			if(game.get(loc6)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc7)!=null) {
			if(game.get(loc7)) {
				ans = ans + 1;
			}
		}
		if(game.get(loc8)!=null) {
			if(game.get(loc8)) {
				ans = ans + 1;
			}
		}
		return ans;
	}

	/**
	 * Executes a generation of life.  Be sure to read the specification
	 * for this assignment, because it points out a common mistake students
	 * make when implementing this method.
	 * 
	 */
	public void step(){
		Conway c1 = new Conway(this.getRows(), this.getColumns());
		for(String key : this.game.keySet()) {
		c1.game.put(key, this.game.get(key));
		}
		
		for(int row=0; row<c1.rows; ++row) {
			for(int col=0; col<c1.cols; ++col) {
				if(isAlive(row, col)) {
					if(this.countLivingNeighbors(row, col)<2) {
						c1.setLiveness(false, row, col);
					}
				}
				else {
					if(this.countLivingNeighbors(row, col)>=3) {
						c1.setLiveness(true, row, col);
					}
				}
			}
		}
//
//		for(String key : this.game.keySet()) {
//			//string to int
//			String[] lo = key.split(", ");
//			int row = Integer.valueOf(lo[0]);
//			int col = Integer.valueOf(lo[1]);
//			if(isAlive(row, col)) {
//				if(this.countLivingNeighbors(row, col)<2) {
//					c1.setLiveness(false, row, col);
//				}
//			}
//			else {
//				if(this.countLivingNeighbors(row, col)>=3) {
//					c1.setLiveness(true, row, col);
//				}
//			}
//		}
//		for(String key : this.game.keySet()) {
//			this.game.put(key, c1.game.get(key));
//		}	
		for(int row=0; row<c1.rows; ++row) {
			for(int col=0; col<c1.cols; ++col) {
				this.setLiveness(c1.isAlive(row, col), row, col);
			}
		}
	}

	/**
	 * creates a blinker
	 */
	public void blinker() {

		if (this.getRows() < 3 || this.getColumns() < 3) {
			System.out.println("Grid is too small for premade pattern Blinker. " +
					"Conway must be at least 3x3");
		}
		else {
			this.setLiveness(true, 1, 0);
			this.setLiveness(true, 1, 1);
			this.setLiveness(true, 1, 2);
		}
	}

	public void fourBlinkers() {
		clear();
		if (this.getRows() < 9 || this.getColumns() < 9) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 9x9");
		}
		else {
			for (int i = 3; i < 6; i++) {
				for (int j = 3; j < 6; j++) {
					this.setLiveness(true, i, j);
				}
			}
		}
	}


	public void gosperGliderGun() {
		clear();
		if (this.getRows() < 50 || this.getColumns() < 50) {
			System.out.println("Grid is too small for premade pattern Gosper Glider Gun. " +
					"Conway must be at least 50x50");
		}
		else {
			this.setLiveness(true,0,27);
			this.setLiveness(true,1,25);
			this.setLiveness(true,1,27);
			this.setLiveness(true,2,15);
			this.setLiveness(true,2,16);
			this.setLiveness(true,2,23);
			this.setLiveness(true,2,24);
			this.setLiveness(true,2,37);
			this.setLiveness(true,2,38);
			this.setLiveness(true,3,14);
			this.setLiveness(true,3,18);
			this.setLiveness(true,3,23);
			this.setLiveness(true,3,24);
			this.setLiveness(true,3,37);
			this.setLiveness(true,3,38);
			this.setLiveness(true,4,3);
			this.setLiveness(true,4,4);
			this.setLiveness(true,4,13);
			this.setLiveness(true,4,19);
			this.setLiveness(true,4,23);
			this.setLiveness(true,4,24);
			this.setLiveness(true,5,3);
			this.setLiveness(true,5,4);
			this.setLiveness(true,5,13);
			this.setLiveness(true,5,17);
			this.setLiveness(true,5,19);
			this.setLiveness(true,5,20);
			this.setLiveness(true,5,25);
			this.setLiveness(true,5,27);
			this.setLiveness(true,6,13);
			this.setLiveness(true,6,19);
			this.setLiveness(true,6,27);
			this.setLiveness(true,7,14);
			this.setLiveness(true,7,18);
			this.setLiveness(true,8,15);
			this.setLiveness(true,8,16);


		}
	}

	public void glider() {
		clear();
		if (this.getRows() < 10 || this.getColumns() < 10) {
			System.out.println("Grid is too small for premade pattern Four Blinkers. " +
					"Conway must be at least 10x10");
		}
		else {

			this.setLiveness(true,1,1);
			this.setLiveness(true,1,3);
			this.setLiveness(true,2,2);
			this.setLiveness(true,2,3);
			this.setLiveness(true,3,2);

		}
	}

	public void yourDesignOne() {
		this.setLiveness(true,2,5);
		this.setLiveness(true,2,6);
		this.setLiveness(true,2,7);
		this.setLiveness(true,2,8);
		this.setLiveness(true,2,9);
		this.setLiveness(true,7,0);
		this.setLiveness(true,7,1);
		this.setLiveness(true,7,2);
		this.setLiveness(true,7,3);
		this.setLiveness(true,7,4);
		
	}

	public void yourDesignTwo() {
		this.setLiveness(true,2,4);
		this.setLiveness(true,2,6);
		this.setLiveness(true,2,8);
		this.setLiveness(true,2,10);
		this.setLiveness(true,2,12);
		this.setLiveness(true,1,5);
		this.setLiveness(true,1,7);
		this.setLiveness(true,1,9);
		this.setLiveness(true,1,11);
		this.setLiveness(true,1,13);
	}


	public void logAndCapture() {
		clear();
		for(int row=0; row<this.rows; ++row) {
			for(int col=0; col<this.cols; ++col) {
				if(isAlive(row, col)) {
					StdDraw.point(row, col);
					System.out.println("setLiveness(true, row, col)");
				}
			}
		}

	}

}