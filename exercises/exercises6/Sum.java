package exercises6;

public class Sum {
	public static int sum(int n) {
		if (n>0) {
			return n + sum(n-1);
		}
		else {
			return 0;
		}
	}

}
