/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
//import java.awt.Image;
//import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.*;



/**
 *
 * @author pc
 */
public class StdAtten extends javax.swing.JFrame {

    /**
     * Creates new form stdAtten
     */
    
    
    
    public StdAtten() {
        initComponents();
        closeconfirm();
        dt();
        
        ImageIcon myImage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/attendance.png")));
        
        Image img1=myImage.getImage();
        Image img2=img1.getScaledInstance(attenIcn1.getWidth(), attenIcn1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(img2);
        
        attenIcn1.setIcon(i);
        txtStatuslb.setEnabled(false);
        getSubject();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void dt(){
        Date d = new Date();
        
        SimpleDateFormat sdat = new SimpleDateFormat("yyyy-MM-dd");
        
        String dd= sdat.format(d);
         txtAttnDate.setText(dd);
    }
    
    private void reset(){
        txtStdID.setText("");
        txtStdID.setText("");
        lblstdName.setText("");
        buttonGroup1.clearSelection();
        txtNotes.setText("");
        txtStatuslb.setText("");
        txtStatuslb.setEnabled(false);
        txtNotes.setText("Special Note");
        txtNotes.setForeground(new Color(153, 153, 153));

    }
    
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bgPnl = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        attenTitle = new javax.swing.JLabel();
        attenIcn1 = new javax.swing.JLabel();
        attmarkPanl = new javax.swing.JPanel();
        sbjName = new javax.swing.JLabel();
        stdID = new javax.swing.JLabel();
        stdName = new javax.swing.JLabel();
        txtStdID = new javax.swing.JTextField();
        presentRB = new javax.swing.JRadioButton();
        absentRB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNotes = new javax.swing.JTextArea();
        tchrName = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        cnslBtn = new javax.swing.JButton();
        txtStatuslb = new javax.swing.JTextField();
        statuslb = new javax.swing.JLabel();
        subCB = new javax.swing.JComboBox<>();
        searchBtn01 = new javax.swing.JButton();
        lblstdName = new javax.swing.JLabel();
        lblTchrName = new javax.swing.JLabel();
        tblPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        attnDate = new javax.swing.JLabel();
        txtAttnDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Attendance");
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        bgPnl.setBackground(new java.awt.Color(153, 204, 255));
        bgPnl.setMaximumSize(new java.awt.Dimension(1000, 580));
        bgPnl.setMinimumSize(new java.awt.Dimension(1000, 580));
        bgPnl.setPreferredSize(new java.awt.Dimension(1000, 580));
        bgPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attenTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        attenTitle.setText("Student Attendace");
        jPanel1.add(attenTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 35));
        jPanel1.add(attenIcn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 32, 35));

        bgPnl.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        attmarkPanl.setBackground(new java.awt.Color(198, 228, 255));
        attmarkPanl.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 5, 5, new java.awt.Color(102, 102, 102)));

        sbjName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sbjName.setText("Subject Name :");

        stdID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stdID.setText("Student ID :");

        stdName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stdName.setText("Student Name :");

        txtStdID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        presentRB.setBackground(new java.awt.Color(198, 228, 255));
        buttonGroup1.add(presentRB);
        presentRB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        presentRB.setText("Present");
        presentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentRBActionPerformed(evt);
            }
        });

        absentRB.setBackground(new java.awt.Color(198, 228, 255));
        buttonGroup1.add(absentRB);
        absentRB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        absentRB.setText("Absent");
        absentRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentRBActionPerformed(evt);
            }
        });

        txtNotes.setColumns(20);
        txtNotes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNotes.setForeground(new java.awt.Color(153, 153, 153));
        txtNotes.setLineWrap(true);
        txtNotes.setRows(5);
        txtNotes.setText("Special Note");
        txtNotes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNotesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNotesFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtNotes);

        tchrName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tchrName.setText("Teacher's Name :");

        createBtn.setBackground(new java.awt.Color(102, 255, 102));
        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-user.png"))); // NOI18N
        createBtn.setText("Save");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.setIconTextGap(5);
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

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

        txtStatuslb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtStatuslb.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        statuslb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statuslb.setText("Status :");

        subCB.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        subCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subject" }));
        subCB.setPreferredSize(new java.awt.Dimension(27, 20));
        subCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCBActionPerformed(evt);
            }
        });

        searchBtn01.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        searchBtn01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        searchBtn01.setText("Search");
        searchBtn01.setIconTextGap(5);
        searchBtn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn01ActionPerformed(evt);
            }
        });

        lblstdName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        lblTchrName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout attmarkPanlLayout = new javax.swing.GroupLayout(attmarkPanl);
        attmarkPanl.setLayout(attmarkPanlLayout);
        attmarkPanlLayout.setHorizontalGroup(
            attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attmarkPanlLayout.createSequentialGroup()
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(attmarkPanlLayout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cnslBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(attmarkPanlLayout.createSequentialGroup()
                        .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(sbjName))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(stdName))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(stdID))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tchrName))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(statuslb)))
                        .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attmarkPanlLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(presentRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(absentRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStatuslb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(attmarkPanlLayout.createSequentialGroup()
                                        .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                        .addComponent(searchBtn01))
                                    .addComponent(subCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblstdName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(attmarkPanlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTchrName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        attmarkPanlLayout.setVerticalGroup(
            attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attmarkPanlLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbjName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subCB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tchrName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTchrName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstdName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStatuslb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statuslb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(presentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(absentRB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(attmarkPanlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnslBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        bgPnl.add(attmarkPanl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 410, 440));

        tblPanel.setBackground(new java.awt.Color(153, 204, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Subject Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        javax.swing.GroupLayout tblPanelLayout = new javax.swing.GroupLayout(tblPanel);
        tblPanel.setLayout(tblPanelLayout);
        tblPanelLayout.setHorizontalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        tblPanelLayout.setVerticalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        bgPnl.add(tblPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 11, -1, -1));

        attnDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        attnDate.setText("Date :");
        bgPnl.add(attnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 70, 50, 30));
        bgPnl.add(txtAttnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNotesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNotesFocusGained
        if(txtNotes.getText().equals("Special Note")){

            txtNotes.setText("");
            txtNotes.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtNotesFocusGained

    private void txtNotesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNotesFocusLost
        if(txtNotes.getText().equals("")){

            txtNotes.setText("Special Note");
            txtNotes.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNotesFocusLost

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
        
        reset();
    }//GEN-LAST:event_newBtnActionPerformed

    private void presentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentRBActionPerformed
        // TODO add your handling code here:
       
            if (presentRB.isSelected()== (true)){
                String c = "Present";
                
                txtStatuslb.setText(c);
                txtStatuslb.setEnabled(false);

                
            }
           
    }//GEN-LAST:event_presentRBActionPerformed

    private void cnslBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnslBtnActionPerformed
        // TODO add your handling code here:        
        int reply = JOptionPane.showConfirmDialog(null,
                    "Really Quit ?", "Quit", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION){
                this.dispose();
            }
        
    }//GEN-LAST:event_cnslBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
                
        if (txtStdID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill the Required Fields","Error Occurred!",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int Std_ID=Integer.parseInt(txtStdID.getText());
        String Std_Name=lblstdName.getText();
        String date=txtAttnDate.getText();
        String subject=(String) subCB.getSelectedItem();
        String techerName=lblTchrName.getText();
        String specNote=txtNotes.getText();
        String status=txtStatuslb.getText();
        
                
        
                if (!Std_Name.isEmpty() && !subject.isEmpty() && !techerName.isEmpty() && !status.isEmpty()) {
                Connection con;
                PreparedStatement pstmt2;
                con = DBConnect.connect();
                
        try {
                                                
            String query ="insert into attndance_table(Date,Subj_Name,Tchr_Name,Std_ID,Std_Name,Status,Spc_Note)values(?,?,?,?,?,?,?)";

            pstmt2 = con.prepareStatement(query);


            pstmt2.setString(1, date);
            pstmt2.setString(2, subject);
            pstmt2.setString(3, techerName);
            pstmt2.setInt(4, Std_ID);
            pstmt2.setString(5, Std_Name);
            pstmt2.setString(6, status);
            
            
            if (!(specNote.equals("Special Note"))){
                pstmt2.setString(7, specNote);
            }
            else{
                
                pstmt2.setString(7, "");
            }

            pstmt2.execute();
            JOptionPane.showMessageDialog(null, "Data successfully Saved!");
                String[] columns={txtStdID.getText(), Std_Name, subject, status};
                DefaultTableModel dtm= (DefaultTableModel)jTable1.getModel();
                dtm.addRow(columns);
            pstmt2.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error:"+e.getLocalizedMessage(),"Error Occurred!",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
        
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill the Required Fields","Error Occurred!",JOptionPane.ERROR_MESSAGE);
        }
        }

    }//GEN-LAST:event_createBtnActionPerformed

    private void absentRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentRBActionPerformed
        // TODO add your handling code here:
        
        if (absentRB.isSelected()== (true)){
                String b = "Absent";
                
                txtStatuslb.setText(b);
                txtStatuslb.setEnabled(false);

                
            }
        
    }//GEN-LAST:event_absentRBActionPerformed

    private void searchBtn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn01ActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        ResultSet rs;
        PreparedStatement pstmt;
        try {
            String studentID=txtStdID.getText();
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

    private void subCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCBActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        ResultSet rs2;
        PreparedStatement pstmt3;
        try {
            String subject=(String) subCB.getSelectedItem();
            pstmt3 = con.prepareStatement("SELECT * FROM tchr_info_table WHERE Subj_Name = ?");
            pstmt3.setString(1, subject);
            rs2 = pstmt3.executeQuery();
            
            if(rs2.next()){
            String TeacherName =rs2.getString("Tchr_Name");
            lblTchrName.setText(TeacherName);
        }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter Valid Subject Name");
                lblTchrName.setText("");

            }
            pstmt3.close();
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
    
//public void fillTchrName(){
//    
//        
//    
//    
//}    
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
            java.util.logging.Logger.getLogger(StdAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StdAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StdAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StdAtten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StdAtten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton absentRB;
    private javax.swing.JLabel attenIcn1;
    private javax.swing.JLabel attenTitle;
    private javax.swing.JPanel attmarkPanl;
    private javax.swing.JLabel attnDate;
    private javax.swing.JPanel bgPnl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cnslBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTchrName;
    private javax.swing.JLabel lblstdName;
    private javax.swing.JButton newBtn;
    private javax.swing.JRadioButton presentRB;
    private javax.swing.JLabel sbjName;
    private javax.swing.JButton searchBtn01;
    private javax.swing.JLabel statuslb;
    private javax.swing.JLabel stdID;
    private javax.swing.JLabel stdName;
    private javax.swing.JComboBox<String> subCB;
    private javax.swing.JPanel tblPanel;
    private javax.swing.JLabel tchrName;
    private javax.swing.JTextField txtAttnDate;
    private javax.swing.JTextArea txtNotes;
    private javax.swing.JTextField txtStatuslb;
    private javax.swing.JTextField txtStdID;
    // End of variables declaration//GEN-END:variables
}
