package com.rafpereira.scriptybot;

import java.awt.event.InputEvent;

public class RightClick extends Command {

	@Override
	public void doAction() {
		bot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		bot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
	}

}
