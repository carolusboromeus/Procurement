//import komponen 
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest_2
 */
public class clsCetak extends clsKoneksi{
    String Kode1; 
    String Kode2; 
	
    //Method cetak data 
    public void Cetak(String mKode1, String mKode2) 
    { 
	try 
	{ 
            Kode1 = mKode1; 
            Kode2 = mKode2; 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //method keluar 
    public void Keluar() 
    { 
	try 
	{ 
            JOptionPane.showMessageDialog(null,"Keluar dari form cetak data"); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    }
}
