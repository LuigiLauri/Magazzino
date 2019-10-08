package com.magazzino.gui.view;

import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelProdotti extends JPanel {

	private Component textFieldPrezzoCliente;
	private Component textFieldPrezzoFornitore;
	private Component textFieldCodProdotto;
	private JTextField textFieldFiltraProdotti;

	/**
	 * Create the panel.
	 */
	public JPanelProdotti() {

		
		JPanel panelTableProdotti = new JPanel();
		
		JToolBar toolBarProdotti = new JToolBar();
		toolBarProdotti.setFloatable(false);
		
		JPanel panelTopProotti = new JPanel();
		
		textFieldFiltraProdotti = new JTextField();
		textFieldFiltraProdotti.setText("");
		textFieldFiltraProdotti.setColumns(10);
		
		JButton btnFiltraProdotti = new JButton("Filtra Prodotti");
		
		JComboBox comboBoxCercaProdotto = new JComboBox();
		GroupLayout gl_panelTopProotti = new GroupLayout(panelTopProotti);
		gl_panelTopProotti.setHorizontalGroup(
			gl_panelTopProotti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTopProotti.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldFiltraProdotti, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(comboBoxCercaProdotto, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnFiltraProdotti)
					.addContainerGap(285, Short.MAX_VALUE))
		);
		gl_panelTopProotti.setVerticalGroup(
			gl_panelTopProotti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTopProotti.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelTopProotti.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldFiltraProdotti, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCercaProdotto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFiltraProdotti))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelTopProotti.setLayout(gl_panelTopProotti);
		
		JScrollPane containerTabellaProdotti = new JScrollPane();
		GroupLayout gl_panelTableProdotti = new GroupLayout(panelTableProdotti);
		gl_panelTableProdotti.setHorizontalGroup(
			gl_panelTableProdotti.createParallelGroup(Alignment.TRAILING)
				.addComponent(toolBarProdotti, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
				.addComponent(panelTopProotti, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
				.addComponent(containerTabellaProdotti, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
		);
		gl_panelTableProdotti.setVerticalGroup(
			gl_panelTableProdotti.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTableProdotti.createSequentialGroup()
					.addComponent(panelTopProotti, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(containerTabellaProdotti, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolBarProdotti, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		);
		
		JTable tabellaProdotti = new JTable();
		containerTabellaProdotti.setViewportView(tabellaProdotti);
		
		JButton btnNuovo_1 = new JButton("Nuovo");
		toolBarProdotti.add(btnNuovo_1);
		
		JButton btnDuplica_1 = new JButton("Modifica");
		toolBarProdotti.add(btnDuplica_1);
		
		JButton btnElimina_1 = new JButton("Elimina");
		toolBarProdotti.add(btnElimina_1);
		panelTableProdotti.setLayout(gl_panelTableProdotti);
		
		JPanel panelOptionProdotti = new JPanel();
		GroupLayout gl_panelProdotti = new GroupLayout(this);
		gl_panelProdotti.setHorizontalGroup(
			gl_panelProdotti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelProdotti.createSequentialGroup()
					.addComponent(panelTableProdotti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelOptionProdotti, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
		);
		gl_panelProdotti.setVerticalGroup(
			gl_panelProdotti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelProdotti.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelProdotti.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelOptionProdotti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelTableProdotti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(48))
		);
		
		JTabbedPane opzioniProdotto = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_panelOptionProdotti = new GroupLayout(panelOptionProdotti);
		gl_panelOptionProdotti.setHorizontalGroup(
			gl_panelOptionProdotti.createParallelGroup(Alignment.LEADING)
				.addComponent(opzioniProdotto, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
		);
		gl_panelOptionProdotti.setVerticalGroup(
			gl_panelOptionProdotti.createParallelGroup(Alignment.LEADING)
				.addComponent(opzioniProdotto, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
		);
		
		JPanel panelOpzioniProdottoCaratteristiche = new JPanel();
		panelOpzioniProdottoCaratteristiche.setToolTipText("");
		opzioniProdotto.addTab("Prodotto", null, panelOpzioniProdottoCaratteristiche, null);
		
		JLabel lblCodProdotto = new JLabel("Cod.");
		
		textFieldCodProdotto = new JTextField();
		
		JLabel lblDescrizioneProdotto = new JLabel("Descrizione");
		
		JTextArea textAreaDescProdotto = new JTextArea();
		
		JLabel lblCategoriaProdotto = new JLabel("Categoria");
		
		JComboBox comboBoxCategoriaProdotto = new JComboBox();
		
		JButton btnCategoriaProdotto = new JButton("...");
		
		JLabel lblPrezzi = new JLabel("Prezzi");
		
		JLabel lblPrezzoFornitore = new JLabel("Prezzo Fornitore");
		
		textFieldPrezzoFornitore = new JTextField();
		
		JLabel lblPrezzoAlCliente = new JLabel("Prezzo al Cliente");
		
		textFieldPrezzoCliente = new JTextField();
		
		JLabel lblFornitoreProdotto = new JLabel("Fornitore");
		
		JComboBox comboBoxFornitoreProdotto = new JComboBox();
		
		JButton buttonFornitoreProdotto = new JButton("...");
		
		JButton btnConfermaProdotto = new JButton("Conferma");
		
		JButton btnCancellaProdotto = new JButton("Cancella");
		
		JButton btnPrezzoAlClienteProdotto = new JButton("...");
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panelOpzioniProdottoCaratteristiche = new GroupLayout(panelOpzioniProdottoCaratteristiche);
		gl_panelOpzioniProdottoCaratteristiche.setHorizontalGroup(
			gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
							.addComponent(btnConfermaProdotto)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCancellaProdotto)
							.addGap(176))
						.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
							.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPrezzoAlCliente)
								.addComponent(lblFornitoreProdotto)
								.addComponent(lblDescrizioneProdotto)
								.addComponent(lblCodProdotto)
								.addComponent(lblCategoriaProdotto)
								.addComponent(lblPrezzoFornitore))
							.addGap(18)
							.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
									.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxFornitoreProdotto, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textFieldPrezzoCliente))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnPrezzoAlClienteProdotto, 0, 0, Short.MAX_VALUE)
										.addComponent(buttonFornitoreProdotto, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE))
									.addGap(128))
								.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
										.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
											.addComponent(lblPrezzi, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
											.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
												.addGap(18)
												.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
													.addComponent(textFieldCodProdotto)
													.addComponent(comboBoxCategoriaProdotto, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(textAreaDescProdotto, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnCategoriaProdotto, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
												.addGap(42)))
										.addGap(69))
									.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
										.addComponent(textFieldPrezzoFornitore, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
										.addGap(152)))))))
				.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelOpzioniProdottoCaratteristiche.setVerticalGroup(
			gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOpzioniProdottoCaratteristiche.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodProdotto)
						.addComponent(textFieldCodProdotto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescrizioneProdotto)
						.addComponent(textAreaDescProdotto, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoriaProdotto)
						.addComponent(comboBoxCategoriaProdotto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCategoriaProdotto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPrezzi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(43)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrezzoFornitore)
						.addComponent(textFieldPrezzoFornitore, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPrezzoAlCliente)
						.addComponent(textFieldPrezzoCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPrezzoAlClienteProdotto))
					.addGap(42)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFornitoreProdotto)
						.addComponent(comboBoxFornitoreProdotto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonFornitoreProdotto))
					.addGap(74)
					.addGroup(gl_panelOpzioniProdottoCaratteristiche.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConfermaProdotto)
						.addComponent(btnCancellaProdotto))
					.addGap(20))
		);
		panelOpzioniProdottoCaratteristiche.setLayout(gl_panelOpzioniProdottoCaratteristiche);
		
		JPanel panelOpzioniProdottoMagazzino = new JPanel();
		opzioniProdotto.addTab("Magazzino", null, panelOpzioniProdottoMagazzino, null);
		
		JButton btnCaricaProdottoMagazzino = new JButton("Carica");
		
		JButton btnScaricaProdottoMagazzino = new JButton("Scarica");
		
		JButton btnRettificaProdottoMagazzino = new JButton("Rettifica");
		
		JButton btnVaiAlMagazzino = new JButton("Vai Al Magazzino");
		
		JSeparator separator_1 = new JSeparator();
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblStatoProdottoLabel = new JLabel("Stato");
		
		JLabel lblStatoProdotto = new JLabel("...");
		lblStatoProdotto.setToolTipText("");
		
		JLabel lblQuantitInGiacenza = new JLabel("Quantità in giacenza");
		
		JLabel lblQuantitaImpegnata = new JLabel("Quantità Impegnata");
		
		JLabel labelInGiacenzaValue = new JLabel("...");
		
		JLabel labelImpegnataValue = new JLabel("...");
		
		JLabel lblQuantitDisponibile = new JLabel("Quantità Disponibile");
		
		JLabel labelDisponibileValue = new JLabel("...");
		
		GroupLayout gl_panelOpzioniProdottoMagazzino = new GroupLayout(panelOpzioniProdottoMagazzino);
		gl_panelOpzioniProdottoMagazzino.setHorizontalGroup(
			gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
						.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.LEADING)
								.addComponent(btnVaiAlMagazzino)
								.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
									.addComponent(btnCaricaProdottoMagazzino, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnScaricaProdottoMagazzino, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnRettificaProdottoMagazzino, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)))
					.addContainerGap())
				.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStatoProdottoLabel)
						.addComponent(lblQuantitInGiacenza)
						.addComponent(lblQuantitaImpegnata)
						.addComponent(lblQuantitDisponibile))
					.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.LEADING)
						.addComponent(labelDisponibileValue)
						.addComponent(labelImpegnataValue)
						.addComponent(labelInGiacenzaValue)
						.addComponent(lblStatoProdotto, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
					.addGap(67))
		);
		gl_panelOpzioniProdottoMagazzino.setVerticalGroup(
			gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOpzioniProdottoMagazzino.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCaricaProdottoMagazzino)
						.addComponent(btnScaricaProdottoMagazzino)
						.addComponent(btnRettificaProdottoMagazzino))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(btnVaiAlMagazzino)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStatoProdottoLabel)
						.addComponent(lblStatoProdotto))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantitInGiacenza)
						.addComponent(labelInGiacenzaValue))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantitaImpegnata)
						.addComponent(labelImpegnataValue))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelOpzioniProdottoMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantitDisponibile)
						.addComponent(labelDisponibileValue))
					.addContainerGap(374, Short.MAX_VALUE))
		);
		panelOpzioniProdottoMagazzino.setLayout(gl_panelOpzioniProdottoMagazzino);
		panelOptionProdotti.setLayout(gl_panelOptionProdotti);
		setLayout(gl_panelProdotti);

	}

}
