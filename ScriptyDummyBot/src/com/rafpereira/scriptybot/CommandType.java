package com.rafpereira.scriptybot;

public enum CommandType {

	LEFT_CLICK("Left click", LeftClick.class), 
	RIGHT_CLICK("Right click", RightClick.class);

	public String name;
	
	public Class<?> clazz;

	private CommandType(String nameParam, Class<?> clazzParam) {
		name = nameParam;
		clazz = clazzParam;
	}

	public Class<?> getClazz() {
		return clazz;
	}
	
	public static CommandType getByName(String name) {
		for (CommandType type  : values()) {
			if (type.name.equals(name)) {
				return type;
			}
		}
		return null;
	}

	public static String[] names() {
		String[] names = new String[values().length + 1];
		names[0] = "";
		for (int iType = 0; iType < values().length; iType++) {
			names[iType + 1] = values()[iType].name;
		}
		return names;
	}
	
}
