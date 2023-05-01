package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcDemo.model.Student;

public class MainProram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
            // loading of driver
			Class.forName("com.mysql.jdbc.Driver");
			// create connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            // create preparedStatement
            String sql = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(sql);
            // execute query
            ResultSet rs = ps.executeQuery();
            // retrieve
            while(rs.next()) {
            	Student student = new Student();
            	student.setId(rs.getInt("id"));
            	student.setName(rs.getString("name"));
            	student.setAge(rs.getInt("age"));
            	student.setRegd(rs.getString("regd"));
            	System.out.println(student);
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
        	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

}
