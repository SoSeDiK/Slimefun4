package me.mrCookieSlime.Slimefun.utils;

public enum MachineType {
	
	CAPACITOR("Конденсатор"),
	GENERATOR("Генератор"),
	MACHINE("Механизм");
	
	private String suffix;
	
	private MachineType(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public String toString() {
		return suffix;
	}

}
