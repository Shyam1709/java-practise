
import java.sql.*;
public class Insert_DB
{
    public static void main(String args[])
    {
        String id = "id1";
        String pwd = "pwd1";
        String fullname = "shyam";
        String email = "shyam@123.gmail.com";
         
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "login1", "pwd1");
            Statement stmt = con.createStatement();
             
            String q1 = "insert into userid values('" +id+ "', '" +pwd+  "', '" +fullname+ "', '" +email+ "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0)            
                System.out.println("Successfully Inserted");            
            else           
                System.out.println("Insert Failed");
             
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}