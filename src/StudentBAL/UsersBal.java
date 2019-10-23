package StudentBAL;

import StudentBean.UsersBean;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsersBal {

    DBConnection connect = new DBConnection();
    UsersBean userBean = null;
    Connection connection = connect.getConnection();

    public ArrayList<UsersBean> getUserData() {

        ArrayList<UsersBean> arrlst = new ArrayList<UsersBean>();

        try {
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM users");
            while (rs.next()) {

                userBean = new UsersBean(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4));
                arrlst.add(userBean);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " UserBal getUserData error");
        }

        return arrlst;
    }
    public void insertData(String division,String userName,String passWord ){
        
        try {
            Statement statement=connection.createStatement();
            int check=statement.executeUpdate("INSERT INTO users (Division,UserName,PASSWORD) VALUES ('"+division+"','"+userName+"','"+passWord+"');");
            if(check==1){
                JOptionPane.showMessageDialog(null,"User Added Successfully");
                
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"UserBal insertData error");
        }
        
    }
    public void deleteData(int id){
        
        try {
            Statement statement=connection.createStatement();
            int check=statement.executeUpdate("DELETE FROM users WHERE ID = '"+id+"';");
            if(check==1){
                JOptionPane.showMessageDialog(null,"User Deleted Successfully");
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"UserBal DeleteData error");
        }
        
        
    }
    public void updateData(int id,String division,String userName,String passWord){
        
        try {
            Statement statement=connection.createStatement();
            int check=statement.executeUpdate("UPDATE users SET Division= '"+division+"',UserName = '"+userName+"',PASSWORD = '"+passWord+"' WHERE ID = '"+id+"';");
            if(check==1){
                JOptionPane.showMessageDialog(null,"User data updated Successfully");
                
            }
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"UserBal updateData error");
        }
        
        
    }
}