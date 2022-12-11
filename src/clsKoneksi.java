import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class clsKoneksi {
    // mendeklarasikan variabel/atribut 
    public Connection conn; 
    public Statement res; 
    public String sql; 

    //Method mengakses ke database 
    public void AksesData() 
    {
	try 
	{
		Class.forName("com.mysql.jdbc.Driver"); 
                
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/databarang","root",""); 
		res=conn.createStatement(); 
	} 
	catch (Exception e) 
	{ 
		JOptionPane.showMessageDialog(null,"Koneksi Gagal"); 
		System.out.println(e.getMessage()); 
	}  
    }
}
