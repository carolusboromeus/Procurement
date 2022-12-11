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
public class clsStok extends clsKoneksi{
    //Mendeklarasikan variabel/atribut 
    String KodeB; 
    String KodeK; 
    String NamaB; 
    int HargaBeli;
    int HargaJual;
    int Stok;
	
    //Method menampilkan data 
    public void TampilData() 
    { 
	sql = "select tblStok.KodeB, tblStok.NamaB, tblStok.KodeK, tblkatagori.Katagori, tblStok.HargaBeli, tblStok.HargaJual, "
                + "tblStok.Stok, tblStok.Stok*tblStok.HargaBeli, tblStok.Stok*tblStok.HargaJual,"
                + "IF(tblStok.Stok<10,'Stok Kritis',IF(Stok>45,'Over Stok','Stok Aman')) as Keterangan from (tblStok LEFT JOIN tblkatagori ON tblStok.KodeK = tblkatagori.KodeK)"; 
    } 
	
    //Method baru 
    public void Baru() 
    { 
	try 
	{ 
            KodeB = ""; 
            KodeK = "";
            NamaB = ""; 
            HargaBeli = 0;
            HargaJual = 0;
            Stok = 0;
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method simpan data 
    public void Simpan() 
    { 
	try 
	{ 
            sql = "insert into tblStok values ('"+ KodeB +"', '" + NamaB + "', '" + KodeK + "', '" + HargaBeli + "', '" + HargaJual + "', '" + Stok + "')"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //method edit data 
    public void Edit() 
    { 
	try 
	{ 
            sql = "update tblstok set NamaB = '" + NamaB + "', HargaBeli = '" + HargaBeli + "', HargaJual = '" + HargaJual 
                    + "', KodeK = '" + KodeK + "' where KodeB ='" + KodeB + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method hapus data 
    public void Hapus(String mKodeDep) 
    { 
	try 
	{ 
            sql = "delete from tblstok where KodeB = '" + KodeB + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 
	
    //Method keluar 
    public void Keluar() 
    { 
	try 
	{ 
            JOptionPane.showMessageDialog(null,"Keluar dari form stok barang"); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    }
}
