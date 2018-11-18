package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;
import Model.Buch;
import View.Portal;

public class PortalController implements ActionListener{
	private Portal view;
	
	public PortalController(Portal view) {
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "ADD_BOOK") this.addBook();
		/*else if(e.getActionCommand() == "ADD_PERSON") this.addPerson();
		else if(e.getActionCommand() == "LIST_PERS") this.getPList();
		else if(e.getActionCommand() == "LIST_BOOK_BOR") this.getBListBorrowed();
		else if(e.getActionCommand() == "LIST_BOOK_ALL") this.getBListAll();*/
		else System.out.println("Unknown command");
	}
	
	public void addBook() {
		try {
			if(this.view.getAutor() != null && this.view.getTitel() != null) {
				Buch book = new Buch(this.view.getTitel(), this.view.getAutor(), this.view.getComboBox_Buch());
				Buch.saveBookInDB(book);
				
				showMessageDialog(null, "Buch erfolgreich in DB gespeichert");
			}
			if(this.view.getAutor().equals(null) && this.view.getTitel() != null) {
				Buch book = new Buch(this.view.getTitel(), this.view.getComboBox_Buch());
				Buch.saveBookInDB(book);
				
				showMessageDialog(null, "Buch ohne Autor erfolgreich in DB gespeichert");
			}
			else {
				throw new Exception();
			}
		}
		catch (Exception e){
			showMessageDialog(null, e.getMessage());
		}
	}
	/*public void addPerson() {
		try {
			Person pers = new Person
		}
	}
	public void getPList() {
		
	}
	public void getBListBorrowed() {
	
	}
	public void getBListAll() {
	
	}*/
}
