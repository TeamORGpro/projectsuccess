/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author pc
 */
public class StdRegForm extends javax.swing.JFrame {

    /**
     * Creates new form regForm
     */
     ArrayList name= new ArrayList();
    
    
    
    public StdRegForm() {
        initComponents();
        closeconfirm();
        nextid();
        ImageIcon myImage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/regicon.png")));
        
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(registerIcn1.getWidth(), registerIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        
        registerIcn1.setIcon(i);
        
        txtStdID.setEnabled(false);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void closeconfirm(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            }
            else{
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
            }
                
        }
    });
    }
    
    @SuppressWarnings("unchecked")
    
    public void nextid(){
        Connection con;
        con = DBConnect.connect();
        Statement s;
         try {
             s = con.createStatement();
         
         
        try (ResultSet rs =s.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'successdb' AND TABLE_NAME= 'std_info_table';")){
            
            rs.next();
            txtStdID.setText(rs.getString("AUTO_INCREMENT"));
            
            
        }    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void reset(){
        nextid();
        txtstdName.setText("");
        txtstdNameShort.setText("");
//        txtStdID.setText("");
        txtAddress.setText("");
        txtDob.setText("yyyy-mm-dd");
        txtDob.setForeground(new Color(153, 153, 153));
        txtSubject.setText("");
        gradeCB.setSelectedItem("Grade 6");
        txtPhoneNo.setText("");
        cboxSex.setSelectedItem("Male");
        txtguardiansName.setText("");
        txtgphoneNo.setText("");
        txtStdID.setEnabled(false);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        stdName = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        phoneNo = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        guardiansName = new javax.swing.JLabel();
        gPhoneNo = new javax.swing.JLabel();
        txtstdName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtguardiansName = new javax.swing.JTextField();
        txtgphoneNo = new javax.swing.JTextField();
        cboxSex = new javax.swing.JComboBox<>();
        createBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        registerTitle = new javax.swing.JLabel();
        registerIcn1 = new javax.swing.JLabel();
        stdNameShort = new javax.swing.JLabel();
        txtstdNameShort = new javax.swing.JTextField();
        newBtn = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        stdID = new javax.swing.JLabel();
        txtStdID = new javax.swing.JTextField();
        gradeCB = new javax.swing.JComboBox<>();
        subjectLbl = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();

        jDialog1.setTitle("Massage");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Register");
        setBounds(new java.awt.Rectangle(0, 0, 606, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(606, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(606, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stdName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdName.setText("Full Name :");
        stdName.setMaximumSize(new java.awt.Dimension(53, 14));
        stdName.setMinimumSize(new java.awt.Dimension(53, 14));
        jPanel1.add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setText("Postal Address :");
        address.setMaximumSize(new java.awt.Dimension(78, 14));
        address.setMinimumSize(new java.awt.Dimension(78, 14));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dob.setText("Date Of Birth :");
        dob.setMaximumSize(new java.awt.Dimension(70, 14));
        dob.setMinimumSize(new java.awt.Dimension(70, 14));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        grade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        grade.setText("Grade In School :");
        grade.setMaximumSize(new java.awt.Dimension(83, 14));
        grade.setMinimumSize(new java.awt.Dimension(83, 14));
        jPanel1.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        phoneNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        phoneNo.setText("Phone No. :");
        phoneNo.setMaximumSize(new java.awt.Dimension(57, 14));
        phoneNo.setMinimumSize(new java.awt.Dimension(57, 14));
        jPanel1.add(phoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        sex.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sex.setText("Sex :");
        sex.setMaximumSize(new java.awt.Dimension(25, 14));
        sex.setMinimumSize(new java.awt.Dimension(25, 14));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        guardiansName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        guardiansName.setText("Guardian's Name :");
        guardiansName.setMaximumSize(new java.awt.Dimension(87, 14));
        guardiansName.setMinimumSize(new java.awt.Dimension(87, 14));
        jPanel1.add(guardiansName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        gPhoneNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gPhoneNo.setText("His Or Her Phone  No. :");
        gPhoneNo.setMaximumSize(new java.awt.Dimension(108, 14));
        gPhoneNo.setMinimumSize(new java.awt.Dimension(108, 14));
        jPanel1.add(gPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        txtstdName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtstdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 57, 388, -1));

        txtDob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDob.setForeground(new java.awt.Color(153, 153, 153));
        txtDob.setText("yyyy-mm-dd");
        txtDob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDobFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDobFocusLost(evt);
            }
        });
        txtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDobKeyTyped(evt);
            }
        });
        jPanel1.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 217, 388, -1));

        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 337, 388, -1));

        txtguardiansName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtguardiansName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 417, 388, -1));

        txtgphoneNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtgphoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtgphoneNoKeyTyped(evt);
            }
        });
        jPanel1.add(txtgphoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 457, 388, -1));

        cboxSex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(cboxSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 377, 88, -1));

        createBtn.setBackground(new java.awt.Color(102, 255, 102));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-user.png"))); // NOI18N
        createBtn.setText("Save");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.setIconTextGap(5);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        jPanel1.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 520, 100, 36));

        cnslBtn.setBackground(new java.awt.Color(255, 102, 102));
        cnslBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cnslBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x.png"))); // NOI18N
        cnslBtn.setText("Cancel");
        cnslBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnslBtn.setIconTextGap(7);
        cnslBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnslBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cnslBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 100, 36));

        registerTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        registerTitle.setText("Student Register Form");
        jPanel1.add(registerTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 11, -1, 35));
        jPanel1.add(registerIcn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, 40, 35));

        stdNameShort.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdNameShort.setText("Name With Initials :");
        stdNameShort.setMaximumSize(new java.awt.Dimension(53, 14));
        stdNameShort.setMinimumSize(new java.awt.Dimension(53, 14));
        jPanel1.add(stdNameShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtstdNameShort.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtstdNameShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 97, 388, -1));

        newBtn.setBackground(new java.awt.Color(255, 255, 153));
        newBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new.png"))); // NOI18N
        newBtn.setText("New");
        newBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newBtn.setIconTextGap(6);
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });
        jPanel1.add(newBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 100, 36));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 177, 388, -1));

        stdID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdID.setText("Student ID :");
        stdID.setMaximumSize(new java.awt.Dimension(53, 14));
        stdID.setMinimumSize(new java.awt.Dimension(53, 14));
        jPanel1.add(stdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtStdID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtStdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 137, 388, -1));

        gradeCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        jPanel1.add(gradeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 297, 128, 25));

        subjectLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        subjectLbl.setText("Subjects :");
        subjectLbl.setMaximumSize(new java.awt.Dimension(57, 14));
        subjectLbl.setMinimumSize(new java.awt.Dimension(57, 14));
        jPanel1.add(subjectLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 90, -1));

        txtSubject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSubject.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSubjectFocusGained(evt);
            }
        });
        txtSubject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSubjectKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSubjectKeyTyped(evt);
            }
        });
        jPanel1.add(txtSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 257, 388, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:

        reset();    
    }//GEN-LAST:event_newBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        //uppercase each word 

String word = txtSubject.getText().toLowerCase();

    // stores each characters to a char array
    char[] charArray = word.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) {

      // if the array element is a letter
      if(Character.isLetter(charArray[i])) {

        // check space is present before the letter
        if(foundSpace) {

          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }

      else {
        // if the new character is not character
        foundSpace = true;
      }
    }

    // convert the char array to the string
    word = String.valueOf(charArray);
    txtSubject.setText(word);
        
        
        
            String Std_Name=txtstdName.getText();
            String Name_with_Initials=txtstdNameShort.getText();
            String Address=txtAddress.getText();
            String DOB=txtDob.getText();
            String subject=txtSubject.getText();
            String Grade=(String) gradeCB.getSelectedItem();
            String Phone_no=txtPhoneNo.getText();
            String sex=(String) cboxSex.getSelectedItem();
            String Grd_name=txtguardiansName.getText();
            String Grd_Phone_no = txtgphoneNo.getText();
            
            

        
            

                      
            // need validation part here
            Connection con;
            PreparedStatement pstmt;
            con = DBConnect.connect();
            if(!Std_Name.isEmpty() && !Name_with_Initials.isEmpty() && !Address.isEmpty() && !("yyyy-mm-dd".equals(DOB)) && !subject.isEmpty() && !Grade.isEmpty() && !sex.isEmpty() && !Grd_name.isEmpty() && !Grd_Phone_no.isEmpty()){
            
                                            
                                            try {
                                                
                                                String query ="insert into std_info_table(Std_Name,Name_with_Initials,Address,DOB,Subjects,Grade,Phone_no,sex,Grd_name,Grd_Phone_no)values(?,?,?,?,?,?,?,?,?,?)";

                                                pstmt = con.prepareStatement(query);


                                                pstmt.setString(1, Std_Name);
                                                pstmt.setString(2, Name_with_Initials);
                                                pstmt.setString(3, Address);
                                                pstmt.setString(4, DOB);
                                                pstmt.setString(5, subject);
                                                pstmt.setString(6, Grade);
                                                pstmt.setString(7, Phone_no);
                                                pstmt.setString(8, sex);
                                                pstmt.setString(9, Grd_name);
                                                pstmt.setString(10, Grd_Phone_no);


                                                pstmt.execute();
                                                System.out.println("query successfully executed");
                                                JOptionPane.showMessageDialog(null, "query successfully executed");

                                                pstmt.close();
                                                con.close();
                                            } catch (SQLException e) {
                                                
                                                
                                                if (e.getLocalizedMessage() == null ? "Data truncation: Incorrect date value: '"+DOB+"' for column `successdb`.`std_info_table`.`DOB` at row 1" == null : e.getLocalizedMessage().equals("Data truncation: Incorrect date value: '"+DOB+"' for column `successdb`.`std_info_table`.`DOB` at row 1")) {
                                                    JOptionPane.showMessageDialog(null, "Please enter right date format","Error Occurred!",JOptionPane.ERROR_MESSAGE);
                                                } else{
                                                    JOptionPane.showMessageDialog(null, "Error :"+e.getMessage(),"Error Occurred!",JOptionPane.ERROR_MESSAGE);
                                                }
                                                
                                            }
                                            
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Fill the Required Fields","Error Occurred!",JOptionPane.ERROR_MESSAGE);
            }
    
            
    }//GEN-LAST:event_createBtnActionPerformed

    
    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
            
        int reply = JOptionPane.showConfirmDialog(null,"Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                this.dispose();
            }
        

    }//GEN-LAST:event_cnslBtnActionPerformed

    private void txtPhoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyTyped
        // Type only numbers
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneNoKeyTyped

    private void txtgphoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgphoneNoKeyTyped
        // Type only numbers
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtgphoneNoKeyTyped

    private void txtDobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDobKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobKeyTyped

    private void txtSubjectKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubjectKeyTyped
        // TODO add your handling code here:
        databaseName();
    }//GEN-LAST:event_txtSubjectKeyTyped

    private void txtSubjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubjectKeyPressed
        // TODO add your handling code here:
        
        switch(evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                txtSubject.setText(txtSubject.getText());
                break;
            default:
                EventQueue.invokeLater(new Runnable(){
                    @Override


            public void run() {
                String txt = txtSubject.getText();
                        autoComplete(txt);
            }
                });
        }
    }//GEN-LAST:event_txtSubjectKeyPressed

    private void txtSubjectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSubjectFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSubjectFocusGained

    private void txtDobFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDobFocusGained
        // TODO add your handling code here:
        if(txtDob.getText().equals("yyyy-mm-dd")){

            txtDob.setText("");
            txtDob.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtDobFocusGained

    private void txtDobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDobFocusLost
        // TODO add your handling code here:
        if(txtDob.getText().equals("")){

            txtDob.setText("yyyy-mm-dd");
            txtDob.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtDobFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StdRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StdRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StdRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StdRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StdRegForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JComboBox<String> cboxSex;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel gPhoneNo;
    private javax.swing.JLabel grade;
    private javax.swing.JComboBox<String> gradeCB;
    private javax.swing.JLabel guardiansName;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newBtn;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel registerIcn1;
    private javax.swing.JLabel registerTitle;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel stdID;
    private javax.swing.JLabel stdName;
    private javax.swing.JLabel stdNameShort;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtStdID;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtgphoneNo;
    private javax.swing.JTextField txtguardiansName;
    private javax.swing.JTextField txtstdName;
    private javax.swing.JTextField txtstdNameShort;
    // End of variables declaration//GEN-END:variables
        
   
private void databaseName(){
    
    Connection con;
    con = DBConnect.connect();
    try {
        Statement st=con.createStatement();
        String sql="SELECT * FROM tchr_info_table;";
        ResultSet rst=st.executeQuery(sql);
        
        while(rst.next()){
            String Name = rst.getString("Subj_Name");
                
            name.add(Name);
            
        }
        rst.close();
        st.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private void autoComplete (String txt){
    String complete="";
    int start =txt.length();
    int last = txt.length();
    int a;
    for(a=0;a<name.size();a++){
        if (name.get(a).toString().startsWith(txt)){
            complete= name.get(a).toString();
            last = complete.length();
            break;
        }
    }
    if (last>start){
        txtSubject.setText(complete);
        txtSubject.setCaretPosition(last);
        txtSubject.moveCaretPosition(start);
    }
    
}


}