import java.io.*;
class CustomException extends Exception //A Class that represents custom expception 
{
	public CustomException()
	{
		super("Number is negative"); // Call constructor of parent Exception
	}
}




public class CustomExceptionExample // A Class that uses above MyException
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		try
		{
			if(n<0)
			{
				throw new CustomException();
			}
		}
		catch(CustomException ce)
		{
			System.out.println("Custom Exception Occurs");
		}
	}
}