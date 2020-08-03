package com.rafpereira.scriptybot;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

/**
 * Each bot script is a list of commands. A command defines each action that a robot will do.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public abstract class Command {

	/**
	 * A shared Robot component, that will perform the actions.
	 */
	protected static Robot bot;

	/**
	 * A list of parameters.
	 */
	private ArrayList<Object> parameters = new ArrayList<>();
	
	static {
		try {
			bot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Defines how this bot will do its action.
	 */
	public abstract void doAction();

	/**
	 * Gets the proper command of a type.
	 * @param type Type.
	 * @return A command instance of the type.
	 */
	public Command getInstance(CommandType type) {
		Command command = null;
		try {
			command = (Command) type.getClazz().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return command;
	}
	
	public ArrayList<Object> getParameters() {
		return parameters;
	}

	public void setParameters(ArrayList<Object> parameters) {
		this.parameters = parameters;
	}
	
}
