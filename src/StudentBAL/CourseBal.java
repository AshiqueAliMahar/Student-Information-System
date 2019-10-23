package StudentBAL;

import StudentBean.CourseBean;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CourseBal {

    DBConnection con = new DBConnection();
    CourseBean courseBean = null;
    Connection connect = con.getConnection();

    public ArrayList<CourseBean> getCourses() {

        ArrayList<CourseBean> arrLst = new ArrayList<CourseBean>();
        try {
            Statement stat = connect.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM courses");

            while (rs.next()) {

                courseBean = new CourseBean(rs.getInt(1), rs.getString(2));
                arrLst.add(courseBean);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return arrLst;
    }

    public void insertCourses(String course) {

        try {
            Statement createStatement = connect.createStatement();
            int check = createStatement.executeUpdate("INSERT INTO courses (`Course Name`) VALUES ('"+course+"');");
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Course Added Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "UnSuccessful");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void updateCourse(CourseBean courseBean) {

        try {
            Statement createStatement = connect.createStatement();
            int check = createStatement.executeUpdate("UPDATE courses SET `Course Name` = '"+courseBean.getCourseName()+"' WHERE `Course ID` = '"+courseBean.getId()+"';");
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Course Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "UnSuccessful");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    public void deleteCourse(int id){
        
        try {
            Statement createStatement = connect.createStatement();
            int check = createStatement.executeUpdate("DELETE FROM courses WHERE `Course ID` = '"+id+"';");
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Course Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "UnSuccessful");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
}
