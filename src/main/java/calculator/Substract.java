package calculator;

public class Substract implements Operator
{
	private double n1, n2;
	public Substract(double number1, double number2)
	{
		this.n1 = number1;
		this.n2 = number2;
	}

	public double calculate()
	{
		return this.n1 - this.n2;
	}

}
