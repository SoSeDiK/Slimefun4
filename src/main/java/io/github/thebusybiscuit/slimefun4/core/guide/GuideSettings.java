package io.github.thebusybiscuit.slimefun4.core.guide;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import io.github.thebusybiscuit.cscorelib2.chat.ChatColors;
import io.github.thebusybiscuit.cscorelib2.data.PersistentDataAPI;
import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.core.services.github.Contributor;
import io.github.thebusybiscuit.slimefun4.core.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.core.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.core.utils.NumberUtils;
import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.SlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public final class GuideSettings {
	
	public static final NamespacedKey FIREWORKS_KEY = new NamespacedKey(SlimefunPlugin.instance, "research_fireworks");
	
	private static final int[] BACKGROUND_SLOTS = {1, 3, 5, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

	private GuideSettings() {}
	
	public static void openSettings(Player p, final ItemStack guide) {
		ChestMenu menu = new ChestMenu("Настройки / Информация");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		for (int slot : BACKGROUND_SLOTS) {
			menu.addItem(slot, ChestMenuUtils.getBackground());
			menu.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
		}
		
		addMenubar(p, menu, guide);
		addConfigurableOptions(p, menu, guide);

		menu.open(p);
	}

	private static void addMenubar(Player p, ChestMenu menu, ItemStack guide) {
		menu.addItem(0, new CustomItem(getItem(SlimefunGuideLayout.CHEST), "&e\u21E6 Назад", "", "&7Вернуться к руководству"),
		(pl, slot, item, action) -> {
			SlimefunGuide.openGuide(pl, guide);
			return false;
		});

		menu.addItem(2, new CustomItem(SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTk1MmQyYjNmMzUxYTZiMDQ4N2NjNTlkYjMxYmY1ZjI2NDExMzNlNWJhMDAwNmIxODU3NmU5OTZhMDI5M2U1MiJ9fX0="),
				"&cО нас…",
				"",
				"&7Авторов: &e" + SlimefunPlugin.getGitHubService().getContributors().size(),
				"",
				"&7Slimefun является общедоступным проектом",
				"&7и поддерживается большим комьюнити,",
				"&7здесь можно их всех увидеть",
				"", 
				"&7\u21E8 Нажмите, чтобы просмотреть"
		),
		(pl, slot, action, item) -> {
			openCredits(pl, 0);
			return false;
		});

		menu.addItem(4, new CustomItem(new ItemStack(Material.WRITABLE_BOOK),
				"&aВерсия Slimefun",
				"&7&oЭто очень важно во время составления баг-репортов!",
				"",
				"&7Версия Minecraft: &a" + Bukkit.getBukkitVersion(),
				"&7Версия Slimefunn: &a" + Slimefun.getVersion(),
				"&7Версия CS-CoreLib: &a" + CSCoreLib.getLib().getDescription().getVersion(),
				"&7Установленные дополнения: &b" + Slimefun.getInstalledAddons().size()
		),  ChestMenuUtils.getEmptyClickHandler());

		menu.addItem(6, new CustomItem(new ItemStack(Material.COMPARATOR), 
				"&eИсходный код",
				"", 
				"&7Байтов в коде плагина: &6" + NumberUtils.formatBigNumber(SlimefunPlugin.getGitHubService().getCodeSize()),
				"&7Последняя активность: &a" + NumberUtils.timeDelta(SlimefunPlugin.getGitHubService().getLastUpdate()) + " назад",
				"&7Форков: &e" + SlimefunPlugin.getGitHubService().getForks(),
				"&7Звёзд: &e" + SlimefunPlugin.getGitHubService().getStars(),
				"", 
				"&7&oSlimefun 4 — это общедоступный проект,",
				"&7&oисходный код плагина доступен на сайте GitHub.",
				"&7&oИ если Вы хотите, чтобы плагин оставался 'жив',",
				"&7&oто подумайте над его улучшением.",
				"", 
				"&7\u21E8 Нажмите, чтобы открыть страницу плагина на GitHub."
		),
		(pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4");
			return false;
		});

		menu.addItem(8, new CustomItem(new ItemStack(Material.KNOWLEDGE_BOOK), 
				"&3Slimefun Вики",
				"", 
				"&7Нужна помощь с предметом или машиной?",
				"&7Не можете понять, что делать дальше?",
				"&7Взгляните на Вики, поддерживаемое англоязычным",
				"&7сообществом Slimefun!",
				"", 
				"&7\u21E8 Нажмите, чтобы перейти на официальную Вики Slimefun"
		),
		(pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/wiki");
			return false;
		});
	}

	private static void addConfigurableOptions(Player p, ChestMenu menu, ItemStack guide) {
		int i = 19;
		
		if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEST), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.CHEST), "&7Дизайн: &eслотовый интерфейс", "", "&aСлотовый интерфейс", "&7Книжный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(i, new CustomItem(new ItemStack(Material.CHEST), "&7Дизайн: &eслотовый интерфейс", "", "&aСлотовый интерфейс", "&7Книжный интерфейс", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.BOOK));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			
			i++;
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.BOOK), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.BOOK), "&7Дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEAT_SHEET));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(i, new CustomItem(new ItemStack(Material.BOOK), "&7Дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			
			i++;
		}
		else if (SlimefunManager.isItemSimilar(guide, getItem(SlimefunGuideLayout.CHEAT_SHEET), true)) {
			menu.addItem(i, new CustomItem(new ItemStack(Material.COMMAND_BLOCK), "&7Дизайн: &eрежим выдачи предметов", "", "&7Слотовый интерфейс", "&7Книжный интерфейс", "&aРежим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
			menu.addMenuClickHandler(i, (pl, slot, item, action) -> {
				pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
				openSettings(pl, pl.getInventory().getItemInMainHand());
				return false;
			});
			
			i++;
		}

		if (SlimefunPlugin.getSettings().researchFireworksEnabled) {
			if (!PersistentDataAPI.hasByte(p, FIREWORKS_KEY) || PersistentDataAPI.getByte(p, FIREWORKS_KEY) == (byte) 1) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.FIREWORK_ROCKET), "&bФейерверки: &aвключены", "", "&7При изучении предметов Вас", "&7поздравит большой фейерверк", "", "&7\u21E8 Нажмите для изменения"),
				(pl, slot, item, action) -> {
					PersistentDataAPI.setByte(pl, FIREWORKS_KEY, (byte) 0);
					openSettings(pl, guide);
					return false;
				});
			}
			else {
				menu.addItem(i, new CustomItem(new ItemStack(Material.FIREWORK_ROCKET), "&bФейерверки: &4отключены", "", "&7При изучении предметов Вас не", "&7поздравит большой фейерверк", "", "&7\u21E8 Нажмите для изменения"),
				(pl, slot, item, action) -> {
					PersistentDataAPI.setByte(pl, FIREWORKS_KEY, (byte) 1);
					openSettings(pl, guide);
					return false;
				});
			}
			
			i++;
		}

		menu.addItem(i, new CustomItem(new ItemStack(Material.REDSTONE), "&4Баг-трекер", "", "&7Нерешённые вопросы: &a" + SlimefunPlugin.getGitHubService().getIssues(), "&7Ожидаемые изменения: &a" + SlimefunPlugin.getGitHubService().getPullRequests(), "", "&7\u21E8 Нажмите, чтобы перейти на баг-трекер Slimefun"),
		(pl, slot, item, action) -> {
			pl.closeInventory();
			ChatUtils.sendURL(pl, "https://github.com/TheBusyBiscuit/Slimefun4/issues");
			return false;
		});
	}

	private static void openCredits(Player p, int page) {
		ChestMenu menu = new ChestMenu("Мы благодарны им:");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		for (int i = 0; i < 9; i++) {
			if (i != 1) {
				menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
			}
			else {
				menu.addItem(1, new CustomItem(ChestMenuUtils.getBackButton(), "&e\u21E6 Back", "", "&7Вернуться назад к настройкам"));
				menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
					openSettings(pl, p.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		
		for (int i = 45; i < 54; i++) {
			if (i != 46 && i != 52) {
				menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
			}
		}
		
		List<Contributor> contributors = new ArrayList<>(SlimefunPlugin.getGitHubService().getContributors().values());
		contributors.sort(Comparator.comparingInt(Contributor::index));
		
		int pages = (contributors.size() - 1) / 36 + 1;
		
		for (int i = page * 36; i < contributors.size(); i++) {
			if (i >= (page + 1) * 36) {
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

		menu.addItem(46, ChestMenuUtils.getPreviousButton(page + 1, pages));
		menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
			if (page > 0) openCredits(pl, page - 1);
			return false;
		});

		menu.addItem(52, ChestMenuUtils.getNextButton(page + 1, pages));
		menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
			if (page + 1 < pages) openCredits(pl, page + 1);
			return false;
		});

		menu.open(p);
	}

	private static ItemStack getItem(SlimefunGuideLayout layout) {
		return SlimefunGuide.getItem(layout);
	}
	
}
