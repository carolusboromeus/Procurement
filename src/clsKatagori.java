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
public class clsKatagori extends clsKoneksi{
    //mendeklararsikan variabel/atribut 
    String KodeK; 
    String Katagori; 

    //method menampilkan data 
    public void TampilData() 
    {    
		sql = "select * from tblkatagori"; 
    } 

    //method baru untuk menambah data 
    public void Baru(String mKodeK, String mKatagori) 
    { 
	try 
	{ 
            mKodeK = ""; 
            mKatagori = ""; 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method untuk menyimpan data 
    public void Simpan(String mKodeK, String mKatagori) 
    { 
        try 
        { 
            sql = "insert into tblKatagori values ('"+ mKodeK +"', '" + mKatagori + "')"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method untuk edit data 
    public void Edit(String mKodeK, String mKatagori) 
    { 
	try 
	{ 
            sql = "update tblkatagori set Katagori = '" + mKatagori + "'where KodeK ='" + mKodeK + "'"; 
	}
	catch (Exception e) 
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    } 

    //method hapus data 
    public void Hapus(String mKodeK) 
    { 
	try 
	{ 
            sql = "delete from tblkatagori where KodeK = '" + mKodeK + "'"; 
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
            JOptionPane.showMessageDialog(null,"Keluar dari form katagori"); 
	}
	catch (Exception e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage()); 
	} 
    }
}
