/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author hp
 */
public class FramePemesanan extends javax.swing.JFrame {
    private static Connection conn;
    
    public void connect() {
        try {
            // Register JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // URL koneksi ke database
            String url = "jdbc:mysql://localhost:3306/shoekroe";
            String username = "root";
            String password = "";
            
            // Membuat koneksi
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    Connection getConnection() {
        return conn; 
    }  
    
    /**
     * Creates new form FramePemesanan
     */
    
    public static String nama;
    public static String noTelp;
    public static String alamat;
    public static int jumSepatu;
    public static int harga;
    public static int index;
    public static String keterangan;
    public static String jenisJasa;
    public static String status;
    public static String tanggal;
    
    public FramePemesanan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cLeather = new javax.swing.JCheckBox();
        cEasy = new javax.swing.JCheckBox();
        cMedium = new javax.swing.JCheckBox();
        cHard = new javax.swing.JCheckBox();
        cRepaint = new javax.swing.JCheckBox();
        cRepair = new javax.swing.JCheckBox();
        tKeterangan = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tNotelp = new javax.swing.JTextField();
        tJumlah = new javax.swing.JTextField();
        tAlamat1 = new javax.swing.JTextField();
        bBack = new javax.swing.JButton();
        bBuatPesanan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Keterangan Sepatu : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 180, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jumlah Sepatu : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 140, -1));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nomor Telepon: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 180, 20));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nama : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 70, -1));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Alamat Lengkap : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 180, 30));

        buttonGroup1.add(cLeather);
        cLeather.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cLeather.setForeground(new java.awt.Color(0, 0, 0));
        cLeather.setText("Leather Shining");
        cLeather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLeatherActionPerformed(evt);
            }
        });
        getContentPane().add(cLeather, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 170, 30));

        cEasy.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cEasy);
        cEasy.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cEasy.setForeground(new java.awt.Color(0, 0, 0));
        cEasy.setText("Easy Wash");
        cEasy.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEasyActionPerformed(evt);
            }
        });
        getContentPane().add(cEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 120, 30));

        buttonGroup1.add(cMedium);
        cMedium.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cMedium.setForeground(new java.awt.Color(0, 0, 0));
        cMedium.setText("Medium Wash");
        cMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMediumActionPerformed(evt);
            }
        });
        getContentPane().add(cMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 150, 30));

        buttonGroup1.add(cHard);
        cHard.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cHard.setForeground(new java.awt.Color(0, 0, 0));
        cHard.setText("Hard Wash");
        getContentPane().add(cHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 140, 30));

        buttonGroup1.add(cRepaint);
        cRepaint.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cRepaint.setForeground(new java.awt.Color(0, 0, 0));
        cRepaint.setText("Repaint");
        cRepaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRepaintActionPerformed(evt);
            }
        });
        getContentPane().add(cRepaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 140, 30));

        buttonGroup1.add(cRepair);
        cRepair.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        cRepair.setForeground(new java.awt.Color(0, 0, 0));
        cRepair.setText("Repair");
        cRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRepairActionPerformed(evt);
            }
        });
        getContentPane().add(cRepair, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 140, 30));

        tKeterangan.setBackground(new java.awt.Color(255, 255, 255));
        tKeterangan.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tKeterangan.setBorder(null);
        tKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKeteranganActionPerformed(evt);
            }
        });
        getContentPane().add(tKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 860, 70));

        tNama.setBackground(new java.awt.Color(255, 255, 255));
        tNama.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tNama.setBorder(null);
        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });
        getContentPane().add(tNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 350, 20));

        tNotelp.setBackground(new java.awt.Color(255, 255, 255));
        tNotelp.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tNotelp.setBorder(null);
        tNotelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNotelpActionPerformed(evt);
            }
        });
        getContentPane().add(tNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 350, 30));

        tJumlah.setBackground(new java.awt.Color(255, 255, 255));
        tJumlah.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tJumlah.setBorder(null);
        tJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(tJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 110, 20));

        tAlamat1.setBackground(new java.awt.Color(255, 255, 255));
        tAlamat1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        tAlamat1.setBorder(null);
        tAlamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAlamat1ActionPerformed(evt);
            }
        });
        getContentPane().add(tAlamat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 400, 130));

        bBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_asset/tombolback (2).png"))); // NOI18N
        bBack.setBorder(null);
        bBack.setContentAreaFilled(false);
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 50, 50));

        bBuatPesanan.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        bBuatPesanan.setText("Buat Pesanan");
        bBuatPesanan.setBorder(null);
        bBuatPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuatPesananActionPerformed(evt);
            }
        });
        getContentPane().add(bBuatPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, 140, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_asset/Pesan2_.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void saveToDatabase(Connection conn) {
        try {
            // Query untuk menyimpan data ke tabel akun
            String query = "INSERT INTO " + FrameLogin.usernameLogin.concat("_db") +
                           "(invoice, nama, noTelp, alamat, jumSepatu, keterangan, jenisJasa, harga, status, tanggal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // Persiapan statement
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, String.valueOf(this.index + 1));
                preparedStatement.setString(2, this.nama);
                preparedStatement.setString(3, this.noTelp);
                preparedStatement.setString(4, this.alamat);
                preparedStatement.setInt(5, this.jumSepatu);
                preparedStatement.setString(6, this.keterangan);
                preparedStatement.setString(7, this.jenisJasa);
                preparedStatement.setInt(8, this.harga);
                preparedStatement.setString(9, this.status);
                preparedStatement.setString(10, this.tanggal);

                // Eksekusi query
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully!");
                } else {
                    System.out.println("Failed to insert data!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private String getDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        return formattedDate;
    }
    
    private int getIndex(Connection conn){
        int index = 0;

        try {
            String query = "SELECT COUNT(*) AS 'index' FROM " + FrameLogin.usernameLogin.concat("_db");

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Check if the result set has data
            if (resultSet.next()) {
                // Retrieve the count from the "row_count" column
                index = resultSet.getInt("index");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return index;
    }

    
    private void cMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMediumActionPerformed

    private void cLeatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLeatherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cLeatherActionPerformed

    private void cRepaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRepaintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRepaintActionPerformed

    private void cRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRepairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRepairActionPerformed

    private void tKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKeteranganActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void tNotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNotelpActionPerformed

    private void tJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJumlahActionPerformed

    private void tAlamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAlamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAlamat1ActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        FrameHome hm = new FrameHome();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_bBackActionPerformed

    private void bBuatPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuatPesananActionPerformed
        // TODO add your handling code here:

        boolean filled = true;
        
        if (tAlamat1.getText().isBlank() || tJumlah.getText().isBlank() || tNama.getText().isBlank() || tKeterangan.getText().isBlank() || tNotelp.getText().isBlank()) {
            JOptionPane.showMessageDialog(null,"Semua Field Harus diisi!");
            filled = false;
        }
        
        if(filled){
            if(cEasy.isSelected()){
                jenisJasa = "Easy Wash";
                harga = 50000;
            }
            if(cMedium.isSelected()){
                jenisJasa = "Medium Wash";
                harga = 75000;
            }
            if(cHard.isSelected()){
                jenisJasa = "Hard Wash";
                harga = 100000;
            }
            if(cLeather.isSelected()){
                jenisJasa = "Leather Shining";
                harga = 120000;
            }
            if(cRepair.isSelected()){
                jenisJasa = "Repair";
                harga = 250000;
            }
            if(cRepaint.isSelected()){
                jenisJasa = "Repaint";
                harga = 125000;
            }
            
            connect();
            int result = JOptionPane.showConfirmDialog(null, "Apakah pesanan sudah benar?", "Confirmation", JOptionPane.YES_NO_OPTION);

            // Check the user's choice
            if (result == JOptionPane.YES_OPTION) {
                alamat = tAlamat1.getText();
                jumSepatu = Integer.valueOf(tJumlah.getText());
                nama = tNama.getText();
                keterangan = tKeterangan.getText();
                noTelp = tNotelp.getText();
                harga *= jumSepatu;
                status = "Belum Bayar";
                tanggal = getDate();
                index = getIndex(getConnection()); 
                
                saveToDatabase(getConnection());
                disconnect();   

                FrameMetodePembayaranIsi pm = new FrameMetodePembayaranIsi();
                pm.setVisible(true);
                pm.pack();
                pm.setLocationRelativeTo(null);
                this.dispose();
            } else {
                System.out.println("Perhatikan isi dari pesanan!");
            }
        }    
    }//GEN-LAST:event_bBuatPesananActionPerformed

    private void cEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEasyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEasyActionPerformed

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
            java.util.logging.Logger.getLogger(FramePemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePemesanan().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bBuatPesanan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cEasy;
    private javax.swing.JCheckBox cHard;
    private javax.swing.JCheckBox cLeather;
    private javax.swing.JCheckBox cMedium;
    private javax.swing.JCheckBox cRepaint;
    private javax.swing.JCheckBox cRepair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tAlamat1;
    private javax.swing.JTextField tJumlah;
    private javax.swing.JTextField tKeterangan;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNotelp;
    // End of variables declaration//GEN-END:variables
}