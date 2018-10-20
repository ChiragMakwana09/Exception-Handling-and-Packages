import java.io.File;

public class IllegalArgumentExceptionExample 
{
	
	public static String createRelativePath(String parent, String filename) 
	{
		if(parent == null)
			throw new IllegalArgumentException("The parent path cannot be null!");
		
		if(filename == null)
			throw new IllegalArgumentException("The filename cannot be null!");
		
		return parent + File.separator + filename;
	}
	
	public static void main(String[] args) 
	{
		// The following command will be successfully executed.
		System.out.println(IllegalArgumentExceptionExample.createRelativePath("dir1", "file1"));
		System.out.println();
		
		// The following command throws an IllegalArgumentException.
		System.out.println(IllegalArgumentExceptionExample.createRelativePath(null, "file1"));
	}
}