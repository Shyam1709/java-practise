import java.sql.*;

public class delete 
{
public static void main(String args[])
{
		String id = "id2";
		String pwd = "pwd2";
		try
		{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "login1", "pwd1");
				Statement stmt = con.createStatement();
							
				// Deleting from database
				String q1 = "DELETE from userid WHERE id = '" + id + 
								"' AND pwd = '" + pwd + "'";
								 
				int x = stmt.executeUpdate(q1);
				 
				if (x > 0)            
						System.out.println("One User Successfully Deleted");            
				else
						System.out.println("ERROR OCCURED :(");  
			 
				con.close();
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
}
}