package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author Don't Waste Time
 */
public class LogoutPanel extends javax.swing.JFrame {

     LoginPanel loginPanel=new LoginPanel();
    public LogoutPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnStudentManager = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        users = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudentManager.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        btnStudentManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StudentManager.png"))); // NOI18N
        btnStudentManager.setText("Student Manager");
        btnStudentManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudentManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 424, -1, 97));

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogOutL.png"))); // NOI18N
        btnLogOut.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 11, 49, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bk3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jMenu1.setText("File");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Courses Manipulation");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        users.setText("Users");
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        jMenu1.add(users);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
          
       
        loginPanel.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnStudentManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentManagerActionPerformed
        
        StudentManager stdManager=new StudentManager();
        stdManager.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnStudentManagerActionPerformed

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        
        if(StudentInformation.usersBean.getDivision().equalsIgnoreCase("admin")){
            
            new UsersPanel().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Only Admin Can Access");
        }
        
    }//GEN-LAST:event_usersActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
       
        
        new CoursesPanel().setVisible(true);
        
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnStudentManager;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem users;
    // End of variables declaration//GEN-END:variables
}