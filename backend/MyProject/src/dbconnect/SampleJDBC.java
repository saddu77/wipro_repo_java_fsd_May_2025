package dbconnect;

import java.sql.*;

public class SampleJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db","root","admin");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            
            while (rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();	
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
