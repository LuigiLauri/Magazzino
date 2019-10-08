package com.magazzino.gui.view;

import java.util.Date;
import java.util.Enumeration;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class JTablePagamenti extends JTable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	DefaultTableModel tableModel;
	private static final String[] headers = {" ","Data","Risorsa","Soggetto","Descrizione","Modalità di Pagamento","Entrate","Uscite","Saldato"};
	public JTablePagamenti() {
		super(null,headers);
		tableModel = new DefaultTableModel();
		
		//super.setAutoCreateColumnsFromModel(true);
		String[] tryRow = {"","Data","Risorsa","Soggetto","fgjdfgj","Modalità di Pagamento","Entrate","Uscite","Saldato"};
		tableModel.addRow(tryRow);
		super.setModel(tableModel);
		setAutoCreateRowSorter(true);

}
}
