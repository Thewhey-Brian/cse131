package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int i=1;
		double a=0, b=0;
		while(i<1001) {
			double k = Math.random();
			a = k+a;
			b = a/i;
			if(i%100==0) {
				System.out.println("The average is: "+b);
			}
			i = i+1;
		}
		
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses?
		//        Became closer to 0.5.
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		//        Right up there!
		//
		
	}

}
