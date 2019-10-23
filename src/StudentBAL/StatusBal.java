package StudentBAL;

import StudentBean.StatusBean;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StatusBal {
    DBConnection dBConnection=new DBConnection();
        Connection connection = dBConnection.getConnection();
        
    public void updateStatus(StatusBean statusBean){
        
        try {
            Statement createStatement = connection.createStatement();
            createStatement.executeUpdate("UPDATE STATUS SET `Status` = '"+statusBean.getStatus()+"',`loginId` = '"+statusBean.getLoginId()+" WHERE `id` = '"+1+"';");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }
    public void getStatus(){
        
        //SELECT * FROM STATUS;
        //connection.cre
        
    }
    
}
