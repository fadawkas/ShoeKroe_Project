/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author hp
 */
public class FrameSignup extends javax.swing.JFrame {
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
     * Creates new form FrameSignup
     */
    public static String email;
    public static String username;
    public static String password;
    
    public FrameSignup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        bSignup = new javax.swing.JButton();
        txtPasswordSU2 = new javax.swing.JTextField();
        txtemailSU = new javax.swing.JTextField();
        txtUsernameSU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPasswordSU = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        bBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Re-Enter Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 210, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 210, 10));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 210, 10));

        bSignup.setBackground(new java.awt.Color(102, 102, 102));
        bSignup.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        bSignup.setForeground(new java.awt.Color(255, 255, 255));
        bSignup.setText("Sign Up");
        bSignup.setBorder(null);
        bSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignupActionPerformed(evt);
            }
        });
        getContentPane().add(bSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 80, 30));

        txtPasswordSU2.setBackground(new java.awt.Color(213, 213, 213));
        txtPasswordSU2.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordSU2.setBorder(null);
        txtPasswordSU2.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPasswordSU2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPasswordSU2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtPasswordSU2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPasswordSU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordSU2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasswordSU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 210, 20));

        txtemailSU.setBackground(new java.awt.Color(213, 213, 213));
        txtemailSU.setForeground(new java.awt.Color(0, 0, 0));
        txtemailSU.setBorder(null);
        txtemailSU.setCaretColor(new java.awt.Color(0, 0, 0));
        txtemailSU.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtemailSU.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtemailSU.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtemailSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailSUActionPerformed(evt);
            }
        });
        getContentPane().add(txtemailSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 210, 20));

        txtUsernameSU.setBackground(new java.awt.Color(213, 213, 213));
        txtUsernameSU.setForeground(new java.awt.Color(0, 0, 0));
        txtUsernameSU.setBorder(null);
        txtUsernameSU.setCaretColor(new java.awt.Color(0, 0, 0));
        txtUsernameSU.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsernameSU.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtUsernameSU.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsernameSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameSUActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsernameSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 210, 20));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        txtPasswordSU.setBackground(new java.awt.Color(213, 213, 213));
        txtPasswordSU.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordSU.setBorder(null);
        txtPasswordSU.setCaretColor(new java.awt.Color(0, 0, 0));
        txtPasswordSU.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPasswordSU.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtPasswordSU.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPasswordSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordSUActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasswordSU, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 210, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 210, 10));

        bBack.setBackground(new java.awt.Color(102, 102, 102));
        bBack.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        bBack.setForeground(new java.awt.Color(255, 255, 255));
        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        getContentPane().add(bBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_component_asset/Sign Up.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveToDatabase(Connection conn) {
        try {
            // Query untuk menyimpan data ke tabel akun
            String query = "INSERT INTO akun (email, username, password) VALUES (?, ?, ?)";

            // Persiapan statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.email);
            preparedStatement.setString(2, this.username);
            preparedStatement.setString(3, this.password);

            // Eksekusi query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void newAkun(Connection conn) {
        try {
            // Query untuk menyimpan data ke tabel akunF
            String tableName = this.username.concat("_db");
            String query = "CREATE TABLE " + tableName + " (invoice varchar(30), nama varchar(30), noTelp varchar(13), alamat varchar(100), jumSepatu int(2), keterangan varchar(300), jenisJasa varchar(15), harga int(8), status varchar(15), tanggal varchar(11))";

            // Persiapan statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            // Eksekusi query
            int rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void newRating(Connection conn) {
        try {
            // Query untuk menyimpan data ke tabel akun
            String query = "INSERT INTO rating (username) VALUES (?)";

            // Persiapan statement
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, this.username);


            // Eksekusi query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    private void bSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignupActionPerformed
        // TODO add your handling code here:
        
        boolean filled = true;
        
        if(txtUsernameSU.getText().isBlank() || txtPasswordSU.getText().isBlank()|| txtemailSU.getText().isBlank() || txtPasswordSU2.getText().isBlank()){
            JOptionPane.showMessageDialog(null,"Semua Field Harus diisi!");
            filled = false;
        }
        else if(txtPasswordSU2.getText().equals(txtPasswordSU.getText()) && filled){
                email = txtemailSU.getText();
                username = txtUsernameSU.getText();
                password = txtPasswordSU.getText();

                FrameLogin lg = new FrameLogin();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                this.dispose();  
                
                connect();
                saveToDatabase(getConnection());
                newAkun(getConnection());
                newRating(getConnection());
                disconnect();
        }
        else{
                JOptionPane.showMessageDialog(null,"Password tidak sesuai");
        }
        
        
    }//GEN-LAST:event_bSignupActionPerformed

    private void txtPasswordSU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordSU2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordSU2ActionPerformed

    private void txtemailSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailSUActionPerformed

    private void txtUsernameSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameSUActionPerformed

    private void txtPasswordSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordSUActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        FrameLogin lg = new FrameLogin();
                lg.setVisible(true);
                lg.pack();
                lg.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_bBackActionPerformed

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
            java.util.logging.Logger.getLogger(FrameSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtPasswordSU;
    private javax.swing.JTextField txtPasswordSU2;
    private javax.swing.JTextField txtUsernameSU;
    private javax.swing.JTextField txtemailSU;
    // End of variables declaration//GEN-END:variables
    
}
