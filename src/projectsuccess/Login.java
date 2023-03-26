/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        icon();
        ImageIcon myImage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/login.png")));

        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(loginIcon1.getWidth(), loginIcon1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);

        loginIcon1.setIcon(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        uName = new javax.swing.JLabel();
        passWord = new javax.swing.JLabel();
        uNameTxt = new javax.swing.JTextField();
        passWordArea = new javax.swing.JPasswordField();
        btnLin = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        loginTitle = new javax.swing.JLabel();
        loginIcon1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In Here");
        setName("LoginFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BG.setBackground(new java.awt.Color(153, 204, 255));

        uName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        uName.setText("Enter User Name :");

        passWord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passWord.setText("Enter Password   :");

        btnLin.setBackground(new java.awt.Color(102, 255, 102));
        btnLin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login2.png"))); // NOI18N
        btnLin.setText("Login");
        btnLin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLin.setIconTextGap(15);
        btnLin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinActionPerformed(evt);
            }
        });

        cnslBtn.setBackground(new java.awt.Color(255, 102, 102));
        cnslBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cnslBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x.png"))); // NOI18N
        cnslBtn.setText("Cancel");
        cnslBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cnslBtn.setIconTextGap(15);
        cnslBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnslBtnActionPerformed(evt);
            }
        });

        loginTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        loginTitle.setText("Login");
        loginTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo_login PG.png"))); // NOI18N

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(loginIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnLin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(cnslBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passWordArea, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(loginTitle)))
                .addGap(6, 6, 6)
                .addComponent(logo)
                .addGap(45, 45, 45)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(uNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passWord, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(passWordArea, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnslBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 349, 465));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        this.dispose();
    }

    /**
     * @param args the command line arguments
     */

    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed

        System.exit(0);

    }//GEN-LAST:event_cnslBtnActionPerformed

    private static Process process;
    private void btnLinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinActionPerformed
        String username = uNameTxt.getText();
        String password = String.valueOf(passWordArea.getPassword());

        if (username.equals("") && password.equals("")) {
            this.dispose();
            HomeWindowV2 h1 = new HomeWindowV2();
            h1.setVisible(true);
        } else {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "invaild username or password");

        }

        try {
            // Replace this with the path to your XAMPP installation folder
            String xamppPath = "C:\\xampp";

            // Start MySQL in the background
            String[] command = {"cmd.exe", "/c", "start", "cmd.exe", "/c", "cd \"" + xamppPath + "\" && mysql\\bin\\mysqld.exe"};
            process = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnLinActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnLin;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JLabel loginIcon1;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passWord;
    private javax.swing.JPasswordField passWordArea;
    private javax.swing.JLabel uName;
    private javax.swing.JTextField uNameTxt;
    // End of variables declaration//GEN-END:variables
    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/Project Icon.png")));
    }
}
