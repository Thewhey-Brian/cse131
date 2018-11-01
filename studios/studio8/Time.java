package studio8;

public class Time {
	private final int hour;
	private final int minute;
	private final boolean format;
	
	public Time(int hour, int minute, boolean format) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}

	public int sum() {
		return this.hour+this.minute;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public boolean isFormat() {
		return format;
	}

	@Override
	public String toString() {
		return  hour + ", " + minute + ", 12-hour?" + format;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (format ? 1231 : 1237);
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (format != other.format)
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
	
	
	
	
	
}
