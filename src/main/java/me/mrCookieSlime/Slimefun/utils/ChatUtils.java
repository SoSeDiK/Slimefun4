package me.mrCookieSlime.Slimefun.utils;

import org.bukkit.entity.Player;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;

public final class ChatUtils {
	
	private ChatUtils() {}
	
	public static void sendURL(Player p, String url) {
		p.sendMessage("");
		p.sendMessage(ChatColors.color("&7&oНажмите сюда:"));
		p.sendMessage(ChatColors.color("&7&o" + url));
		p.sendMessage("");
	}

}
