import java.io.*;
//Example of IOException using throws method
class IOExceptionThrows
{
	public static void main(String args[]) throws IOException
        {
      		FileInputStream fis = null; //This constructor throws FileNotFoundException which is a checked exception
   	        fis = new FileInputStream("G:/myfile.txt"); //change location according to your file
     	        int k; 

   	         while(( k = fis.read() ) != -1) 
  	         { 
	                System.out.print((char)k); 
     	         } 
    		  fis.close(); 	
   	}
}