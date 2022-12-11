import java.awt.Dimension; 
import java.awt.Toolkit;
import java.awt.event.KeyEvent; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import javax.swing.JFrame; 
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {    
    clsLogin objLogin = new clsLogin();
    public frmLogin() {
        initComponents();
        
        setDefaultCloseOperation(frmKatagori.DO_NOTHING_ON_CLOSE);
        objLogin.AksesData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nama = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Nama.setText("Nama        :");

        Password.setText("Password :");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        btnKeluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnKeluarKeyPressed(evt);
            }
        });

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNamaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(Nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnKeluar))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
	try
	{
            objLogin.AksesData(); 
            objLogin.mNama = Nama.getText(); 
            objLogin.mKataKunci = Password.getText(); 
            objLogin.Masuk(); 
            objLogin.sql = "select * from tblpengguna where Nama = '" + Nama.getText()+ "' and KataKunci = '" + Password.getText()+ "'"; 
            Statement stat = objLogin.conn.createStatement(); 
            ResultSet res=stat.executeQuery(objLogin.sql); 
            res.last(); 
            int i = res.getRow(); 
            if (i>0)
            {
		frmMenuUtama utama = new frmMenuUtama(); 
		utama.show();
		utama.dispose();
		Nama.setText(""); 
		Password.setText(""); 
            }	 
            else if (i==0)
            {
		JOptionPane.showMessageDialog(null,"Masukkan nama pengguna & password dengan benar"); 
		System.out.println();
            } 
            stat.close();
            dispose(); 
            //membuat tampilan menu utama full screen 
            frmMenuUtama menu = new frmMenuUtama(); 
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            menu.setVisible(true);
	}
	catch (Exception e)
        { 
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        try 
	{ 
            objLogin.Keluar(); 
            dispose(); 
        }
        catch (Exception e)
        { 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	}
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
        if (txtNama.getText().length() > 29) 
	evt.consume();
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txtNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) 
	{
            if (txtNama.getText().isEmpty()) 
            { 
		JOptionPane.showMessageDialog(this, "Masukkan nama pengguna","Informasi", 
		JOptionPane.INFORMATION_MESSAGE); 
		txtNama.requestFocus(); 
            } 
            else 
            { 
		txtPassword.requestFocus(); 
            } 
	}
    }//GEN-LAST:event_txtNamaKeyPressed

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
	if (txtPassword.getText().length() > 29) 
	evt.consume();
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()== KeyEvent.VK_ENTER) 
	{ 
            if (txtPassword.getText().isEmpty()) 
            { 
		JOptionPane.showMessageDialog(this, "Masukkan password","Informasi", 
		JOptionPane.INFORMATION_MESSAGE); 
		txtPassword.requestFocus(); 
            } 
            else 
            { 
                btnLogin.requestFocus(); 
            } 
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnKeluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnKeluarKeyPressed
        // TODO add your handling code here:
        dispose(); 
    }//GEN-LAST:event_btnKeluarKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize(); 
	int x = (posisi.width - this.getWidth())/2; 
	int y = (posisi.height - this.getHeight())/2; 
	this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama;
    private javax.swing.JLabel Password;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
