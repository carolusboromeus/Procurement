//import  komponen
import  javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest_2
 */
public class clsPengguna extends clsKoneksi{
    //Mendeklarasikan  variabel/atribut 
    String  IdPengguna;
    String  Nama; 
    String  KataKunci;

    //Methood  menampilkan  data 
    public  void  TampilData()
    {
	sql  =  "select  *  from  tblpengguna";
    }

    //Method  baru 
    public  void  Baru()
    {
	try
	{
            IdPengguna  =  ""; 
            Nama = ""; 
            KataKunci  =  "";
	}
	catch  (Exception  e)
	{ 
            JOptionPane.showMessageDialog(null,"Terjadi  kesalahan");
            System.out.println(e.getMessage());
	}
    }

    //Method  simpan  data
    public  void  Simpan()
    {
	try
	{
            sql  =  "insert  into  tblpengguna  values  ('"+ IdPengguna + "', '" + Nama + "', '" + KataKunci + "'  )";
	}
	catch  (Exception  e)
	{
            JOptionPane.showMessageDialog(null,"Terjadi  kesalahan");
            System.out.println(e.getMessage());
	}
    }
	
    public  void  Edit()
    {
	try
	{
            sql  =  "update  tblpengguna  set  Nama  =  '"  +  Nama  +  "',  KataKunci  =  '"  +  KataKunci +  "'  where  NIK  ='"  +  IdPengguna  +  "'";
	}
	catch  (Exception  e)
	{
            JOptionPane.showMessageDialog(null,"Terjadi  kesalahan");
            System.out.println(e.getMessage());
	}
    }
	
    //Method  hapus  data
    public  void  Hapus()
    {
	try
	{
            sql  =  "delete  from  tblpengguna  where  NIK  =  '"  +  IdPengguna  +  "'";
	}
	catch  (Exception  e)
	{
            JOptionPane.showMessageDialog(null,"Terjadi  kesalahan");
            System.out.println(e.getMessage());
	}
    }
	
    //Menthod  keluar
    public  void  Keluar()
    {
        try
	{
            JOptionPane.showMessageDialog(null,"Keluar  dari  form  pengguna");
	}
	catch  (Exception  e)
	{
            JOptionPane.showMessageDialog(null,"Terjadi  kesalahan");
            System.out.println(e.getMessage());
	}
    }
}
