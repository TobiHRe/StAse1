package Model;

public class Buch {
	private Leihe ausl;
	private String titel;
	private String autor;
	
	public Buch (Leihe ausl, String titel, String autor) throws Exception{
		if (titel == null) throw new Exception();
		if (ausl == null) throw new Exception();
		else {
			this.ausl = ausl;
			this.titel = titel;
			this.autor = autor;
		}
	}
	
	public Buch (Leihe ausl, String titel) throws Exception{
		if (titel == null) throw new Exception();
		if (ausl == null) throw new Exception();
		else {
			this.ausl = ausl;
			this.titel = titel;
			this.autor = null;
		}
	}
}
