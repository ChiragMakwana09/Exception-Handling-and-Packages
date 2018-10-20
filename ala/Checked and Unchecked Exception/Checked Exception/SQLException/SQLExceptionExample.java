import java.sql.*;

public class SQLExceptionExample  // JDBC driver name and database URL
{
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/EMP";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public static void main(String[] args) {
   Connection conn = null;
   try{
      
      Class.forName("com.mysql.jdbc.Driver"); //Register JDBC driver

      
      System.out.println("Connecting to database...");  //Open a connection
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      
      System.out.println("Creating statement...");     //Execute a query
      Statement stmt = conn.createStatement();
      String sql;
      sql = "SELECT id, first, last, age FROM Employees";
      ResultSet rs = stmt.executeQuery(sql);

      
      while(rs.next())           //Extract data from result set
         {
         int id  = rs.getInt("id");     //Retrieve by column name
         int age = rs.getInt("age");
         String first = rs.getString("first");
         String last = rs.getString("last");

         System.out.print("ID: " + id);      //Display values
         System.out.print(", Age: " + age);
         System.out.print(", First: " + first);
         System.out.println(", Last: " + last);
         }
      
      rs.close();    //Clean-up environment
      stmt.close();
      conn.close();
   }
	catch(SQLException se)
       {
              se.printStackTrace();     //Handle errors for JDBC
       }
	catch(Exception e)
	{
      	      e.printStackTrace();      //Handle errors for Class.forName
  	}
	finally      //finally block used to close resources
        {
      		try
		{     
        		 if(conn!=null)
          		  conn.close();
      		}
		catch(SQLException se)
		{
     		    se.printStackTrace();
   		}//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample