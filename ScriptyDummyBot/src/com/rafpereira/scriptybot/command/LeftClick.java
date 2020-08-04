package com.rafpereira.scriptybot.command;

import java.awt.event.InputEvent;

/**
 * A single mouse left click.
 * 
 * @author rafaeldearaujopereira
 * @since 1.0
 * @version 1.0
 */
public class LeftClick extends Command {

	/**
	 * Do a left click on the mouse.
	 */
	@Override
	public void doAction() {
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	@Override
	public String getDescription() {
		return "Clicks with the left button where the mouse is currently pointing.";
	}

}
