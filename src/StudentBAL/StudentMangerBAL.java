package StudentBAL;

import StudentBean.StudentManagerBean;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StudentMangerBAL {

    DBConnection con = new DBConnection();
    StudentManagerBean studentManagerBean = null;
    Connection connect = con.getConnection();

    public ArrayList<StudentManagerBean> getStudentData() {

        ArrayList<StudentManagerBean> arrlst = new ArrayList<StudentManagerBean>();

        try {
            Statement stat = connect.createStatement();
            ResultSet rs = stat.executeQuery("SELECT `Student ID`,`First Name`,`Middle Name`,`Last Name`,`Father's Name`,`Surname`,`Date Of Birth`,`Gender`,`Mail`,`ContactNumber`,`Address`,crs.`Course Name`,`Cousrse ID` FROM studentinformation INNER JOIN courses crs ON (`Cousrse ID`=crs.`Course ID`);");
            while (rs.next()) {

                studentManagerBean = new StudentManagerBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getInt(13));
                arrlst.add(studentManagerBean);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Stdmnger get StudentData error");
        }

        return arrlst;
    }

    public void addRecord(StudentManagerBean studentManagerBean,String photoName) {

        String query = "INSERT INTO studentinformation(`First Name`,`Middle Name`,`Last Name`,`Father's Name`,`Surname`,`Date Of Birth`,`Gender`,`Mail`,`ContactNumber`,`Address`,`Cousrse ID`,`photo_Name`) VALUES('" + studentManagerBean.getFirstName() + "','" + studentManagerBean.getMiddleName() + "','" + studentManagerBean.getLastName() + "','" + studentManagerBean.getFathersName() + "','" + studentManagerBean.getSurname() + "','" + studentManagerBean.getDateOfBirth() + "','" + studentManagerBean.getGender() + "','" + studentManagerBean.getMail() + "','" + studentManagerBean.getContactNumber() + "','" + studentManagerBean.getAddress() + "','" + studentManagerBean.getId() + "','"+photoName+"');";
        try {
            Statement stat = connect.createStatement();
            int check = stat.executeUpdate(query);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Record Added Successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "StudentManger addRecord error" + ex.getMessage());
        }
        

    }

    public void deleteRecord(int id) {

        try {
            String query = "DELETE FROM studentinformation WHERE `Student ID` = " + id + "";
            Statement stat = connect.createStatement();
            int check = stat.executeUpdate(query);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Record Deleted");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void updateRecord(StudentManagerBean studentManagerBean) {

        String query = "UPDATE studentinformation SET `First Name` = '" + studentManagerBean.getFirstName() + "',`Middle Name` = '" + studentManagerBean.getMiddleName() + "',`Last Name` = '" + studentManagerBean.getLastName() + "',`Father's Name` = '" + studentManagerBean.getFathersName() + "', `Surname` = '" + studentManagerBean.getSurname() + "', `Date Of Birth` = '" + studentManagerBean.getDateOfBirth() + "', `Gender` = '" + studentManagerBean.getGender() + "', `Mail` = '" + studentManagerBean.getMail() + "', `ContactNumber` = '" + studentManagerBean.getContactNumber() + "', `Address` = '" + studentManagerBean.getAddress() + "', `Cousrse ID` =" + studentManagerBean.getId() + " WHERE `Student ID` = " + studentManagerBean.getStudentId() + "";
        try {
            Statement stat = connect.createStatement();
            int check = stat.executeUpdate(query);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Record Updated Successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "StudentManger UpdateRecord error");
        }

    }
    public void updateRecord(StudentManagerBean studentManagerBean,String photoPath) {

        String query = "UPDATE studentinformation SET `First Name` = '" + studentManagerBean.getFirstName() + "',`Middle Name` = '" + studentManagerBean.getMiddleName() + "',`Last Name` = '" + studentManagerBean.getLastName() + "',`Father's Name` = '" + studentManagerBean.getFathersName() + "', `Surname` = '" + studentManagerBean.getSurname() + "', `Date Of Birth` = '" + studentManagerBean.getDateOfBirth() + "', `Gender` = '" + studentManagerBean.getGender() + "', `Mail` = '" + studentManagerBean.getMail() + "', `ContactNumber` = '" + studentManagerBean.getContactNumber() + "', `Address` = '" + studentManagerBean.getAddress() + "', `Cousrse ID` =" + studentManagerBean.getId()+ ", `photo_Name` = '" +photoPath+"' WHERE `Student ID` = " + studentManagerBean.getStudentId() + "";
        JOptionPane.showMessageDialog(null,photoPath);
        try {
            Statement stat = connect.createStatement();
            int check = stat.executeUpdate(query);
            if (check == 1) {
                JOptionPane.showMessageDialog(null, "Record Updated Successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "StudentManger UpdateRecord error"+ex.getMessage());
        }

    }
    

    public ArrayList<StudentManagerBean> searchStudentData(String Name) {

        ArrayList<StudentManagerBean> arrlst = new ArrayList<>();

        try {
            Statement stat = connect.createStatement();
            ResultSet rs = stat.executeQuery("SELECT `Student ID`,`First Name`,`Middle Name`,`Last Name`,`Father's Name`,`Surname`,`Date Of Birth`,`Gender`,`Mail`,`ContactNumber`,`Address`,c.`Course Name`,`cousrse ID` FROM studentinformation INNER JOIN  courses c ON(`cousrse ID`=c.`Course ID`) WHERE CONCAT( `First Name`,' ',`Middle Name`,' ',`Last Name`) LIKE '%"+Name+"%';");
            while (rs.next()){

                studentManagerBean = new StudentManagerBean(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),rs.getInt(13));
                arrlst.add(studentManagerBean);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Stdmnger Search StudentData error"+ex.getMessage());
        }

        return arrlst;
    }
    public String getPhoto(int id){
        
        String photoPath="E:\\OneDrive - MUET\\Documents\\univesity form\\3rd semester\\java\\NetBeansProjects\\StudentInformation\\src\\StudentImages\\";
        try {
            Statement stat = connect.createStatement();
            ResultSet rs=stat.executeQuery("SELECT `photo_Name` FROM studentinformation WHERE `Student ID` = '"+id+"';");
            rs.next();
            photoPath+=rs.getString(1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()+"StudentMangerBal getPhoto error");
        }
        return photoPath;
    }

}
