import java.io.*;
//Example of IOException using try-catch
class IOExceptionTryCatch
{  
	public static void main(String args[])
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("G:/myfile.txt"); //change location according to your file
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file is not " + "present at the given path");
		}

		int k; 

		try
		{
			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			} 
			fis.close(); 
		}
		catch(IOException ioe)
		{
			System.out.println("I/O error occurred: "+ioe);
		}
	}
}