package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n= n;
	}
	
	public int roll(int n) {
		int roll= (int)(Math.random()*n);
		if(roll==0) {
			roll+=1;
		}
		return roll;
	}
}
