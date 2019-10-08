package com.magazzino.gui.view;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelDocumenti extends JPanel {

	private JTextField textFieldCercaDocumenti;

	/**
	 * Create the panel.
	 */
	public JPanelDocumenti() {
		
		
		JPanel panelTabellaDocumenti = new JPanel();
		
		JTable tableDocumenti = new JTable();
		
		JToolBar toolBarDocumenti = new JToolBar();
		toolBarDocumenti.setFloatable(false);
		
		JPanel panelCercaDocumenti = new JPanel();
		
		textFieldCercaDocumenti = new JTextField();
		textFieldCercaDocumenti.setText("");
		textFieldCercaDocumenti.setColumns(10);
		
		JComboBox comboBoxCercaDocumenti = new JComboBox();
		
		JButton buttonCercaDocumenti = new JButton("Filtra");
		GroupLayout gl_panelCercaDocumenti = new GroupLayout(panelCercaDocumenti);
		gl_panelCercaDocumenti.setHorizontalGroup(
			gl_panelCercaDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGroup(gl_panelCercaDocumenti.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldCercaDocumenti, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxCercaDocumenti, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(buttonCercaDocumenti)
					.addContainerGap(345, Short.MAX_VALUE))
		);
		gl_panelCercaDocumenti.setVerticalGroup(
			gl_panelCercaDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGap(0, 93, Short.MAX_VALUE)
				.addGroup(gl_panelCercaDocumenti.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelCercaDocumenti.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldCercaDocumenti, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCercaDocumenti, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonCercaDocumenti))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panelCercaDocumenti.setLayout(gl_panelCercaDocumenti);
		GroupLayout gl_panelTabellaDocumenti = new GroupLayout(panelTabellaDocumenti);
		gl_panelTabellaDocumenti.setHorizontalGroup(
			gl_panelTabellaDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGap(0, 744, Short.MAX_VALUE)
				.addGap(0, 744, Short.MAX_VALUE)
				.addComponent(tableDocumenti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(toolBarDocumenti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
				.addComponent(panelCercaDocumenti, GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
		);
		gl_panelTabellaDocumenti.setVerticalGroup(
			gl_panelTabellaDocumenti.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGroup(gl_panelTabellaDocumenti.createSequentialGroup()
					.addComponent(panelCercaDocumenti, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tableDocumenti, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toolBarDocumenti, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		);
		panelTabellaDocumenti.setLayout(gl_panelTabellaDocumenti);
		
		JPanel panelOptionsDocumenti = new JPanel();
		GroupLayout gl_panelOptionsDocumenti = new GroupLayout(panelOptionsDocumenti);
		gl_panelOptionsDocumenti.setHorizontalGroup(
			gl_panelOptionsDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 447, Short.MAX_VALUE)
				.addGap(0, 447, Short.MAX_VALUE)
				.addGap(0, 447, Short.MAX_VALUE)
		);
		gl_panelOptionsDocumenti.setVerticalGroup(
			gl_panelOptionsDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGap(0, 642, Short.MAX_VALUE)
				.addGap(0, 642, Short.MAX_VALUE)
		);
		panelOptionsDocumenti.setLayout(gl_panelOptionsDocumenti);
		GroupLayout gl_panelDocumenti = new GroupLayout(this);
		gl_panelDocumenti.setHorizontalGroup(
			gl_panelDocumenti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDocumenti.createSequentialGroup()
					.addComponent(panelTabellaDocumenti, GroupLayout.PREFERRED_SIZE, 744, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelOptionsDocumenti, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_panelDocumenti.setVerticalGroup(
			gl_panelDocumenti.createParallelGroup(Alignment.LEADING)
				.addGap(0, 695, Short.MAX_VALUE)
				.addGap(0, 695, Short.MAX_VALUE)
				.addGroup(gl_panelDocumenti.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panelDocumenti.createParallelGroup(Alignment.TRAILING)
						.addComponent(panelOptionsDocumenti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panelTabellaDocumenti, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		setLayout(gl_panelDocumenti);

	}

}
