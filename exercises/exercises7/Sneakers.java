package exercises7;

public class Sneakers {
	
	private String brand;
	private String fun;
	private double price;
	private double weight;
	private int year;
	/**
	 * constructor
	 * @param brand
	 * @param fun
	 * @param price
	 * @param weight
	 */
	public Sneakers(String brand, String fun, int price, double weight) {
		super();
		this.brand = brand;
		this.fun = fun;
		this.price = price;
		this.weight = weight;
		this.year = 1;
	}
	
	public String getBrand() {
		return brand;
	}

	public String getFun() {
		return fun;
	}
	
	public void loseWeight(){
		this.weight -= 9.8;
	}
	
	public void yearAdd() {
		this.year += 1;
	}
	public double priceOverYears() {
		return this.price = this.price * 1.1 * this.year;
	}
	
	
	
	
	

}
