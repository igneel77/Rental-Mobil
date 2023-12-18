
import Database.KoneksiDatabase;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Form_Peminjam extends javax.swing.JInternalFrame {
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form Form_Peminjam
     */
    public Form_Peminjam() {
         con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
      
        initComponents();
  
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass2 = new usu.widget.glass.PanelGlass();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nik_peminjam = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txt_email_peminjam = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_tlp_peminjam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        btn_next = new usu.widget.ButtonGlass();
        btn_erase = new usu.widget.ButtonGlass();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_nama_peminjam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat   *");
        panelGlass2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 100, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(":");
        panelGlass2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 14, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(":");
        panelGlass2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 14, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIK        *");
        panelGlass2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, -1));
        panelGlass2.add(txt_nik_peminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 297, 36));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("No. Tlp  *");
        panelGlass2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(":");
        panelGlass2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 16, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Email     *");
        panelGlass2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 100, -1));
        panelGlass2.add(txt_email_peminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 291, 295, 36));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText(":");
        panelGlass2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 16, -1));

        txt_tlp_peminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tlp_peminjamActionPerformed(evt);
            }
        });
        panelGlass2.add(txt_tlp_peminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 243, 297, 37));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* Harus di isi");
        panelGlass2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 338, -1, -1));

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        panelGlass2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 297, 50));

        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/arrow_right.png"))); // NOI18N
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 370, -1, -1));

        btn_erase.setForeground(new java.awt.Color(255, 255, 255));
        btn_erase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/File.png"))); // NOI18N
        btn_erase.setText("Clear All");
        btn_erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eraseActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_erase, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 370, 110, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Peminjam");
        panelGlass2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 42, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        panelGlass2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 32, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama     *");
        panelGlass2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(":");
        panelGlass2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 14, -1));

        txt_nama_peminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_peminjamActionPerformed(evt);
            }
        });
        panelGlass2.add(txt_nama_peminjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 297, 36));

        getContentPane().add(panelGlass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 940, 480));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Form Peminjaman Mobil");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backOk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
      
        if (txt_nik_peminjam.getText().isEmpty() || txt_alamat.getText().isEmpty() || txt_tlp_peminjam.getText().isEmpty ()|| txt_email_peminjam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
        } else {
            String nama = txt_nama_peminjam.getText();
            String nik = txt_nik_peminjam.getText();
            String alamat = txt_alamat.getText();
            String tlp = txt_tlp_peminjam.getText();
            String email = txt_email_peminjam.getText();
            Home.jDesktopPane1.removeAll();
            Home.jDesktopPane1.repaint();
            Form_Transaksi fm = new Form_Transaksi(nama, nik, alamat, tlp, email);

            fm.setVisible(true);
            Home.jDesktopPane1.add(fm);
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eraseActionPerformed
      txt_nik_peminjam.setText("");
      txt_alamat.setText("");
      txt_tlp_peminjam.setText("");
      txt_email_peminjam.setText("");
    }//GEN-LAST:event_btn_eraseActionPerformed

    private void txt_nama_peminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_peminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_peminjamActionPerformed

    private void txt_tlp_peminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tlp_peminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tlp_peminjamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_Peminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Peminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Peminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Peminjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form_Peminjam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_erase;
    private usu.widget.ButtonGlass btn_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_email_peminjam;
    private javax.swing.JTextField txt_nama_peminjam;
    private javax.swing.JTextField txt_nik_peminjam;
    private javax.swing.JTextField txt_tlp_peminjam;
    // End of variables declaration//GEN-END:variables

  
    
}
