package calculator;

public enum Operators
{
	ADD("+"),
	SUBSTRACT("-");
	
	private String operator;
	Operators(String operator)
	{
		this.operator = operator;
	}
	public String toString()
	{
		return this.operator;
	}
	
}
