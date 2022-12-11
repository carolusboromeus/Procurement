//import komponen 
import java.awt.Dimension; 
import java.awt.Toolkit; 
import java.awt.event.KeyEvent; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 
import javax.swing.table.TableColumn;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest_2
 */
public class frmKatagori extends javax.swing.JFrame {
    //Membuat objek dari kelas clsDepartemen 
    clsKatagori objK = new clsKatagori(); 
	
    //Mendekalarasikan variabel 
    private TableColumn column;

    /**
     * Creates new form frmKatagori
     */
    public frmKatagori() {
        initComponents();
        
        //Untuk mematikan tombol close 
	setDefaultCloseOperation(frmKatagori.DO_NOTHING_ON_CLOSE); 
	
	objK.AksesData(); //koneksi ke database 
	IsiTabel(); //mengisi jTable dgn data
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtKatagori = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabel = new javax.swing.JTable();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Kode Katagori :");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel2.setText("Katagori            :");

        txtKode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKodeKeyTyped(evt);
            }
        });

        txtKatagori.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKatagoriKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKatagoriKeyTyped(evt);
            }
        });

        jTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Kode Katagori", "Katagori"
            }
        ));
        jTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabel);

        btnBaru.setBackground(new java.awt.Color(255, 51, 51));
        btnBaru.setText("New");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(255, 51, 51));
        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        btnSimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSimpanKeyPressed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 51, 51));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 51, 51));
        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnKeluar.setText("Close");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtKatagori, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnKeluar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKatagori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        // TODO add your handling code here:
        try 
	{ 
            BersihIsian(); 
            IsiTabel(); 
            txtKode.requestFocus(); 
	} 
	catch (Exception e) 
	{ 
	}
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        try 
	{ 
            objK.Keluar(); 
            dispose(); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	}
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        //Panggil prosesdur simpan data 
	SimpanData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtKode.getText().equals("")||txtKatagori.getText().equals(""))
	{
            JOptionPane.showMessageDialog(null,"Masukkan katagori");
	}
	else
	{
            try
            {
		objK.AksesData();
		objK.KodeK  =  txtKode.getText();
		objK.Katagori  =  txtKatagori.getText();
		objK.Edit(objK.KodeK,  objK.Katagori);
		objK.res.executeUpdate(objK.sql);
		objK.conn.close();
		BersihIsian();
		IsiTabel();
		JOptionPane.showMessageDialog(null,"Data  berhasil  diupdate");
            }
            catch (Exception e) 
            { 
		JOptionPane.showMessageDialog(null,"Proses penyimpanan gagal/ koneksi gagal"); 
		System.out.println(e.getMessage()); 
            }
	}
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try
	{
            objK.AksesData();
            objK.KodeK  =  txtKode.getText();
            objK.Hapus(objK.KodeK);
            objK.res.executeUpdate(objK.sql);
            objK.conn.close();
            IsiTabel();
            BersihIsian();
            JOptionPane.showMessageDialog(null,"Data  berhasil  dihapus");
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Proses penghapusan gagal/ koneksi gagal"); 
            System.out.println(e.getMessage()); 
	}
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelMouseClicked
        // TODO add your handling code here:
        int  baris  =  jTabel.getSelectedRow();
	String  kolom1  =  jTabel.getValueAt(baris,  0).toString();
	String  kolom2  =  jTabel.getValueAt(baris,  1).toString();
	txtKode.setText(kolom1);
	txtKatagori.setText(kolom2);
    }//GEN-LAST:event_jTabelMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //menampilkan  form  ditengah-tengah  layar
	Dimension  posisi  =  Toolkit.getDefaultToolkit().getScreenSize();
	int  x  =  (posisi.width  -  this.getWidth())/2;
	int  y  =  (posisi.height  -  this.getHeight())/2;
	this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void txtKodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeKeyTyped
        // TODO add your handling code here:
        //untuk  membatasi  3  karakter
	if  (txtKode.getText().length()  >  2)
	evt.consume();
    }//GEN-LAST:event_txtKodeKeyTyped

    private void txtKodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) 
	{ 
            if ((txtKode.getText().length() < 3) || (txtKode.getText().isEmpty())) 
            { 
		JOptionPane.showMessageDialog(this, "Panjang kode harus 3 digit","Informasi", 
		JOptionPane.INFORMATION_MESSAGE); 
		txtKode.requestFocus(); 
            } 
            else 
            { 
		txtKatagori.requestFocus(); 
            } 
	}
    }//GEN-LAST:event_txtKodeKeyPressed

    private void txtKatagoriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKatagoriKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) 
	{ 
            if (txtKatagori.getText().isEmpty()) 
            { 
                JOptionPane.showMessageDialog(this, "Masukkan nama katagori","Informasi", 
		JOptionPane.INFORMATION_MESSAGE); 
		txtKatagori.requestFocus(); 
            } 
            else 
            { 
		btnSimpan.requestFocus(); 
            } 
	}
    }//GEN-LAST:event_txtKatagoriKeyPressed

    private void txtKatagoriKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKatagoriKeyTyped
        // TODO add your handling code here:
        //untuk  membatasi  30  karakter
	if  (txtKatagori.getText().length()  >  29)
	evt.consume();
    }//GEN-LAST:event_txtKatagoriKeyTyped

    private void btnSimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSimpanKeyPressed
        // TODO add your handling code here:
        //Memanggil  prosedur  simpand  data
	SimpanData();
    }//GEN-LAST:event_btnSimpanKeyPressed

    private  void  SimpanData()
    {
	if(txtKode.getText().equals("")||txtKatagori.getText().equals(""))
	{
            JOptionPane.showMessageDialog(null,"Data harus diisi semua");
	}
	else
	{
            try
            {
		objK.AksesData();
		objK.KodeK  =  txtKode.getText();
		objK.Katagori  =  txtKatagori.getText();
		objK.Simpan(objK.KodeK,  objK.Katagori);
		objK.res.executeUpdate(objK.sql);
		objK.conn.close();
		BersihIsian();
		IsiTabel();
		JOptionPane.showMessageDialog(null,"Data berhasil disimpan");
            }
            catch (Exception e) 
            { 
		JOptionPane.showMessageDialog(null,"Proses penyimpanan gagal/koneksi gagal"); 
		System.out.println(e.getMessage()); 
            } 
	} 
    }
    
    //Prosedur membersihkan isian data 
    public void BersihIsian() 
    { 
	txtKode.setText(""); 
	txtKatagori.setText(""); 
	txtKode.requestFocus(); 
    } 

    //Prosedur mengatur kolom jTable 
    private void AturKolom() 
    { 
	jTabel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
	column = jTabel.getColumnModel().getColumn(0); 
	column.setPreferredWidth(80); 
	column = jTabel.getColumnModel().getColumn(1); 
	column.setPreferredWidth(320); 
    } 

    //Prosedur menampilkan data ke jTable 
    private void IsiTabel() 
    { 
	DefaultTableModel tabelmapel = new DefaultTableModel(); 
	
	tabelmapel.addColumn("Kode Katagori"); 
	tabelmapel.addColumn("Katagori"); 
	try 
	{ 
            objK.AksesData(); 
            objK.TampilData(); 
		
            Statement stat1 = objK.conn.createStatement(); 
            ResultSet res1=stat1.executeQuery(objK.sql); 
            while (res1.next()) 
            { 
		tabelmapel.addRow(new Object[]{res1.getString(1),res1.getString(2)}); 
            } 
            jTabel.setModel(tabelmapel); 
            AturKolom(); //atur kolom jTable 
        } 
        catch (Exception e) 
	{ 
	} 
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
            java.util.logging.Logger.getLogger(frmKatagori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKatagori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKatagori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKatagori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKatagori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabel;
    private javax.swing.JTextField txtKatagori;
    private javax.swing.JTextField txtKode;
    // End of variables declaration//GEN-END:variables
}
