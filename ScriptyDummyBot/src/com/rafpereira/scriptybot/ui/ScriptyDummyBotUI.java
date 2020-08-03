package com.rafpereira.scriptybot.ui;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import com.rafpereira.scriptybot.CommandType;

/**
 * UI to configure and test the bot.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class ScriptyDummyBotUI extends JPanel {
	
	/**
	 * Main panel.
	 */
	public ScriptyDummyBotUI() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		String[] commandOptions = new String[] {"", "Open Program" , "Write", "Move Mouse To", "Right-Click", "Left-Click", "Hold Alt", "Hold Ctrl", "Hold Shift", "Release Alt", "Release Ctrl", "Release Shift", "Wait"};
		
		JComboBox<String> cbCommandOld = new JComboBox<String>(commandOptions);
		this.add(cbCommandOld);
		
		
		JComboBox<String> cbCommand = new JComboBox<>(CommandType.names());
		this.add(cbCommand);
		
	}
	

	/**
	 * Recommended when serialized (JPanel).
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * Starts the example.
	 * @param args Not used.
	 */
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
