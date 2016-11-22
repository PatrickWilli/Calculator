package calculator;

public class Add implements Operator
{
	private double n1, n2;
	public Add(double number1, double number2)
	{
		this.n1 = number1;
		this.n2 = number2;
	}

	public double calculate()
	{
		return this.n1 + this.n2;
	}
	
	public double getfirstnumber()
	{
		return this.n1;
	}
	public double getsecondnumber()
	{
		return this.n2;
	}
	
}
