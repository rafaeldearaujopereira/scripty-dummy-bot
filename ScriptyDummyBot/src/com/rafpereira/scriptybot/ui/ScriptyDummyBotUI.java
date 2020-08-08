package com.rafpereira.scriptybot.ui;

import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import com.rafpereira.scriptybot.bot.ScriptBot;
import com.rafpereira.scriptybot.command.CommandType;

/**
 * UI to configure and test the bot.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class ScriptyDummyBotUI extends JPanel {
	
	private static final String MAIN_SCRIPT = "<MAIN>";
	HashMap<String, ScriptBot> scripts = new HashMap<String, ScriptBot>();
	
	/**
	 * Main panel.
	 */
	public ScriptyDummyBotUI() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ScriptBot mainScript = new ScriptBot("Main");
		scripts.put(MAIN_SCRIPT, mainScript);		

		JComboBox<String> cbCommand = new JComboBox<>(CommandType.names());
		JButton btAddCommand = new JButton("Add to");
		JComboBox<ScriptBot> cbScript = new JComboBox<>(getScriptList());
		JTextField txNewScript = new JTextField();
		JButton btCreateNewScript = new JButton("Create");
		
		JPanel selCommandPanel = new JPanel();
		selCommandPanel.setLayout(new BoxLayout(selCommandPanel, BoxLayout.X_AXIS));
		selCommandPanel.setBorder(new EmptyBorder(1, 1, 1, 1));	
		selCommandPanel.add(new JLabel("Command: "));
		selCommandPanel.add(cbCommand);
		selCommandPanel.add(new JLabel(" "));
		selCommandPanel.add(btAddCommand);
		selCommandPanel.add(new JLabel(" "));
		selCommandPanel.add(cbScript);
	
		JPanel newScriptPanel = new JPanel();
		newScriptPanel.setLayout(new BoxLayout(newScriptPanel, BoxLayout.X_AXIS));
		newScriptPanel.setBorder(new EmptyBorder(1, 1, 1, 1));	
		newScriptPanel.add(new JLabel("New Sript: "));
		newScriptPanel.add(txNewScript);
		newScriptPanel.add(btCreateNewScript);
	
		
		this.add(selCommandPanel);
		this.add(new JLabel(" "));
		this.add(newScriptPanel);
		
	}
	
	/**
	 * Gets the array of scripts (bots).
	 * @return Array of scripts.
	 */
	private ScriptBot[] getScriptList() {
		ScriptBot[] scriptsArray = new ScriptBot[scripts.size()];
		int iScript = 0;
		for (ScriptBot script : scripts.values()) {
			scriptsArray[iScript] = script;
			iScript++;
		}
		return scriptsArray;
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
