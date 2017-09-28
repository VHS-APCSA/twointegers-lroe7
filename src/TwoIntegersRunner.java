import java.util.Scanner;

public class TwoIntegersRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer.");
		int number1 = input.nextInt();
		System.out.println("Enter another integer.");
		int number2 = input.nextInt();
		System.out.println("You entered " + number1 + " and " + number2);
		TwoIntegers integer = new TwoIntegers(number1, number2);
		int compare = integer.comparingIntegers();
		if(compare == 0)
		{
			System.out.println("The numbers are equal");
		}
		else
		{
			System.out.println(compare + " is larger");
		}
		String oddEven = integer.oddEven();
		System.out.println(oddEven);
	}
}