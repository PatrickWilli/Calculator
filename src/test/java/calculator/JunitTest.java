package calculator;


import junit.framework.*;

public class JunitTest extends TestCase
{
	protected double n1,n2, expectedresult;
	protected void setUp()
	{
		n1 = 6.0;
		n2 = 2.0;
	}
	
	public void testAdd()
	{
		Add add = new Add(n1,n2);
		expectedresult = 8;
		assertEquals(expectedresult, add.calculate());
		
	}
	
	public void testSubstract()
	{
		Substract sub = new Substract(n1, n2);
		expectedresult = 4;
		assertEquals(expectedresult, sub.calculate());
	}
	
	public void testDivision()
	{
		Divide div = new Divide(n1, n2);
		expectedresult = 3;
		assertEquals(expectedresult, div.calculate());
	}
	
	public void testMultiply()
	{
		Multiply mul = new Multiply(n1, n2);
		expectedresult = 12;
		assertEquals(expectedresult, mul.calculate());
	}
	
	public void testParser()
	{
		assertEquals(4.0, Parser.toDouble("4"));
	}
	
}
