package io.github.thebusybiscuit.slimefun4.core.attributes;

import org.bukkit.ChatColor;

public enum Radioactivity {

	MODERATE(ChatColor.YELLOW, "УМЕРЕННЫЙ"),
	HIGH(ChatColor.DARK_GREEN, "ВЫСОКИЙ"),
	VERY_HIGH(ChatColor.RED, "ЭКСТРЕМАЛЬНЫЙ"),
	VERY_DEADLY(ChatColor.DARK_RED, "СМЕРТЕЛЬНЫЙ");

	private final ChatColor color;
	private final String name;

	private Radioactivity(ChatColor color, String name) {
		this.color = color;
		this.name = name;
	}

	public String getLore() {
		return ChatColor.GREEN + "\u2622" + ChatColor.GRAY + " Уровень радиации: " + color + name;
	}

	public int getLevel() {
		return ordinal() + 1;
	}

}
