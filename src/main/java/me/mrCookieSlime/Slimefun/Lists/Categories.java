package me.mrCookieSlime.Slimefun.Lists;

import org.bukkit.Material;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.LockedCategory;
import me.mrCookieSlime.Slimefun.Objects.SeasonalCategory;
import me.mrCookieSlime.Slimefun.utils.Christmas;

/**
 * Built-in categories.
 * 
 * @author TheBusyBiscuit
 * @since 4.0
 * @see Category
 */
public final class Categories {
	
	private Categories() {}

	private static final String LORE = "&a> Нажмите, чтобы открыть";
	
	public static final Category WEAPONS = new Category(new CustomItem(SlimefunItems.SWORD_OF_BEHEADING, "&7Оружие", "", LORE), 1);
	public static final Category TOOLS = new Category(new CustomItem(SlimefunItems.AUTO_SMELT_PICKAXE, "&7Инструменты", "", LORE), 1);
	public static final Category PORTABLE = new Category(new CustomItem(SlimefunItems.BACKPACK_MEDIUM, "&7Предметы", "", LORE), 1);
	public static final Category FOOD = new Category(new CustomItem(SlimefunItems.FORTUNE_COOKIE, "&7Еда", "", LORE), 2);
	public static final Category MACHINES_1 = new Category(new CustomItem(Material.SMITHING_TABLE, "&7Основные машины", "", LORE), 1);
	public static final LockedCategory ELECTRICITY = new LockedCategory(new CustomItem(SlimefunItems.NUCLEAR_REACTOR, "&bЭлектричество", "", LORE), 4, MACHINES_1);
	public static final LockedCategory GPS = new LockedCategory(new CustomItem(SlimefunItems.GPS_TRANSMITTER, "&bМашины на базе GPS", "", LORE), 4, MACHINES_1);
	public static final Category ARMOR = new Category(new CustomItem(SlimefunItems.DAMASCUS_STEEL_CHESTPLATE, "&7Броня", "", LORE), 2);
	public static final Category LUMPS_AND_MAGIC = new Category(new CustomItem(SlimefunItems.RUNE_ENDER, "&7Магические предметы", "", LORE), 2);
	public static final Category MAGIC = new Category(new CustomItem(SlimefunItems.INFUSED_ELYTRA, "&7Магические приборы", "", LORE), 3);
	public static final Category MISC = new Category(new CustomItem(SlimefunItems.CAN, "&7Разное", "", LORE), 2);
	public static final Category TECH = new Category(new CustomItem(SlimefunItems.STEEL_JETPACK, "&7Технические приборы", "", LORE), 3);
	public static final Category RESOURCES = new Category(new CustomItem(SlimefunItems.SYNTHETIC_SAPPHIRE, "&7Ресурсы", "", LORE), 1);
	public static final Category CARGO = new LockedCategory(new CustomItem(SlimefunItems.CARGO_MANAGER, "&cУправление грузом", "", LORE), 4, MACHINES_1);
	public static final Category TECH_MISC = new Category(new CustomItem(SlimefunItems.HEATING_COIL, "&7Технические компоненты", "", LORE), 2);
	public static final Category MAGIC_ARMOR = new Category(new CustomItem(SlimefunItems.ENDER_HELMET, "&7Магическая броня", "", LORE), 2);
	public static final Category TALISMANS_1 = new Category(new CustomItem(SlimefunItems.TALISMAN, "&7Талисманы – &aступень I", "", LORE), 2);
	public static final LockedCategory TALISMANS_2 = new LockedCategory(new CustomItem(SlimefunItems.ENDER_TALISMAN, "&7Талисманы – &aступень II", "", LORE), 3, TALISMANS_1);
	
	// Seasonal Categories
	public static final SeasonalCategory CHRISTMAS = new SeasonalCategory(12, 1, new CustomItem(Material.NETHER_STAR, Christmas.color("Рождество"), "", "&c> Нажмите, чтобы помочь &aСанте"));
	public static final SeasonalCategory VALENTINES_DAY = new SeasonalCategory(2, 2, new CustomItem(Material.POPPY, "&dДень святого Валентина", "", "&d> Нажмите, чтобы отпраздновать любовь"));
	public static final SeasonalCategory EASTER = new SeasonalCategory(4, 2, new CustomItem(Material.EGG, "&6Пасха", "", "&a> Нажмите, чтобы порисовать яйца"));
	public static final SeasonalCategory BIRTHDAY = new SeasonalCategory(10, 1, new CustomItem(Material.FIREWORK_ROCKET, "&a&lДень рождения TheBusyBiscuit &7(26-е октября)", "", "&a> Нажмите, чтобы отпраздновать вместе с автором плагина!"));
	
}
