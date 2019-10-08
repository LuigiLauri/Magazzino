package com.magazzino.gui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OptionsFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;


	/**
	 * Create the frame.
	 */
	public OptionsFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelAnagrafica = new JPanel();
		tabbedPane.addTab("Anagrafica", null, panelAnagrafica, null);
		
		JLabel lblNome = new JLabel("Nome");
		
		JLabel lblDescrizione = new JLabel("Descrizione");
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		
		JLabel lblCap = new JLabel("CAP");
		
		JLabel lblCitta = new JLabel("Citta");
		
		JLabel lblProvincia = new JLabel("Provincia");
		
		JLabel lblCodFiscale = new JLabel("Cod. Fiscale");
		
		JLabel lblPiva = new JLabel("Piva");
		
		JLabel lblTel = new JLabel("Tel");
		
		JLabel lblFax = new JLabel("Fax");
		
		JLabel lblEmail = new JLabel("E-mail");
		
		JLabel lblLogo = new JLabel("Logo");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JPanel panelLogo = new JPanel();
		
		JButton btnCaricaImmagine = new JButton("Carica Immagine");
		
		JButton btnCancella = new JButton("Cancella");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JButton btnCongerma = new JButton("Conferma");
		
		JButton btnAnnulla = new JButton("Annulla");
		GroupLayout gl_panelAnagrafica = new GroupLayout(panelAnagrafica);
		gl_panelAnagrafica.setHorizontalGroup(
			gl_panelAnagrafica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAnagrafica.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescrizione)
						.addGroup(gl_panelAnagrafica.createSequentialGroup()
							.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCodFiscale)
								.addComponent(lblIndirizzo)
								.addComponent(lblCap)
								.addComponent(lblNome)
								.addComponent(lblPiva)
								.addComponent(lblTel)
								.addComponent(lblFax)
								.addComponent(lblEmail)
								.addComponent(lblLogo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.LEADING)
								.addComponent(panelLogo, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
								.addGroup(gl_panelAnagrafica.createSequentialGroup()
									.addComponent(btnCaricaImmagine, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancella, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_panelAnagrafica.createSequentialGroup()
									.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.TRAILING)
										.addComponent(textField_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
										.addComponent(textField_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
										.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
										.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_panelAnagrafica.createSequentialGroup()
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblCitta)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblProvincia)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
										.addComponent(textField_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
										.addComponent(textField_6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panelAnagrafica.createSequentialGroup()
									.addComponent(btnCongerma)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnAnnulla)))))
					.addGap(16))
		);
		gl_panelAnagrafica.setVerticalGroup(
			gl_panelAnagrafica.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAnagrafica.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescrizione)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIndirizzo)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCap)
						.addComponent(lblCitta)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvincia)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodFiscale)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPiva)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTel)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFax)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelAnagrafica.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLogo)
							.addContainerGap(231, Short.MAX_VALUE))
						.addGroup(gl_panelAnagrafica.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelLogo, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCaricaImmagine)
								.addComponent(btnCancella, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addGap(42)
							.addGroup(gl_panelAnagrafica.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCongerma)
								.addComponent(btnAnnulla))
							.addContainerGap())))
		);
		panelAnagrafica.setLayout(gl_panelAnagrafica);
		
		JPanel panelAltriUtenti = new JPanel();
		tabbedPane.addTab("Opzioni", null, panelAltriUtenti, null);
		
		JButton btnModificaUtente = new JButton("Opzioni Utente");
		
		JButton btnCreaNuovoUtente = new JButton("Crea Nuovo Utente");
		
		JButton btnCambiaUtente = new JButton("Cambia Utente");
		GroupLayout gl_panelAltriUtenti = new GroupLayout(panelAltriUtenti);
		gl_panelAltriUtenti.setHorizontalGroup(
			gl_panelAltriUtenti.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelAltriUtenti.createSequentialGroup()
					.addGap(147)
					.addGroup(gl_panelAltriUtenti.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCambiaUtente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(btnCreaNuovoUtente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
						.addComponent(btnModificaUtente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(158))
		);
		gl_panelAltriUtenti.setVerticalGroup(
			gl_panelAltriUtenti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAltriUtenti.createSequentialGroup()
					.addGap(25)
					.addComponent(btnModificaUtente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCreaNuovoUtente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCambiaUtente)
					.addContainerGap(437, Short.MAX_VALUE))
		);
		panelAltriUtenti.setLayout(gl_panelAltriUtenti);
	}

}
