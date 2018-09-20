package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int lim = ap.nextInt("What the speed limit?");
		int speed = ap.nextInt("What's your speed?");
		int fine= 0;
		fine = (speed>lim&&speed<(lim+10)) ? fine = fine+50 : 0;
		fine = (speed>(lim+10)) ? fine = fine+50+10*(speed-(lim+10)) : fine;
		System.out.print("Your fine is "+fine);
	}

}
