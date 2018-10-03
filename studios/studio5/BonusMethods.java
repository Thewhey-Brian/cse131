package studio5;

public class BonusMethods {

	
	public static int sumDownBy2(int n) {
		int ans = 0;
		if(n==0||n<0) {
			ans = 0;
		}
		else {
			if(n==1) {
				ans = 1;
			}
			else {
				int elm = 0;
				for (int i=0; elm>=0; i=i+2) {
					ans = ans + elm;
					elm = n-i;
				}
			}
		}
		return ans;
	}
	
	public static double harmonicSum(int n) {
		double ans = 0;
		for (double i=1; i<=n; ++i) {
			ans = ans + 1/i;
		}
		return ans;
	}
	
	public static double geometricSum(int k) {
		double ans = 0;
		for(int i=0; i<=k; ++i) {
			double a = Math.pow(2, i);
			ans = ans + 1/a;
		}
		return ans;
	}
	
	public static int multPos(int j, int k) {
		int ans = 0;
		for(int i=0; i<j; ++i) {
			ans = ans + k;
		}
		return ans;
	}
	
	public static int mult(int j, int k) {
		int ans;
		if(j>=0&&k>=0) {
			ans = multPos(j, k);
		}
		else {
			if(j<=0&&k<=0) {
				int ja = Math.abs(j);
				int ka = Math.abs(k);
				ans = multPos(ja, ka);
			}
			else {
				int ja = Math.abs(j);
				int ka = Math.abs(k);
				ans = -multPos(ja, ka);
			}
		}
		return ans;
	}
	
	public static int expt(int n, int k) {
		int ans = 1;
		if(k==0) {
			ans = 1;
		}
		else {
			for (int i=0; i<k; i++) {
				ans = ans * n;
			}
		}
		return ans;
	}


}
