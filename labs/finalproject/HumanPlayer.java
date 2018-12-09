package finalproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import cse131.ArgsProcessor;
import cse131.NotYetImplementedException;

public class HumanPlayer implements Player {
	
	private final ArgsProcessor ap; // Don't change this!
	private String name;
	private int height;
	private int width;
	private Map<Ship, Boolean> list = new HashMap<Ship, Boolean>();
	private Map<Ship, String[][]> loc = new HashMap<Ship, String[][]>();
	private String[][] radar;

	/**
	 * Creates an instance of the HumanPlayer class
	 * Note that we already dealt with taking in an ArgsProcessor object
	 * 		We know you've never seen this before, which is why it's given to you
	 * 		You can treat this ArgsProcessor (ap) throughout the HumanPlayer class
	 * 			like any other ArgsProcessor you've used in 131
	 * We leave the rest of the constructor to you
	 * 
	 * @param name the name of the player
	 * @param height the height of the board
	 * @param width the width of the board
	 * @param ap the ArgsProcessor object
	 */
	public HumanPlayer(String name, int height, int width, ArgsProcessor ap) {
		this.ap = ap;
		this.name = name;
		this.height = height;
		this.width = width;
		for(Ship key : list.keySet()){
			list.put(key, key.isSunk());
		}
		for(Ship key : loc.keySet()){
			loc.put(key, key.body);
		}
		this.radar = new String[this.width][this.height];
		for(int i=0; i<this.width; ++i) {
			for(int j=0; j<this.height; ++j) {
				radar[i][j] = ".";
			}
		}
	}
	
	@Override
	public boolean addShip(Ship s) {
		if(isValidShipToAdd(s)) {
			list.put(s, s.isSunk());
			loc.put(s, s.body);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int[] getTargetLocation() {
		int[] ans = new int[2];
		int x = ap.nextInt("the next target-x you want?");
		int y = ap.nextInt("the next target-y you want?");
		while(!(x>=0&&y>=0&&x<=this.width-1&&y<=this.height-1)) {
			x = ap.nextInt("the next target-x you want?");
			y = ap.nextInt("the next target-y you want?");
		}
		ans[0] = x;
		ans[1] = y;
		return ans;
	}

	@Override
	public void recordHitOrMiss(int x, int y, boolean isHit) {
		getTargetLocation()[0] = x;
		getTargetLocation()[1] = y; 
		if(isHit) {
			this.radar[x][y] = "X";
		}
		else {
			this.radar[x][y] = "o";
		}
	}

	@Override
	public Ship decideShipPlacement(int length) {
		int x = ap.nextInt("What is the topLeftX?");
		int y = ap.nextInt("What is the topLeftY?");
		boolean hor = ap.nextBoolean("Is it horizental?");
		Ship door = new Ship(x, y, length, hor);
		while(!isValidShipToAdd(door)) {
			x = ap.nextInt("What is the topLeftX?");
			y = ap.nextInt("What is the topLeftY?");
			hor = ap.nextBoolean("Is it horizental?");
			door = new Ship(x, y, length, hor);
		}
		return door;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean respondToFire(int x, int y) {
		for(Ship key : list.keySet()) {
			if(key.isHoriozntal) {
				if(y==key.topLeftY&&x>=key.topLeftX&&x<key.topLeftX+key.length) {
					key.hits[x-key.topLeftX] = "x";
					return true;
				}
			}
			else {
				if(x==key.topLeftX&&y>=key.topLeftY&&y<key.topLeftY+key.length) {
					key.hits[y-key.topLeftY] = "x";
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int numShipsStillAfloat() {
		int ans = 0;
		for(Ship key : list.keySet()){
			if(!key.isSunk()) {
				ans++;
			}
		}
		return ans;
	}

	@Override
	public boolean addRandomShip(int length) {
		boolean tri = true;
		while(tri) {
			double coin = Math.random();
			boolean hor = true;
			if(coin>0.5) {
				hor = false;
			}
			int x = (int) (Math.random()*this.width);
			int y = (int) (Math.random()*this.height);
			Ship door = new Ship(x, y, length, hor);
			if(isValidShipToAdd(door)) {
				addShip(door);
				tri = false;
			}
		}
		return true;
		
//		int i=0;
////		while(i<100) {
//			double coin = Math.random();
//			boolean hor = true;
//			if(coin>0.5) {
//				hor = false;
//			}
//			if(hor) {
//				while(i<10000) {
//					int x = (int) (Math.random()*(this.width-length));
//					int y = (int) (Math.random()*this.height);
//					Ship door = new Ship(x, y, length, hor);
//					if(isValidShipToAdd(door)) {
//						addShip(door);
//						return true;
//					}
//					++i;
//				}
//				return false;
//			}
//			else {
//				while(i<10000) {
//					int x = (int) (Math.random()*this.width);
//					int y = (int) (Math.random()*(this.height-length));
//					Ship door = new Ship(x, y, length, hor);
//					if(isValidShipToAdd(door)) {
//						addShip(door);
//						return true;
//					}
//					++i;
//				}
////			i++;
////		}
//		return false;
//		}
//		boolean tri = true;
//		int x = 0, y = 0;
//		x = (int) (Math.random()*this.width);
//		y = (int) (Math.random()*this.height);
//		double coin = Math.random();
//		boolean hor = true;
//		if(coin>0.5) {
//			hor = false;
//		}
//		Ship door = new Ship(x, y, length, hor);
//		while(tri) {
//			if((hor&&x+length<=this.width&&isValidShipToAdd(door))||((!hor)&&y+length<=this.height&&isValidShipToAdd(door))) {
//				break;
//			}
//			else {
//				x = (int) (Math.random()*this.width);
//				y = (int) (Math.random()*this.height);
//				coin = Math.random();
//				hor = true;
//				if(coin>0.5) {
//					hor = false;
//				}
//				door = new Ship(x, y, length, hor);
//			}
//		}
//		return 
	}
	
	public boolean isCrash(Ship key, Ship s) {
		if(key.isHoriozntal==s.isHoriozntal) {
			if(key.isHoriozntal) {
				if((s.topLeftY==key.topLeftY)&&((s.topLeftX>=key.topLeftX&&s.topLeftX<key.topLeftX+key.length)||key.topLeftX>=s.topLeftX&&key.topLeftX<s.topLeftX+s.length)) {
					return true;
				}
			}
			else {
				if((s.topLeftX==key.topLeftX)&&((s.topLeftY>=key.topLeftY&&s.topLeftY<key.topLeftY+key.length)||key.topLeftY>=s.topLeftY&&key.topLeftY<s.topLeftY+s.length)) {
					return true;
				}
			}
		}
		else {
			if(s.isHoriozntal) {
				if((s.topLeftY>=key.topLeftY&&s.topLeftY<key.topLeftY+key.length)&&(key.topLeftX>=s.topLeftX&&key.topLeftX<s.topLeftX+s.length)) {
					return true;
				}
			}
			else {
				if((key.topLeftY>=s.topLeftY&&key.topLeftY<s.topLeftY+s.length)&&(s.topLeftX>=key.topLeftX&&s.topLeftX<key.topLeftX+key.length)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean isValidShipToAdd(Ship s) {
		if(s.topLeftX<0||s.topLeftY<0) {
			return false;
		}
		if(s.length==0) {
			return false;
		}
		if(s.isHoriozntal) {
			if(s.topLeftX+s.length>this.width) {
				return false;
			}
		}
		else {
			if(s.topLeftY+s.length>this.height) {
				return false;
			}
		}
		for(Ship key : loc.keySet()) {
			if(isCrash(key, s)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void printRadar() {
		for(int i=0; i<this.width; ++i) {
			for(int j=0; j<this.height; ++j) {
				System.out.println(this.radar[i][j]);
			}
		}
	}


}
