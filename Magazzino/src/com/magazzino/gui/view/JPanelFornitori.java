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

public class JPanelFornitori extends JPanel {

	private JTextField textFieldCercaFornitori;
	private JTextField textFieldCodFiscaleFornitore;
	private JTextField textFieldPivaFornitore;
	private JTextField textFieldCodFornitore;
	private JTextField textFieldIndirizzoFornitore;
	private JTextField textFieldNomeFornitore;
	private JTextField textFieldNazioneFornitore;
	private JTextField textFieldCapFornitore;
	private JTextField textFieldCittaFornitore;
	private JTextField textFieldProvFornitore;
	private JTextField textFieldEmailFornitore;
	private JTextField textFieldTelFornitore;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public JPanelFornitori() {
JPanel panelTabellaFornitori = new JPanel();
		
		JTable tableFornitori = new JTable();
		
		JToolBar toolBarFornitori = new JToolBar();
		toolBarFornitori.setFloatable(false);
		
		JPanel panelCercaFornitori = new JPanel();
		
		textFieldCercaFornitori = new JTextField();
		textFieldCercaFornitori.setText("");
		textFieldCercaFornitori.setColumns(10);
		
		JComboBox comboBoxCercaFornitori = new JComboBox();
		
		JButton buttonCercaFornitori = new JButton("Filtra");
		GroupLayout gl_panelCercaFornitori = new GroupLayout(panelCercaFornitori);
		gl_panelCercaFornitori.setHorizontalGroup(
			gl_panelCercaFornitori.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGroup(gl_panelCercaFornitori.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldCercaFornitori, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxCercaFornitori, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonCercaFornitori)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		gl_panelCercaFornitori.setVerticalGroup(
			gl_panelCercaFornitori.createParallelGroup(Alignment.LEADING)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGroup(gl_panelCercaFornitori.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelCercaFornitori.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCercaFornitori, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCercaFornitori, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonCercaFornitori))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelCercaFornitori.setLayout(gl_panelCercaFornitori);
		GroupLayout gl_panelTabellaFornitori = new GroupLayout(panelTabellaFornitori);
		gl_panelTabellaFornitori.setHorizontalGroup(
			gl_panelTabellaFornitori.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBarFornitori, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(panelCercaFornitori, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(tableFornitori, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
		);
		gl_panelTabellaFornitori.setVerticalGroup(
			gl_panelTabellaFornitori.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTabellaFornitori.createSequentialGroup()
					.addComponent(panelCercaFornitori, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableFornitori, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolBarFornitori, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		);
		
		JButton btnNuovo_2 = new JButton("Nuovo");
		toolBarFornitori.add(btnNuovo_2);
		
		JButton btnDuplica_2 = new JButton("Duplica");
		toolBarFornitori.add(btnDuplica_2);
		
		JButton btnElimina_2 = new JButton("Elimina");
		toolBarFornitori.add(btnElimina_2);
		panelTabellaFornitori.setLayout(gl_panelTabellaFornitori);
		
		JPanel panelOptionsFornitori = new JPanel();
		GroupLayout gl_panelFornitori = new GroupLayout(this);
		gl_panelFornitori.setHorizontalGroup(
			gl_panelFornitori.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1197, Short.MAX_VALUE)
				.addGap(0, 1197, Short.MAX_VALUE)
				.addGroup(gl_panelFornitori.createSequentialGroup()
					.addComponent(panelTabellaFornitori, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelOptionsFornitori, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
		);
		gl_panelFornitori.setVerticalGroup(
			gl_panelFornitori.createParallelGroup(Alignment.LEADING)
				.addGap(0, 695, Short.MAX_VALUE)
				.addGap(0, 695, Short.MAX_VALUE)
				.addGroup(gl_panelFornitori.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelFornitori.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelOptionsFornitori, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelTabellaFornitori, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panelOptionsFornitori = new GroupLayout(panelOptionsFornitori);
		gl_panelOptionsFornitori.setHorizontalGroup(
			gl_panelOptionsFornitori.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOptionsFornitori.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
		);
		gl_panelOptionsFornitori.setVerticalGroup(
			gl_panelOptionsFornitori.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
		);
		
		JPanel panelAnagraficaFornitore = new JPanel();
		tabbedPane.addTab("Anagrafica", null, panelAnagraficaFornitore, null);
		
		JLabel labelCodFiscaleFornitore = new JLabel("Cod. Fiscale");
		
		textFieldCodFiscaleFornitore = new JTextField();
		textFieldCodFiscaleFornitore.setColumns(10);
		
		JLabel labelPivaFornitore = new JLabel("P.Iva");
		
		textFieldPivaFornitore = new JTextField();
		textFieldPivaFornitore.setColumns(10);
		
		JLabel labelEmailFornitore = new JLabel("Email");
		
		JLabel labelTelForntiroe = new JLabel("Tel.");
		
		JLabel labelNazioneFornitore = new JLabel("Nazione");
		
		JLabel labelCapFornitore = new JLabel("CAP");
		
		JLabel labelCodFornitore = new JLabel("Codice");
		
		textFieldCodFornitore = new JTextField();
		textFieldCodFornitore.setColumns(10);
		
		JCheckBox checkBoxCliente = new JCheckBox("Cliente");
		
		JCheckBox checkBoxFornitoreF = new JCheckBox("Fornitore");
		checkBoxFornitoreF.setSelected(true);
		checkBoxFornitoreF.setEnabled(false);
		
		JLabel labelIndirizzoFornitore = new JLabel("Indirizzo");
		
		JLabel labelNomeFornitore = new JLabel("Nome");
		
		textFieldIndirizzoFornitore = new JTextField();
		textFieldIndirizzoFornitore.setColumns(10);
		
		textFieldNomeFornitore = new JTextField();
		textFieldNomeFornitore.setColumns(10);
		
		textFieldNazioneFornitore = new JTextField();
		textFieldNazioneFornitore.setColumns(10);
		
		textFieldCapFornitore = new JTextField();
		textFieldCapFornitore.setColumns(10);
		
		JLabel labelCittaFornitore = new JLabel("Città");
		
		textFieldCittaFornitore = new JTextField();
		textFieldCittaFornitore.setColumns(10);
		
		JLabel labelProvFornitore = new JLabel("Prov");
		
		textFieldProvFornitore = new JTextField();
		textFieldProvFornitore.setColumns(10);
		
		textFieldEmailFornitore = new JTextField();
		textFieldEmailFornitore.setColumns(10);
		
		textFieldTelFornitore = new JTextField();
		textFieldTelFornitore.setColumns(10);
		
		JButton buttonConfFornitore = new JButton("Conferma");
		
		JButton buttonAnnullaFornitore = new JButton("Annulla");
		GroupLayout gl_panelAnagraficaFornitore = new GroupLayout(panelAnagraficaFornitore);
		gl_panelAnagraficaFornitore.setHorizontalGroup(
			gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
				.addGap(0, 572, Short.MAX_VALUE)
				.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
					.addGap(41)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
							.addComponent(labelCodFiscaleFornitore)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldCodFiscaleFornitore, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(labelPivaFornitore)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldPivaFornitore, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
								.addComponent(labelEmailFornitore)
								.addContainerGap())
							.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
									.addComponent(labelTelForntiroe)
									.addContainerGap())
								.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
									.addComponent(labelNazioneFornitore)
									.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
										.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
												.addComponent(labelCapFornitore)
												.addPreferredGap(ComponentPlacement.RELATED))
											.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
												.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
														.addComponent(labelCodFornitore)
														.addGap(18)
														.addComponent(textFieldCodFornitore, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(checkBoxCliente)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(checkBoxFornitoreF))
													.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
														.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
															.addComponent(labelIndirizzoFornitore)
															.addComponent(labelNomeFornitore))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.TRAILING)
															.addComponent(textFieldIndirizzoFornitore, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
															.addComponent(textFieldNomeFornitore, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
															.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
																.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.TRAILING)
																	.addComponent(textFieldNazioneFornitore, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
																	.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
																		.addComponent(textFieldCapFornitore, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(labelCittaFornitore, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textFieldCittaFornitore, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(labelProvFornitore)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(textFieldProvFornitore, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
																	.addComponent(textFieldEmailFornitore, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
																	.addComponent(textFieldTelFornitore, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
																.addPreferredGap(ComponentPlacement.RELATED)))))
												.addGap(29)))
										.addGap(136)))))))
				.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
					.addContainerGap()
					.addComponent(buttonConfFornitore)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonAnnullaFornitore)
					.addContainerGap(363, Short.MAX_VALUE))
		);
		gl_panelAnagraficaFornitore.setVerticalGroup(
			gl_panelAnagraficaFornitore.createParallelGroup(Alignment.LEADING)
				.addGap(0, 596, Short.MAX_VALUE)
				.addGroup(gl_panelAnagraficaFornitore.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelCodFornitore)
						.addComponent(checkBoxCliente)
						.addComponent(checkBoxFornitoreF)
						.addComponent(textFieldCodFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelNomeFornitore)
						.addComponent(textFieldNomeFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelIndirizzoFornitore)
						.addComponent(textFieldIndirizzoFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelCapFornitore)
						.addComponent(textFieldCapFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelCittaFornitore, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldCittaFornitore, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelProvFornitore)
						.addComponent(textFieldProvFornitore, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelNazioneFornitore)
						.addComponent(textFieldNazioneFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelTelForntiroe)
						.addComponent(textFieldTelFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelEmailFornitore)
						.addComponent(textFieldEmailFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelCodFiscaleFornitore)
						.addComponent(textFieldCodFiscaleFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(labelPivaFornitore)
						.addComponent(textFieldPivaFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
					.addGroup(gl_panelAnagraficaFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonConfFornitore)
						.addComponent(buttonAnnullaFornitore))
					.addGap(39))
		);
		panelAnagraficaFornitore.setLayout(gl_panelAnagraficaFornitore);
		
		JPanel panelRapportiFornitore = new JPanel();
		tabbedPane.addTab("Rapporti Commerciali", null, panelRapportiFornitore, null);
		
		JLabel label = new JLabel("Coord. Bancarie");
		
		JLabel label_1 = new JLabel("Sconti");
		
		JLabel label_2 = new JLabel("Pagamento");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		
		JButton button_1 = new JButton("...");
		
		JButton button_2 = new JButton("Conferma");
		
		JButton button_3 = new JButton("Annulla");
		GroupLayout gl_panelRapportiFornitore = new GroupLayout(panelRapportiFornitore);
		gl_panelRapportiFornitore.setHorizontalGroup(
			gl_panelRapportiFornitore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRapportiFornitore.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
						.addGroup(gl_panelRapportiFornitore.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
						.addComponent(comboBox_1, 0, 281, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(130))
				.addGroup(gl_panelRapportiFornitore.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_3)
					.addContainerGap(369, Short.MAX_VALUE))
		);
		gl_panelRapportiFornitore.setVerticalGroup(
			gl_panelRapportiFornitore.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRapportiFornitore.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(button_1)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 608, Short.MAX_VALUE)
					.addGroup(gl_panelRapportiFornitore.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_2)
						.addComponent(button_3))
					.addGap(27))
		);
		panelRapportiFornitore.setLayout(gl_panelRapportiFornitore);
		panelOptionsFornitori.setLayout(gl_panelOptionsFornitori);
		setLayout(gl_panelFornitori);
		

	}

}
