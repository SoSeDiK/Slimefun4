package me.mrCookieSlime.Slimefun;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import io.github.thebusybiscuit.cscorelib2.math.DoubleHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.PlayerProfile;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.guides.BookSlimefunGuide;
import me.mrCookieSlime.Slimefun.guides.ChestSlimefunGuide;
import me.mrCookieSlime.Slimefun.guides.ISlimefunGuide;
import me.mrCookieSlime.Slimefun.guides.SlimefunGuideLayout;
import me.mrCookieSlime.Slimefun.hooks.github.Contributor;
import me.mrCookieSlime.Slimefun.hooks.github.IntegerFormat;

public final class SlimefunGuide {

	private SlimefunGuide() {}
	
	static {
		Map<SlimefunGuideLayout, ISlimefunGuide> layouts = SlimefunPlugin.getUtilities().guideLayouts;
		ISlimefunGuide chestGuide = new ChestSlimefunGuide();
		layouts.put(SlimefunGuideLayout.CHEST, chestGuide);
		layouts.put(SlimefunGuideLayout.CHEAT_SHEET, chestGuide);
		layouts.put(SlimefunGuideLayout.BOOK, new BookSlimefunGuide());
	}

	private static final int[] SLOTS = new int[] {0, 2, 3, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};

	@Deprecated
	public static ItemStack getItem() {
		return getItem(SlimefunGuideLayout.CHEST);
	}

	public static ItemStack getItem(SlimefunGuideLayout design) {
		switch (design) {
		case BOOK:
			return new CustomItem(new ItemStack(Material.ENCHANTED_BOOK), "&aРуководство Slimefun &7(книжный интерфейс)", "", "&eПравый клик &8\u21E8 &7просмотр", "&eShift + правый клик &8\u21E8 &7открыть настройки");
		case CHEAT_SHEET:
			return new CustomItem(new ItemStack(Material.ENCHANTED_BOOK), "&cРуководство Slimefun &4(режим выдачи предметов)", "", "&4&lОткрывается только администраторами", "", "&eПравый клик &8\u21E8 &7просмотр", "&eShift + правый клик &8\u21E8 &7открыть настройки");
		case CHEST:
			return new CustomItem(new ItemStack(Material.ENCHANTED_BOOK), "&aРуководство Slimefun &7(слотовый интерфейс)", "", "&eПравый клик &8\u21E8 &7просмотр", "&eShift + правый клик &8\u21E8 &7открыть настройки");
		default:
			return null;
		}
	}

	@Deprecated
	public static ItemStack getItem(boolean book) {
		return getItem(book ? SlimefunGuideLayout.BOOK: SlimefunGuideLayout.CHEST);
	}

	@Deprecated
	public static ItemStack getDeprecatedItem(boolean book) {
		return new CustomItem(new ItemStack(Material.ENCHANTED_BOOK), "&eРуководство Slimefun &7(правый клик)", (book ? "": "&2"), "&rЭто базовая информация по Slimefun системе", "&rТут Вы можете посмотреть продвинутые крафты предметов,", "&rкоторые были добавлены на сервер", "&rУдачи в изучении ;)");
	}

	public static void openSettings(Player p, final ItemStack guide) {
		final ChestMenu menu = new ChestMenu("Настройки / Информация");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(
				pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F)
		);

		for (int i: SLOTS) {
			menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
			menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
		}


		if (SlimefunManager.isItemSimiliar(guide, getItem(SlimefunGuideLayout.CHEST), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Текущий дизайн: &eслотовый интерфейс", "", "&aСлотовый интерфейс", "&7Книжный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
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
		else if (SlimefunManager.isItemSimiliar(guide, getItem(SlimefunGuideLayout.BOOK), true)) {
			if (p.hasPermission("slimefun.cheat.items")) {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Текущий дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "&7Режим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEAT_SHEET));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
			else {
				menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Дизайн: &eкнижный интерфейс", "", "&7Слотовый интерфейс", "&aКнижный интерфейс", "", "&8\u21E8 &eНажмите &7для изменения"));
				menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
					pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
					openSettings(pl, pl.getInventory().getItemInMainHand());
					return false;
				});
			}
		}
		else if (SlimefunManager.isItemSimiliar(guide, getItem(SlimefunGuideLayout.CHEAT_SHEET), true)) {
			menu.addItem(19, new CustomItem(new ItemStack(Material.CHEST), "&7Текущий дизайн: &eрежим выдачи предметов", "", "&7Слотовый интерфейс", "&7Книжный интерфейс", "&aРежим выдачи предметов", "", "&8\u21E8 &eНажмите &7для изменения"));
			menu.addMenuClickHandler(19, (pl, slot, item, action) -> {
				pl.getInventory().setItemInMainHand(getItem(SlimefunGuideLayout.CHEST));
				openSettings(pl, pl.getInventory().getItemInMainHand());
				return false;
			});
		}

		menu.addItem(1, new CustomItem(new ItemStack(Material.WRITABLE_BOOK), "&aО нас…", "", "&7Версия: &a" + Slimefun.getVersion(), "&7Установленные дополнения: &b" + Slimefun.getInstalledAddons().size(), "&7Авторы: &e" + SlimefunPlugin.getUtilities().contributors.size(), "", "&7\u21E8 Нажмите, чтобы увидеть список людей, создавших этот плагин :)"));
		menu.addMenuClickHandler(1, (pl, slot, item, action) -> {
			openCredits(pl, guide);
			return false;
		});

		try {
			menu.addItem(4, new CustomItem(new ItemStack(Material.COMPARATOR), "&eИсходный код", "", "&7Байтов в коде плагина: &6" + IntegerFormat.formatBigNumber(SlimefunPlugin.getUtilities().codeBytes), "&7Последнее обновление: &a" + IntegerFormat.timeDelta(SlimefunPlugin.getUtilities().lastUpdate) + " назад", "&7Форков: &e" + SlimefunPlugin.getUtilities().forks, "&7Звёзд: &e" + SlimefunPlugin.getUtilities().stars, "", "&7&oSlimefun 4 — это общедоступный проект,", "&7&oисходный код плагина доступен на сайте GitHub.", "&7&oИ если Вы хотите, чтобы плагин оставался 'жив',", "&7&oто подумайте над его улучшением.", "", "&7\u21E8 Нажмите, чтобы открыть страницу плагина на GitHub."));
			menu.addMenuClickHandler(4, (pl, slot, item, action) -> {
				pl.closeInventory();
				pl.sendMessage("");
				pl.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&ohttps://github.com/TheBusyBiscuit/Slimefun4"));
				pl.sendMessage("");
				return false;
			});
		} catch (Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "An Error occured while creating the Info-Panel for Slimefun " + Slimefun.getVersion(), x);
		}

		menu.addItem(7, new CustomItem(new ItemStack(Material.REDSTONE), "&4Баг-трекер", "", "&7Нерешённые вопросы: &a" + SlimefunPlugin.getUtilities().issues, "&7Ожидаемые изменения: &a" + SlimefunPlugin.getUtilities().prs, "", "&7\u21E8 Нажмите, чтобы перейти на страницу багов Slimefun"));
		menu.addMenuClickHandler(7, (pl, slot, item, action) -> {
			pl.closeInventory();
			pl.sendMessage("");
			pl.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&ohttps://github.com/TheBusyBiscuit/Slimefun4/issues"));
			pl.sendMessage("");
			return false;
		});

		menu.open(p);
	}

	private static void openCredits(Player p, final ItemStack guide) {
		final ChestMenu menu = new ChestMenu("Мы благодарны им:");

		menu.setEmptySlotsClickable(false);
		menu.addMenuOpeningHandler(pl -> pl.playSound(pl.getLocation(), Sound.BLOCK_NOTE_BLOCK_HARP, 0.7F, 0.7F));

		for (int i = 0; i < 9; i++) {
			if (i != 4) {
				menu.addItem(i, new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "));
				menu.addMenuClickHandler(i, (pl, slot, item, action) -> false);
			}
			else {
				menu.addItem(4, new CustomItem(new ItemStack(Material.EMERALD), "&7\u21E6 Вернуться назад"));
				menu.addMenuClickHandler(4, (pl, slot, item, action) -> {
					openSettings(pl, guide);
					return false;
				});
			}
		}

		int index = 9;
		double total = 1.0 * SlimefunPlugin.getUtilities().contributors.stream().mapToInt(Contributor::getCommits).sum();

		for (final Contributor contributor: SlimefunPlugin.getUtilities().contributors) {
			ItemStack skull = new ItemStack(Material.PLAYER_HEAD);

			try {
				String texture = contributor.getTexture();
				if (texture != null) skull = CustomSkull.getItem(texture);
			} catch (Exception x) {
				Slimefun.getLogger().log(Level.SEVERE, "An Error occured while fetching a Contributor Head for Slimefun " + Slimefun.getVersion(), x);
			}

			SkullMeta meta = (SkullMeta) skull.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD + contributor.getName());

			if (contributor.getCommits() > 0) {
				double percentage = DoubleHandler.fixDouble((contributor.getCommits() * 100.0) / total, 2);
				meta.setLore(Arrays.asList("", ChatColor.translateAlternateColorCodes('&', "&7Роль: &r" + contributor.getJob()), ChatColor.translateAlternateColorCodes('&', "&7Вклад: &r" + contributor.getCommits() + " коммитов &7(&r" + percentage + "%&7)"), "", ChatColor.translateAlternateColorCodes('&', "&7\u21E8 Нажмите для просмотра GitHub профиля")));
			}
			else {
				meta.setLore(Arrays.asList("", ChatColor.translateAlternateColorCodes('&', "&7Роль: &r" + contributor.getJob())));
			}

			skull.setItemMeta(meta);

			menu.addItem(index, skull);
			menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
				if (contributor.getCommits() > 0) {
					pl.closeInventory();
					pl.sendMessage("");
					pl.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&o" + contributor.getProfile()));
					pl.sendMessage("");
				}
				return false;
			});

			index++;
		}

		menu.open(p);
	}

	public static void openCheatMenu(Player p) {
		openMainMenuAsync(p, false, SlimefunGuideLayout.CHEAT_SHEET, 1);
	}

	@Deprecated
	public static void openGuide(Player p, boolean book) {
		openGuide(p, book ? SlimefunGuideLayout.BOOK: SlimefunGuideLayout.CHEST);
	}

	public static void openGuide(Player p, SlimefunGuideLayout layout) {
		if (!SlimefunPlugin.getWhitelist().getBoolean(p.getWorld().getName() + ".enabled")) return;
		if (!SlimefunPlugin.getWhitelist().getBoolean(p.getWorld().getName() + ".enabled-items.SLIMEFUN_GUIDE")) return;

		ISlimefunGuide guide = SlimefunPlugin.getUtilities().guideLayouts.get(layout);
		Object last = null;
		
		Optional<PlayerProfile> profile = PlayerProfile.find(p);
		if (profile.isPresent()) {
			last = guide.getLastEntry(profile.get(), false);
			guide.handleHistory(profile.get(), last, true);
		}
		else {
			openMainMenuAsync(p, true, layout, 1);
		}
	}

	private static void openMainMenuAsync(final Player player, final boolean survival, final SlimefunGuideLayout layout, final int selected_page) {
		if (!PlayerProfile.get(player, profile -> Slimefun.runSync(() -> openMainMenu(profile, layout, survival, selected_page))))
			Slimefun.getLocal().sendMessage(player, "messages.opening-guide");
	}

	public static void openMainMenu(final PlayerProfile profile, SlimefunGuideLayout layout, final boolean survival, final int selected_page) {
		SlimefunPlugin.getUtilities().guideLayouts.get(layout).openMainMenu(profile, survival, selected_page);
	}

	public static void openCategory(final PlayerProfile profile, final Category category, SlimefunGuideLayout layout, final boolean survival, final int selected_page) {
		if (category == null) return;
		SlimefunPlugin.getUtilities().guideLayouts.get(layout).openCategory(profile, category, survival, selected_page);
	}

	public static void openSearch(final PlayerProfile profile, String input, boolean survival, boolean addToHistory) {
		SlimefunPlugin.getUtilities().guideLayouts.get(SlimefunGuideLayout.CHEST).openSearch(profile, input, survival, addToHistory);
	}

	public static void displayItem(PlayerProfile profile, final ItemStack item, boolean addToHistory) {
		SlimefunPlugin.getUtilities().guideLayouts.get(SlimefunGuideLayout.CHEST).displayItem(profile, item, addToHistory);
	}

	public static void displayItem(PlayerProfile profile, final SlimefunItem item, boolean addToHistory) {
		SlimefunPlugin.getUtilities().guideLayouts.get(SlimefunGuideLayout.CHEST).displayItem(profile, item, addToHistory);
	}
}
