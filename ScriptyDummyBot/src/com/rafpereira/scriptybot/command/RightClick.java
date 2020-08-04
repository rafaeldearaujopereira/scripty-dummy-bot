package com.rafpereira.scriptybot.command;

import java.awt.event.InputEvent;

/**
 * A single mouse right click.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class RightClick extends Command {

	/**
	 * Do a right click on the mouse.
	 */
	@Override
	public void doAction() {
		bot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
	}

	@Override
	public String getDescription() {
		return "Clicks with the right button where the mouse is currently pointing.";
	}

}
