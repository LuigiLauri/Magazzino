package com.magazzino.gui.view;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelClienti extends JPanel {

	private JTextField textFieldCercaClienti;
	private JTextField textFieldCodiceCliente;
	private JTextField textField_1;
	private JTextField textFieldIndirizzoCliente;
	private JTextField textFieldCapCliente;
	private JTextField textFieldCittaCliente;
	private JTextField textFieldProvCliente;
	private JTextField textFieldCliente;
	private JTextField textFieldTelCliente;
	private JTextField textFieldEmailCliente;
	private JTextField textFieldCodFiscaleCliente;
	private JTextField textFieldPivaCliente;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public JPanelClienti() {
		
		JPanel panelTabellaClienti = new JPanel();
		
		JTable tableClienti = new JTable();
		
		JToolBar toolBarClienti = new JToolBar();
		toolBarClienti.setFloatable(false);
		
		JPanel panelCercaClienti = new JPanel();
		
		textFieldCercaClienti = new JTextField();
		textFieldCercaClienti.setText("");
		textFieldCercaClienti.setColumns(10);
		
		JComboBox comboBoxCercaClienti = new JComboBox();
		
		JButton buttonCercaClienti = new JButton("Filtra");
		GroupLayout gl_panelCercaClienti = new GroupLayout(panelCercaClienti);
		gl_panelCercaClienti.setHorizontalGroup(
			gl_panelCercaClienti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGroup(gl_panelCercaClienti.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldCercaClienti, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxCercaClienti, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonCercaClienti)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		gl_panelCercaClienti.setVerticalGroup(
			gl_panelCercaClienti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGroup(gl_panelCercaClienti.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelCercaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCercaClienti, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCercaClienti, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonCercaClienti))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelCercaClienti.setLayout(gl_panelCercaClienti);
		GroupLayout gl_panelTabellaClienti = new GroupLayout(panelTabellaClienti);
		gl_panelTabellaClienti.setHorizontalGroup(
			gl_panelTabellaClienti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addComponent(tableClienti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(toolBarClienti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(panelCercaClienti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
		);
		gl_panelTabellaClienti.setVerticalGroup(
			gl_panelTabellaClienti.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGroup(gl_panelTabellaClienti.createSequentialGroup()
					.addComponent(panelCercaClienti, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableClienti, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolBarClienti, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnNuovoCliente = new JButton("Nuovo");
		toolBarClienti.add(btnNuovoCliente);
		
		JButton btnModificaCliente = new JButton("Modifica");
		toolBarClienti.add(btnModificaCliente);
		
		JButton btnEliminaCliente = new JButton("Elimina");
		toolBarClienti.add(btnEliminaCliente);
		panelTabellaClienti.setLayout(gl_panelTabellaClienti);
		
		JPanel panelOptionsClienti = new JPanel();
		
		JTabbedPane tabbedPaneOptionsClienti = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panelOptionsClienti = new GroupLayout(panelOptionsClienti);
		gl_panelOptionsClienti.setHorizontalGroup(
			gl_panelOptionsClienti.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPaneOptionsClienti, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
		);
		gl_panelOptionsClienti.setVerticalGroup(
			gl_panelOptionsClienti.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPaneOptionsClienti, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
		);
		
		JPanel panelAnagraficaClienti = new JPanel();
		tabbedPaneOptionsClienti.addTab("Anagrafica", null, panelAnagraficaClienti, null);
		
		JLabel lblCodiceCliente = new JLabel("Codice");
		
		textFieldCodiceCliente = new JTextField();
		textFieldCodiceCliente.setColumns(10);
		
		JCheckBox chckbxCliente = new JCheckBox("Cliente");
		
		JCheckBox chckbxFornitore = new JCheckBox("Fornitore");
		
		JLabel lblNomeCliente = new JLabel("Nome");
		
		JLabel lblIndirizzoCliente = new JLabel("Indirizzo");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textFieldIndirizzoCliente = new JTextField();
		textFieldIndirizzoCliente.setColumns(10);
		
		JLabel lblCapCliente = new JLabel("CAP");
		
		textFieldCapCliente = new JTextField();
		textFieldCapCliente.setColumns(10);
		
		JLabel lblCittaCliente = new JLabel("Città");
		
		textFieldCittaCliente = new JTextField();
		textFieldCittaCliente.setColumns(10);
		
		JLabel lblProvCliente = new JLabel("Prov");
		
		textFieldProvCliente = new JTextField();
		textFieldProvCliente.setColumns(10);
		
		JLabel lblNazioneCliente = new JLabel("Nazione");
		
		textFieldCliente = new JTextField();
		textFieldCliente.setColumns(10);
		
		JLabel lblTelCliente = new JLabel("Tel.");
		
		textFieldTelCliente = new JTextField();
		textFieldTelCliente.setColumns(10);
		
		JLabel lblEmailCliente = new JLabel("Email");
		
		textFieldEmailCliente = new JTextField();
		textFieldEmailCliente.setColumns(10);
		
		JLabel lblCodFiscaleCliente = new JLabel("Cod. Fiscale");
		
		textFieldCodFiscaleCliente = new JTextField();
		textFieldCodFiscaleCliente.setColumns(10);
		
		JLabel lblPivaCliente = new JLabel("P.Iva");
		
		textFieldPivaCliente = new JTextField();
		textFieldPivaCliente.setColumns(10);
		
		JButton btnConferma_1 = new JButton("Conferma");
		
		JButton btnAnnulla_1 = new JButton("Annulla");
		GroupLayout gl_panelAnagraficaClienti = new GroupLayout(panelAnagraficaClienti);
		gl_panelAnagraficaClienti.setHorizontalGroup(
			gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
							.addComponent(lblCodFiscaleCliente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldCodFiscaleCliente, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPivaCliente)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldPivaCliente, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
								.addComponent(lblEmailCliente)
								.addContainerGap())
							.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
									.addComponent(lblTelCliente)
									.addContainerGap())
								.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNazioneCliente)
									.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
										.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
												.addComponent(lblCapCliente)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
												.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
														.addComponent(lblCodiceCliente)
														.addGap(18)
														.addComponent(textFieldCodiceCliente, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxCliente)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(chckbxFornitore))
													.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
														.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
															.addComponent(lblIndirizzoCliente)
															.addComponent(lblNomeCliente))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.TRAILING)
															.addComponent(textFieldIndirizzoCliente, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
															.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
															.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
																.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.TRAILING)
																	.addComponent(textFieldCliente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
																	.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
																		.addComponent(textFieldCapCliente, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(lblCittaCliente, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textFieldCittaCliente, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(lblProvCliente)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textFieldProvCliente, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
																	.addComponent(textFieldEmailCliente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
																	.addComponent(textFieldTelCliente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
																.addPreferredGap(ComponentPlacement.RELATED)))))
												.addGap(29)))
										.addGap(136)))))))
				.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnConferma_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAnnulla_1)
					.addContainerGap(338, Short.MAX_VALUE))
		);
		gl_panelAnagraficaClienti.setVerticalGroup(
			gl_panelAnagraficaClienti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAnagraficaClienti.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodiceCliente)
						.addComponent(chckbxCliente)
						.addComponent(chckbxFornitore)
						.addComponent(textFieldCodiceCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeCliente)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIndirizzoCliente)
						.addComponent(textFieldIndirizzoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCapCliente)
						.addComponent(textFieldCapCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCittaCliente, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCittaCliente, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProvCliente)
						.addComponent(textFieldProvCliente, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNazioneCliente)
						.addComponent(textFieldCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelCliente)
						.addComponent(textFieldTelCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmailCliente)
						.addComponent(textFieldEmailCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodFiscaleCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCodFiscaleCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPivaCliente)
						.addComponent(textFieldPivaCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
					.addGroup(gl_panelAnagraficaClienti.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConferma_1)
						.addComponent(btnAnnulla_1))
					.addGap(39))
		);
		panelAnagraficaClienti.setLayout(gl_panelAnagraficaClienti);
		
		JPanel panelRapportiCliente = new JPanel();
		tabbedPaneOptionsClienti.addTab("RapportiCommerciali", null, panelRapportiCliente, null);
		
		JLabel lblSconti = new JLabel("Sconti");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblPagamento = new JLabel("Pagamento");
		
		JComboBox comboBox = new JComboBox();
		
		JButton button = new JButton("...");
		
		JLabel lblCoordBancarie = new JLabel("Coord. Bancarie");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnConferma = new JButton("Conferma");
		
		JButton btnAnnulla = new JButton("Annulla");
		GroupLayout gl_panelRapportiCliente = new GroupLayout(panelRapportiCliente);
		gl_panelRapportiCliente.setHorizontalGroup(
			gl_panelRapportiCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRapportiCliente.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCoordBancarie)
						.addComponent(lblSconti, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPagamento))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
						.addGroup(gl_panelRapportiCliente.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
						.addComponent(comboBox, 0, 269, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(130))
				.addGroup(gl_panelRapportiCliente.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnConferma)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAnnulla)
					.addContainerGap(332, Short.MAX_VALUE))
		);
		gl_panelRapportiCliente.setVerticalGroup(
			gl_panelRapportiCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRapportiCliente.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSconti)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPagamento)
						.addComponent(button)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCoordBancarie)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
					.addGroup(gl_panelRapportiCliente.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConferma)
						.addComponent(btnAnnulla))
					.addGap(27))
		);
		panelRapportiCliente.setLayout(gl_panelRapportiCliente);
		panelOptionsClienti.setLayout(gl_panelOptionsClienti);
		GroupLayout gl_panelClienti = new GroupLayout(this);
		gl_panelClienti.setHorizontalGroup(
			gl_panelClienti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1197, Short.MAX_VALUE)
				.addGroup(gl_panelClienti.createSequentialGroup()
					.addComponent(panelTabellaClienti, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelOptionsClienti, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
		);
		gl_panelClienti.setVerticalGroup(
			gl_panelClienti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 695, Short.MAX_VALUE)
				.addGroup(gl_panelClienti.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelClienti.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelOptionsClienti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelTabellaClienti, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		setLayout(gl_panelClienti);

	}

}
