/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;


public class PaymentDetails extends javax.swing.JFrame {
    
    Connection con= null;
    ResultSet rset = null;
    PreparedStatement pstmt2=null;


    public PaymentDetails() {
        initComponents();
        
        ImageIcon myImage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/paymentIcon.png")));
        
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(paymentIcn1.getWidth(), paymentIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        
        paymentIcn1.setIcon(i);
        
        con = DBConnect.connect();
    }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void reset(){
        txtstdID.setText("");
        txtstdName.setText("");
        txtTchrName.setText("");
        txtSbjName.setText("");
        gradeCB.setSelectedItem("Grade 6");
        displayFee.setText("0.00");
        monthCB.setSelectedItem("January");
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addpaymentDetails = new javax.swing.JPanel();
        month = new javax.swing.JLabel();
        txtstdID = new javax.swing.JTextField();
        txtstdName = new javax.swing.JTextField();
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
        displayFee = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        txtTchrName = new javax.swing.JTextField();
        txtSbjName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment Details");
        setBounds(new java.awt.Rectangle(0, 0, 486, 600));
        setResizable(false);

        addpaymentDetails.setBackground(new java.awt.Color(153, 204, 255));
        addpaymentDetails.setMinimumSize(new java.awt.Dimension(606, 459));
        addpaymentDetails.setPreferredSize(new java.awt.Dimension(605, 700));
        addpaymentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        month.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        month.setText("Month :");
        month.setMaximumSize(new java.awt.Dimension(108, 14));
        month.setMinimumSize(new java.awt.Dimension(108, 14));
        addpaymentDetails.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 295, -1, -1));

        txtstdID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addpaymentDetails.add(txtstdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 61, 399, -1));

        txtstdName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addpaymentDetails.add(txtstdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 100, 399, -1));

        stdName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdName.setText("Student Name :");
        stdName.setMaximumSize(new java.awt.Dimension(53, 14));
        stdName.setMinimumSize(new java.awt.Dimension(53, 14));
        addpaymentDetails.add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 102, -1, -1));

        pmntDetails.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        pmntDetails.setText("Paymant Details");
        addpaymentDetails.add(pmntDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 16, -1, 35));

        stdID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdID.setText("Student ID :");
        addpaymentDetails.add(stdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 63, -1, -1));

        tcherName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tcherName.setText("Teacher's Name :");
        tcherName.setMaximumSize(new java.awt.Dimension(78, 14));
        tcherName.setMinimumSize(new java.awt.Dimension(78, 14));
        addpaymentDetails.add(tcherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 141, -1, -1));

        sbjName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sbjName.setText("Subject :");
        sbjName.setMaximumSize(new java.awt.Dimension(70, 14));
        sbjName.setMinimumSize(new java.awt.Dimension(70, 14));
        addpaymentDetails.add(sbjName, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 182, -1, -1));

        grade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        grade.setText("Grade In School :");
        grade.setMaximumSize(new java.awt.Dimension(83, 14));
        grade.setMinimumSize(new java.awt.Dimension(83, 14));
        addpaymentDetails.add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 221, -1, -1));

        pmntFee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pmntFee.setText("Payment Fees (Rs) :");
        pmntFee.setMaximumSize(new java.awt.Dimension(57, 14));
        pmntFee.setMinimumSize(new java.awt.Dimension(57, 14));
        addpaymentDetails.add(pmntFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 258, -1, -1));
        addpaymentDetails.add(paymentIcn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, 40, 35));

        gradeCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        addpaymentDetails.add(gradeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 219, 128, -1));

        monthCB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        monthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        addpaymentDetails.add(monthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 293, 128, -1));

        displayFee.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayFee.setText("0.00");
        addpaymentDetails.add(displayFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 259, 128, -1));

        createBtn.setBackground(new java.awt.Color(102, 255, 102));
        createBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/create.png"))); // NOI18N
        createBtn.setText("Save");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.setIconTextGap(6);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        addpaymentDetails.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 347, 100, 36));

        clearBtn.setBackground(new java.awt.Color(255, 255, 153));
        clearBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.setIconTextGap(6);
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        addpaymentDetails.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 347, 100, 36));

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
        addpaymentDetails.add(cnslBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 347, 100, 36));

        txtTchrName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addpaymentDetails.add(txtTchrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 139, 399, -1));

        txtSbjName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addpaymentDetails.add(txtSbjName, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 179, 399, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpaymentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpaymentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_cnslBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        int Std_ID=Integer.parseInt(txtstdID.getText());
        String Std_Name=txtstdName.getText();
        String Tchr_Name=txtTchrName.getText();
        String Subj_Name=txtSbjName.getText();
        String Grade=gradeCB.getItemAt(6);
     //   String paymet=displayFee.getText();
        String Month=monthCB.getItemAt(10);
        
        try{
            
            String query="insert into payment_table(Std_ID,Std_Name,Tchr_Name,Subj_Name,Grade,Month)values(?,?,?,?,?,?)";
            
            pstmt2 = con.prepareStatement(query);
            
            pstmt2.setInt(1,Std_ID);
            pstmt2.setString(2,Std_Name);
            pstmt2.setString(3,Tchr_Name);
            pstmt2.setString(4,Subj_Name);
            pstmt2.setString(5,Grade);
            pstmt2.setString(6,Month);
            
            pstmt2.execute();
            JOptionPane.showMessageDialog(null, "query successfully executed");
            
            } catch (SQLException e) {
                System.out.println(e);
            
        }
        
        
    }//GEN-LAST:event_createBtnActionPerformed

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
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel displayFee;
    private javax.swing.JLabel grade;
    private javax.swing.JComboBox<String> gradeCB;
    private javax.swing.JLabel month;
    private javax.swing.JComboBox<String> monthCB;
    private javax.swing.JLabel paymentIcn1;
    private javax.swing.JLabel pmntDetails;
    private javax.swing.JLabel pmntFee;
    private javax.swing.JLabel sbjName;
    private javax.swing.JLabel stdID;
    private javax.swing.JLabel stdName;
    private javax.swing.JLabel tcherName;
    private javax.swing.JTextField txtSbjName;
    private javax.swing.JTextField txtTchrName;
    private javax.swing.JTextField txtstdID;
    private javax.swing.JTextField txtstdName;
    // End of variables declaration//GEN-END:variables
}
