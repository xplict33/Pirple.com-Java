package ctrlFlow;

public class fizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++)
		{
			// Multiples of 3 and 5
			if (i % 3 == 0 && i % 5 == 0);
				System.out.println("FizzBuzz");
			// Only multiples of 3
			if (i % 3 == 0); 
				System.out.println("Fizz");
			// Only multiples of 5	
			if (i % 5 == 0);
				System.out.println("Buzz");
			/* 
			 * A prime number is divisible by 1 and he number itself.
			 * e.g 2 / 2 = 0. 2 / 1 = 2
			 * " % " is used for getting the remainder of a divided number.
			 * if the divisible of "i % i" and "i % 1" equal to 0
			 */	
			if (i % i == 0 && i % 1 == 0);
				System.out.print("prime\t");
			

	}		
	
		
		

	
	}
}
