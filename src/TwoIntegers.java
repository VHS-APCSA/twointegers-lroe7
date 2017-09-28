
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
		arithmetic = "The sum is " + sum + "\n";
		arithmetic += "The product is" + product + "\n";
		arithmetic += "The difference is" + difference + "\n";
		arithmetic += "The quotient is" + quotient;
		return arithmetic;
	}
	public int comparingIntegers()
	{
		int comparingIntegers = 0;
		if(number1>number2)
		{
			comparingIntegers = number1;
		}
		else if(number1 == number2)
		{
			comparingIntegers = 0;
		}
		else
		{
			comparingIntegers = number2;
		}
		return comparingIntegers;
	}
	public String oddEven()
	{
		String oddEven = "";
		if(number1%2 == 0)
		{
			oddEven = number1 + " is even";
		}
		else
		{
			oddEven = number1 + " is odd";
		}
		if(number2%2 == 0)
		{
			oddEven = number2 + " is even";
		}
		else
		{
			oddEven = number2 + " is odd";
		}
		return oddEven;
	}
	
}
