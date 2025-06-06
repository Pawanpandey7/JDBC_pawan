import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            //establish a connection
            String url = "jdbc:mysql://localhost:3307/test";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url,username,password);

            //create a statement
            Statement st = conn.createStatement();

            String delt = "DROP TABLE student2";
            st.executeUpdate((delt));

        }catch(SQLException sqlExcept){
            System.out.println("Error:"+sqlExcept.getMessage());
        }
    }



    }
