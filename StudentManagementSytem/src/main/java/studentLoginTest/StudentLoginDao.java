package studentLoginTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.DBConnection;
import test.StudentBean;

public class StudentLoginDao {
    public StudentBean login(String rollNo) {
        StudentBean ab = null;

        try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student71 WHERE rollno = ?");
            ps.setString(1, rollNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ab = new StudentBean();
                ab.setRollNo(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ab;
    }
}
