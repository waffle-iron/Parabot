package org.parabot;

import javax.swing.UIManager;

import org.parabot.core.Core;
import org.parabot.core.Directories;
import org.parabot.core.ui.ServerSelector;

/**
 * Parabot X - A revolution in bot clients
 * 
 * @author Clisprail
 * @author Matt, Dane, Parameter
 * @version 2.0
 */
public class Landing {

	public static void main(String... args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable t) {
			t.printStackTrace();
		}
		Directories.validate();
		Core.enableDevMode();
		ServerSelector.getInstance().setVisible(true);
	}
}
