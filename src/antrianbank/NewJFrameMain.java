package antrianbank;

import sun.audio.*;
import javax.swing.*;
import java.io.*;
import java.sql.ResultSet;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrameMain extends javax.swing.JFrame {

    static int noJml;
    static int noAntriA = 0;
    static int noAntriB = 0;

    static BinaryTree list = new BinaryTree();

    public NewJFrameMain() {
        initComponents();
        selectDataA();
        selectDataB();
    }

    private String getTime() {
        DateFormat dt = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date();
        return dt.format(date);
    }

    public void selectDataA() {
        String kolom[] = {"No Antrian", "Jam", "Keterangan"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT jml_antri, jam, ket FROM antrian";
        ResultSet rs = Koneksi.executeQuery(SQL);
        try {
            while (rs.next()) {
                String jmlAntri = rs.getString(1);
                String tgl = rs.getString(2);
                String ket = rs.getString(3);

                String data[] = {jmlAntri, tgl, ket};
                dtm.addRow(data);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
        }
        tableAntrian.setModel(dtm);
    }

    public void selectDataB() {
        String kolom[] = {"No Antrian", "Jam", "Keterangan"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT jml_antri, jam, ket FROM antrianb";
        ResultSet rs = Koneksi.executeQuery(SQL);
        try {
            while (rs.next()) {
                String jmlAntri = rs.getString(1);
                String tgl = rs.getString(2);
                String ket = rs.getString(3);

                String data[] = {jmlAntri, tgl, ket};
                dtm.addRow(data);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, e);
        }
        tableAntrian1.setModel(dtm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAntrianA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAntrianB2 = new javax.swing.JLabel();
        txtAntrianB4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAntrian = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtAntrianB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAntrianB1 = new javax.swing.JLabel();
        txtAntrianB3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAntrian1 = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnRepeat = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnRepeat1 = new javax.swing.JButton();
        btnReset1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNext2 = new javax.swing.JButton();
        btnNext3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 204, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAntrianA.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianA.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMOR ANTRIAN TELLER");

        txtAntrianB2.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianB2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianB2.setText("0");

        txtAntrianB4.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianB4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianB4.setText("A");

        tableAntrian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Antrian", "Jam", "Keterangan"
            }
        ));
        jScrollPane1.setViewportView(tableAntrian);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(txtAntrianB2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAntrianA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAntrianB4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAntrianA, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAntrianB2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAntrianB4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAntrianB.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianB.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOMOR ANTRIAN CUSTOMER SERVICE");

        txtAntrianB1.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianB1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianB1.setText("B");

        txtAntrianB3.setFont(new java.awt.Font("Tahoma", 1, 118)); // NOI18N
        txtAntrianB3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAntrianB3.setText("0");

        tableAntrian1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No Antrian", "Jam", "Keterangan"
            }
        ));
        jScrollPane2.setViewportView(tableAntrian1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAntrianB3)
                .addGap(18, 18, 18)
                .addComponent(txtAntrianB)
                .addGap(18, 18, 18)
                .addComponent(txtAntrianB1)
                .addGap(72, 72, 72))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAntrianB3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAntrianB, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAntrianB1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnRepeat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRepeat.setText("Panggil");
        btnRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepeatActionPerformed(evt);
            }
        });

        btnNext1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext1.setText("Cetak");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setText("Cetak");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnRepeat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRepeat1.setText("Panggil");
        btnRepeat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepeat1ActionPerformed(evt);
            }
        });

        btnReset1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset1.setText("RESET");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianbank/i.jpg"))); // NOI18N

        btnNext2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext2.setText("Bantuan");
        btnNext2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext2ActionPerformed(evt);
            }
        });

        btnNext3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext3.setText("Bantuan");
        btnNext3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNext3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNext1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRepeat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnNext3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(btnRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(btnRepeat1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        noAntriA = noAntriA + 1;
        list.push(new BinaryTreeNode(noAntriA));
        list.print();
        txtAntrianA.setText(String.valueOf(noAntriA));

        String ket;

        String SQL = "INSERT INTO antrian(jml_antri,jam,ket)"
                + "VALUES" + "('" + "0" + txtAntrianA.getText() + "A" + "'," + "'" + getTime() + "'," + "'" + "Teller" + "')";
        int status = Koneksi.execute(SQL);
        if (status == 1) {
            selectDataA();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            selectDataA();
        }
        InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\h\\5.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        noAntriA = 0;
        txtAntrianA.setText(String.valueOf(noAntriA));
        list.resetdata();
        System.out.print("semua element terhapus");
        list.print();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepeatActionPerformed
        if (noAntriA == 1) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\a.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 2) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\3.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 3) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\4.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 4) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\5.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 5) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\6.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 6) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\7.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 7) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\8.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 8) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\9.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 9) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\10.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 10) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\11.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 11) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\12.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 12) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\13.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 13) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\14.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 14) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\15.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 15) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\16.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 16) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\17.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 17) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\18.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 18) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\19.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 19) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\20.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriA == 20) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\aa\\21.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_btnRepeatActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        noAntriB = noAntriB + 1;
        list.push(new BinaryTreeNode(noAntriB));
        list.print();
        txtAntrianB.setText(String.valueOf(noAntriB));

        String ket;

        String SQL = "INSERT INTO antrianb(jml_antri,jam,ket)"
                + "VALUES" + "('" + "0" + txtAntrianB.getText() + "B" + "'," + "'" + getTime() + "'," + "'" + "Customer Service" + "')";
        int status = Koneksi.execute(SQL);
        if (status == 1) {
            selectDataB();
        } else {
            JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            selectDataB();
        }
        InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\h\\6.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        noAntriB = 0;
        txtAntrianB.setText(String.valueOf(noAntriB));
        list.resetdata();
        System.out.print("semua element terhapus");
        list.print();
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void btnRepeat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepeat1ActionPerformed

        if (noAntriB == 1) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\a.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 2) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\2.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 3) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\3.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 4) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\4.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 5) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\5.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 6) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\6.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 7) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\7.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 8) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\8.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 9) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\9.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 10) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\10.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 11) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\11.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 12) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\12.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 13) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\13.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 14) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\14.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 15) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\15.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 16) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\16.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 17) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\17.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 18) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\18.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 19) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\19.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
        if (noAntriB == 20) {

            InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\20.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_btnRepeat1ActionPerformed

    private void btnNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext2ActionPerformed
        InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\h\\1.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }// TODO add your handling code here:
    }//GEN-LAST:event_btnNext2ActionPerformed

    private void btnNext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext3ActionPerformed
       InputStream in;
            try {
                in = new FileInputStream(new File("C:\\Users\\User\\Music\\bb\\h\\2.wav"));
                AudioStream audios = new AudioStream(in);
                AudioPlayer.player.start(audios);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } // TODO add your handling code here:
    }//GEN-LAST:event_btnNext3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnNext2;
    private javax.swing.JButton btnNext3;
    private javax.swing.JButton btnRepeat;
    private javax.swing.JButton btnRepeat1;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAntrian;
    private javax.swing.JTable tableAntrian1;
    private javax.swing.JLabel txtAntrianA;
    private javax.swing.JLabel txtAntrianB;
    private javax.swing.JLabel txtAntrianB1;
    private javax.swing.JLabel txtAntrianB2;
    private javax.swing.JLabel txtAntrianB3;
    private javax.swing.JLabel txtAntrianB4;
    // End of variables declaration//GEN-END:variables

}
