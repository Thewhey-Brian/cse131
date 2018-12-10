package finalproject;

import cse131.ArgsProcessor;
import cse131.NotYetImplementedException;

public class OnePlayerBattleship implements Battleship {

	private ArgsProcessor ap;
	private Player p1;
	private int width;
	private int height;
	private boolean randomShips;
	private int numShips;
	private String playerName;
	
	/**
	 * The main method that gets the starting parameters for a game,
	 * creates an instance of the OnePlayerBattleship class,
	 * and plays the game!
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("What is the player's name?");
		int length = ap.nextInt("What is the length of the board?");
		int width = ap.nextInt("What is the width of the board?");
		int numShips = ap.nextInt("How many ships should each player have?");
		boolean randomShips = ap.nextBoolean("Should the ships be placed randomly? Type true or false");
		Battleship bs = new OnePlayerBattleship(length, width, randomShips, numShips, name, ap);
		Player winner = bs.play();
		System.out.println(winner.getName() + " won!");
	}
	
	/**
	 * Create an instance of the OnePlayerBattleship class
	 * Create a player with the given name
	 * Place all ships, randomly or manually
	 * 
	 * NOTE: We've created the player for you, in order to deal with the ArgsProcessor that needs to be passed
	 * 
	 * @param width width of the board (# cols)
	 * @param height height of the board (# rows)
	 * @param randomShips whether or not the ships should be placed randomly
	 * @param playerName the name of the Player who will be playing the game
	 */
	public OnePlayerBattleship(int width, int height, boolean randomShips, int numShips, String playerName, ArgsProcessor ap) {
		p1 = new HumanPlayer(playerName, width, height, ap); // DON'T CHANGE THIS
		this.width = width;
		this.height = height;
		this.randomShips = randomShips;
		this.numShips = numShips;
		this.playerName = playerName;
		this.ap = ap;
	}

	@Override
	public Player play(){
		if(this.randomShips) {
			for(int i=0; i<this.numShips; ++i) {
				int length  = ap.nextInt("What is the length of this ship?");
				p1.addRandomShip(length);
			}
		}
		else {
			for(int i=0; i<this.numShips; ++i) {
				int length  = ap.nextInt("What is the length of this ship?");
				p1.addShip(p1.decideShipPlacement(length));
			}
		}
		while(p1.numShipsStillAfloat()>0) {
			int[] loc = p1.getTargetLocation();
			boolean isHit = p1.respondToFire(loc[0], loc[1]);
			System.out.println(isHit);
			p1.recordHitOrMiss(loc[0], loc[1], isHit);
			p1.printRadar();
		}
		return p1;
	}

	@Override
	public boolean turn(Player p) {
		int o = p1.numShipsStillAfloat();
		while(p1.numShipsStillAfloat()>0) {
			p.printRadar();
			p.getTargetLocation();
			boolean isHit = this.p1.respondToFire(p.getTargetLocation()[0], p.getTargetLocation()[1]);
			p.recordHitOrMiss(p.getTargetLocation()[0], p.getTargetLocation()[1], isHit);
			p.printRadar();
			if(p1.numShipsStillAfloat()<o) {
				System.out.println("You sunk my battleship!");
				o--;
			}
		}
		return true;
	}
	
	/**
	 * We've implemented this for you since there's only one player, you can leave this alone!
	 */
	@Override
	public Player getPlayerOne() {
		return p1;
	}

	/**
	 * We've implemented this for you since there's only one player, you can leave this alone!
	 */
	@Override
	public Player getPlayerTwo() {
		return null;
	}

}
