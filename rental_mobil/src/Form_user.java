import Database.KoneksiDatabase;
import Database.ResultSetTable;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Form_user extends javax.swing.JInternalFrame {
    
    ResultSet rs;
    KoneksiDatabase con;
    /**
     * Creates new form Form_user
     */
    public Form_user() {
        
        con =new KoneksiDatabase(new Database.Parameter().HOST_DB,new Database.Parameter().USERNAME_DB,new Database.Parameter().PASSWORD_DB);
        initComponents();
        loadTabel(); 
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();
        panelGlass6 = new usu.widget.glass.PanelGlass();
        txt_search_user = new javax.swing.JTextField();
        btn_search_user = new usu.widget.ButtonGlass();
        btn_create_user = new usu.widget.ButtonGlass();
        btn_Edit_user = new usu.widget.ButtonGlass();
        btn_Delete_user = new usu.widget.ButtonGlass();
        btn_Refresh_user = new usu.widget.ButtonGlass();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        txt_username_user = new javax.swing.JTextField();
        txt_nama_user = new javax.swing.JTextField();
        txt_password_user = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Username", "Type"
            }
        ));
        tabel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_userMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_user);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 940, 210));

        btn_search_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_lense.png"))); // NOI18N
        btn_search_user.setRoundRect(true);
        btn_search_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass6Layout = new javax.swing.GroupLayout(panelGlass6);
        panelGlass6.setLayout(panelGlass6Layout);
        panelGlass6Layout.setHorizontalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txt_search_user, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGlass6Layout.setVerticalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelGlass6Layout.createSequentialGroup()
                .addComponent(btn_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 640, 40));

        btn_create_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_create_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btn_create_user.setText("Create");
        btn_create_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create_userActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 190, -1));

        btn_Edit_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_Edit_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil_edit.png"))); // NOI18N
        btn_Edit_user.setText("Edit");
        btn_Edit_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edit_userActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Edit_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 190, -1));

        btn_Delete_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash_box.png"))); // NOI18N
        btn_Delete_user.setText("Delete");
        btn_Delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete_userActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 190, -1));

        btn_Refresh_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_Refresh_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh.png"))); // NOI18N
        btn_Refresh_user.setText("Refresh");
        btn_Refresh_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Refresh_userActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Refresh_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 190, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama              :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username     :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password     :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type               :");

        cb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Staff" }));
        cb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_typeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user_tambah_icon.png"))); // NOI18N

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txt_password_user))
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_username_user))
                        .addGroup(panelGlass1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_username_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(panelGlass1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(panelGlass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 940, 260));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Form Tambah User");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/backOk.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Edit_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edit_userActionPerformed
     try {
           if( !txt_nama_user.getText().isEmpty() && !txt_username_user.getText().isEmpty() && !txt_password_user.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama_user.getText(),txt_username_user.getText(),txt_password_user.getText(),cb_type.getSelectedItem().toString()};
                
                con.queryUpdate("user", kolom, isi,"id_user='"+String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0))+"'");
                JOptionPane.showMessageDialog(this, "Data Berhasil Diedit");
            }else{
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error edit data");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Edit_userActionPerformed

    private void btn_create_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create_userActionPerformed
      create();
    }//GEN-LAST:event_btn_create_userActionPerformed

    private void tabel_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_userMouseClicked
        txt_nama_user.setText(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),1)));
        txt_username_user.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),2)));
        txt_password_user.setText(String.valueOf( tabel_user.getValueAt(tabel_user.getSelectedRow(),3)));
       cb_type.setSelectedItem(String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),4)));
    }//GEN-LAST:event_tabel_userMouseClicked

    private void btn_Delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete_userActionPerformed
        try {
            String id=String.valueOf(tabel_user.getValueAt(tabel_user.getSelectedRow(),0));
                if (JOptionPane.showConfirmDialog(this, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            con.queryDelete("user","id_user="+id);

            }else{
                return;
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pilih id terlebih dahulu");
        }
        loadTabel();
        clear();
    }//GEN-LAST:event_btn_Delete_userActionPerformed

    private void btn_Refresh_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Refresh_userActionPerformed
         loadTabel();
    }//GEN-LAST:event_btn_Refresh_userActionPerformed

    private void btn_search_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_userActionPerformed
        if(txt_search_user.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Isikan data pencarian");
        }else{
            try {
                 String kolom[] = {"nama","username","type"};
                rs=con.querySelect(kolom ,"user", "nama LIKE '%"+txt_search_user.getText()+"%' OR type LIKE '%"+txt_search_user.getText()+"%'");
                tabel_user.setModel(new Database.ResultSetTable(rs));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Pencarian Error");
            }
        }
        clear();
    }//GEN-LAST:event_btn_search_userActionPerformed

    private void cb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_typeActionPerformed

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
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form_user().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_Delete_user;
    private usu.widget.ButtonGlass btn_Edit_user;
    private usu.widget.ButtonGlass btn_Refresh_user;
    private usu.widget.ButtonGlass btn_create_user;
    private usu.widget.ButtonGlass btn_search_user;
    private javax.swing.JComboBox cb_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass6;
    private javax.swing.JTable tabel_user;
    private javax.swing.JTextField txt_nama_user;
    private javax.swing.JPasswordField txt_password_user;
    private javax.swing.JTextField txt_search_user;
    private javax.swing.JTextField txt_username_user;
    // End of variables declaration//GEN-END:variables

    private void loadTabel() {
       String namaKolom[] = {"id_user","nama","username","type"};
        rs=con.querySelect(namaKolom,"user");
        tabel_user.setModel(new ResultSetTable(rs));
       clear();
    }

    private void create() {
        try {
 
            if( !txt_nama_user.getText().isEmpty() && !txt_username_user.getText().isEmpty() && !txt_password_user.getText().isEmpty()){
                String kolom[] = {"nama","username","password","type"};
                String isi[] = { txt_nama_user.getText(),txt_username_user.getText(),txt_password_user.getText(),cb_type.getSelectedItem().toString()};
                
                System.out.println( con.queryInsert("user",kolom,isi));
               
                JOptionPane.showMessageDialog(this, "User Berhasil ditambahkan");
            }else{
                JOptionPane.showMessageDialog(this, "Data User Masih ada yang Kosong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error input data");
             System.out.println("salah");
        }
        loadTabel();
        clear();
    }

    private void clear() {
        txt_nama_user.setText("");
        txt_username_user.setText("");
        cb_type.setSelectedItem("Admin");
        txt_password_user.setText("");
       
    }
}
