package Main;

import StudentBAL.CourseBal;
import StudentBAL.StudentMangerBAL;
import StudentBean.CourseBean;
import StudentBean.StudentManagerBean;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentManager extends javax.swing.JFrame {

    String fileName = null;
    File f = null;
    StudentMangerBAL studentMangerBAL=new StudentMangerBAL();

    public StudentManager() {
        initComponents();
        btnGrp.add(rdBtnMale);
        btnGrp.add(rdBtnFemale);
        loadTable();
        loadCmbCourse();
    }

    private void loadTable() {

        StudentMangerBAL stdMngrBal = new StudentMangerBAL();
        ArrayList<StudentManagerBean> studentData = stdMngrBal.getStudentData();
        DefaultTableModel model = (DefaultTableModel) tblRecord.getModel();
        model.setRowCount(0);
        for (StudentManagerBean ob : studentData) {

            Vector v = new Vector();
            v.add(ob.getStudentId());
            v.add(ob.getFirstName());
            v.add(ob.getMiddleName());
            v.add(ob.getLastName());
            v.add(ob.getFathersName());
            v.add(ob.getSurname());
            v.add(ob.getDateOfBirth());
            v.add(ob.getGender());
            v.add(ob.getMail());
            v.add(ob.getContactNumber());
            v.add(ob.getAddress());
            v.add(ob.getCourseName());

            model.addRow(v);
        }

        tblRecord.setModel(model);

    }

    private void loadTable(String Name) {

        StudentMangerBAL stdMngrBal = new StudentMangerBAL();
        ArrayList<StudentManagerBean> studentData = stdMngrBal.searchStudentData(Name);
        DefaultTableModel model = (DefaultTableModel) tblRecord.getModel();
        model.setRowCount(0);
        for (StudentManagerBean ob : studentData) {

            Vector v = new Vector();
            v.add(ob.getStudentId());
            v.add(ob.getFirstName());
            v.add(ob.getMiddleName());
            v.add(ob.getLastName());
            v.add(ob.getFathersName());
            v.add(ob.getSurname());
            v.add(ob.getDateOfBirth());
            v.add(ob.getGender());
            v.add(ob.getMail());
            v.add(ob.getContactNumber());
            v.add(ob.getAddress());
            v.add(ob.getCourseName());
            model.addRow(v);
        }

        tblRecord.setModel(model);

    }

    private void loadCmbCourse() {
        cmbCourse.removeAllItems();
        CourseBal courseBal = new CourseBal();
        ArrayList<CourseBean> courses = courseBal.getCourses();
        for (CourseBean ob : courses) {

            cmbCourse.addItem(ob);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDataOfBirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSurName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rdBtnMale = new javax.swing.JRadioButton();
        rdBtnFemale = new javax.swing.JRadioButton();
        lblAttachPhoto = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbCourse = new javax.swing.JComboBox();
        btnupdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecord = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Student Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "S t u d e nt _ I n f o r m a t i o n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        jLabel2.setText("Student ID:");

        txtStudentId.setEditable(false);
        txtStudentId.setToolTipText("Student ID");

        jLabel3.setText("First Name:");

        jLabel4.setText("Date Of Birth:");

        jLabel5.setText("Surname:");

        jLabel6.setText("Address:");

        jLabel8.setText("Mail:");

        jLabel9.setText("Contact Number:");

        jLabel11.setText("Fathers Name:");

        jLabel12.setText("Last Name:");

        jLabel13.setText("Gender:");

        rdBtnMale.setText("Male");

        rdBtnFemale.setText("Female");

        lblAttachPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentImages/AddFriendPic.png"))); // NOI18N
        lblAttachPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAttachPhotoMouseClicked(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save-icon.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel10.setText("Middle Name:");

        jLabel14.setText("Course:");

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update icon.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/erase-128.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_16x16.gif"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastName)
                            .addComponent(txtFatherName)
                            .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDataOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSurName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMiddleName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rdBtnMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdBtnFemale)
                                    .addGap(15, 15, 15)))
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAttachPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnupdate)
                            .addComponent(btnDelete))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAttachPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnupdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(btnDelete)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSurName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDataOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdBtnFemale)
                            .addComponent(rdBtnMale)
                            .addComponent(jLabel13))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tblRecord.setAutoCreateRowSorter(true);
        tblRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student  ID", "First Name", "Middle Name", "Last Name", "Fathers Name", "SurName", "Date Of Birth", "Gender", "Mail", "Contact Number", "Address", "Course"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecord.setDoubleBuffered(true);
        tblRecord.setDragEnabled(true);
        tblRecord.setFillsViewportHeight(true);
        tblRecord.setFocusCycleRoot(true);
        tblRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecordMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecord);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new LogoutPanel().setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        StudentMangerBAL studentMangerBAL = new StudentMangerBAL();
        String rd = null;
        
        if (rdBtnFemale.isSelected()) {
        
            rd = rdBtnFemale.getText();
        
        } else if (rdBtnMale.isSelected()) {
        
            rd = rdBtnMale.getText();
        
        }
        
        CourseBean selectedItem = (CourseBean) cmbCourse.getSelectedItem();
        StudentManagerBean studentManagerBean = new StudentManagerBean(0, txtFirstName.getText(), txtMiddleName.getText(), txtLastName.getText(), txtFatherName.getText(), txtSurName.getText(), txtDataOfBirth.getText(), rd, txtMail.getText(), txtContactNumber.getText(), txtAddress.getText(), selectedItem.getCourseName(), selectedItem.getId());
        
        if (f != null) {
            
            studentMangerBAL.addRecord(studentManagerBean, f.getName());
            loadTable();
            f = null;
            clear();
            
        } else {
            
            JOptionPane.showMessageDialog(rootPane,"First Attach new picture");
        
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (tblRecord.getSelectedRow() > -1) {
            StudentMangerBAL studentMangerBAL = new StudentMangerBAL();
            String rd = null;
            if (rdBtnFemale.isSelected()) {
                rd = rdBtnFemale.getText();
            } else if (rdBtnMale.isSelected()) {
                rd = rdBtnMale.getText();
            }
            CourseBean selectedItem = (CourseBean) cmbCourse.getSelectedItem();
            StudentManagerBean studentManagerBean = new StudentManagerBean(Integer.parseInt(txtStudentId.getText()), txtFirstName.getText(), txtMiddleName.getText(), txtLastName.getText(), txtFatherName.getText(), txtSurName.getText(), txtDataOfBirth.getText(), rd, txtMail.getText(), txtContactNumber.getText(), txtAddress.getText(), selectedItem.getCourseName(), selectedItem.getId());
            
            if (f == null) {
                studentMangerBAL.updateRecord(studentManagerBean);

            } else {
                studentMangerBAL.updateRecord(studentManagerBean,f.getName());
                System.out.println(f.getName());
            }
            loadTable();
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Select Record From Table");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void clear() {
        txtStudentId.setText("");
        txtFirstName.setText("");
        txtMiddleName.setText("");
        txtLastName.setText("");
        txtFatherName.setText("");
        txtSurName.setText("");
        txtDataOfBirth.setText("");
        txtMail.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        cmbCourse.setSelectedIndex(-1);
        if (rdBtnFemale.isSelected()) {
            rdBtnFemale.setSelected(false);
        }
        if (rdBtnMale.isSelected()) {
            rdBtnMale.setSelected(false);
        }
        fileName="E:\\OneDrive - MUET\\Documents\\univesity form\\3rd semester\\java\\NetBeansProjects\\StudentInformation\\src\\StudentImages\\AddFriendPic.png";
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(lblAttachPhoto.getWidth(), lblAttachPhoto.getHeight(), Image.SCALE_DEFAULT));
            lblAttachPhoto.setIcon(imageIcon);
            try {

            File image = new File(fileName);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }

    private void tblRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecordMouseClicked

        int row = tblRecord.getSelectedRow();

        if (row > -1) {

            txtStudentId.setText(tblRecord.getValueAt(row, 0).toString());
            txtFirstName.setText(tblRecord.getValueAt(row, 1).toString());
            txtMiddleName.setText(tblRecord.getValueAt(row, 2).toString());
            txtLastName.setText(tblRecord.getValueAt(row, 3).toString());
            txtFatherName.setText(tblRecord.getValueAt(row, 4).toString());
            txtSurName.setText(tblRecord.getValueAt(row, 5).toString());
            txtDataOfBirth.setText(tblRecord.getValueAt(row, 6).toString());
            String maleOrFemale = tblRecord.getValueAt(row, 7).toString();
            if (maleOrFemale.equals(rdBtnFemale.getText())) {
                rdBtnFemale.setSelected(true);
            } else if (maleOrFemale.equals(rdBtnMale.getText())) {
                rdBtnMale.setSelected(true);
            }
            txtMail.setText(tblRecord.getValueAt(row, 8).toString());
            txtContactNumber.setText(tblRecord.getValueAt(row, 9).toString());
            txtAddress.setText(tblRecord.getValueAt(row, 10).toString());
            String Course = tblRecord.getValueAt(row, 11).toString();
            for (int i = 0; i < cmbCourse.getItemCount(); i++) {

                CourseBean courseBean = (CourseBean) cmbCourse.getItemAt(i);
                if (Course.equals(courseBean.getCourseName())) {

                    cmbCourse.setSelectedItem(courseBean);

                }

            }
            fileName=studentMangerBAL.getPhoto(Integer.parseInt(tblRecord.getValueAt(row, 0).toString()));
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(lblAttachPhoto.getWidth(), lblAttachPhoto.getHeight(), Image.SCALE_DEFAULT));
            lblAttachPhoto.setIcon(imageIcon);
            try {

            File image = new File(fileName);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }

        }


    }//GEN-LAST:event_tblRecordMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (tblRecord.getSelectedRow() > -1) {

            new StudentMangerBAL().deleteRecord(Integer.parseInt(tblRecord.getValueAt(tblRecord.getSelectedRow(), 0).toString()));
            loadTable();
            clear();

        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.getText().length() > 0) {

            try {
                loadTable(txtSearch.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Enter Name");
            }
        } else {
            loadTable();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void lblAttachPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAttachPhotoMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();

        fileName = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(lblAttachPhoto.getWidth(), lblAttachPhoto.getHeight(), Image.SCALE_DEFAULT));
        lblAttachPhoto.setIcon(imageIcon);
        File destinationFile = new File("E:\\OneDrive - MUET\\Documents\\univesity form\\3rd semester\\java\\NetBeansProjects\\StudentInformation\\src\\StudentImages\\" + f.getName());
        try {
            Files.copy(f.toPath(), destinationFile.toPath());
        }catch (FileAlreadyExistsException ex) {
            JOptionPane.showMessageDialog(null, "This file already exist");
        } catch (IOException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {

            File image = new File(fileName);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }

    }//GEN-LAST:event_lblAttachPhotoMouseClicked
    byte[] person_image = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAttachPhoto;
    private javax.swing.JRadioButton rdBtnFemale;
    private javax.swing.JRadioButton rdBtnMale;
    private javax.swing.JTable tblRecord;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtSurName;
    // End of variables declaration//GEN-END:variables
}
