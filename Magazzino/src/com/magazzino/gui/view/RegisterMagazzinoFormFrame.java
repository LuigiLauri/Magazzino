package com.magazzino.gui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterMagazzinoFormFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldDescrizione;
	private JTextField textFieldIndirizzo;
	private JTextField textFieldCAP;
	private JTextField textFieldCitta;
	private JTextField textFieldProvincia;
	private JTextField textFieldCodFiscale;
	private JTextField textFieldPIva;
	private JTextField textFieldTel;
	private JTextField textFieldFax;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public RegisterMagazzinoFormFrame() {
		
		displayButtons();
		
	}
	
	
	
	
	private void displayButtons() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 913, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel registerFormContainerPanel = new JPanel();
		
		JButton btnConferma = new JButton("Conferma");
		
		JButton btnAnnulla = new JButton("Annulla");
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(registerFormContainerPanel, GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnAnnulla)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnConferma)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(registerFormContainerPanel, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConferma)
						.addComponent(btnAnnulla))
					.addGap(26))
		);
		
		JLabel lblNome = new JLabel("Nome");
		
		JLabel lblDescrizione = new JLabel("Descrizione");
		
		JLabel lblIndirizzo = new JLabel("Indirizzo");
		
		JLabel lblCap = new JLabel("CAP");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		textFieldDescrizione = new JTextField();
		textFieldDescrizione.setColumns(10);
		
		textFieldIndirizzo = new JTextField();
		textFieldIndirizzo.setColumns(10);
		
		textFieldCAP = new JTextField();
		textFieldCAP.setColumns(10);
		
		JLabel lblCitta = new JLabel("Città");
		
		textFieldCitta = new JTextField();
		textFieldCitta.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		
		textFieldProvincia = new JTextField();
		textFieldProvincia.setColumns(10);
		
		JLabel lblCodFiscale = new JLabel("Cod. Fiscale");
		
		textFieldCodFiscale = new JTextField();
		textFieldCodFiscale.setColumns(10);
		
		JLabel lblPIva = new JLabel("P. Iva");
		
		textFieldPIva = new JTextField();
		textFieldPIva.setColumns(10);
		
		JLabel lblTel = new JLabel("Tel.");
		
		textFieldTel = new JTextField();
		textFieldTel.setColumns(10);
		
		JLabel lblFax = new JLabel("Fax");
		
		textFieldFax = new JTextField();
		textFieldFax.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblLogo = new JLabel("Logo");
		
		JPanel panelLogo = new JPanel();
		
		JButton btnCaricaImmagine = new JButton("Carica Immagine");
		
		JButton btnCancella = new JButton("Cancella");
	
		GroupLayout gl_registerFormContainerPanel = new GroupLayout(registerFormContainerPanel);
		gl_registerFormContainerPanel.setHorizontalGroup(
			gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
					.addGap(65)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblIndirizzo, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldIndirizzo, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDescrizione, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldDescrizione, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCodFiscale))
							.addGap(0)
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
									.addGap(12)
									.addComponent(textFieldCodFiscale, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPIva)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldPIva, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
									.addGap(10)
									.addComponent(textFieldCAP, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
									.addGap(30)
									.addComponent(lblCitta)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldCitta, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblProvincia)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldProvincia, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(30)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail)
								.addComponent(lblFax)
								.addComponent(lblTel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textFieldFax, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldTel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addComponent(lblLogo)
							.addGap(18)
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
									.addComponent(btnCaricaImmagine, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancella, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
								.addComponent(panelLogo, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
					.addGap(112))
		);
		gl_registerFormContainerPanel.setVerticalGroup(
			gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
					.addGap(55)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTel)
						.addComponent(textFieldTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescrizione, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldDescrizione, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFax)
						.addComponent(textFieldFax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIndirizzo, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldIndirizzo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldCAP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCitta)
								.addComponent(textFieldCitta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblProvincia)
								.addComponent(textFieldProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLogo)
								.addComponent(lblCap, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodFiscale)
								.addComponent(lblPIva)
								.addComponent(textFieldPIva, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldCodFiscale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_registerFormContainerPanel.createSequentialGroup()
							.addGap(23)
							.addComponent(panelLogo, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addGroup(gl_registerFormContainerPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCaricaImmagine)
						.addComponent(btnCancella)))
		);
		registerFormContainerPanel.setLayout(gl_registerFormContainerPanel);
		contentPane.setLayout(gl_contentPane);
	}
}
