package com.magazzino.gui.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.TabExpander;

import com.magazzino.utilities.ImageScaler;


import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JToolBar;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tableFornitori;
	private JTextField textFieldCercaFornitori;
	private JTable tableDocumenti;
	private JTextField textFieldCercaDocumenti;
	private JTextField textField_4;
	private JTextField textField_5;
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

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1354, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnTabelle = new JMenu("Tabelle");
		menuBar.add(mnTabelle);
		
		JMenuItem mntmMetodiDiPagamento = new JMenuItem("Metodi Di Pagamento");
		mnTabelle.add(mntmMetodiDiPagamento);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelMenuContainer = new JPanel();
		
		JPanel panelContainerMain = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panelMenuContainer, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
						.addComponent(panelContainerMain, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelMenuContainer, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelContainerMain, GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelContainerMain.setLayout(new CardLayout(0, 0));
		
		JPanelPagamenti panelPagamenti = new JPanelPagamenti();
		panelContainerMain.add(panelPagamenti, "name_109858100978992");
		
		
		JPanelProdotti panelProdotti = new JPanelProdotti();
		panelContainerMain.add(panelProdotti, "name_108708503496359");
		
				
		JPanelMagazzino panelMagazzino = new JPanelMagazzino();
		panelContainerMain.add(panelMagazzino, "name_122968321548138");
		
		
		
		JPanelClienti panelClienti = new JPanelClienti();
		panelContainerMain.add(panelClienti, "name_132496448297532");
		
		
		
		JPanelFornitori panelFornitori = new JPanelFornitori();
		panelContainerMain.add(panelFornitori, "name_132943175041526");
		
		
		JPanelDocumenti panelDocumenti = new JPanelDocumenti();
		panelContainerMain.add(panelDocumenti, "name_133051186006174");

		
		JPanel panelMenu = new JPanel();
		GroupLayout gl_panelMenuContainer = new GroupLayout(panelMenuContainer);
		gl_panelMenuContainer.setHorizontalGroup(
			gl_panelMenuContainer.createParallelGroup(Alignment.LEADING)
				.addComponent(panelMenu, GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
		);
		gl_panelMenuContainer.setVerticalGroup(
			gl_panelMenuContainer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenuContainer.createSequentialGroup()
					.addComponent(panelMenu, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		GroupLayout gl_panelMenu = new GroupLayout(panelMenu);
		gl_panelMenu.setHorizontalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
					.addGap(76))
		);
		gl_panelMenu.setVerticalGroup(
			gl_panelMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMenu.createSequentialGroup()
					.addContainerGap()
					.addComponent(toolBar, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JMenuBar menuBarNuovo = new JMenuBar();
		toolBar.add(menuBarNuovo);
		
		JMenu mnNuovo = new JMenu("Nuovo");
		menuBarNuovo.add(mnNuovo);
		mnNuovo.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/nuovoIcon.png"), 5)));
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnNuovo.add(mntmCliente);
		
		JMenuItem mntmFornitore = new JMenuItem("Fornitore");
		mnNuovo.add(mntmFornitore);
		
		JMenuItem mntmProdotto = new JMenuItem("Prodotto");
		mnNuovo.add(mntmProdotto);
		
		JMenuItem mntmFattura = new JMenuItem("Fattura In Entrata");
		mnNuovo.add(mntmFattura);
		
		JMenuItem mntmFatturaInUscita = new JMenuItem("Fattura In Uscita");
		mnNuovo.add(mntmFatturaInUscita);
		
		JMenuItem mntmPreventivo = new JMenuItem("Preventivo");
		mnNuovo.add(mntmPreventivo);
		
		JMenuItem mntmPreventivoFornitore = new JMenuItem("Preventivo Fornitore");
		mnNuovo.add(mntmPreventivoFornitore);
		
		JMenuItem mntmDdtInUscita = new JMenuItem("DDT in Uscita");
		mnNuovo.add(mntmDdtInUscita);
		
		JMenuItem mntmDocumentoDiTrasporto = new JMenuItem("DDT in Entrata");
		mnNuovo.add(mntmDocumentoDiTrasporto);
	
		JButton btnProdotti = new JButton("Prodotti");
		btnProdotti.setBackground(new Color(255,255,255));
		btnProdotti.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/prodottiIcon.png"), 15)));
		toolBar.add(btnProdotti);
		
		JButton btnClienti = new JButton("Clienti");
		btnClienti.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/clientIcon.png"), 16.5)));
		toolBar.add(btnClienti);
		
		JButton btnFornitori = new JButton("Fornitori");
		btnFornitori.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/supplierIcon.png"), 6.5)));
		toolBar.add(btnFornitori);
		
		JMenuBar menuBarPagamenti = new JMenuBar();
		toolBar.add(menuBarPagamenti);
		
		JMenu mnPagamenti = new JMenu("Pagamenti");
		mnPagamenti.setBackground(new Color(255,255,255));
		mnPagamenti.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/paymentIcon.png"), 15)));
		menuBarPagamenti.add(mnPagamenti);
		
		JMenuItem mntmTutti = new JMenuItem("Tutti");
		mnPagamenti.add(mntmTutti);
		
		JMenuItem mntmEntrata = new JMenuItem("Entrata");
		mnPagamenti.add(mntmEntrata);
		
		JMenuItem mntmUscita = new JMenuItem("Uscita");
		mnPagamenti.add(mntmUscita);
		
		JButton btnMagazzino = new JButton("Magazzino");
		btnMagazzino.setBackground(new Color(255,255,255));
		btnMagazzino.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/supplierIcon.png"), 6.5)));
		toolBar.add(btnMagazzino);
		
		JMenuBar menuBarDocumenti = new JMenuBar();
		toolBar.add(menuBarDocumenti);
		
		JMenu mnDocumenti = new JMenu("Documenti");
		mnDocumenti.setBackground(new Color(255,255,255));
		mnDocumenti.setIcon(new ImageIcon(ImageScaler.getScaledImage(new ImageIcon("Icons/documentsIcon.png"), 6)));
		menuBarDocumenti.add(mnDocumenti);
		
		JMenuItem mntmFatture = new JMenuItem("Fatture");
		mnDocumenti.add(mntmFatture);
		
		JMenuItem mntmDdt = new JMenuItem("DDT");
		mnDocumenti.add(mntmDdt);
		
		JMenuItem mntmPreventivi = new JMenuItem("Preventivi");
		mnDocumenti.add(mntmPreventivi);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		toolBar.add(separator_3);
		
		JButton btnOpzioni = new JButton("Opzioni");
		toolBar.add(btnOpzioni);
		panelMenu.setLayout(gl_panelMenu);
		panelMenuContainer.setLayout(gl_panelMenuContainer);
		contentPane.setLayout(gl_contentPane);
	}
}
