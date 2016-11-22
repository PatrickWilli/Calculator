package calculator;

public class Parser
{
	  public static double toDouble(final String str) 
	  {
	      if (str == null) 
	      {
	          return 0.0;
	      }
	      try 
	      {
	          return Double.parseDouble(str);
	      } 
	      catch (final NumberFormatException nfe) 
	      {
	          return 0;
	      }
	}
}
