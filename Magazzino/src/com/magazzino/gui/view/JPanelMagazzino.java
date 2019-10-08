package com.magazzino.gui.view;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelMagazzino extends JPanel {

	private JTextField textFieldCercaMagazzino;

	/**
	 * Create the panel.
	 */
	public JPanelMagazzino() {
		
		JPanel panelMagazzinoTable = new JPanel();
		
		JTable tableMagazzino = new JTable();
		
		JToolBar toolBarMagazzino = new JToolBar();
		toolBarMagazzino.setFloatable(false);
		
		JPanel panelTopMagazzino = new JPanel();
		
		textFieldCercaMagazzino = new JTextField();
		textFieldCercaMagazzino.setText("");
		textFieldCercaMagazzino.setColumns(10);
		
		JButton buttonFiltraMagazzino = new JButton("Filtra");
		
		JComboBox comboBoxCercaMagazzino = new JComboBox();
		GroupLayout gl_panelTopMagazzino = new GroupLayout(panelTopMagazzino);
		gl_panelTopMagazzino.setHorizontalGroup(
			gl_panelTopMagazzino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTopMagazzino.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldCercaMagazzino, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxCercaMagazzino, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonFiltraMagazzino)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		gl_panelTopMagazzino.setVerticalGroup(
			gl_panelTopMagazzino.createParallelGroup(Alignment.LEADING)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGroup(gl_panelTopMagazzino.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelTopMagazzino.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCercaMagazzino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCercaMagazzino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonFiltraMagazzino))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelTopMagazzino.setLayout(gl_panelTopMagazzino);
		GroupLayout gl_panelMagazzinoTable = new GroupLayout(panelMagazzinoTable);
		gl_panelMagazzinoTable.setHorizontalGroup(
			gl_panelMagazzinoTable.createParallelGroup(Alignment.LEADING)
				.addComponent(tableMagazzino, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(toolBarMagazzino, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(panelTopMagazzino, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
		);
		gl_panelMagazzinoTable.setVerticalGroup(
			gl_panelMagazzinoTable.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelMagazzinoTable.createSequentialGroup()
					.addComponent(panelTopMagazzino, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableMagazzino, GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolBarMagazzino, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
		);
		
		JButton btnRettificaMagazzino = new JButton("Rettifica");
		toolBarMagazzino.add(btnRettificaMagazzino);
		panelMagazzinoTable.setLayout(gl_panelMagazzinoTable);
		
		JPanel panelMagazzinoOption = new JPanel();
		
		JLabel lblPeriodo = new JLabel("Periodo");
		
		JButton btnMeseScorso = new JButton("Mese Scorso");
		
		JButton btnUltimoAnno = new JButton("Anno Corrente");
		
		JButton btnMeseCorrente = new JButton("Mese Corrente");
		
		JButton btnAnnoScorso = new JButton("Anno Scorso");
		GroupLayout gl_panelMagazzinoOption = new GroupLayout(panelMagazzinoOption);
		gl_panelMagazzinoOption.setHorizontalGroup(
			gl_panelMagazzinoOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMagazzinoOption.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelMagazzinoOption.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMeseScorso)
						.addComponent(btnMeseCorrente)
						.addComponent(lblPeriodo)
						.addGroup(gl_panelMagazzinoOption.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelMagazzinoOption.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAnnoScorso)
								.addComponent(btnUltimoAnno))))
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_panelMagazzinoOption.setVerticalGroup(
			gl_panelMagazzinoOption.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMagazzinoOption.createSequentialGroup()
					.addGap(21)
					.addComponent(lblPeriodo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMeseCorrente)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMeseScorso)
					.addGap(8)
					.addComponent(btnUltimoAnno)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAnnoScorso)
					.addContainerGap(457, Short.MAX_VALUE))
		);
		panelMagazzinoOption.setLayout(gl_panelMagazzinoOption);
		GroupLayout gl_panelMagazzino = new GroupLayout(this);
		gl_panelMagazzino.setHorizontalGroup(
			gl_panelMagazzino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMagazzino.createSequentialGroup()
					.addComponent(panelMagazzinoTable, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelMagazzinoOption, GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
		);
		gl_panelMagazzino.setVerticalGroup(
			gl_panelMagazzino.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMagazzino.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelMagazzino.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelMagazzinoOption, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelMagazzinoTable, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		setLayout(gl_panelMagazzino);
	}

}
