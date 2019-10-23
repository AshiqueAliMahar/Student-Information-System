package Main;
//6:25 10%

import StudentBean.UsersBean;


public class StudentInformation {
    
    static UsersBean usersBean=null;
    public static void main(String[] args) {
        
        
        lookAndFeel();
        
        LoginPanel loginPanel = new LoginPanel();
        loginPanel.setVisible(true);
    }

    private static void lookAndFeel() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
}
