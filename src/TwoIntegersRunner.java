import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Type in two integers");
		int integer1 = input.nextInt();
		int integer2 = input.nextInt();
		
		TwoIntegers twoIntegers = new TwoIntegers(integer1, integer2);
		String answer = twoIntegers.arithmetic();
		System.out.println(answer);
		
		String comparison = twoIntegers.comparison();
		System.out.println(comparison);
		
		boolean oddOrEven = twoIntegers.isOddOrEven();
		System.out.println("integer1 is even = " + oddOrEven);
		
		boolean multiple = twoIntegers.isMultiple();
		System.out.println("integer1 is a " + multiple + " multiple of 2");
	}
}
