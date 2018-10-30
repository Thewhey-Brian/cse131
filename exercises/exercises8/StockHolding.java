package exercises8;

import java.util.HashSet;
import java.util.Set;

public class StockHolding {
	
	private final String name;
	private final String owner;
	private int smun;
	private double sprice;
	public StockHolding(String name, String owner, int smun, double sprice) {
		this.name = name;
		this.owner = owner;
		this.smun = smun;
		this.sprice = sprice;
	}
	public void setSmun(int smun) {
		this.smun = smun;
	}
	public void setSprice(double sprice) {
		this.sprice = sprice;
	}
	public String getName() {
		return name;
	}
	public String getOwner() {
		return owner;
	}
	public int getSmun() {
		return smun;
	}
	public double getSprice() {
		return sprice;
	}
	@Override
	public String toString() {
		return "StockHolding [name=" + name + ", owner=" + owner + ", smun=" + smun + ", sprice=" + sprice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		StockHolding other = (StockHolding) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
    public static void main(String[] args) {
    	Set<StockHolding> set = new HashSet<StockHolding>();
    	StockHolding a = new StockHolding("MS", "BG", 100, 0.16); 
    	a.setSmun(20);
    	set.add(a);
    	a.setSprice(0.5);
    	set.add(a);
    	StockHolding b = new StockHolding("MS", "BGJ", 1100, 0.716); 
    	set.add(b);
    	System.out.println(set);
    }

}
