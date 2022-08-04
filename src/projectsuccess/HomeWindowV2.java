/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsuccess;

import java.awt.*;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 *
 * @author pc
 */
public class HomeWindowV2 extends javax.swing.JFrame {

    /**
     * Creates new form HomeWindow
     */
    public HomeWindowV2() {
        initComponents();
        closedeny();
        attnSField();
        tchrSField();
        stdSField();
        pymntSField();
        
    }
    
        public void attnSField() {
        TableRowSorter<TableModel> attnSort = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(attnSort);

        attnSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String attnStr = attnSearchField.getText();
                if (attnStr.trim().length() == 0) {
                    attnSort.setRowFilter(null);
                } else {
                    attnSort.setRowFilter(RowFilter.regexFilter("(?i)" + attnStr));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String attnStr = attnSearchField.getText();
                if (attnStr.trim().length() == 0) {
                    attnSort.setRowFilter(null);

                } else {
                    attnSort.setRowFilter(RowFilter.regexFilter("(?i)" + attnStr));

                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    public void tchrSField() {
        TableRowSorter<TableModel> tchrSort = new TableRowSorter<>(jTable4.getModel());
        jTable4.setRowSorter(tchrSort);

        tchrSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String tchrStr = tchrSearchField.getText();
                if (tchrStr.trim().length() == 0) {
                    tchrSort.setRowFilter(null);
                } else {
                    tchrSort.setRowFilter(RowFilter.regexFilter("(?i)" + tchrStr));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String tchrStr = tchrSearchField.getText();
                if (tchrStr.trim().length() == 0) {
                    tchrSort.setRowFilter(null);

                } else {
                    tchrSort.setRowFilter(RowFilter.regexFilter("(?i)" + tchrStr));

                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    public void stdSField() {
        TableRowSorter<TableModel> sort = new TableRowSorter<>(jTable3.getModel());
        jTable3.setRowSorter(sort);

        stdSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String str = stdSearchField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);
                } else {
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String str = stdSearchField.getText();
                if (str.trim().length() == 0) {
                    sort.setRowFilter(null);

                } else {
                    sort.setRowFilter(RowFilter.regexFilter("(?i)" + str));

                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    public void pymntSField() {
        TableRowSorter<TableModel> pymntSort = new TableRowSorter<>(jTable2.getModel());
        jTable2.setRowSorter(pymntSort);

        pymtSearchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String pymntStr = pymtSearchField.getText();
                if (pymntStr.trim().length() == 0) {
                    pymntSort.setRowFilter(null);
                } else {
                    pymntSort.setRowFilter(RowFilter.regexFilter("(?i)" + pymntStr));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String pymntStr = pymtSearchField.getText();
                if (pymntStr.trim().length() == 0) {
                    pymntSort.setRowFilter(null);

                } else {
                    pymntSort.setRowFilter(RowFilter.regexFilter("(?i)" + pymntStr));

                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void closedeny() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

            }
        });
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPnl = new javax.swing.JPanel();
        ctrlPnl = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnstdInfoAll = new javax.swing.JButton();
        btnAttnInfoAll = new javax.swing.JButton();
        btnPaymentInfoAll1 = new javax.swing.JButton();
        btntcherInfoAll = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        mainPnl = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        stdAttenBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stdpymntformbtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stdregformbtn = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLout = new javax.swing.JButton();
        tcherregFormBtn = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        attnInfo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        attnFilterPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        attnSearchField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        restBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        sendBtnAttnInfo = new javax.swing.JButton();
        stdInfo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        stdFilterPnl = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        stdSearchField = new javax.swing.JTextField();
        deleteBtn1 = new javax.swing.JButton();
        restBtn1 = new javax.swing.JButton();
        updateBtn2 = new javax.swing.JButton();
        sendBtnStdInfo = new javax.swing.JButton();
        tcherInfo = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        tcherFilterPnl = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        tchrSearchField = new javax.swing.JTextField();
        deleteBtn2 = new javax.swing.JButton();
        restBtn2 = new javax.swing.JButton();
        updateBtn3 = new javax.swing.JButton();
        sendBtnTchrInfo = new javax.swing.JButton();
        pymntInfo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        pymntFilterPnl = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pymtSearchField = new javax.swing.JTextField();
        deleteBtn3 = new javax.swing.JButton();
        restBtn3 = new javax.swing.JButton();
        sendBtnPymntInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Success Educational Institute");
        setMinimumSize(new java.awt.Dimension(1024, 632));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPnl.setBackground(new java.awt.Color(153, 204, 255));
        bgPnl.setMinimumSize(new java.awt.Dimension(1024, 632));
        bgPnl.setPreferredSize(new java.awt.Dimension(1024, 768));
        bgPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ctrlPnl.setBackground(new java.awt.Color(0, 153, 204));
        ctrlPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logo.png"))); // NOI18N
        logo.add(jLabel3, java.awt.BorderLayout.CENTER);

        ctrlPnl.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 100));

        btnHome.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        ctrlPnl.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 90));

        btnstdInfoAll.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnstdInfoAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/stdInfo.png"))); // NOI18N
        btnstdInfoAll.setText("Students Informations");
        btnstdInfoAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnstdInfoAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnstdInfoAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnstdInfoAllMouseClicked(evt);
            }
        });
        btnstdInfoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstdInfoAllActionPerformed(evt);
            }
        });
        ctrlPnl.add(btnstdInfoAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 90));

        btnAttnInfoAll.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnAttnInfoAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/stdAtten.png"))); // NOI18N
        btnAttnInfoAll.setText("Attendance Informations");
        btnAttnInfoAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAttnInfoAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAttnInfoAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttnInfoAllMouseClicked(evt);
            }
        });
        btnAttnInfoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttnInfoAllActionPerformed(evt);
            }
        });
        ctrlPnl.add(btnAttnInfoAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 90));

        btnPaymentInfoAll1.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btnPaymentInfoAll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/money.png"))); // NOI18N
        btnPaymentInfoAll1.setText("Payment Informations");
        btnPaymentInfoAll1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaymentInfoAll1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaymentInfoAll1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaymentInfoAll1MouseClicked(evt);
            }
        });
        btnPaymentInfoAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentInfoAll1ActionPerformed(evt);
            }
        });
        ctrlPnl.add(btnPaymentInfoAll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 90));

        btntcherInfoAll.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        btntcherInfoAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/teacher.png"))); // NOI18N
        btntcherInfoAll.setText("Teachers Information");
        btntcherInfoAll.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btntcherInfoAll.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btntcherInfoAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntcherInfoAllMouseClicked(evt);
            }
        });
        btntcherInfoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntcherInfoAllActionPerformed(evt);
            }
        });
        ctrlPnl.add(btntcherInfoAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 240, 90));

        bgPnl.add(ctrlPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 630));
        ctrlPnl.getAccessibleContext().setAccessibleName("");

        jPanel6.setBackground(new java.awt.Color(97, 198, 166));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgPnl.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, 779, 30));

        home.setBackground(new java.awt.Color(97, 198, 166));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Success Higher Educational Institute");
        home.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 10, -1, 50));

        stdAttenBtn.setBackground(new java.awt.Color(204, 255, 255));
        stdAttenBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(153, 153, 153)));
        stdAttenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdAttenBtn.setMaximumSize(new java.awt.Dimension(340, 110));
        stdAttenBtn.setMinimumSize(new java.awt.Dimension(340, 110));
        stdAttenBtn.setPreferredSize(new java.awt.Dimension(340, 110));
        stdAttenBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                stdAttenBtnMouseDragged(evt);
            }
        });
        stdAttenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdAttenBtnMouseClicked(evt);
            }
        });
        stdAttenBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/attendance.png"))); // NOI18N
        stdAttenBtn.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Student Attendance");
        stdAttenBtn.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 70));

        home.add(stdAttenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 340, 110));

        stdpymntformbtn.setBackground(new java.awt.Color(204, 255, 255));
        stdpymntformbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(153, 153, 153)));
        stdpymntformbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdpymntformbtn.setMaximumSize(new java.awt.Dimension(340, 110));
        stdpymntformbtn.setMinimumSize(new java.awt.Dimension(340, 110));
        stdpymntformbtn.setPreferredSize(new java.awt.Dimension(340, 110));
        stdpymntformbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdpymntformbtnMouseClicked(evt);
            }
        });
        stdpymntformbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paymentIcon.png"))); // NOI18N
        stdpymntformbtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Student Payments");
        stdpymntformbtn.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 70));

        home.add(stdpymntformbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 340, 110));

        stdregformbtn.setBackground(new java.awt.Color(204, 255, 255));
        stdregformbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(153, 153, 153)));
        stdregformbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdregformbtn.setMaximumSize(new java.awt.Dimension(340, 110));
        stdregformbtn.setMinimumSize(new java.awt.Dimension(340, 110));
        stdregformbtn.setPreferredSize(new java.awt.Dimension(340, 110));
        stdregformbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stdregformbtnMouseClicked(evt);
            }
        });
        stdregformbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/regicon.png"))); // NOI18N
        stdregformbtn.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Student Registration");
        stdregformbtn.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 70));

        home.add(stdregformbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 110));

        btnLout.setBackground(new java.awt.Color(255, 102, 102));
        btnLout.setForeground(new java.awt.Color(255, 255, 255));
        btnLout.setText("Log Out");
        btnLout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoutActionPerformed(evt);
            }
        });
        home.add(btnLout, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 120, 29));

        tcherregFormBtn.setBackground(new java.awt.Color(204, 255, 255));
        tcherregFormBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(153, 153, 153)));
        tcherregFormBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tcherregFormBtn.setMaximumSize(new java.awt.Dimension(340, 110));
        tcherregFormBtn.setMinimumSize(new java.awt.Dimension(340, 110));
        tcherregFormBtn.setPreferredSize(new java.awt.Dimension(340, 110));
        tcherregFormBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tcherregFormBtnMouseClicked(evt);
            }
        });
        tcherregFormBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/regicon.png"))); // NOI18N
        tcherregFormBtn.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setText("Teacher Registration");
        tcherregFormBtn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 190, 70));

        home.add(tcherregFormBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 340, 110));

        jButton5.setBackground(new java.awt.Color(0, 102, 204));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Backup And Restore");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        home.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, 30));

        mainPnl.addTab("tab1", home);

        attnInfo.setBackground(new java.awt.Color(255, 255, 255));
        attnInfo.setPreferredSize(new java.awt.Dimension(765, 596));
        attnInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setText("Attendance Informations");
        attnInfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, 30));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Subject Name", "Student ID", "Student Name", "Teacher's Name", "Status", "Special Notes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(200);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setMinWidth(200);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setMinWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setMinWidth(200);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        attnInfo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, 740, 410));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        attnInfo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 97, 29));

        attnFilterPnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Search in Here :");

        attnSearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                attnSearchFieldFocusGained(evt);
            }
        });
        attnSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attnSearchFieldActionPerformed(evt);
            }
        });
        attnSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                attnSearchFieldKeyTyped(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 153, 51));
        deleteBtn.setText("Delete Record");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        restBtn.setBackground(new java.awt.Color(255, 255, 102));
        restBtn.setText("Reset");
        restBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(153, 204, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        sendBtnAttnInfo.setBackground(new java.awt.Color(204, 204, 255));
        sendBtnAttnInfo.setText("Send to Export");
        sendBtnAttnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnAttnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attnFilterPnlLayout = new javax.swing.GroupLayout(attnFilterPnl);
        attnFilterPnl.setLayout(attnFilterPnlLayout);
        attnFilterPnlLayout.setHorizontalGroup(
            attnFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attnFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(attnSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendBtnAttnInfo)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        attnFilterPnlLayout.setVerticalGroup(
            attnFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attnFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attnFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attnSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendBtnAttnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        attnInfo.add(attnFilterPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 50));

        mainPnl.addTab("tab2", attnInfo);

        stdInfo.setBackground(new java.awt.Color(255, 255, 255));
        stdInfo.setPreferredSize(new java.awt.Dimension(765, 596));
        stdInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel12.setText("Students Informations");
        stdInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, 30));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Full Name", "Name with Initials", "Postal Address", "Date of Birth", "Subjects", "Grade", "Phone No", "Sex", "Guardian's Name", "Guardian's Phone No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(1).setMinWidth(200);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(2).setMinWidth(150);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable3.getColumnModel().getColumn(3).setMinWidth(200);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(4).setMinWidth(100);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(5).setMinWidth(200);
            jTable3.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(6).setMinWidth(100);
            jTable3.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(7).setMinWidth(100);
            jTable3.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(8).setMinWidth(50);
            jTable3.getColumnModel().getColumn(8).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(9).setMinWidth(200);
            jTable3.getColumnModel().getColumn(9).setPreferredWidth(200);
            jTable3.getColumnModel().getColumn(10).setMinWidth(100);
            jTable3.getColumnModel().getColumn(10).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        stdInfo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, 740, 410));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        stdInfo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 97, 29));

        stdFilterPnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setText("Search in Here :");

        stdSearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stdSearchFieldFocusGained(evt);
            }
        });
        stdSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stdSearchFieldKeyTyped(evt);
            }
        });

        deleteBtn1.setBackground(new java.awt.Color(255, 153, 51));
        deleteBtn1.setText("Delete Record");
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        restBtn1.setBackground(new java.awt.Color(255, 255, 102));
        restBtn1.setText("Reset");
        restBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restBtn1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restBtn1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                restBtn1MouseReleased(evt);
            }
        });
        restBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBtn1ActionPerformed(evt);
            }
        });

        updateBtn2.setBackground(new java.awt.Color(153, 204, 255));
        updateBtn2.setText("Update");
        updateBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn2ActionPerformed(evt);
            }
        });

        sendBtnStdInfo.setBackground(new java.awt.Color(204, 204, 255));
        sendBtnStdInfo.setText("Send to Export");
        sendBtnStdInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnStdInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stdFilterPnlLayout = new javax.swing.GroupLayout(stdFilterPnl);
        stdFilterPnl.setLayout(stdFilterPnlLayout);
        stdFilterPnlLayout.setHorizontalGroup(
            stdFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stdFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stdSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restBtn1)
                .addGap(18, 18, 18)
                .addComponent(updateBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendBtnStdInfo)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn1)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        stdFilterPnlLayout.setVerticalGroup(
            stdFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stdFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stdFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stdSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(deleteBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendBtnStdInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        stdInfo.add(stdFilterPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 50));

        mainPnl.addTab("tab3", stdInfo);

        tcherInfo.setBackground(new java.awt.Color(255, 255, 255));
        tcherInfo.setPreferredSize(new java.awt.Dimension(765, 596));
        tcherInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel13.setText("Teachers Informations");
        tcherInfo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, 30));

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Subject Name", "Name With Initial", "Full Name", "Subject Fees", "Postal Address", "Date of Birth", "Phone No", "Sex", "NIC No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(1).setMinWidth(200);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(2).setMinWidth(150);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable4.getColumnModel().getColumn(3).setMinWidth(200);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(4).setMinWidth(75);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(75);
            jTable4.getColumnModel().getColumn(5).setMinWidth(200);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable4.getColumnModel().getColumn(6).setMinWidth(100);
            jTable4.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(7).setMinWidth(100);
            jTable4.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(8).setMinWidth(50);
            jTable4.getColumnModel().getColumn(8).setPreferredWidth(50);
            jTable4.getColumnModel().getColumn(9).setMinWidth(100);
            jTable4.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        tcherInfo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, 740, 410));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        tcherInfo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 97, 29));

        tcherFilterPnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setText("Search in Here :");

        tchrSearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tchrSearchFieldFocusGained(evt);
            }
        });
        tchrSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tchrSearchFieldKeyTyped(evt);
            }
        });

        deleteBtn2.setBackground(new java.awt.Color(255, 153, 51));
        deleteBtn2.setText("Delete Record");
        deleteBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn2ActionPerformed(evt);
            }
        });

        restBtn2.setBackground(new java.awt.Color(255, 255, 102));
        restBtn2.setText("Reset");
        restBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBtn2ActionPerformed(evt);
            }
        });

        updateBtn3.setBackground(new java.awt.Color(153, 204, 255));
        updateBtn3.setText("Update");
        updateBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn3ActionPerformed(evt);
            }
        });

        sendBtnTchrInfo.setBackground(new java.awt.Color(204, 204, 255));
        sendBtnTchrInfo.setText("Send to Export");
        sendBtnTchrInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnTchrInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tcherFilterPnlLayout = new javax.swing.GroupLayout(tcherFilterPnl);
        tcherFilterPnl.setLayout(tcherFilterPnlLayout);
        tcherFilterPnlLayout.setHorizontalGroup(
            tcherFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tcherFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tchrSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restBtn2)
                .addGap(18, 18, 18)
                .addComponent(updateBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendBtnTchrInfo)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn2)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        tcherFilterPnlLayout.setVerticalGroup(
            tcherFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tcherFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tcherFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tchrSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(deleteBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendBtnTchrInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tcherInfo.add(tcherFilterPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 50));

        mainPnl.addTab("tab4", tcherInfo);

        pymntInfo.setBackground(new java.awt.Color(255, 255, 255));
        pymntInfo.setPreferredSize(new java.awt.Dimension(765, 596));
        pymntInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel11.setText("Payment Informations");
        pymntInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 21, -1, 30));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student  Name", "Subject", "Teacher's Name", "Subject Fee", "Last Paid Month", "Paid Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.setNextFocusableComponent(attnSearchField);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable2FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(200);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(2).setMinWidth(200);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(3).setMinWidth(200);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(4).setMinWidth(75);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(75);
            jTable2.getColumnModel().getColumn(5).setMinWidth(100);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(6).setMinWidth(100);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pymntInfo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 139, 740, 410));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        pymntInfo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 97, 29));

        pymntFilterPnl.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setText("Search in Here :");

        pymtSearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pymtSearchFieldFocusGained(evt);
            }
        });
        pymtSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pymtSearchFieldActionPerformed(evt);
            }
        });
        pymtSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pymtSearchFieldKeyTyped(evt);
            }
        });

        deleteBtn3.setBackground(new java.awt.Color(255, 153, 51));
        deleteBtn3.setText("Delete Record");
        deleteBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn3ActionPerformed(evt);
            }
        });

        restBtn3.setBackground(new java.awt.Color(255, 255, 102));
        restBtn3.setText("Reset");
        restBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBtn3ActionPerformed(evt);
            }
        });

        sendBtnPymntInfo.setBackground(new java.awt.Color(204, 204, 255));
        sendBtnPymntInfo.setText("Send to Export");
        sendBtnPymntInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnPymntInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pymntFilterPnlLayout = new javax.swing.GroupLayout(pymntFilterPnl);
        pymntFilterPnl.setLayout(pymntFilterPnlLayout);
        pymntFilterPnlLayout.setHorizontalGroup(
            pymntFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pymntFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pymtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restBtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sendBtnPymntInfo)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn3)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pymntFilterPnlLayout.setVerticalGroup(
            pymntFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pymntFilterPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pymntFilterPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pymtSearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(deleteBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendBtnPymntInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pymntInfo.add(pymntFilterPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 50));

        mainPnl.addTab("tab5", pymntInfo);

        bgPnl.add(mainPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, -3, 780, 635));

        getContentPane().add(bgPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked

    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnstdInfoAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnstdInfoAllMouseClicked

    }//GEN-LAST:event_btnstdInfoAllMouseClicked

    private void btnAttnInfoAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttnInfoAllMouseClicked

    }//GEN-LAST:event_btnAttnInfoAllMouseClicked

    private void btnPaymentInfoAll1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaymentInfoAll1MouseClicked

    }//GEN-LAST:event_btnPaymentInfoAll1MouseClicked

    private void btntcherInfoAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntcherInfoAllMouseClicked

    }//GEN-LAST:event_btntcherInfoAllMouseClicked

    private void stdAttenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdAttenBtnMouseClicked
        onClick(stdAttenBtn);
        onLeaveClick(stdpymntformbtn);
        onLeaveClick(stdregformbtn);
        onLeaveClick(tcherregFormBtn);

        //link StdAtten windows
        StdAtten i = new StdAtten();
        i.setVisible(true);
    }//GEN-LAST:event_stdAttenBtnMouseClicked

    private void stdpymntformbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdpymntformbtnMouseClicked
        onLeaveClick(stdAttenBtn);
        onClick(stdpymntformbtn);
        onLeaveClick(stdregformbtn);
        onLeaveClick(tcherregFormBtn);

        //link PaymentDetails windows
        PaymentDetails c = new PaymentDetails();
        c.setVisible(true);
    }//GEN-LAST:event_stdpymntformbtnMouseClicked

    private void stdregformbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdregformbtnMouseClicked
        onLeaveClick(stdAttenBtn);
        onLeaveClick(stdpymntformbtn);
        onClick(stdregformbtn);
        onLeaveClick(tcherregFormBtn);

        //link StdRegForm windows
        StdRegForm a = new StdRegForm();
        a.setVisible(true);
    }//GEN-LAST:event_stdregformbtnMouseClicked

    private void tcherregFormBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tcherregFormBtnMouseClicked
        onLeaveClick(stdAttenBtn);
        onLeaveClick(stdpymntformbtn);
        onLeaveClick(stdregformbtn);
        onClick(tcherregFormBtn);

        //link TcherRegForm windows
        TcherRegForm i = new TcherRegForm();
        i.setVisible(true);
    }//GEN-LAST:event_tcherregFormBtnMouseClicked

    private void stdAttenBtnMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdAttenBtnMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_stdAttenBtnMouseDragged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // going back to home panel

        mainPnl.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        mainPnl.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnstdInfoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstdInfoAllActionPerformed
        mainPnl.setSelectedIndex(2);
        Connection con;
        con = DBConnect.connect();

        Dimension dim = new Dimension(10, 1);
        jTable3.setIntercellSpacing(new Dimension(dim));

        try {
            DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
            dt.setRowCount(0);

            Statement s = con.createStatement();
            try (ResultSet rs = s.executeQuery("select * from std_info_table ")) {
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Std_ID"));
                    v.add(rs.getString("Std_Name"));
                    v.add(rs.getString("Name_with_Initials"));
                    v.add(rs.getString("Address"));
                    v.add(rs.getString("DOB"));
                    v.add(rs.getString("Subjects"));
                    v.add(rs.getString("Grade"));
                    v.add(rs.getString("Phone_no"));
                    v.add(rs.getString("sex"));
                    v.add(rs.getString("Grd_name"));
                    v.add(rs.getString("Grd_Phone_no"));
                    dt.addRow(v);
                }
                rs.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnstdInfoAllActionPerformed

    private void btnAttnInfoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttnInfoAllActionPerformed
        mainPnl.setSelectedIndex(1);
        Connection con;

        con = DBConnect.connect();

        Dimension dim = new Dimension(10, 1);
        jTable1.setIntercellSpacing(new Dimension(dim));

        try {
            DefaultTableModel dt1 = (DefaultTableModel) jTable1.getModel();
            dt1.setRowCount(0);
            Statement s1 = con.createStatement();
            try (ResultSet rs1 = s1.executeQuery("select * from attndance_table ")) {
                while (rs1.next()) {
                    Vector v1 = new Vector();
                    v1.add(rs1.getString("Date"));
                    v1.add(rs1.getString("Subj_Name"));
                    v1.add(rs1.getInt("Std_ID"));
                    v1.add(rs1.getString("Std_Name"));
                    v1.add(rs1.getString("Tchr_Name"));
                    v1.add(rs1.getString("Status"));
                    v1.add(rs1.getString("Spc_Note"));
                    dt1.addRow(v1);
                }
                s1.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnAttnInfoAllActionPerformed

    private void btnPaymentInfoAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentInfoAll1ActionPerformed
        mainPnl.setSelectedIndex(4);

        Connection con;

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        Dimension dim = new Dimension(10, 1);
        jTable2.setIntercellSpacing(new Dimension(dim));

        con = DBConnect.connect();
        try {
            DefaultTableModel dt3 = (DefaultTableModel) jTable2.getModel();
            dt3.setRowCount(0);
            Statement s3 = con.createStatement();
            try (ResultSet rs3 = s3.executeQuery("select * from payment_table")) {
                while (rs3.next()) {
                    Vector v3 = new Vector();
                    v3.add(rs3.getInt("Std_ID"));
                    v3.add(rs3.getString("Std_Name"));
                    v3.add(rs3.getString("Subj_Name"));
                    v3.add(rs3.getString("Tchr_Name"));
                    v3.add(rs3.getString("Payment_fee"));
                    v3.add(rs3.getString("Month"));
                    v3.add(rs3.getString("Date_paid"));

                    dt3.addRow(v3);
                }
                s3.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnPaymentInfoAll1ActionPerformed

    private void btntcherInfoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntcherInfoAllActionPerformed
        mainPnl.setSelectedIndex(3);

        Connection con;

        con = DBConnect.connect();

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        jTable4.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        Dimension dim = new Dimension(10, 1);
        jTable4.setIntercellSpacing(new Dimension(dim));

        try {
            DefaultTableModel dt2 = (DefaultTableModel) jTable4.getModel();
            dt2.setRowCount(0);
            Statement s2 = con.createStatement();
            try (ResultSet rs2 = s2.executeQuery("select * from tchr_info_table ")) {
                while (rs2.next()) {
                    Vector v2 = new Vector();
                    v2.add(rs2.getInt("Tchr_ID"));
                    v2.add(rs2.getString("Subj_Name"));
                    v2.add(rs2.getString("Name_with_Initials"));
                    v2.add(rs2.getString("Tchr_Name"));
                    v2.add(rs2.getString("Payment_Fees"));
                    v2.add(rs2.getString("Address"));
                    v2.add(rs2.getString("DOB"));
                    v2.add(rs2.getString("Phone_no"));
                    v2.add(rs2.getString("sex"));
                    v2.add(rs2.getString("NIC"));
                    dt2.addRow(v2);
                }
                s2.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btntcherInfoAllActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        mainPnl.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        mainPnl.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        mainPnl.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4MouseClicked

    private void restBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restBtn1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_restBtn1MouseClicked

    private void restBtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restBtn1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_restBtn1MousePressed

    private void restBtn1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restBtn1MouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_restBtn1MouseReleased

    private void btnLoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoutActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null,
                "Do you really want to log out ?", "Logging Out", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnLoutActionPerformed

    private void stdSearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stdSearchFieldFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_stdSearchFieldFocusGained

    private void attnSearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_attnSearchFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_attnSearchFieldFocusGained

    private void tchrSearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tchrSearchFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tchrSearchFieldFocusGained

    private void pymtSearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pymtSearchFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_pymtSearchFieldFocusGained

    private void restBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restBtnActionPerformed
        // TODO add your handling code here:

        attnSearchField.setText("");
    }//GEN-LAST:event_restBtnActionPerformed

    private void restBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restBtn1ActionPerformed
        // TODO add your handling code here:

        stdSearchField.setText("");
    }//GEN-LAST:event_restBtn1ActionPerformed

    private void restBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restBtn2ActionPerformed
        // TODO add your handling code here:

        tchrSearchField.setText("");
    }//GEN-LAST:event_restBtn2ActionPerformed

    private void restBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restBtn3ActionPerformed
        // TODO add your handling code here:

        pymtSearchField.setText("");
    }//GEN-LAST:event_restBtn3ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        Statement upSt;

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to update data?", "Updating", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                upSt = con.createStatement();

                for (int i = 0; i < model.getRowCount(); i++) {
                    String date = model.getValueAt(i, 0).toString();
                    String subjName = model.getValueAt(i, 1).toString();
                    int stuID = Integer.valueOf(model.getValueAt(i, 2).toString());
                    String status = model.getValueAt(i, 5).toString();
                    String spcNote = model.getValueAt(i, 6).toString();

                    String updateQuery = "UPDATE attndance_table SET Status='" + status + "',Spc_Note='" + spcNote + "' WHERE `Date`='" + date + "'AND Subj_Name='" + subjName + "'AND Std_ID=" + stuID;

                    upSt.addBatch(updateQuery);
                }

                upSt.executeBatch();
                JOptionPane.showMessageDialog(null, "Table Successfully Updated");
                upSt.close();
                con.close();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error :" + e.getLocalizedMessage());
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn2ActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        Statement upSt1;

        DefaultTableModel model1 = (DefaultTableModel) jTable3.getModel();

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to update data?", "Updating", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                upSt1 = con.createStatement();

                for (int i = 0; i < model1.getRowCount(); i++) {
                    int stuID = Integer.valueOf(model1.getValueAt(i, 0).toString());
                    String fname = model1.getValueAt(i, 1).toString();
                    String nameWithIN = model1.getValueAt(i, 2).toString();
                    String addr = model1.getValueAt(i, 3).toString();
                    String dob = model1.getValueAt(i, 4).toString();
                    String Subjects = model1.getValueAt(i, 5).toString();
                    String grd = model1.getValueAt(i, 6).toString();
                    String pNo = model1.getValueAt(i, 7).toString();
                    String sex = model1.getValueAt(i, 8).toString();
                    String gName = model1.getValueAt(i, 9).toString();
                    String gPNo = model1.getValueAt(i, 10).toString();

                    String updateQuery = "UPDATE `std_info_table` SET `Std_Name`='" + fname + "',`Name_with_Initials`='" + nameWithIN + "',`Address`='" + addr + "',`DOB`='" + dob + "',`Subjects`='" + Subjects + "',`Grade`='" + grd + "',`Phone_no`='" + pNo + "',`sex`='" + sex + "',`Grd_name`='" + gName + "',`Grd_Phone_no`='" + gPNo + "' WHERE `Std_ID`=" + stuID;

                    upSt1.addBatch(updateQuery);
                }

                upSt1.executeBatch();
                JOptionPane.showMessageDialog(null, "Table Successfully Updated");
                upSt1.close();
                con.close();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error :" + e.getLocalizedMessage());
                e.getMessage();
            }
        }


    }//GEN-LAST:event_updateBtn2ActionPerformed

    private void updateBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn3ActionPerformed
        // TODO add your handling code here:

        Connection con;
        con = DBConnect.connect();
        Statement upSt2;

        DefaultTableModel model2 = (DefaultTableModel) jTable4.getModel();

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to update data?", "Updating", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                upSt2 = con.createStatement();

                for (int i = 0; i < model2.getRowCount(); i++) {
                    int tchrID = Integer.valueOf(model2.getValueAt(i, 0).toString());
                    String subjName = model2.getValueAt(i, 1).toString();
                    String namewithIn = model2.getValueAt(i, 2).toString();
                    String fname = model2.getValueAt(i, 3).toString();
                    String fee = model2.getValueAt(i, 4).toString();
                    String addr = model2.getValueAt(i, 5).toString();
                    String dateofbirth = model2.getValueAt(i, 6).toString();
                    String pNo = model2.getValueAt(i, 7).toString();
                    String sex = model2.getValueAt(i, 8).toString();
                    String nic = model2.getValueAt(i, 9).toString();

                    String updateQuery = "UPDATE `tchr_info_table` SET `Tchr_Name`='" + fname + "',`Name_with_Initials`='" + namewithIn + "',`Address`='" + addr + "',`Phone_no`='" + pNo + "',`sex`='" + sex + "',`NIC`='" + nic + "',`Subj_Name`='" + subjName + "',`Payment_Fees`='" + fee + "',`DOB`='" + dateofbirth + "' WHERE `Tchr_ID`=" + tchrID;

                    upSt2.addBatch(updateQuery);

                }
                upSt2.executeBatch();
                JOptionPane.showMessageDialog(null, "Table Successfully Updated");

                upSt2.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error :" + ex.getLocalizedMessage());
                ex.getMessage();
            }
        }


    }//GEN-LAST:event_updateBtn3ActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        // TODO add your handling code here:
        Connection con;
        PreparedStatement ps;
        con = DBConnect.connect();

        DefaultTableModel stdtbmodel = (DefaultTableModel) jTable3.getModel();
        int row = jTable3.getSelectedRow();
        String eve = (String) jTable3.getModel().getValueAt(row, 0);

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to delete?", "Deleting", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            String delRow = "DELETE FROM `std_info_table` WHERE `Std_ID`= " + eve;
            try {
                ps = con.prepareStatement(delRow);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Row Successfully Deleted");
                ps.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error :" + ex.getLocalizedMessage());
            }
        }

        con = DBConnect.connect();

        try {
            DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
            dt.setRowCount(0);

            Statement s = con.createStatement();
            try (ResultSet rs = s.executeQuery("select * from std_info_table ")) {
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("Std_ID"));
                    v.add(rs.getString("Std_Name"));
                    v.add(rs.getString("Name_with_Initials"));
                    v.add(rs.getString("Address"));
                    v.add(rs.getString("DOB"));
                    v.add(rs.getString("Subjects"));
                    v.add(rs.getString("Grade"));
                    v.add(rs.getString("Phone_no"));
                    v.add(rs.getString("sex"));
                    v.add(rs.getString("Grd_name"));
                    v.add(rs.getString("Grd_Phone_no"));
                    dt.addRow(v);
                }
                rs.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_deleteBtn1ActionPerformed

    private void deleteBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn2ActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        PreparedStatement pst;

        DefaultTableModel tchrtbmodel = (DefaultTableModel) jTable4.getModel();
        int row1 = jTable4.getSelectedRow();
        int eve1 = (int) jTable4.getModel().getValueAt(row1, 0);

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to delete?", "Deleting", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            String delRow = "DELETE FROM `tchr_info_table` WHERE `Tchr_ID` =" + eve1;
            try {
                pst = con.prepareStatement(delRow);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Row Successfully Deleted");
                pst.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error :" + ex.getLocalizedMessage());
            }
        }

        ResultSet rset = null;

        con = DBConnect.connect();
        try {
            DefaultTableModel dt2 = (DefaultTableModel) jTable4.getModel();
            dt2.setRowCount(0);
            Statement s2 = con.createStatement();
            try (ResultSet rs2 = s2.executeQuery("select * from tchr_info_table ")) {
                while (rs2.next()) {
                    Vector v2 = new Vector();
                    v2.add(rs2.getInt("Tchr_ID"));
                    v2.add(rs2.getString("Subj_Name"));
                    v2.add(rs2.getString("Name_with_Initials"));
                    v2.add(rs2.getString("Tchr_Name"));
                    v2.add(rs2.getString("Payment_Fees"));
                    v2.add(rs2.getString("Address"));
                    v2.add(rs2.getString("DOB"));
                    v2.add(rs2.getString("Phone_no"));
                    v2.add(rs2.getString("sex"));
                    v2.add(rs2.getString("NIC"));
                    dt2.addRow(v2);
                }
                s2.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_deleteBtn2ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        PreparedStatement psa;

        DefaultTableModel attntbmodel = (DefaultTableModel) jTable1.getModel();
        int row2 = jTable1.getSelectedRow();
        String date = jTable1.getValueAt(row2, 0).toString();
        String subjName = jTable1.getValueAt(row2, 1).toString();
        int stuID = Integer.valueOf(jTable1.getValueAt(row2, 2).toString());

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to delete?", "Deleting", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            String delRow = "DELETE FROM `attndance_table` WHERE `Date`='" + date + "' AND `Subj_Name`='" + subjName + "' AND `Std_ID`=" + stuID;

            try {
                psa = con.prepareStatement(delRow);
                psa.execute();
                JOptionPane.showMessageDialog(null, "Row Successfully Deleted");
                psa.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error :" + ex.getLocalizedMessage());
            }
        }

        con = DBConnect.connect();
        try {
            DefaultTableModel dt1 = (DefaultTableModel) jTable1.getModel();
            dt1.setRowCount(0);
            Statement s1 = con.createStatement();
            try (ResultSet rs1 = s1.executeQuery("select * from attndance_table ")) {
                while (rs1.next()) {
                    Vector v1 = new Vector();
                    v1.add(rs1.getString("Date"));
                    v1.add(rs1.getString("Subj_Name"));
                    v1.add(rs1.getInt("Std_ID"));
                    v1.add(rs1.getString("Std_Name"));
                    v1.add(rs1.getString("Tchr_Name"));
                    v1.add(rs1.getString("Status"));
                    v1.add(rs1.getString("Spc_Note"));
                    dt1.addRow(v1);
                }
                s1.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void deleteBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn3ActionPerformed
        // TODO add your handling code here:
        Connection con;
        con = DBConnect.connect();
        PreparedStatement psp;

        DefaultTableModel pymnttbmodel = (DefaultTableModel) jTable2.getModel();

        int row2 = jTable2.getSelectedRow();
        int stuID = Integer.valueOf(jTable2.getValueAt(row2, 0).toString());
        String subjName = jTable2.getValueAt(row2, 2).toString();
        String month = jTable2.getValueAt(row2, 5).toString();
        String date = jTable2.getValueAt(row2, 6).toString();

        int reply = JOptionPane.showConfirmDialog(null,
                "Do you want to delete?", "Deleting", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            String delRow = "DELETE FROM `payment_table` WHERE `Std_ID`=" + stuID + " AND `Subj_Name`='" + subjName + "' AND `Date_paid`='" + date + "' AND `Month`='" + month + "';";
            try {
                psp = con.prepareStatement(delRow);
                psp.execute();
                JOptionPane.showMessageDialog(null, "Row Successfully Deleted");
                psp.close();
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error :" + ex.getLocalizedMessage());
            }
        }

        ResultSet rset = null;

        con = DBConnect.connect();
        try {
            DefaultTableModel dt3 = (DefaultTableModel) jTable2.getModel();
            dt3.setRowCount(0);
            Statement s3 = con.createStatement();
            try (ResultSet rs3 = s3.executeQuery("select * from payment_table")) {
                while (rs3.next()) {
                    Vector v3 = new Vector();
                    v3.add(rs3.getInt("Std_ID"));
                    v3.add(rs3.getString("Std_Name"));
                    v3.add(rs3.getString("Subj_Name"));
                    v3.add(rs3.getString("Tchr_Name"));
                    v3.add(rs3.getString("Payment_fee"));
                    v3.add(rs3.getString("Month"));
                    v3.add(rs3.getString("Date_paid"));

                    dt3.addRow(v3);
                }
                s3.close();
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_deleteBtn3ActionPerformed

    private void sendBtnPymntInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnPymntInfoActionPerformed
        // TODO add your handling code here:
        int rCount = jTable2.getSelectedRowCount();

        if (rCount == 0) {
            JOptionPane.showMessageDialog(null, "Please Select one or more rows to export", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            pymtSearchField.setText("");
            TableModel model1 = jTable2.getModel();

            int[] indexs = jTable2.getSelectedRows();

            Object[] row = new Object[7];

            PaymntExpo exportpayment = new PaymntExpo();
            DefaultTableModel model2 = (DefaultTableModel) exportpayment.paymntExpoTbl.getModel();

            for (int i = 0; i < indexs.length; i++) {
                row[0] = model1.getValueAt(indexs[i], 0);

                row[1] = model1.getValueAt(indexs[i], 1);

                row[2] = model1.getValueAt(indexs[i], 2);

                row[3] = model1.getValueAt(indexs[i], 3);

                row[4] = model1.getValueAt(indexs[i], 4);

                row[5] = model1.getValueAt(indexs[i], 5);

                row[6] = model1.getValueAt(indexs[i], 6);

                model2.addRow(row);
            }

            exportpayment.setVisible(true);
            exportpayment.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }


    }//GEN-LAST:event_sendBtnPymntInfoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        BackupAndRestore bANDr = new BackupAndRestore();
        bANDr.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sendBtnTchrInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnTchrInfoActionPerformed
        // TODO add your handling code here:
        int rCount = jTable4.getSelectedRowCount();

        if (rCount == 0) {
            JOptionPane.showMessageDialog(null, "Please Select one or more rows to export", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            tchrSearchField.setText("");
            TableModel model1 = jTable4.getModel();

            int[] indexs = jTable4.getSelectedRows();

            Object[] row = new Object[10];

            TchrExpo exportTchr = new TchrExpo();
            DefaultTableModel model2 = (DefaultTableModel) exportTchr.tchrExportTbl.getModel();

            for (int i = 0; i < indexs.length; i++) {
                row[0] = model1.getValueAt(indexs[i], 0);

                row[1] = model1.getValueAt(indexs[i], 1);

                row[2] = model1.getValueAt(indexs[i], 2);

                row[3] = model1.getValueAt(indexs[i], 3);

                row[4] = model1.getValueAt(indexs[i], 4);

                row[5] = model1.getValueAt(indexs[i], 5);

                row[6] = model1.getValueAt(indexs[i], 6);

                row[7] = model1.getValueAt(indexs[i], 7);

                row[8] = model1.getValueAt(indexs[i], 8);

                row[9] = model1.getValueAt(indexs[i], 9);

                model2.addRow(row);
            }

            exportTchr.setVisible(true);
            exportTchr.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }


    }//GEN-LAST:event_sendBtnTchrInfoActionPerformed


    private void sendBtnStdInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnStdInfoActionPerformed
        // TODO add your handling code here:
        int rCount = jTable3.getSelectedRowCount();

        if (rCount == 0) {
            JOptionPane.showMessageDialog(null, "Please Select one or more rows to export", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            stdSearchField.setText("");
            TableModel model1 = jTable3.getModel();

            int[] indexs = jTable3.getSelectedRows();

            Object[] row = new Object[11];

            StdExpo exportstd = new StdExpo();
            DefaultTableModel model2 = (DefaultTableModel) exportstd.expoStdInfoTbl.getModel();

            for (int i = 0; i < indexs.length; i++) {
                row[0] = model1.getValueAt(indexs[i], 0);

                row[1] = model1.getValueAt(indexs[i], 1);

                row[2] = model1.getValueAt(indexs[i], 2);

                row[3] = model1.getValueAt(indexs[i], 3);

                row[4] = model1.getValueAt(indexs[i], 4);

                row[5] = model1.getValueAt(indexs[i], 5);

                row[6] = model1.getValueAt(indexs[i], 6);

                row[7] = model1.getValueAt(indexs[i], 7);

                row[8] = model1.getValueAt(indexs[i], 8);

                row[9] = model1.getValueAt(indexs[i], 9);

                row[10] = model1.getValueAt(indexs[i], 10);

                model2.addRow(row);
            }

            exportstd.setVisible(true);
            exportstd.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }


    }//GEN-LAST:event_sendBtnStdInfoActionPerformed

    private void sendBtnAttnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnAttnInfoActionPerformed
        // TODO add your handling code here:
        int rCount = jTable1.getSelectedRowCount();

        if (rCount == 0) {
            JOptionPane.showMessageDialog(null, "Please Select one or more rows to export", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            attnSearchField.setText("");
            TableModel model1 = jTable1.getModel();

            int[] indexs = jTable1.getSelectedRows();

            Object[] row = new Object[7];

            StdAttnExpo exportstdAtn = new StdAttnExpo();
            DefaultTableModel model2 = (DefaultTableModel) exportstdAtn.stdAttnExpoTbl.getModel();

            for (int i = 0; i < indexs.length; i++) {
                row[0] = model1.getValueAt(indexs[i], 0);

                row[1] = model1.getValueAt(indexs[i], 1);

                row[2] = model1.getValueAt(indexs[i], 2);

                row[3] = model1.getValueAt(indexs[i], 3);

                row[4] = model1.getValueAt(indexs[i], 4);

                row[5] = model1.getValueAt(indexs[i], 5);

                row[6] = model1.getValueAt(indexs[i], 6);

                model2.addRow(row);
            }

            exportstdAtn.setVisible(true);
            exportstdAtn.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        }


    }//GEN-LAST:event_sendBtnAttnInfoActionPerformed

    private void attnSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attnSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attnSearchFieldActionPerformed

    private void pymtSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pymtSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pymtSearchFieldActionPerformed

    private void jTable2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable2FocusLost
        // TODO add your handling code here:        
    }//GEN-LAST:event_jTable2FocusLost

    private void attnSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_attnSearchFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_attnSearchFieldKeyTyped

    private void tchrSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tchrSearchFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tchrSearchFieldKeyTyped


    private void stdSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stdSearchFieldKeyTyped
        // TODO add your handling code here:        
    }//GEN-LAST:event_stdSearchFieldKeyTyped


    private void pymtSearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pymtSearchFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pymtSearchFieldKeyTyped

    private void onClick(JPanel panel) {
        panel.setBackground(new Color(48, 203, 220));
    }

    private void onLeaveClick(JPanel panel) {
        panel.setBackground(new Color(230, 244, 246));
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
            java.util.logging.Logger.getLogger(HomeWindowV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWindowV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWindowV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWindowV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindowV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attnFilterPnl;
    private javax.swing.JPanel attnInfo;
    private javax.swing.JTextField attnSearchField;
    private javax.swing.JPanel bgPnl;
    private javax.swing.JButton btnAttnInfoAll;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLout;
    private javax.swing.JButton btnPaymentInfoAll1;
    private javax.swing.JButton btnstdInfoAll;
    private javax.swing.JButton btntcherInfoAll;
    private javax.swing.JPanel ctrlPnl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton deleteBtn2;
    private javax.swing.JButton deleteBtn3;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JPanel logo;
    private javax.swing.JTabbedPane mainPnl;
    private javax.swing.JPanel pymntFilterPnl;
    private javax.swing.JPanel pymntInfo;
    private javax.swing.JTextField pymtSearchField;
    private javax.swing.JButton restBtn;
    private javax.swing.JButton restBtn1;
    private javax.swing.JButton restBtn2;
    private javax.swing.JButton restBtn3;
    private javax.swing.JButton sendBtnAttnInfo;
    private javax.swing.JButton sendBtnPymntInfo;
    private javax.swing.JButton sendBtnStdInfo;
    private javax.swing.JButton sendBtnTchrInfo;
    private javax.swing.JPanel stdAttenBtn;
    private javax.swing.JPanel stdFilterPnl;
    private javax.swing.JPanel stdInfo;
    private javax.swing.JTextField stdSearchField;
    private javax.swing.JPanel stdpymntformbtn;
    private javax.swing.JPanel stdregformbtn;
    private javax.swing.JPanel tcherFilterPnl;
    private javax.swing.JPanel tcherInfo;
    private javax.swing.JPanel tcherregFormBtn;
    private javax.swing.JTextField tchrSearchField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateBtn2;
    private javax.swing.JButton updateBtn3;
    // End of variables declaration//GEN-END:variables
}
