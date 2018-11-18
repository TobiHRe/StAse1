package Model;

import java.sql.Connection;
import java.sql.Statement;

import Database.DBConnection;

public class Buch {
	private String titel;
	private String autor;
	private String ausl;
	
	public Buch (String titel, String autor, String ausl) throws Exception{
		if (titel == null) throw new Exception();
		if (ausl == null) throw new Exception();
		else {
			this.ausl = ausl;
			this.titel = titel;
			this.autor = autor;
		}
	}
	
	public Buch (String titel, String ausl) throws Exception{
		if (titel == null) throw new Exception();
		if (ausl == null) throw new Exception();
		else {
			this.ausl = ausl;
			this.titel = titel;
			this.autor = null;
		}
	}
	
	public static void saveBookInDB(Buch book) throws Exception {
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		
		String sql = "INSERT INTO buecher (ID, Titel, Autor, Status) "
				+ "VALUES(NULL,'" +  book.titel + "', '" + book.autor + "', '" + book.ausl + "')";
		
		stmt.executeUpdate(sql);
		conn.close();
	}
	
	
}
