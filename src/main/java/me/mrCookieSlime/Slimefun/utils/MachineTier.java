package me.mrCookieSlime.Slimefun.utils;

public enum MachineTier {
	
	BASIC("&eБазовый"),
	AVERAGE("&6Средний"),
	MEDIUM("&aУлучшенный"),
	GOOD("&2Хороший"),
	ADVANCED("&6Продвинутый"),
	END_GAME("последней разработки");
	
	private String prefix;
	
	private MachineTier(String prefix) {
		this.prefix = prefix;
	}
	
	@Override
	public String toString() {
		return prefix;
	}
	
	public String and(MachineType type) {
		if (this == END_GAME) return "&4" + type.toString() + " " + this;
		return this + " " + type.toString().toLowerCase();
	}

}
