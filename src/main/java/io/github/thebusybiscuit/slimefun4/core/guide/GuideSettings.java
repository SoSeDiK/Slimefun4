package io.github.thebusybiscuit.slimefun4.core.guide;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.core.services.github.Contributor;
import io.github.thebusybiscuit.slimefun4.core.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.core.utils.NumberUtils;
import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public final class GuideSettings {
	
	private static final int[] SLOTS = new int[] {0, 2, 4, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

	private GuideSettings() {}
	
	public static void openSettings(Player p, final ItemStack guide) {
		final ChestMenu menu = new ChestMenu("Настройки / Информация");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		menu.addItem(1, new CustomItem(getItem(SlimefunGuideLayout.CHEST), "&e\u21E6 Назад", "", "&7Вернуться к руководству"));
		menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
			SlimefunGuide.openGuide(pl, guide);
			return false;
		});
		
		for (int i: SLOTS) {
			menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
			menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
		}

		if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEST), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Дизайн: &eслотовый интерфейс", "", "&aСлотовый интерфейс", "&7Книжный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Дизайн: &eслотовый интерфейс", "", "&aСлотовый интерфейс", "&7Книжный интерфейс", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.BOOK), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.BOOK), "&7Дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEAT_SHEET));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(19, new CustomItem(new ItemStack(Material.BOOK), "&7Дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEAT_SHEET), true)) {
			menu.addItem(19, new CustomItem(new ItemStack(Material.COMMAND_BLOCK), "&7Дизайн: &eрежим выдачи предметов", "", "&7Слотовый интерфейс", "&7Книжный интерфейс", "&aРежим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
			menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
				pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
				openSettings(pl, pl.getInventory().getItemInMainHand());
				return false;
			});
		}

		menu.addItem(3, new CustomItem(new ItemStack(Material.WRITABLE_BOOK),
				"&aО нас…",
				"",
				"&7Версия Slimefun: &a" + Slimefun.getVersion(),
				"&7Версия CS-CoreLib: &a" + CSCoreLib.getLib().getDescription().getVersion(),
				"&7Установленные дополнения: &b" + Slimefun.getInstalledAddons().size(),
				"&7Авторы: &e" + SlimefunPlugin.getGitHubService().getContributors().size(),
				"",
				"&7\u21E8 Нажмите, чтобы увидеть список людей, создавших этот плагин :)"
		));
		menu.addMenuClickHandler(3, (pl, slot, item, action) -> {
			openCredits(pl, 0);
			return false;
		});

		try {
			menu.addItem(5, new CustomItem(new ItemStack(Material.COMPARATOR), "&eИсходный код", "", "&7Байтов в коде плагина: &6" + NumberUtils.formatBigNumber(SlimefunPlugin.getGitHubService().getCodeSize()), "&7Последнее обновление: &a" + NumberUtils.timeDelta(SlimefunPlugin.getGitHubService().getLastUpdate()) + " назад", "&7Форков: &e" + SlimefunPlugin.getGitHubService().getForks(), "&7Звёзд: &e" + SlimefunPlugin.getGitHubService().getStars(), "", "&7&oSlimefun 4 — это общедоступный проект,", "&7&oисходный код плагина доступен на сайте GitHub.", "&7&oИ если Вы хотите, чтобы плагин оставался 'жив',", "&7&oто подумайте над его улучшением.", "", "&7\u21E8 Нажмите, чтобы открыть страницу плагина на GitHub."));
			menu.addMenuClickHandler(5, (pl, slot, item, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4");
				return false;
			});
		} catch (Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "An Error occured while creating the Info-Panel for Slimefun " + Slimefun.getVersion(), x);
		}

		menu.addItem(7, new CustomItem(new ItemStack(Material.KNOWLEDGE_BOOK), "&3Slimefun Вики", "", "&7Нужна помощь с предметом или машиной?", "&7Не можете понять, что делать дальше?", "&7*Вики поддерживается сообществом", "&7и доступна на английском языке!", "", "&7\u21E8 Нажмите, чтобы перейти на официальную Вики Slimefun"));
		menu.addMenuClickHandler(7, (pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/wiki");
			return false;
		});

		menu.addItem(20, new CustomItem(new ItemStack(Material.REDSTONE), "&4Баг-трекер", "", "&7Нерешённые вопросы: &a" + SlimefunPlugin.getGitHubService().getIssues(), "&7Ожидаемые изменения: &a" + SlimefunPlugin.getGitHubService().getPullRequests(), "", "&7\u21E8 Нажмите, чтобы перейти на страницу багов Slimefun"));
		menu.addMenuClickHandler(20, (pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/issues");
			return false;
		});
		
		// TODO: Resourcepack Install Button

		menu.open(p);
	}

	private static void openCredits(Player p, int page) {
		final ChestMenu menu = new ChestMenu("Мы благодарны им:");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		for (int i = 0; i < 9; i++) {
			if (i != 1) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
			}
			else {
				menu.addItem(1, new CustomItem(getItem(SlimefunGuideLayout.CHEST), "&e\u21E6 Back", "", "&7Вернуться назад"));
				menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
					openSettings(pl, p.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		
		for (int i = 45; i < 54; i++) {
			if (i != 46 && i != 52) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
			}
		}
		
		List<Contributor> contributors = new ArrayList<>(SlimefunPlugin.getGitHubService().getContributors().values());
		contributors.sort(Comparator.comparingInt(Contributor::index));
		
		boolean hasPrevious = page > 0;
		boolean hasNext = false;
		
		for (int i = page * 36; i < contributors.size(); i++) {
			if (i >= (page + 1) * 36) {
				hasNext = true;
				break;
			}
			
			Contributor contributor = contributors.get(i);
			ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
			
			try {
				skull = SkullItem.fromBase64(contributor.getTexture());
			} catch (Exception e) {
				Slimefun.getLogger().log(Level.SEVERE, "An Error occurred while inserting a Contributors head.", e);
			}

			SkullMeta meta = (SkullMeta) skull.getItemMeta();
			meta.setDisplayName(ChatColor.GRAY + contributor.getName()
					+ (!contributor.getName().equals(contributor.getMinecraftName()) ? ChatColor.DARK_GRAY + " (MC: " + contributor.getMinecraftName() + ")" : "")
			);
			
			List<String> lore = new LinkedList<>();
			lore.add("");
			
			for (Map.Entry<String, Integer> entry : contributor.getContributions().entrySet()) {
				String info = entry.getKey();
				
				if (entry.getValue() > 0) {
					info += " &7(коммитов: " + entry.getValue() + ")";
				}
				
				lore.add(ChatColors.color(info));
			}
			
			lore.add("");
			lore.add(ChatColors.color("&7\u21E8 Нажмите для просмотра GitHub профиля " + contributor.getName()));
			meta.setLore(lore);
			skull.setItemMeta(meta);

			menu.addItem(i - page * 36 + 9, skull);
			menu.addMenuClickHandler(i - page * 36 + 9, (pl, slot, item, action) -> {
				pl.closeInventory();
				ChatUtils.sendURL(pl, contributor.getProfile());
				return false;
			});
		}

		if (hasPrevious) {
			menu.addItem(46, new CustomItem(Material.LIME_STAINED_GLASS_PANE, "&e\u21E6 Предыдущая страница"));
			menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
				openCredits(pl, page - 1);
				return false;
			});
		}
		else {
			menu.addItem(46, new CustomItem(Material.BLACK_STAINED_GLASS_PANE, " "));
			menu.addMenuClickHandler(46, (pl, slot, item, action) -> false);
		}

		if (hasNext) {
			menu.addItem(52, new CustomItem(Material.LIME_STAINED_GLASS_PANE, "&eСледующая страница \u21E8"));
			menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
				openCredits(pl, page + 1);
				return false;
			});
		}
		else {
			menu.addItem(52, new CustomItem(Material.BLACK_STAINED_GLASS_PANE, " "));
			menu.addMenuClickHandler(52, (pl, slot, item, action) -> false);
		}

		menu.open(p);
	}

	private static ItemStack getItem(SlimefunGuideLayout layout) {
		return SlimefunGuide.getItem(layout);
	}
	
}
