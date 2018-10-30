package exercises8;

public class PersonalProporty implements Valuable {
	
	private final int initial;
	private int year;
	
	public PersonalProporty(int initial) {
		this.initial = initial;
	}
	
	public int depreciatedValue() {
		return (int) (this.initial*Math.pow(0.80, year));
	}
	
	public void addYear() {
		this.year += 1; 
	}

	@Override  
	public String toString() {
		return "PersonalProporty [initial=" + initial + ", year=" + year + "now= "+ this.depreciatedValue()+ "]";
	}

	@Override
	public int getLiquidValue() {
		return this.depreciatedValue();
	}

}
