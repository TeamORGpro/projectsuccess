/*Chathura
ravishan
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author Chathura
 */
public class TecForm___Dont_use extends javax.swing.JFrame {
   Connection con=null;
   Statement stmt; 
    /**
     * Creates new form TecForm
     */
    public TecForm___Dont_use() {
        this.stmt = null;
        initComponents();
        
        con = DBConnect.connect();
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

        jPanel1 = new javax.swing.JPanel();
        tcherregisterTitle = new javax.swing.JLabel();
        fna = new javax.swing.JLabel();
        nwi = new javax.swing.JLabel();
        tachid = new javax.swing.JLabel();
        adde = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        pn = new javax.swing.JLabel();
        sx = new javax.swing.JLabel();
        nc = new javax.swing.JLabel();
        sbj = new javax.swing.JLabel();
        sbf = new javax.swing.JLabel();
        Tchr_Name = new javax.swing.JTextField();
        Name_with_Initials = new javax.swing.JTextField();
        Tchr_ID = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        Phone_no = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        NIC = new javax.swing.JTextField();
        Subj_Name = new javax.swing.JTextField();
        Payment_Fees = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Register");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        tcherregisterTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tcherregisterTitle.setText("Teacher Register Form");

        fna.setText("Full Name");

        nwi.setText("Name with Initials");

        tachid.setText("Teacher ID");

        adde.setText("Address");

        db.setText("Date of Birth");

        pn.setText("Phone No");

        sx.setText("Sex");

        nc.setText("NIC");

        sbj.setText("Subject");

        sbf.setText("Subject Fee");

        Name_with_Initials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_with_InitialsActionPerformed(evt);
            }
        });

        Tchr_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tchr_IDActionPerformed(evt);
            }
        });

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        Payment_Fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Payment_FeesActionPerformed(evt);
            }
        });

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

        cnslBtn.setBackground(new java.awt.Color(255, 102, 102));
        cnslBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cnslBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x.png"))); // NOI18N
        cnslBtn.setText("Cancel");
        cnslBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnslBtn.setIconTextGap(7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(tcherregisterTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fna, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nwi)
                            .addComponent(tachid)
                            .addComponent(db)
                            .addComponent(pn)
                            .addComponent(adde)
                            .addComponent(sx)
                            .addComponent(nc)
                            .addComponent(sbj)
                            .addComponent(sbf))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cnslBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Tchr_Name)
                                .addComponent(Name_with_Initials)
                                .addComponent(Tchr_ID)
                                .addComponent(Address)
                                .addComponent(DOB)
                                .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Payment_Fees, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(Subj_Name)
                                .addComponent(NIC)
                                .addComponent(Phone_no)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tcherregisterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fna, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tchr_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nwi)
                    .addComponent(Name_with_Initials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tachid)
                    .addComponent(Tchr_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adde)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(db)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pn)
                    .addComponent(Phone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sx)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nc)
                    .addComponent(NIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbj)
                    .addComponent(Subj_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbf)
                    .addComponent(Payment_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnslBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Name_with_InitialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_with_InitialsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Name_with_InitialsActionPerformed

    private void Tchr_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tchr_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tchr_IDActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        try{

            stmt=con.createStatement();

            int TchrID=Integer.parseInt(Tchr_ID.getText());
            String TchrName = Tchr_Name.getText();
            String NamewithInitials = Name_with_Initials.getText();
            String  Address1 = Address.getText();
            String Phoneno = Phone_no.getText();
            String gender = (String) sex.getSelectedItem();
            String NIC1 = NIC.getText();
            String SubjName = Subj_Name.getText();
            String PaymentFees = Payment_Fees.getText();
            String DOB1 = DOB.getText();

            String sql;
            sql = "INSERT INTO tchr_info_table(Tchr_ID,Tchr_Name,Name_with_Initials,Address,Phone_no,sex,NIC,Subj_Name,Payment_Fees,DOB) VALUES(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,TchrID);
            pst.setString(2,TchrName);
            pst.setString(3,NamewithInitials);
            pst.setString(4,Address1);
            pst.setString(5,Phoneno);
            pst.setString(6,gender);
            pst.setString(7,NIC1);
            pst.setString(8,SubjName);
            pst.setString(9,PaymentFees);
            pst.setString(10,DOB1);

            pst.execute();
            JOptionPane.showMessageDialog(null,"Successfully saved");
        }
        catch(Exception e){
            System.out.println(e);
    }//GEN-LAST:event_createBtnActionPerformed
    }
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:

        reset();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void Payment_FeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Payment_FeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Payment_FeesActionPerformed

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
            java.util.logging.Logger.getLogger(TecForm___Dont_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TecForm___Dont_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TecForm___Dont_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TecForm___Dont_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TecForm___Dont_use().setVisible(true);
            }
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
    private javax.swing.JLabel adde;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel db;
    private javax.swing.JLabel fna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nc;
    private javax.swing.JLabel nwi;
    private javax.swing.JLabel pn;
    private javax.swing.JLabel sbf;
    private javax.swing.JLabel sbj;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JLabel sx;
    private javax.swing.JLabel tachid;
    private javax.swing.JLabel tcherregisterTitle;
    // End of variables declaration//GEN-END:variables
}
