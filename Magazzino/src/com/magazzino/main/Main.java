package com.magazzino.main;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import com.magazzino.gui.view.MainFrame;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainFrame mainFrame = new MainFrame();
				mainFrame.setVisible(true);				
			}
		});
	}

}
