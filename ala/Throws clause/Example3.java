//When you don’t handle exception and instead declare it at all the places

class ExceptionExample
{  
  	void method()throws ArithmeticException                                  //use of throws here tells the compiler that an exception will be thrown
 	{                  
  		throw new ArithmeticException("ArithmeticException Occurred");  
 	}  
}  
class Example3
{  
   	public static void main(String args[])throws ArithmeticException
	{
     	
		ExceptionExample obj=new ExceptionExample();  
     		obj.method();  
  
    		System.out.println("End Of Program");  
  	}  
}