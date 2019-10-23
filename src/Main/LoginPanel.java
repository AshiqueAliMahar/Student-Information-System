package Main;

import StudentBAL.UsersBal;
import StudentBean.UsersBean;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class LoginPanel extends javax.swing.JFrame {

    public LoginPanel() {
        initComponents();
        loadCmbDivision();
    }

    private void loadCmbDivision() {

        UsersBal userBal = new UsersBal();
        ArrayList<UsersBean> userData = userBal.getUserData();
        userData.stream().forEach((ob) -> {
            cmbDivision.addItem(ob);
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbDivision = new javax.swing.JComboBox();
        pfPassword = new javax.swing.JPasswordField();
        lblCheckPassword = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 17));
        getContentPane().add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 185, 30));

        jLabel3.setText("User Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 17));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, 26));

        jLabel1.setText("Division:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 20));

        cmbDivision.setBackground(new java.awt.Color(51, 255, 51));
        cmbDivision.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbDivision.setForeground(new java.awt.Color(251, 8, 8));
        cmbDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 185, 26));

        pfPassword.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 185, 30));
        getContentPane().add(lblCheckPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 210, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bk4.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        getSignIn();

    }//GEN-LAST:event_btnLoginActionPerformed

    private void cmbDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDivisionActionPerformed
        if (cmbDivision.getSelectedIndex() > -1) {
            UsersBean userBean = (UsersBean) cmbDivision.getSelectedItem();
            txtUserName.setText(userBean.getUserName());
        }
    }//GEN-LAST:event_cmbDivisionActionPerformed

    private void pfPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyTyped
        lblCheckPassword.setText("");
    }//GEN-LAST:event_pfPasswordKeyTyped

    public void getSignIn() {

        boolean check = true;

        for (int i = 0; i < cmbDivision.getItemCount(); i++) {

            UsersBean userBean = (UsersBean) cmbDivision.getItemAt(i);

            if (userBean.getUserName().trim().equals(txtUserName.getText().trim()) && Arrays.equals(userBean.getPassword().trim().toCharArray(), pfPassword.getPassword())) {

                JOptionPane.showMessageDialog(null, "Success");
                LogoutPanel logOutPanel = new LogoutPanel();
                StudentInformation.usersBean = userBean;
                check = false;
                logOutPanel.setVisible(true);
                this.dispose();

            }
        }
        if (check) {

            lblCheckPassword.setText("Incorrect UserName or Password");

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox cmbDivision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCheckPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
