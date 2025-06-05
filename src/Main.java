import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
          String sql = "select username from users where email = 'olicodes12@gmail.com'";
          String url = "jdbc:mysql://localhost:3307/pawan_fashion_store";
          String username="root";
          String password= "";

          Connection con = DriverManager.getConnection(url, username, password);

          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          rs.next();
          String name = rs.getString(1);
          System.out.println(name);
          con.close();
        }
    }
