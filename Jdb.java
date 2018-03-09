import java.sql.*;
class Jdb
{
  public static void main(String []args)
  {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "user", " ");
      Statement s=con.createStatement();

      ResultSet rs=s.executeQuery("select * from users");	

      while(rs.next()){
         System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }

      con.close();

    }
    catch(Exception e)
    {
       e.printStackTrace();
    }
  }
}