/*  259
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;


public final class PaymentDetails extends javax.swing.JFrame {

    


    public PaymentDetails() {
        initComponents();
        
        ImageIcon myImage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/paymentIcon.png")));
        
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(paymentIcn1.getWidth(), paymentIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        
        paymentIcn1.setIcon(i);
        closeconfirm();

        
        getSubject();
        dt(); 
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
    
    private void reset(){
        txtstdID.setText("");
        lblstdName.setText("");

        
    }
    
    public void dt(){
        java.util.Date d = new java.util.Date();
        
        SimpleDateFormat sdat = new SimpleDateFormat("yyyy-MM-dd");
        
        String dd= sdat.format(d);
         dateLbl.setText(dd);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addpaymentDetails = new javax.swing.JPanel();
        month = new javax.swing.JLabel();
        txtstdID = new javax.swing.JTextField();
        stdName = new javax.swing.JLabel();
        pmntDetails = new javax.swing.JLabel();
        stdID = new javax.swing.JLabel();
        tcherName = new javax.swing.JLabel();
        sbjName = new javax.swing.JLabel();
        grade = new javax.swing.JLabel();
        pmntFee = new javax.swing.JLabel();
        paymentIcn1 = new javax.swing.JLabel();
        gradeCB = new javax.swing.JComboBox<>();
        monthCB = new javax.swing.JComboBox<>();
        createBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        searchBtn01 = new javax.swing.JButton();
        feeLbl = new javax.swing.JLabel();
        subCB = new javax.swing.JComboBox<>();
        lblTchrName = new javax.swing.JLabel();
        lblstdName = new javax.swing.JLabel();
        attnDate = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment Details");
        setBounds(new java.awt.Rectangle(0, 0, 486, 600));
        setResizable(false);

        addpaymentDetails.setBackground(new java.awt.Color(153, 204, 255));
        addpaymentDetails.setMinimumSize(new java.awt.Dimension(606, 459));
        addpaymentDetails.setPreferredSize(new java.awt.Dimension(605, 700));
        addpaymentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        month.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        month.setText("Month :");
        month.setMaximumSize(new java.awt.Dimension(108, 14));
        month.setMinimumSize(new java.awt.Dimension(108, 14));
        addpaymentDetails.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        txtstdID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addpaymentDetails.add(txtstdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 250, 30));

        stdName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stdName.setText("Student Name :");
        stdName.setMaximumSize(new java.awt.Dimension(53, 14));
        stdName.setMinimumSize(new java.awt.Dimension(53, 14));
        addpaymentDetails.add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        pmntDetails.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        pmntDetails.setText("Paymant Details");
        addpaymentDetails.add(pmntDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 16, -1, 35));

        stdID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stdID.setText("Student ID :");
        addpaymentDetails.add(stdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));

        tcherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tcherName.setText("Teacher's Name :");
        tcherName.setMaximumSize(new java.awt.Dimension(78, 14));
        tcherName.setMinimumSize(new java.awt.Dimension(78, 14));
        addpaymentDetails.add(tcherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 30));

        sbjName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sbjName.setText("Subject :");
        sbjName.setMaximumSize(new java.awt.Dimension(70, 14));
        sbjName.setMinimumSize(new java.awt.Dimension(70, 14));
        addpaymentDetails.add(sbjName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        grade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        grade.setText("Grade In School :");
        grade.setMaximumSize(new java.awt.Dimension(83, 14));
        grade.setMinimumSize(new java.awt.Dimension(83, 14));
        addpaymentDetails.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        pmntFee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pmntFee.setText("Payment Fees (Rs) :");
        pmntFee.setMaximumSize(new java.awt.Dimension(57, 14));
        pmntFee.setMinimumSize(new java.awt.Dimension(57, 14));
        addpaymentDetails.add(pmntFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));
        addpaymentDetails.add(paymentIcn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 40, 35));

        gradeCB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        addpaymentDetails.add(gradeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 128, 30));

        monthCB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        addpaymentDetails.add(monthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 128, 30));

        createBtn.setBackground(new java.awt.Color(102, 255, 102));
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/create.png"))); // NOI18N
        createBtn.setText("Save");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.setIconTextGap(6);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        addpaymentDetails.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 100, 36));

        newBtn.setBackground(new java.awt.Color(255, 255, 153));
        newBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/new.png"))); // NOI18N
        newBtn.setText("New");
        newBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newBtn.setIconTextGap(6);
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });
        addpaymentDetails.add(newBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 100, 36));

        cnslBtn.setBackground(new java.awt.Color(255, 102, 102));
        cnslBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cnslBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x.png"))); // NOI18N
        cnslBtn.setText("Cancel");
        cnslBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnslBtn.setIconTextGap(7);
        cnslBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnslBtnActionPerformed(evt);
            }
        });
        addpaymentDetails.add(cnslBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 105, 36));

        searchBtn01.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        searchBtn01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        searchBtn01.setText("Search");
        searchBtn01.setIconTextGap(5);
        searchBtn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn01ActionPerformed(evt);
            }
        });
        addpaymentDetails.add(searchBtn01, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 100, 30));

        feeLbl.setBackground(new java.awt.Color(255, 255, 255));
        feeLbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        feeLbl.setText("0.00");
        addpaymentDetails.add(feeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 310, 120, 30));

        subCB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        subCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject" }));
        subCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCBActionPerformed(evt);
            }
        });
        addpaymentDetails.add(subCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 360, 30));

        lblTchrName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addpaymentDetails.add(lblTchrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 210, 357, 30));

        lblstdName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addpaymentDetails.add(lblstdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 110, 357, 30));

        attnDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attnDate.setText("Date :");
        addpaymentDetails.add(attnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 40, 30));

        dateLbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addpaymentDetails.add(dateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpaymentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpaymentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_newBtnActionPerformed

    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
        // TODO add your handling code here:
        
        int reply = JOptionPane.showConfirmDialog(null,
                    "Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                this.dispose();
            }
        
        
    }//GEN-LAST:event_cnslBtnActionPerformed

//    public class function{
//        
//    }
    
    private void searchBtn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn01ActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        ResultSet rs;
        PreparedStatement pstmt;
        try {
            String studentID=txtstdID.getText();
            pstmt = con.prepareStatement("SELECT * FROM std_info_table WHERE Std_ID = ?");
            pstmt.setString(1, studentID);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
            String studentName =rs.getString("Std_Name");
            lblstdName.setText(studentName);
        }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter Valid Student ID");
                lblstdName.setText("");

            }
            pstmt.close();
            rs.close();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_searchBtn01ActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if (txtstdID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill the Required Fields","Error Occurred!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int Std_ID=Integer.parseInt(txtstdID.getText());
        String Std_Name=lblstdName.getText();
        String subject=(String) subCB.getSelectedItem();
        String techerName=lblTchrName.getText();
        String grd=(String) gradeCB.getSelectedItem();
        String fee=feeLbl.getText();
        String mnth=(String) monthCB.getSelectedItem();
        String date=dateLbl.getText();
    
        if (!Std_Name.isEmpty() && !techerName.isEmpty()){
            Connection con;
            con = DBConnect.connect();
            PreparedStatement pstmt3;
        
        try {
                                                
            String query ="insert into payment_table(Std_ID,Std_Name,Tchr_Name,Subj_Name,Payment_fee,Grade,Month,Date_paid)values(?,?,?,?,?,?,?,?)";

            pstmt3 = con.prepareStatement(query);


            pstmt3.setInt(1, Std_ID);
            pstmt3.setString(2, Std_Name);
            pstmt3.setString(3, techerName);
            pstmt3.setString(4, subject);
            pstmt3.setString(5, fee);
            pstmt3.setString(6, grd);
            pstmt3.setString(7, mnth);
            pstmt3.setString(8, date);
            
            pstmt3.execute();
            JOptionPane.showMessageDialog(null, "Data successfully Saved!");
            
            pstmt3.close();
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Please check your filled data! ","Error Occurred!",JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Fill Required Fields!", "Error Occured!", JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
        
        
                
    }//GEN-LAST:event_createBtnActionPerformed

    private void subCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCBActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        ResultSet rs2;
        PreparedStatement pstmt2;
        try {
            String subject=(String) subCB.getSelectedItem();
            pstmt2 = con.prepareStatement("SELECT * FROM tchr_info_table WHERE Subj_Name = ?");
            pstmt2.setString(1, subject);
            rs2 = pstmt2.executeQuery();
            
            if(rs2.next()){
            String TeacherName =rs2.getString("Tchr_Name");
            String paymentfee = rs2.getString("Payment_Fees");
            lblTchrName.setText(TeacherName);
            feeLbl.setText(paymentfee);
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter Valid Subject Name");
                lblTchrName.setText("");
                feeLbl.setText("");
            }
            pstmt2.close();
            rs2.close();
            con.close();

        } catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_subCBActionPerformed

    
    public void getSubject(){
        Connection con;
        con = DBConnect.connect();
        ResultSet rsSub;
        PreparedStatement psSub;
        
        String query1="SELECT Subj_Name FROM tchr_info_table;";
        
        try {
            
            psSub = con.prepareStatement(query1);
            rsSub=psSub.executeQuery();
            while (rsSub.next()){
                String subjname= rsSub.getString("Subj_Name");
                subCB.addItem(subjname);
            }
            rsSub.close();
            psSub.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
}
    
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
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentDetails().setVisible(true);
            }
        });
        
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                String name = JOptionPane.showInputDialog(parent,
//                        "What is your name?", null);
//            }
//        
//    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addpaymentDetails;
    private javax.swing.JLabel attnDate;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel feeLbl;
    private javax.swing.JLabel grade;
    private javax.swing.JComboBox<String> gradeCB;
    private javax.swing.JLabel lblTchrName;
    private javax.swing.JLabel lblstdName;
    private javax.swing.JLabel month;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JButton newBtn;
    private javax.swing.JLabel paymentIcn1;
    private javax.swing.JLabel pmntDetails;
    private javax.swing.JLabel pmntFee;
    private javax.swing.JLabel sbjName;
    private javax.swing.JButton searchBtn01;
    private javax.swing.JLabel stdID;
    private javax.swing.JLabel stdName;
    private javax.swing.JComboBox<String> subCB;
    private javax.swing.JLabel tcherName;
    private javax.swing.JTextField txtstdID;
    // End of variables declaration//GEN-END:variables
}
