package com.rafpereira.scriptybot.command;

import com.rafpereira.scriptybot.bot.ScriptBot;

/**
 * All the commands available to use on the bot.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public enum CommandType {

	/** Run a script. */
	SCRIPT_BOT("Run a script", ScriptBot.class),

	/** Move the mouse to a position */
	MOVE_MOUSE_TO("Move Move To a Position", MoveMouseTo.class),

	/** Left click on the mouse */
	LEFT_CLICK("Left click", LeftClick.class),

	/** Right click on the mouse. */
	RIGHT_CLICK("Right click", RightClick.class);

	/**
	 * The name of the command type (for use on UI).
	 */
	public String name;

	/**
	 * The class of the command implementation.
	 */
	public Class<?> clazz;

	/**
	 * Constructor, defining the name and the command class.
	 * 
	 * @param nameParam  Name.
	 * @param clazzParam Class.
	 */
	private CommandType(String nameParam, Class<?> clazzParam) {
		name = nameParam;
		clazz = clazzParam;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	/**
	 * Gets the CommandType enum item by its name.
	 * 
	 * @param name Name.
	 * @return Command type item.
	 */
	public static CommandType getByName(String name) {
		for (CommandType type : values()) {
			if (type.name.equals(name)) {
				return type;
			}
		}
		return null;
	}

	/**
	 * Gets the array of names of command types (for use on UI).
	 * 
	 * @return Array of names.
	 */
	public static String[] names() {
		String[] names = new String[values().length + 1];
		names[0] = "";
		for (int iType = 0; iType < values().length; iType++) {
			names[iType + 1] = values()[iType].name;
		}
		return names;
	}

}
