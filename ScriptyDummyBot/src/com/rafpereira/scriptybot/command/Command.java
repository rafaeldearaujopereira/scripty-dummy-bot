package com.rafpereira.scriptybot.command;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.HashMap;

/**
 * Each bot script is a list of commands. A command defines each action that a
 * robot will do.
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
	protected HashMap<String, Object> parameters = new HashMap<>();

	/**
	 * The list of valid parameters for the command.
	 */
	protected HashMap<String, Class<?>> parameterDefinitions = new HashMap<>();

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
	 * 
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

	/**
	 * Description of "what" the command will do. It is implemented by each command.
	 * 
	 * @return Description of the command.
	 */
	public abstract String getDescription();

	public HashMap<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(HashMap<String, Object> parameters) {
		this.parameters = parameters;
	}

	public HashMap<String, Class<?>> getParameterDefinitions() {
		return parameterDefinitions;
	}

}
