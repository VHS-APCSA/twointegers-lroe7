import java.util.Scanner;

public class TwoIntegers
{
	private int number1;
	private int number2;
	public TwoIntegers()
	{
		number1 = 1;
		number2 = 2;
	}
	public TwoIntegers(int number1, int number2)
	{
		this.number1 = number1;
		this.number2 = number2;
	}
	public int getNumber1()
	{
		return number1;
	}
	public int getNumber2()
	{
		return number2;
	}
	public void setNumber1(int number1)
	{
		this.number1 = number1;
	}
	public void setNumber2(int number2)
	{
		this.number2 = number2;
	}
	public String arithmetic()
	{
		String arithmetic = "";
		int sum = number1 + number2;
		int product = number1 * number2;
		int difference = number1 - number2;
		double quotient = number1 / number2;
		double decimal = 0.0;
		decimal = (double) number1 / number2;
		arithmetic = "The sum is " + sum;
		arithmetic = "The product is" + product;
		arithmetic = "The difference is" + difference;
		arithmetic = "The quotient is" + quotient;
		return arithmetic;
	}
}
