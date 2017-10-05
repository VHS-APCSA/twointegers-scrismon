
public class TwoIntegers 
{
	private int integer1;
	private int integer2;

	public TwoIntegers()
	{
		this.integer1 = 0;
		this.integer2 = 0;
	}
	public TwoIntegers(int integer1, int integer2)
	{
		this.integer1 = integer1;
		this.integer2 = integer2;
	}
	public void setInteger1(int integer1)
	{
		this.integer1 = integer1;
	}
	public int getInteger1()
	{
		return integer1;
	}
	public void setInteger2(int integer2)
	{
		this.integer2 = integer2;
	}
	public int getInteger2()
	{
		return integer2;
	}
	public String arithmetic()
	{
		String arithmetic = "";
		int sum = integer1 + integer2;
		int difference = integer1 - integer2;
		int product = integer1 * integer2;
		int quotient = integer1 / integer2;
		arithmetic = "The sum of integer1 and integer2 is" + " " + sum + "\n";
		arithmetic += "The difference of integer1 and integer2 is" + " " + difference + "\n";
		arithmetic += "The product of integer1 and integer2 is" + " " + product + "\n";
		arithmetic += "The quotient of integer1 and integer2 is" + " " + quotient + "\n";
		return arithmetic;
	}
	//end of 2.15
	public String comparison()
	{
		String str = "";
		if(integer1 < integer2)
		{
			str = integer2 + " is larger";
		}
		else if(integer1 == integer2)
		{
			str = "These numbers are equal";
		}
		else 
		{
			str = integer1 + " is larger";
		}
		return str;
	}
	//end of 2.16
	public boolean isOddOrEven()
	{
		boolean isOddOrEven = true;
		if(integer1%2 == 0)
		{
			isOddOrEven = true;
		}
		else
		{
			isOddOrEven = false;
		}
		return isOddOrEven;
	}
	//end of 2.25
	public boolean isMultiple()
	{
		boolean isMultiple = true;
		if(integer1/2 == 0)
		{
			isMultiple = true;
		}
		else
		{
			isMultiple = false;
		}
		return isMultiple;
	}
	//end of 2.26
}
