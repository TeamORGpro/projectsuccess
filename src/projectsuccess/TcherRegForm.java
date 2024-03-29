/*Chathura
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public final class TcherRegForm extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form regForm
     */
    public TcherRegForm() {
        initComponents();
        icon();
        closeconfirm();
        nextid();
        iconlabelLoad();

        Tchr_ID.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void closeconfirm() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int reply = JOptionPane.showConfirmDialog(null,
                        "Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                } else {
                    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
                }

            }
        });
    }

    @SuppressWarnings("unchecked")

    public void nextid() {
        Connection con;
        con = DBConnect.connect();
        Statement s;
        try {
            s = con.createStatement();

            try (ResultSet rs = s.executeQuery("SELECT AUTO_INCREMENT FROM information_schema.TABLES WHERE TABLE_SCHEMA = 'successdb' AND TABLE_NAME= 'tchr_info_table';")) {

                rs.next();
                Tchr_ID.setText(rs.getString("AUTO_INCREMENT"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void reset() {
        nextid();
        Tchr_Name.setText("");
        Name_with_Initials.setText("");
//        Tchr_ID.setText("");
        Address.setText("");
        DOB.setText("yyyy-mm-dd");
        DOB.setForeground(new Color(153, 153, 153));
        Phone_no.setText("");
        sex.setSelectedItem("Male");
        NIC.setText("");
        Subj_Name.setText("");
        Payment_Fees.setText("");
        Tchr_ID.setEnabled(false);
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
        newBtn = new javax.swing.JButton();
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
        DOB.setForeground(new java.awt.Color(153, 153, 153));
        DOB.setText("yyyy-mm-dd");
        DOB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DOBFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DOBFocusLost(evt);
            }
        });
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        jPanel1.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 388, -1));

        Phone_no.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Phone_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_noActionPerformed(evt);
            }
        });
        Phone_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Phone_noKeyTyped(evt);
            }
        });
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
        jPanel1.add(newBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 100, 36));

        Address.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 388, -1));

        Tchr_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Tchr_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 388, -1));

        Subj_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(Subj_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 388, -1));

        Payment_Fees.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Payment_Fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Payment_FeesKeyTyped(evt);
            }
        });
        jPanel1.add(Payment_Fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 388, -1));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fn.setText("Full Name");
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 74, 100, 20));

        nwi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nwi.setText("Name with Initials");
        jPanel1.add(nwi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, 20));

        tID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tID.setText("Teacher ID");
        jPanel1.add(tID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 155, 110, -1));

        adders.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adders.setText("Address");
        jPanel1.add(adders, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 110, 20));

        db.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        db.setText("Date of Birth");
        jPanel1.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 100, 20));

        pNo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pNo.setText("Phone No");
        jPanel1.add(pNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Sex");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, 20));

        nic.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nic.setText("NIC");
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 20));

        sbj.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sbj.setText("Subject");
        jPanel1.add(sbj, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 70, 20));

        sbjfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sbjfee.setText("Subject Fee (Rs.)");
        jPanel1.add(sbjfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 20));

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

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:

        reset();
    }//GEN-LAST:event_newBtnActionPerformed


    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
        // TODO add your handling code here:

        int reply = JOptionPane.showConfirmDialog(null,
                "Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_cnslBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed

        // validation part begins
        String t_subj = Subj_Name.getText().toLowerCase();

        String quryc = "SELECT * FROM `tchr_info_table` WHERE `Subj_Name`='" + t_subj + "';";

        try {
            Connection tchrVcon = DBConnect.connect();
            Statement stVtchr = tchrVcon.createStatement();
            ResultSet rsVtchr = stVtchr.executeQuery(quryc);

            if (rsVtchr.next() == true) {
//                String s = rsVtchr.getString("Tchr_Name").toLowerCase();
//                String sn = rsVtchr.getString("Subj_Name").toLowerCase();
//            System.out.println(s);
                tchrVcon.close();
                stVtchr.close();
                rsVtchr.close();

//                System.out.println("Name match");
                JOptionPane.showMessageDialog(null, "Hmm. It seems that there is already a teacher doing this subject.", "Error!", JOptionPane.ERROR_MESSAGE);

            } else {
                //start of create code
                String TchrName = Tchr_Name.getText();
                String Namewith_Initials = Name_with_Initials.getText();
                String Address1 = Address.getText();
                String DOB1 = DOB.getText();
                String Phoneno = Phone_no.getText();
                String gender = (String) sex.getSelectedItem();
                String NIC1 = NIC.getText();
                String SubjName = Subj_Name.getText().toLowerCase();
                String PaymentFees = Payment_Fees.getText();

                Connection con;
                con = DBConnect.connect();

                char[] charArray = SubjName.toCharArray();
                boolean foundSpace = true;

                for (int i = 0; i < charArray.length; i++) {

                    if (Character.isLetter(charArray[i])) {

                        if (foundSpace) {

                            charArray[i] = Character.toUpperCase(charArray[i]);
                            foundSpace = false;
                        }
                    } else {

                        foundSpace = true;
                    }
                }

                SubjName = String.valueOf(charArray);

                if (!TchrName.isEmpty() && !Namewith_Initials.isEmpty() && !Address1.isEmpty() && !("yyyy-mm-dd".equals(DOB1)) && !Phoneno.isEmpty() && !gender.isEmpty() && !NIC1.isEmpty() && !SubjName.isEmpty() && !PaymentFees.isEmpty()) {

                    try {

                        String sql = "INSERT INTO tchr_info_table(Tchr_Name,Name_with_Initials,Address,Phone_no,sex,NIC,Subj_Name,Payment_Fees,DOB) VALUES(?,?,?,?,?,?,?,?,?)";

                        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                            pstmt.setString(1, TchrName);
                            pstmt.setString(2, Namewith_Initials);
                            pstmt.setString(3, Address1);
                            pstmt.setString(4, Phoneno);
                            pstmt.setString(5, gender);
                            pstmt.setString(6, NIC1);
                            pstmt.setString(7, SubjName);
                            pstmt.setString(8, PaymentFees + ".00");
                            pstmt.setString(9, DOB1);

                            pstmt.execute();
                            JOptionPane.showMessageDialog(null, "Successfully saved");
                            newBtn.doClick();
                        }
                        con.close();
                    } catch (HeadlessException | SQLException e) {
                        if (e.getLocalizedMessage() == null ? "Data truncation: Incorrect date value: '" + DOB1 + "' for column `successdb`.`tchr_info_table`.`DOB` at row 1" == null : e.getLocalizedMessage().equals("Data truncation: Incorrect date value: '" + DOB1 + "' for column `successdb`.`tchr_info_table`.`DOB` at row 1")) {
                            JOptionPane.showMessageDialog(null, "Please enter right date format", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please Fill the Required Fields", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                }//end of create code
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error :" + ex.getMessage(), "Error Occurred!", JOptionPane.ERROR_MESSAGE);

        }

        // validation part ends

    }//GEN-LAST:event_createBtnActionPerformed

    private void Payment_FeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Payment_FeesKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Payment_FeesKeyTyped

    private void Phone_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_noActionPerformed

    private void Phone_noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Phone_noKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_Phone_noKeyTyped

    private void DOBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DOBFocusGained
        // TODO add your handling code here:
        if (DOB.getText().equals("yyyy-mm-dd")) {

            DOB.setText("");
            DOB.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_DOBFocusGained

    private void DOBFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DOBFocusLost
        // TODO add your handling code here:
        if (DOB.getText().equals("")) {

            DOB.setText("yyyy-mm-dd");
            DOB.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_DOBFocusLost

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

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
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel db;
    private javax.swing.JLabel fn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newBtn;
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

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/Project Icon.png")));
    }

    private void iconlabelLoad() {
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/regicon.png")));

        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(registerIcn1.getWidth(), registerIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        registerIcn1.setIcon(i);
    }
}
