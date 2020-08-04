package com.rafpereira.scriptybot.bot;

import java.util.ArrayList;

import com.rafpereira.scriptybot.command.Command;

public class ScriptBot {

	private ArrayList<Command> commands;

	private String name;

	public ScriptBot(String nameParam) {
		this.name = nameParam;
	}

	public ArrayList<Command> getCommands() {
		return commands;
	}

	public void setCommands(ArrayList<Command> commands) {
		this.commands = commands;
	}

	public void addCommand(Command command) {
		this.commands.add(command);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
