package finalproject;

import java.util.Arrays;

import cse131.NotYetImplementedException;

/**
 * @author Mariah Yelenick and Adam Kern
 * @version 11/18/18
 */
public class Ship {
	
	public int topLeftX;
	public int topLeftY;
	public int length;
	public boolean isHoriozntal;
	public String[][] body;
	public String[] hits;
	
	/**
	 * Create an instance of the ship class, recording all necessary information into
	 * any instance variables you choose to create
	 * 
	 * @param topLeftX the x coordinate of the ship's uppermost, leftmost space
	 * @param topLeftY the y coordinate of the ship's uppermost, leftmost space
	 * @param length the number of spaces the ship occupies
	 * @param isHorizontal if true, the ship is placed horizontally, else the ship is placed vertically
	 */
	public Ship(int topLeftX, int topLeftY, int length, boolean isHorizontal) {
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.length = length;
		this.hits = new String[this.length];
		for(int i=0; i<this.length; ++i) {
			hits[i] = "o";
		}
		this.isHoriozntal = isHorizontal;
		if(this.isHoriozntal) {
			this.body = new String[this.topLeftX+this.length][this.topLeftY+1];
			for(int i=this.topLeftX; i<this.topLeftX+this.length; ++i) {
				body[i][this.topLeftY] = "*";
			}
		}
		else {
			this.body = new String[this.topLeftX+1][this.topLeftY+this.length];
			for(int i=this.topLeftY; i<this.topLeftY+this.length; ++i) {
				body[this.topLeftX][i] = "*";
			}
		}
	}
	
	/**
	 * Check if the ship has been sunk
	 * This should only be true if the ship was hit in all the spaces it occupies
	 * 
	 * @return true if the ship has been sunk
	 */
	public boolean isSunk() {
		int t = 0;
			for(int i=0; i<this.length; ++i) {
				if(this.hits[i]=="x") {
					t++;
				}
			}
			if(t==this.length) {
				return true;
			}
				return false;
	}
	
	/**
	 * Check if the ship occupies a space at (x, y)
	 * Note: Be sure to update the hits array so that you can check if the ship is sunk!
	 * 
	 * @param x the x coordinate to shoot at
	 * @param y the y coordinate to shoot at
	 * @return true if this ship occupies that spot (hit), false otherwise (miss)
	 */
	public boolean isHit(int x, int y) {
		if(this.isHoriozntal) {
			if(y==this.topLeftY&&x>=this.topLeftX&&x<this.topLeftX+this.length){
				this.hits[x-this.topLeftX] = "x";
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(x==this.topLeftX&&y>=this.topLeftY&&y<this.topLeftY+this.length) {
				this.hits[y-this.topLeftY] = "x";
				return true;
			}
			else {
				return false;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(body);
		result = prime * result + Arrays.hashCode(hits);
		result = prime * result + (isHoriozntal ? 1231 : 1237);
		result = prime * result + length;
		result = prime * result + topLeftX;
		result = prime * result + topLeftY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ship other = (Ship) obj;
		if (!Arrays.deepEquals(body, other.body))
			return false;
		if (!Arrays.equals(hits, other.hits))
			return false;
		if (isHoriozntal != other.isHoriozntal)
			return false;
		if (length != other.length)
			return false;
		if (topLeftX != other.topLeftX)
			return false;
		if (topLeftY != other.topLeftY)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ship [topLeftX=" + topLeftX + ", topLeftY=" + topLeftY + ", length=" + length + ", isHoriozntal="
				+ isHoriozntal + ", body=" + Arrays.toString(body) + ", hits=" + Arrays.toString(hits) + "]";
	}
	
	
	
}
