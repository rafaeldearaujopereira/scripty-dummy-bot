package com.rafpereira.scriptybot;

import java.awt.event.InputEvent;

public class LeftClick extends Command {

	@Override
	public void doAction() {
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
