import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       try{
           // load the driver
           // Class.forName(com.mysql.jdbc.Driver);

           //set up the connection
           String url = "jdbc:mysql://localhost:3307/test";
           Connection conn = DriverManager.getConnection(url,"root","");



           //create a statement
           String query = "INSERT INTO STUDENT(id,name,district,age) VALUES(?,?,?,?)";
           PreparedStatement ps = conn.prepareStatement(query);

           ps.setInt(1,7);
           ps.setString(2,"Sumiran");
           ps.setString(3,"Jhapa");
           ps.setInt(4,24);

           int affectedRows = ps.executeUpdate();
           System.out.println(affectedRows + "rows affected");
           ps.close();
           conn.close();




           //execute a statement

       }catch(SQLException except){
           System.out.println(except.getMessage());

       }



    }



    }
