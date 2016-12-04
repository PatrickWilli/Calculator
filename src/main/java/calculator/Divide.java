package calculator;

public class Divide implements Operator
{
	private double n1, n2;
	
	public Divide(double number1, double number2)
	{
		try
		{
			if(number2 == 0)
			{
				throw new Exception();
			}
			this.n1 = number1;
			this.n2 = number2;
		}
		catch(Exception e)
		{
			System.err.println("Divisor can't be zero!");
			this.n1 = number1;
			this.n2 = 1;
		}
	
	}


	public double calculate() 
	{
		return n1 / n2;
	}

	public String getcalculation()
	{
		return getfirstnumber() + " / " + getsecondnumber() + " = " + calculate();
	}

	public double getfirstnumber()
	{
		return n1;
	}

	public double getsecondnumber()
	{
		return n2;
	}
}
