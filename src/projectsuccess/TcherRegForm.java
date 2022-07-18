/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
//import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


//import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class TcherRegForm extends javax.swing.JFrame {

    Connection conn=null;
    Statement stmt; 
    /**
     * Creates new form regForm
     */
    public TcherRegForm()
    {conn = DBConnect.connect();
        initComponents();
        
        ImageIcon myImage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/regicon.png")));
        
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(registerIcn1.getWidth(), registerIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        
        registerIcn1.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void reset(){
        Tchr_Name.setText("");
        Name_with_Initials.setText("");
        Tchr_ID.setText("");
        Address.setText("");
        DOB.setText("");
        Phone_no.setText("");
        sex.setSelectedItem("Male");
        NIC.setText("");
        Subj_Name.setText("");
        Payment_Fees.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        Tchr_Name = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        Phone_no = new javax.swing.JTextField();
        NIC = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        createBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        tcherregisterTitle = new javax.swing.JLabel();
        registerIcn1 = new javax.swing.JLabel();
        Name_with_Initials = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        Address = new javax.swing.JTextField();
        Tchr_ID = new javax.swing.JTextField();
        Subj_Name = new javax.swing.JTextField();
        Payment_Fees = new javax.swing.JTextField();
        fn = new javax.swing.JLabel();
        nwi = new javax.swing.JLabel();
        tID = new javax.swing.JLabel();
        adders = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        pNo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nic = new javax.swing.JLabel();
        sbj = new javax.swing.JLabel();
        sbjfee = new javax.swing.JLabel();

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
        setTitle("Teacher Register");
        setBounds(new java.awt.Rectangle(0, 0, 606, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(606, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(606, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tchr_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Tchr_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 388, -1));

        DOB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 388, -1));

        Phone_no.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Phone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 388, -1));

        NIC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 388, -1));

        sex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 88, -1));

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
        jPanel1.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 480, 100, 36));

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
        jPanel1.add(cnslBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 100, 36));

        tcherregisterTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tcherregisterTitle.setText("Teacher Register Form");
        jPanel1.add(tcherregisterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 11, -1, 35));
        jPanel1.add(registerIcn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 11, 40, 35));

        Name_with_Initials.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Name_with_Initials, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 388, -1));

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
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 100, 36));

        Address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 388, -1));

        Tchr_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Tchr_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 388, -1));

        Subj_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Subj_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 388, -1));

        Payment_Fees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Payment_Fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 388, -1));

        fn.setText("Full Name");
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 74, 100, 20));

        nwi.setText("Name with Initials");
        jPanel1.add(nwi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 20));

        tID.setText("Teacher ID");
        jPanel1.add(tID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, -1));

        adders.setText("Address");
        jPanel1.add(adders, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 194, 110, 20));

        db.setText("Date of Birth");
        jPanel1.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));

        pNo.setText("Phone No");
        jPanel1.add(pNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 20));

        jLabel1.setText("Sex");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, 20));

        nic.setText("NIC");
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 20));

        sbj.setText("Subject");
        jPanel1.add(sbj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 20));

        sbjfee.setText("Subject Fee");
        jPanel1.add(sbjfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 70, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_clearBtnActionPerformed


    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_cnslBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        //   sta=conn.createStatement();
             
        int TchrID=Integer.parseInt(Tchr_ID.getText());
        String TchrName = Tchr_Name.getText();
        String Namewith_Initials = Name_with_Initials.getText();
        String Address1 = Address.getText();
        String DOB1 = DOB.getText();
        String Phoneno = Phone_no.getText();
        String gender = (String) sex.getSelectedItem();
        String NIC1 = NIC.getText();
        String SubjName = Subj_Name.getText();
        String PaymentFees = Payment_Fees.getText();
        
        
         if(!TchrName.isEmpty() && !Namewith_Initials.isEmpty() && !Address1.isEmpty() && !DOB1.isEmpty() && !Phoneno.isEmpty() && !gender.isEmpty() && !NIC1.isEmpty() && !SubjName.isEmpty() && !PaymentFees.isEmpty()){
        
         try{
        
         
            String sql = "INSERT INTO tchr_info_table(Tchr_ID,Tchr_Name,Name_with_Initials,Address,Phone_no,sex,NIC,Subj_Name,Payment_Fees,DOB) VALUES(?,?,?,?,?,?,?,?,?,?)";
            
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setInt(1,TchrID);
        pstmt.setString(2,TchrName);
        pstmt.setString(3,Namewith_Initials);
        pstmt.setString(4,Address1);
        pstmt.setString(5,Phoneno);
        pstmt.setString(6,gender);
        pstmt.setString(7,NIC1);
        pstmt.setString(8,SubjName);
        pstmt.setString(9,PaymentFees);
        pstmt.setString(10,DOB1);
        
        pstmt.execute();
            JOptionPane.showMessageDialog(null,"Successfully saved");
         
        }
        catch(Exception e){ 
        System.out.println(e);
    }//GEN-LAST:event_createBtnActionPerformed
         }
         else{
                JOptionPane.showMessageDialog(null, "Please Fill the Required Fields","Error Occurred!",JOptionPane.ERROR_MESSAGE);
            }
    }
    

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
            java.util.logging.Logger.getLogger(TcherRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TcherRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TcherRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TcherRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TcherRegForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField NIC;
    private javax.swing.JTextField Name_with_Initials;
    private javax.swing.JTextField Payment_Fees;
    private javax.swing.JTextField Phone_no;
    private javax.swing.JTextField Subj_Name;
    private javax.swing.JTextField Tchr_ID;
    private javax.swing.JTextField Tchr_Name;
    private javax.swing.JLabel adders;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel db;
    private javax.swing.JLabel fn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nic;
    private javax.swing.JLabel nwi;
    private javax.swing.JLabel pNo;
    private javax.swing.JLabel registerIcn1;
    private javax.swing.JLabel sbj;
    private javax.swing.JLabel sbjfee;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JLabel tID;
    private javax.swing.JLabel tcherregisterTitle;
    // End of variables declaration//GEN-END:variables
}