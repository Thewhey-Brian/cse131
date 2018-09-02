package exercises2;

public class Die {

	public static void main(String[] args) {
		
		double die = Math.random();
		if (die>0.16667)
		{
			if(die>0.33333)
			{
				if(die>0.5)
				{
					if(die>0.66666)
					{
						if(die>0.83333)
						{
							System.out.println("1");
						}
						else {
							System.out.println("2");
						}
					}
					else {
						System.out.println("3");
					}
				}
				else {
					System.out.println("4");
				}
			}
			else {
				System.out.println("5");
			}
		}
		else {
			System.out.println("6");
		}

		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//

	}

}
