package com.magazzino.gui.view;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JPanelPagamenti extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelPagamenti() {

		JPanel panelTabellaPagamenti = new JPanel();
		GroupLayout gl_panelPagamenti = new GroupLayout(this);
		gl_panelPagamenti.setHorizontalGroup(
			gl_panelPagamenti.createParallelGroup(Alignment.LEADING)
				.addComponent(panelTabellaPagamenti, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
		);
		gl_panelPagamenti.setVerticalGroup(
			gl_panelPagamenti.createParallelGroup(Alignment.LEADING)
				.addComponent(panelTabellaPagamenti, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
		);
		
		JToolBar toolBarPagamenti = new JToolBar();
		toolBarPagamenti.setFloatable(false);
		
		JPanel panelCercaPagamenti = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panelTabellaPagamenti = new GroupLayout(panelTabellaPagamenti);
		gl_panelTabellaPagamenti.setHorizontalGroup(
			gl_panelTabellaPagamenti.createParallelGroup(Alignment.LEADING)
				.addComponent(toolBarPagamenti, GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
				.addComponent(panelCercaPagamenti, GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
				.addGroup(gl_panelTabellaPagamenti.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 886, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(463, Short.MAX_VALUE))
		);
		gl_panelTabellaPagamenti.setVerticalGroup(
			gl_panelTabellaPagamenti.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelTabellaPagamenti.createSequentialGroup()
					.addComponent(panelCercaPagamenti, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 509, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(toolBarPagamenti, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
		);
		
		JTablePagamenti table = new JTablePagamenti();
		scrollPane.setViewportView(table);
		
		JTextField textField = new JTextField();
		textField.setText("");
		textField.setColumns(10);
		
		JButton btnCercaPagamenti = new JButton("Filtra Pagamenti");
		GroupLayout gl_panelCercaPagamenti = new GroupLayout(panelCercaPagamenti);
		gl_panelCercaPagamenti.setHorizontalGroup(
			gl_panelCercaPagamenti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCercaPagamenti.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCercaPagamenti)
					.addContainerGap(835, Short.MAX_VALUE))
		);
		gl_panelCercaPagamenti.setVerticalGroup(
			gl_panelCercaPagamenti.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCercaPagamenti.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panelCercaPagamenti.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCercaPagamenti))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		panelCercaPagamenti.setLayout(gl_panelCercaPagamenti);
		
		JButton btnNuovo = new JButton("Nuovo");
		toolBarPagamenti.add(btnNuovo);
		
		JButton btnModifica = new JButton("Modifica");
		toolBarPagamenti.add(btnModifica);
		
		JButton btnDuplica = new JButton("Duplica");
		toolBarPagamenti.add(btnDuplica);
		
		JButton btnElimina = new JButton("Elimina");
		toolBarPagamenti.add(btnElimina);
		panelTabellaPagamenti.setLayout(gl_panelTabellaPagamenti);
		setLayout(gl_panelPagamenti);
	}

}
