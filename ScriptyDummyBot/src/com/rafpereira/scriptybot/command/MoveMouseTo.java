package com.rafpereira.scriptybot.command;

/**
 * A move the mouse to a position.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class MoveMouseTo extends Command {

	/**
	 * Constructor, defining the parameters required.
	 */
	public MoveMouseTo() {
		super();
		parameterDefinitions.put("x", Integer.class);
		parameterDefinitions.put("y", Integer.class);
	}

	/**
	 * Move the mouse.
	 */
	@Override
	public void doAction() {
		int x = (int) parameters.get("x");
		int y = (int) parameters.get("y");
		bot.mouseMove(x, y);
	}

	@Override
	public String getDescription() {
		int x = (int) parameters.get("x");
		int y = (int) parameters.get("y");
		return "Moves the mouse to the position (x = " + x + ", y = " + y + ")";
	}

}
