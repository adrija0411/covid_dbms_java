/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_novelvista;

    import java.sql.*;
    public class Connect {
    String dbname= "users";
    Integer portnumber = 5432;
    
	public static String url="jdbc:postgresql://localhost:5432/postgres";
	public static String username="postgres";
	public static String pwd="Tulo2509";
        
        public static Connection method(){
            Connection conn = null;
            try
		{
			conn = DriverManager.getConnection(url, username, pwd);
			DatabaseMetaData meta= conn.getMetaData();
			System.out.println(meta.getDriverName());
			System.out.println(meta.getDriverVersion());
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDatabaseProductVersion());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
            return conn;
        }
        
	public static void main(String[] args) {
		System.out.println(method());
	}

}
        
                
    

