package studio8;

public class Date {
	private final int month;
	private final int day;
	private final int year;
	
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	@Override
	public String toString() {
		return  month + ", " + day + ", " + year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	

	
	
	
	
}


