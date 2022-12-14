//import komponen 
import java.awt.Dimension; 
import java.awt.Toolkit; 
import java.io.File; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import java.util.HashMap; 
import java.util.Map; 
import javax.swing.JOptionPane; 
import net.sf.jasperreports.engine.JasperCompileManager; 
import net.sf.jasperreports.engine.JasperFillManager; 
import net.sf.jasperreports.engine.JasperPrint; 
import net.sf.jasperreports.engine.JasperReport; 
import net.sf.jasperreports.engine.design.JasperDesign; 
import net.sf.jasperreports.engine.xml.JRXmlLoader; 
import net.sf.jasperreports.view.JasperViewer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest_2
 */
public class frmCetak extends javax.swing.JFrame {
    //Membuat objek 
    clsCetak objCetak = new clsCetak();
    /**
     * Creates new form frmCetak
     */
    public frmCetak() {
        initComponents();
        
        //Untuk mematikan tombol close 
	setDefaultCloseOperation(frmKatagori.DO_NOTHING_ON_CLOSE); 
		
	IsiComboKode1(); //mengisi combobox1 dengan Kode 
	IsiComboKode2(); //mengisi combobox2 dengan Kode
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboKode1 = new javax.swing.JComboBox<>();
        cboKode2 = new javax.swing.JComboBox<>();
        btnCetak = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        jLabel1.setText("Dari Kode     :");

        jLabel2.setText("s/d Kode       :");

        cboKode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboKode2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCetak.setBackground(new java.awt.Color(255, 51, 51));
        btnCetak.setText("Print");
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboKode1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboKode2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboKode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboKode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCetak)
                    .addComponent(btnKeluar))
                .addGap(0, 148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //Membuat posisi layar ditengah-tengah 
	Dimension posisi = Toolkit.getDefaultToolkit().getScreenSize(); 
	int x = (posisi.width - this.getWidth())/2; 
	int y = (posisi.height - this.getHeight())/2; 
	this.setLocation(x,y);
    }//GEN-LAST:event_formWindowActivated

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        try 
	{ 
            objCetak.Keluar(); 
            dispose(); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	}
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        //http://mrhandsblog.blogspot.co.id/2011/07/membuat-report-di-java-dengan-ireport.html 
	//http://readme.awardspace.com/ 
	JasperReport jasRep; 
	JasperPrint jasPri; 
	Map<String, Object> KodeB= new HashMap<>(); 
	JasperDesign jasDes; 
	try 
	{ 
            objCetak.AksesData(); 
            File report1=new File("src/rptStok.jrxml"); 
            jasDes=JRXmlLoader.load(report1); 
            KodeB.clear(); 
            objCetak.Kode1=cboKode1.getSelectedItem().toString().substring(0,8); 
            objCetak.Kode2=cboKode2.getSelectedItem().toString().substring(0,8); 
            KodeB.put("mKodeB",objCetak.Kode1); 
            KodeB.put("nKodeB",objCetak.Kode2); 
            jasRep=JasperCompileManager.compileReport(jasDes); 
            jasPri=JasperFillManager.fillReport(jasRep, KodeB, objCetak.conn); 
            JasperViewer.viewReport(jasPri, false); 
	}
	catch(Exception e)
	{ 
            JOptionPane.showMessageDialog(null, e.getMessage()); 
	}
    }//GEN-LAST:event_btnCetakActionPerformed

    public void IsiComboKode1() 
    { 
	try 
	{ 
            cboKode1.removeAllItems(); 
            objCetak.AksesData(); 
            String sql1 = "select KodeB,NamaB from tblStok"; 
            Statement stat1 = objCetak.conn.createStatement(); 
            ResultSet res1=stat1.executeQuery(sql1); 
            cboKode1.addItem("Pilih Kode"); 
            while(res1.next()) 
            { 
		cboKode1.addItem(res1.getString("KodeB") + " : " + res1.getString("NamaB")); 
            } 
        } 
        catch(Exception e) 
	{ 
	} 
    } 
	
    public void IsiComboKode2() 
    { 
        try 
	{ 
            cboKode2.removeAllItems(); 
            objCetak.AksesData(); 
            String sql1 = "select KodeB,NamaB from tblStok"; 
            Statement stat1 = objCetak.conn.createStatement(); 
            ResultSet res1=stat1.executeQuery(sql1); 
            cboKode2.addItem("Pilih Kode"); 
            while(res1.next()) 
            { 
		cboKode2.addItem(res1.getString("KodeB") + " : " + res1.getString("NamaB")); 
            } 
	} 
	catch(Exception e) 
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
            java.util.logging.Logger.getLogger(frmCetak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCetak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCetak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCetak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCetak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> cboKode1;
    private javax.swing.JComboBox<String> cboKode2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
