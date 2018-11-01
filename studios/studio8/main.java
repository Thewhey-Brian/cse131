package studio8;

public class main {

	public static void main(String[] args) {
		Time t = new Time(12, 55, true);
		Time t1 = new Time(1, 55, true);
		Time t2 = new Time(2, 39, true);
		Time t3 = new Time(11, 05, true);
		Time t4= new Time(2, 44, true);
		
		Date d = new Date(06, 02, 1998);
		Date d1 = new Date(07, 12, 1998);
		Date d2 = new Date(03, 22, 1998);
		Date d3 = new Date(11, 19, 1998);
		Date d4 = new Date(01, 27, 1998);
		
		System.out.println(t);
		System.out.println(d);
	}
}