package com.rafpereira.scriptybot.bot;

import java.util.ArrayList;

import com.rafpereira.scriptybot.command.Command;

public class ScriptBot extends Command {

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

	@Override
	public void doAction() {
		for (Command command : commands) {
			command.doAction();
		}
	}

	@Override
	public String getDescription() {
		return "Execute the steps defined on the script: " + name;
	}
	
}
