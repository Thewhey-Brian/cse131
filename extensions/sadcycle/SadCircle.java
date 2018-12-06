package sadcycle;

import java.util.HashSet;
import java.util.Set;

import cse131.ArgsProcessor;

public class SadCircle {
	
	public static int unit(long n) {
		int i=0;
		long res = (long) (n % Math.pow(10, i));
		while(res != n) {
			i = i+1;
			res = (long) (n % Math.pow(10, i));
		}
		return i-1;
	}
	
	public static long cal(long n) {
		int unit = unit(n);
		long ans = 0;
		for(int i=1; i<=unit+1; ++i) {
			long a = (long) (n % Math.pow(10, i));
			long b = (long) (a/Math.pow(10, i-1));
			ans = ans + b*b;
		}
		return ans;
	}
	
	public static Set<Long> findCycle(int base, long n){
		Set<Long> circle = new HashSet<Long>();
		if(n==1) {
			circle.add((long) 1);
			return circle;
		}
		long next = cal(n);
		//next!=n
		while(!circle.contains(next)) {
			circle.add(n);
			if(next==1) {
				circle = new HashSet<Long>();
				circle.add((long) 1);
				return circle;
			}
			else {
				circle.add(next);
				next = cal(next);
			}
		}
		return circle;
	}

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		long n = ap.nextInt("What is the number?");
		System.out.println(findCycle(10, n));
//		System.out.println(unit(115));
//		System.out.println(cal(4));
//		Set<Long> circle = new HashSet<Long>();
//		circle = new HashSet<Long>();
//		circle.add((long) 1);
//		circle.add((long) 12);
//		System.out.println(circle);
	}

}
