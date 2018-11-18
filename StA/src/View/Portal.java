package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;

import Controller.PortalController;

public class Portal extends JFrame {

	private JPanel contentPane;
	private JTextField titelTF;
	private JTextField autorTF;
	private JTextField nachnTF;
	private JTextField vornTF;
	private JTextField fakTF;
	private JTextField MatnrTF;
	private JComboBox<?> comboBox_Person;
	private JComboBox<?> comboBox_Buch;
	private PortalController pc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Portal window = new Portal();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Portal() {
		this.pc = new PortalController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 573);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 866, 519);
		contentPane.add(tabbedPane);
		
		JPanel TabPerson = new JPanel();
		tabbedPane.addTab("Person anlegen", null, TabPerson, null);
		TabPerson.setLayout(null);
		
		JLabel lblGruppe = new JLabel("Personengruppe");
		lblGruppe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGruppe.setBounds(10, 14, 95, 14);
		TabPerson.add(lblGruppe);
		
		JComboBox<String> comboBox_Person = new JComboBox<String>();
		comboBox_Person.addItem("Student");
		comboBox_Person.addItem("Professor");
		comboBox_Person.setSelectedItem(null);
		comboBox_Person.setBounds(149, 12, 95, 20);
		TabPerson.add(comboBox_Person);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVorname.setBounds(10, 45, 81, 14);
		TabPerson.add(lblVorname);
		
		vornTF = new JTextField();
		vornTF.setColumns(10);
		vornTF.setBounds(101, 43, 158, 20);
		TabPerson.add(vornTF);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNachname.setBounds(10, 77, 81, 14);
		TabPerson.add(lblNachname);
		
		nachnTF = new JTextField();
		nachnTF.setBounds(101, 75, 158, 20);
		TabPerson.add(nachnTF);
		nachnTF.setColumns(10);
		
		JLabel lblMat = new JLabel("Matrikelnr.");
		lblMat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMat.setBounds(10, 141, 81, 14);
		TabPerson.add(lblMat);
		
		MatnrTF = new JTextField();
		MatnrTF.setColumns(10);
		MatnrTF.setBounds(101, 139, 158, 20);
		TabPerson.add(MatnrTF);
		
		JLabel lblFak = new JLabel("bzw. Fakult\u00E4t");
		lblFak.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFak.setBounds(269, 141, 119, 14);
		TabPerson.add(lblFak);
		
		fakTF = new JTextField();
		fakTF.setColumns(10);
		fakTF.setBounds(356, 139, 158, 20);
		TabPerson.add(fakTF);
		
		JLabel lblNewLabel = new JLabel("Beim Anlegen eines Studenten bitte nur Matrikelnummer angeben, f\u00FCr Professoren reicht die Fakult\u00E4t.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 116, 592, 14);
		TabPerson.add(lblNewLabel);
		
		JButton btnPersAnl = new JButton("Mitglied anlegen");
		btnPersAnl.setBounds(49, 177, 195, 23);
		TabPerson.add(btnPersAnl);
		btnPersAnl.setActionCommand("ADD_PERSON");
		btnPersAnl.addActionListener(this.pc);
		
		
		JPanel TabBuch = new JPanel();
		tabbedPane.addTab("Buch anlegen", null, TabBuch, null);
		TabBuch.setLayout(null);
		
		JLabel lblTitel = new JLabel("Titel");
		lblTitel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitel.setBounds(10, 15, 46, 14);
		TabBuch.add(lblTitel);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAutor.setBounds(10, 46, 46, 14);
		TabBuch.add(lblAutor);
		
		titelTF = new JTextField();
		titelTF.setBounds(116, 11, 505, 20);
		TabBuch.add(titelTF);
		titelTF.setColumns(10);
		
		autorTF = new JTextField();
		autorTF.setBounds(116, 44, 239, 20);
		TabBuch.add(autorTF);
		autorTF.setColumns(10);
		
		JComboBox<String> comboBox_Buch = new JComboBox<String>();
		comboBox_Buch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_Buch.addItem("ausleihbar");
		comboBox_Buch.addItem("nicht ausleihbar");
		comboBox_Buch.setSelectedItem(null);
		comboBox_Buch.setBounds(10, 73, 181, 20);
		TabBuch.add(comboBox_Buch);
		
		JButton btnBuchAnl = new JButton("Buch anlegen");
		btnBuchAnl.setBounds(68, 124, 204, 23);
		TabBuch.add(btnBuchAnl);
		btnBuchAnl.setActionCommand("ADD_BOOK");
		btnBuchAnl.addActionListener(this.pc);
		
		JPanel TabBuchAusl = new JPanel();
		tabbedPane.addTab("Buch ausleihen", null, TabBuchAusl, null);
		TabBuchAusl.setLayout(null);
		
		JPanel TabPListe = new JPanel();
		tabbedPane.addTab("Personenliste", null, TabPListe, null);
		TabPListe.setLayout(null);
		
		JButton btnPListe = new JButton("Personenliste erzeugen");
		btnPListe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPListe.setBounds(32, 24, 230, 23);
		TabPListe.add(btnPListe);
		btnPListe.setActionCommand("LIST_PERS");
		btnPListe.addActionListener(this.pc);
		
		JPanel TabBListe = new JPanel();
		TabBListe.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("B\u00FCcherliste", null, TabBListe, "Hier k\u00F6nnen Sie diverse B\u00FCcherlisten generieren und bearbeiten.");
		TabBListe.setLayout(null);
		
		JButton btnBAusl = new JButton("B\u00FCcher - Ausleihstatus");
		btnBAusl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBAusl.setBounds(37, 27, 267, 23);
		TabBListe.add(btnBAusl);
		btnBAusl.setActionCommand("LIST_BOOK_BOR");
		btnBAusl.addActionListener(this.pc);
		
		JButton btnBAll = new JButton("B\u00FCcher - alle anzeigen");
		btnBAll.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBAll.setBounds(37, 74, 267, 23);
		TabBListe.add(btnBAll);
		btnBAll.setActionCommand("LIST_BOOK_ALL");
		btnBAll.addActionListener(this.pc);
	}
	
	public String getTitel() {
		return this.titelTF.getText();
	}

	public String getAutor() {
		return this.autorTF.getText();
	}

	public String getNachn() {
		return this.nachnTF.getText();
	}

	public String getVorn() {
		return this.vornTF.getText();
	}

	public String getFak() {
		return this.fakTF.getText();
	}

	public String getMatnr() {
		return this.MatnrTF.getText();
	}

	public String getComboBox_Person() {
		return (String) this.comboBox_Person.getSelectedItem();
	}

	public String getComboBox_Buch() {
		return (String) this.comboBox_Buch.getSelectedItem();
	}
}
