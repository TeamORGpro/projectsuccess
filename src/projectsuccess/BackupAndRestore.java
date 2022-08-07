/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class BackupAndRestore extends javax.swing.JFrame {

    /**
     * Creates new form BackupAndRestore
     */
    public BackupAndRestore() {
        initComponents();
        closeconfirm();
        icon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bckupnRstorPnl = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        browsBtn = new javax.swing.JButton();
        bkupBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        browsBtn1 = new javax.swing.JButton();
        rstorBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        bckupnRstorPnl.setBackground(new java.awt.Color(0, 153, 204));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Backup");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        browsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        browsBtn.setText("Browse");
        browsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsBtnActionPerformed(evt);
            }
        });

        bkupBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bkupBtn.setText("Backup");
        bkupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkupBtnActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Restore");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        browsBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        browsBtn1.setText("Browse");
        browsBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsBtn1ActionPerformed(evt);
            }
        });

        rstorBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rstorBtn.setText("Restore");
        rstorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bckupnRstorPnlLayout = new javax.swing.GroupLayout(bckupnRstorPnl);
        bckupnRstorPnl.setLayout(bckupnRstorPnlLayout);
        bckupnRstorPnlLayout.setHorizontalGroup(
            bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                        .addComponent(rstorBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                        .addGroup(bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(browsBtn))
                            .addComponent(bkupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(browsBtn1)))
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        bckupnRstorPnlLayout.setVerticalGroup(
            bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bckupnRstorPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkupBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bckupnRstorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rstorBtn)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bckupnRstorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckupnRstorPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        String path1 = null;
    String filename = null;
    private void browsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsBtnActionPerformed
        // TODO add your handling code here:

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);

        try {
            File f = fc.getSelectedFile();
            path1 = f.getAbsolutePath();
            path1 = path1.replace('\\', '/');
            path1 = path1 + ".sql";
            jTextField1.setText(path1);
        } catch (Exception e) {

            e.printStackTrace();
        }

    }//GEN-LAST:event_browsBtnActionPerformed

    private void bkupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkupBtnActionPerformed
        // TODO add your handling code here:
        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p=runtime.exec("C:/Success Institute/mysql/bin/mysqldump.exe -u root   -B successdb -r \""+path1+"\"");

            int processComplete = p.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(null, "Successfully Backuped File");
                jTextField1.setText("");
            } 
            else {
                JOptionPane.showMessageDialog(null, "Backup Didn't Successfull, Try typing a single word for file name", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
            }

        } catch (HeadlessException | IOException | InterruptedException e) {
            System.out.println(e);
            System.out.println(path1);
            JOptionPane.showMessageDialog(null, "Error :" + e.getLocalizedMessage(), "Error Occurred!", JOptionPane.ERROR_MESSAGE);

            e.printStackTrace();
        }

    }//GEN-LAST:event_bkupBtnActionPerformed

    private void browsBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsBtn1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);

        try {
            File f = fc.getSelectedFile();
            path1 = f.getAbsolutePath();
            path1 = path1.replace('\\', '/');
            jTextField2.setText(path1);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_browsBtn1ActionPerformed

    private void rstorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstorBtnActionPerformed
        // TODO add your handling code here:

        String user = "root";
        //        String pass="";
        String[] restorecmd = new String[]{"C:/Success Institute/mysql/bin/mysql.exe", "--user=" + user, "-e", "source "+path1};

        Process process;
        try {
            process = Runtime.getRuntime().exec(restorecmd);
            int pr = process.waitFor();
            if (pr == 0) {
                JOptionPane.showMessageDialog(null, "Successfully Restored File. Please close and relaunch the application.");
                jTextField2.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "Restore Didn't Successfull", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                jTextField2.setText("");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getLocalizedMessage(), "Error Occurred!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_rstorBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackupAndRestore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackupAndRestore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckupnRstorPnl;
    private javax.swing.JButton bkupBtn;
    private javax.swing.JButton browsBtn;
    private javax.swing.JButton browsBtn1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton rstorBtn;
    // End of variables declaration//GEN-END:variables

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/Project Icon.png")));
    }

}
