import javax.swing.JOptionPane;
public class clsLogin extends clsKoneksi {
    String mIDPengguna,mNama,mKataKunci;
    
    public void Masuk()
    {
        try
        {
            sql = "select * from tblpengguna where Nama = '" + mNama + "' and KataKunci = '" + mKataKunci + "'"; 
        }
        catch (Exception e) 
        { 
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan"); 
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar()
    {   
	try 
	{
		JOptionPane.showMessageDialog(null,"Keluar dari form login");
	}
	catch (Exception e)
	{
                JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
		System.out.println(e.getMessage());
	}
    }
}
