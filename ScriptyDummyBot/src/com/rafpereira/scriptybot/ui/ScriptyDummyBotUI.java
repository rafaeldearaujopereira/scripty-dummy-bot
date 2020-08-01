package com.rafpereira.scriptybot.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * UI to configure and test the bot.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class ScriptyDummyBotUI extends JPanel {
	
	

	/**
	 * Recommended when serialized (JPanel).
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Configure and Test a Robot");
				frame.add(new ScriptyDummyBotUI());
				frame.setResizable(false);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

	
	
}
