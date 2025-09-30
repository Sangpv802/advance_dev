package dao;
import db.DBConnection;
import model.Student;
import java.sql.*;
import java.util.*;

public class StudentDAO {
    public void insert(Student s) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO Student(studentID, studentName, gender) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getStudentID());
            ps.setString(2, s.getStudentName());
            ps.setString(3, s.getGender());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection()) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Student");
            while (rs.next()) {
                list.add(new Student(
                    rs.getInt("studentID"),
                    rs.getString("studentName"),
                    rs.getString("gender")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
