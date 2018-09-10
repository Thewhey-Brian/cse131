package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int speed = ap.nextInt("What's your speed?");
		int fine= 0;
		fine = (speed>70) ? fine = fine+50 : 0;
		fine = (speed>80) ? fine = fine+10*(speed-70) : fine;
		System.out.print("Your fine is "+fine);
	}

}
