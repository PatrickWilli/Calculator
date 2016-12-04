package calculator;

import java.util.Scanner;

public class Userinput
{
	private static Scanner scan = new Scanner(System.in);
	public void start()
	{
		getinput();
	}
	
	public void getinput()
	{
		while(true)
		{
			System.out.println("Please enter the first number:");
			double n1 = Parser.toDouble(scan.next());
			System.out.println("Please enter the second number:");
			double n2 = Parser.toDouble(scan.next());
			System.out.println("Please enter an Operator:");
			for(Operators operator : Operators.values())
			{
				System.out.println(operator.toString());
			}
			String operator = scan.next();
			switch(operator)
			{
				case "+":
					Add add = new Add(n1, n2);
					System.out.println("\n" + add.getcalculation());
					printsomelines();
					break;
				
				case "-": 
					Substract sub = new Substract(n1, n2);
					System.out.println("\n" + sub.getcalculation());
					printsomelines();
					break;
				
				case "/":
					Divide div = new Divide(n1, n2);
					System.out.println("\n" + div.getcalculation());
					printsomelines();
					break;
					
				case "*":
					Multiply mul = new Multiply(n1, n2);
					System.out.println("\n" + mul.getcalculation());
					printsomelines();
					break;
				
				default:
					System.out.println(operator + " is not supportet");
					break;
				
			}
			
		}
	}
	
	public void printsomelines()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
