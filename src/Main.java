import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Main implements ActionListener{
        JLabel titleL,genreL,languageL,lengthL;
        JTextField titleF,genreF,languageF,lengthF;
        JButton okButton;
        public Main(){
          JFrame fr = new JFrame("lets see");
          fr.setLayout(new GridLayout(5,2,10,10));

          titleL = new JLabel("title");
          titleF = new JTextField(20);
          fr.add(titleL);
          fr.add(titleF);
          genreL = new JLabel("genre");
          genreF = new JTextField(20);
          fr.add(genreL);
          fr.add(genreF);
          languageL = new JLabel("language");
          languageF = new JTextField(20);
          fr.add(languageL);
          fr.add(languageF);
          lengthL = new JLabel("length");
          lengthF = new JTextField(20);
          fr.add(lengthL);
          fr.add(lengthF);

          okButton = new JButton("OK");
          okButton.addActionListener(this);
          fr.add(okButton);

          fr.setSize(500,500);
          fr.setVisible(true);
          fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() ==okButton)
        {
            try{
                //Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","");

                String query = "INSERT INTO movie VALUES(?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,1);
                ps.setString(2,titleF.getText());
                ps.setString(3,genreF.getText());
                ps.setString(4,languageF.getText());
                ps.setString(5,lengthF.getText());

                ps.executeUpdate();
                conn.close();



            }catch(SQLException ex)
            {
                System.out.print(ex.getMessage());
            }
        }
    }
    public static void main(String[] args){
            new Main();
    }
}