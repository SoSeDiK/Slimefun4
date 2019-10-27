package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomPotion;
import me.mrCookieSlime.CSCoreLibPlugin.general.World.CustomSkull;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.items.StormStaff;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.utils.Christmas;
import me.mrCookieSlime.Slimefun.utils.MachineTier;
import me.mrCookieSlime.Slimefun.utils.MachineType;

public final class SlimefunItems {
	
	private SlimefunItems() {}
	
	/*		 Items 		*/
	public static final ItemStack PORTABLE_CRAFTER = new SlimefunItemStack("PORTABLE_CRAFTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzJlYzRhNGJkOGE1OGY4MzYxZjhhMDMwM2UyMTk5ZDMzZDYyNGVhNWY5MmY3Y2IzNDE0ZmVlOTVlMmQ4NjEifX19", "&6Портативный крафтер", "&a&oПереносной верстак", "", "&eПравый клик&7, чтобы открыть");
	public static final ItemStack PORTABLE_DUSTBIN = new SlimefunItemStack("PORTABLE_DUSTBIN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ==", "&6Портативный мусорный ящик", "&rВаш переносной уничтожитель вещей", "", "&eПравый клик&7, чтобы открыть");
	public static final ItemStack ENDER_BACKPACK = new SlimefunItemStack("ENDER_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ==", "&6Эндер-рюкзак","&a&oПереносной эндер-сундук", "", "&eПравый клик&7, чтобы открыть");
	public static final ItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack("MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "&6&lМагическое око Эндера", "&4&lТребует полный сет эндер-брони", "", "&7&eПравый клик&7, чтобы выпустить эндер-жемчуг");
	public static final ItemStack BROKEN_SPAWNER = new SlimefunItemStack("BROKEN_SPAWNER", Material.SPAWNER, "&cСломанный спавнер", "&7Тип: &b<тип>", "", "&cМожно починить, используя древний алтарь");
	public static final ItemStack REPAIRED_SPAWNER = new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bВосстановленный спавнер", "&7Тип: &b<тип>");
	public static final ItemStack INFERNAL_BONEMEAL = new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "&4Незеритовая костная мука", "", "&cВозможность ускорения роста", "&cнароста из Незера");
	
	/*		 Gadgets 		*/
	public static final ItemStack GOLD_PAN = new SlimefunItemStack("GOLD_PAN", Material.BOWL, "&6Рудопромывочный лоток", "&a&oСможете ли Вы заполучить все виды полезностей…", "", "&7&eПравый клик&7 по гравию для добычи различных вещей");
	public static final ItemStack PARACHUTE = new SlimefunItemStack("PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&r&lПарашют", "", "&7Зажмите &eShift&7 для использования");
	public static final ItemStack GRAPPLING_HOOK = new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6Крюк", "", "&7&eПравый клик&7 для использования");
	public static final ItemStack SOLAR_HELMET = new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "&bСолнечный шлем", "", "&a&oЗаряжает броню и предметы в руках");
	public static final ItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bТкань");
	public static final ItemStack CAN = new SlimefunItemStack("CAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTRkYTk3ZjA4MGUzOTViODQyYzRjYzgyYTg0MDgyM2Q0ZGJkOGNhNjg4YTIwNjg1M2U1NzgzZTRiZmRjMDEyIn19fQ==", "&rКонсервная банка");
	public static final ItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack("NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "&aПрибор ночного видения", "", "&9+ Ночное зрение");
	public static final ItemStack FARMER_SHOES = new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "&eФермерские ботинки", "", "&6&oПредотвращают Вас от вытаптывания грядок");
	public static final ItemStack INFUSED_MAGNET = new SlimefunItemStack("INFUSED_MAGNET", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ==", "&aЗаряженный магнит" , "", "&rЭтот магнит притягивает предметы радом,", "&rесли находится в Вашем инвентаре", "", "&7Зажмите &eShift&7, чтобы активировать");
	public static final ItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack("FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "&cНастой знаний", "", "&rДаёт возможность хранить некоторое", "&rколичество опыта в пустом пузырьке", "&7Стоимость: &a1 уровень");
	public static final ItemStack RAG = new SlimefunItemStack("RAG", Material.PAPER, "&cТряпка", "", "&aМедицинский запас I уровня", "", "&rВосстанавливает 2 сердца", "&rТушит огонь", "", "&7&eПравый клик&7, чтобы применить");
	public static final ItemStack BANDAGE = new SlimefunItemStack("BANDAGE", Material.PAPER, "&cБинт", "", "&aМедицинский запас II уровня", "", "&rВосстанавливает 4 сердца", "&rТушит огонь", "", "&7&eПравый клик&7, чтобы применить");
	public static final ItemStack SPLINT = new SlimefunItemStack("SPLINT", Material.STICK, "&cШина", "", "&aМедицинский запас I уровня", "", "&rВосстанавливает 2 сердца", "", "&7&eПравый клик&7, чтобы применить");
	public static final ItemStack VITAMINS = new SlimefunItemStack("VITAMINS", Material.NETHER_WART, "&cВитамины", "", "&aМедицинский запас III уровня", "", "&rВосстанавливает 4 сердца", "&rТушит огонь", "&rЛечит отравление/иссушение/радиацию", "", "&7&eПравый клик&7, чтобы применить");
	public static final ItemStack MEDICINE = new SlimefunItemStack("MEDICINE", Material.POTION, Color.RED, "&cВакцина", "", "&aМедицинский запас III уровня", "", "&rВосстанавливает 4 сердца", "&rТушит огонь", "&rИзлечивает отравление/иссушение/радиацию");
	
	/*		Backpacks		*/
	public static final ItemStack BACKPACK_SMALL = new SlimefunItemStack("SMALL_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eМаленький рюкзак","", "&7Размер: &e9 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack BACKPACK_MEDIUM = new SlimefunItemStack("MEDIUM_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eСредний рюкзак","", "&7Размер: &e18 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack BACKPACK_LARGE = new SlimefunItemStack("LARGE_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eБольшой рюкзак","", "&7Размер: &e27 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack WOVEN_BACKPACK = new SlimefunItemStack("WOVEN_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eТканевой рюкзак","", "&7Размер: &e36 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack GILDED_BACKPACK = new SlimefunItemStack("GILDED_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eУкреплённый рюкзак","", "&7Размер: &e45 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack RADIANT_BACKPACK = new SlimefunItemStack("RADIANT_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDBjYjFlNjdiNTEyYWIyZDRiZjNkN2FjZTBlYWFmNjFjMzJjZDQ2ODFkZGMzOTg3Y2ViMzI2NzA2YTMzZmEifX19", "&eРюкзак путешественника","", "&7Размер: &e54 &7слота &8(двойной сундук)", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack BOUND_BACKPACK = new SlimefunItemStack("BOUND_BACKPACK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmEzYjM0ODYyYjlhZmI2M2NmOGQ1Nzc5OTY2ZDNmYmE3MGFmODJiMDRlODNmM2VhZjY0NDlhZWJhIn19fQ==", "&cПерсональный рюкзак", "&7&oНе выпадает при смерти", "", "&7Размер: &e36 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");
	public static final ItemStack COOLER = new SlimefunItemStack("COOLER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDRjMTU3MjU4NGViNWRlMjI5ZGU5ZjVhNGY3NzlkMGFhY2JhZmZkMzNiY2IzM2ViNDUzNmE2YTJiYzZhMSJ9fX0=", "&bКулер","&rПозволяет хранить различные напитки и", "&rавтоматически употреблять их, когда Вы голодны,", "&rно имеете этот предмет в инвентаре", "", "&7Размер: &e27 &7слотов", "&7Идентификатор: <отсутствует>", "", "&7&eПравый клик&7, чтобы открыть");

	/*		 Jetpacks		*/
	public static final ItemStack DURALUMIN_JETPACK = new SlimefunItemStack("DURALUMIN_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eI", "", "&8\u21E8 &7Материал: &bдюрасталь", "&c&o&8\u21E8 &e\u26A1 &70 / 20 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.35", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack SOLDER_JETPACK = new SlimefunItemStack("SOLDER_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eII", "", "&8\u21E8 &7Материал: &bприпой", "&c&o&8\u21E8 &e\u26A1 &70 / 30 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.4", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack BILLON_JETPACK = new SlimefunItemStack("BILLON_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eIII", "", "&8\u21E8 &7Материал: &bбиллон", "&c&o&8\u21E8 &e\u26A1 &70 / 45 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.45", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack STEEL_JETPACK = new SlimefunItemStack("STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eIV", "", "&8\u21E8 &7Материал: &bсталь", "&c&o&8\u21E8 &e\u26A1 &70 / 60 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.5", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack("DAMASCUS_STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eV", "", "&8\u21E8 &7Материал: &bдамасская сталь", "&c&o&8\u21E8 &e\u26A1 &70 / 75 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.55", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack("REINFORCED_ALLOY_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Реактивный ранец &7– &eVI", "", "&8\u21E8 &7Материал: &bусиленный сплав", "&c&o&8\u21E8 &e\u26A1 &70 / 100 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.6", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack CARBONADO_JETPACK = new SlimefunItemStack("CARBONADO_JETPACK", Material.LEATHER_CHESTPLATE, Color.BLACK, "&9Реактивный ранец &7– &eVII", "", "&8\u21E8 &7Материал: &bкарбонадо &8(чёрный алмаз)", "&c&o&8\u21E8 &e\u26A1 &70 / 150 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.7", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack ARMORED_JETPACK = new SlimefunItemStack("ARMORED_JETPACK", Material.IRON_CHESTPLATE, "&9Бронированный реактивный ранец", "&8\u21E8 &7Материал: &bсталь", "", "&c&o&8\u21E8 &e\u26A1 &70 / 50 Дж", "&8\u21E8 &7Осевая нагрузка: &c0.45", "", "&7Зажмите &eShift&7, чтобы использовать");
	
	/*		 Jetboots		*/
	public static final ItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack("DURALUMIN_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eI", "", "&8\u21E8 &7Материал: &bдюрасталь", "&c&o&8\u21E8 &e\u26A1 &70 / 20 Дж", "&8\u21E8 &7Скорость: &a0.35", "&8\u21E8 &7Аккуратность: &c50%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack SOLDER_JETBOOTS = new SlimefunItemStack("SOLDER_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eII", "", "&8\u21E8 &7Материал: &bприпой", "&c&o&8\u21E8 &e\u26A1 &70 / 30 Дж", "&8\u21E8 &7Скорость: &a0.4", "&8\u21E8 &7Аккуратность: &660%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack BILLON_JETBOOTS = new SlimefunItemStack("BILLON_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eIII", "", "&8\u21E8 &7Материал: &bбиллон", "&c&o&8\u21E8 &e\u26A1 &70 / 40 Дж", "&8\u21E8 &7Скорость: &a0.45", "&8\u21E8 &7Аккуратность: &665%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack STEEL_JETBOOTS = new SlimefunItemStack("STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eIV", "", "&8\u21E8 &7Материал: &bсталь", "&c&o&8\u21E8 &e\u26A1 &70 / 50 Дж", "&8\u21E8 &7Скорость: &a0.5", "&8\u21E8 &7Аккуратность: &e70%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack("DAMASCUS_STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eV", "", "&8\u21E8 &7Материал: &bдамасская сталь", "&c&o&8\u21E8 &e\u26A1 &70 / 75 Дж", "&8\u21E8 &7Скорость: &a0.55", "&8\u21E8 &7Аккуратность: &a75%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack("REINFORCED_ALLOY_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные сапоги &7– &eVI", "", "&8\u21E8 &7Материал: &bусиленный сплав", "&c&o&8\u21E8 &e\u26A1 &70 / 100 Дж", "&8\u21E8 &7Скорость: &a0.6", "&8\u21E8 &7Аккуратность: &c80%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack CARBONADO_JETBOOTS = new SlimefunItemStack("CARBONADO_JETBOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&9Реактивные сапоги &7– &eVII", "", "&8\u21E8 &7Материал: &bкарбонадо &8(чёрный алмаз)", "&c&o&8\u21E8 &e\u26A1 &70 / 125 Дж", "&8\u21E8 &7Скорость: &a0.7", "&8\u21E8 &7Аккуратность: &c99.9%", "", "&7Зажмите &eShift&7, чтобы использовать");
	public static final ItemStack ARMORED_JETBOOTS = new SlimefunItemStack("ARMORED_JETBOOTS", Material.IRON_BOOTS, "&9Бронированные реактивные сапоги", "", "&8\u21E8 &7Материал: &bсталь", "&c&o&8\u21E8 &e\u26A1 &70 / 50 Дж", "&8\u21E8 &7Скорость: &a0.45", "&8\u21E8 &7Аккуратность: &e70%", "", "&7Зажмите &eShift&7, чтобы использовать");
	
	/*		 Multi Tools		*/
	public static final ItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack("DURALUMIN_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eI", "", "&8\u21E8 &7Материал: &bдюрасталь", "&c&o&8\u21E8 &e\u26A1 &70 / 20 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack("SOLDER_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eII", "", "&8\u21E8 &7Материал: &bприпой", "&c&o&8\u21E8 &e\u26A1 &70 / 30 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack BILLON_MULTI_TOOL = new SlimefunItemStack("BILLON_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eIII", "", "&8\u21E8 &7Материал: &bбиллон", "&c&o&8\u21E8 &e\u26A1 &70 / 40 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack STEEL_MULTI_TOOL = new SlimefunItemStack("STEEL_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eIV", "", "&8\u21E8 &7Материал: &bсталь", "&c&o&8\u21E8 &e\u26A1 &70 / 50 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack("DAMASCUS_STEEL_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eV", "", "&8\u21E8 &7Материал: &bдамасская сталь", "&c&o&8\u21E8 &e\u26A1 &70 / 60 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack("REINFORCED_ALLOY_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eVI", "", "&8\u21E8 &7Материал: &bусиленный сплав", "&c&o&8\u21E8 &e\u26A1 &70 / 75 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	public static final ItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack("CARBONADO_MULTI_TOOL", Material.SHEARS, "&9Мультиинструмент &7– &eVII", "", "&8\u21E8 &7Материал: &bкарбонадо &8(чёрный алмаз)", "&c&o&8\u21E8 &e\u26A1 &70 / 100 Дж", "", "&7&eПравый клик&7, чтобы использовать", "&7Зажмите &eShift + правый клик&7 для изменения режима");
	
	static {
		ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
		duralumin.setUnbreakable(true);
		DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

		ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
		solder.setUnbreakable(true);
		SOLDER_MULTI_TOOL.setItemMeta(solder);

		ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
		billon.setUnbreakable(true);
		BILLON_MULTI_TOOL.setItemMeta(billon);

		ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
		steel.setUnbreakable(true);
		STEEL_MULTI_TOOL.setItemMeta(steel);

		ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
		damascus.setUnbreakable(true);
		DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

		ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
		reinforced.setUnbreakable(true);
		REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

		ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
		carbonado.setUnbreakable(true);
		CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
	}
	
	/*		 Food 		*/
	public static final ItemStack FORTUNE_COOKIE = new SlimefunItemStack("FORTUNE_COOKIE", Material.COOKIE, "&6Печенье судьбы", "", "&a&oСообщает вещи о Вашем будущем :o");
	public static final ItemStack DIET_COOKIE = new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "&6Диетическое печенье", "", "&aНевероятно &oлёгкое &r&aпеченье");
	public static final ItemStack MAGIC_SUGAR = new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "&6Волшебный сахар", "", "&a&oПочувствуй всю силу Гермеса!");
	public static final ItemStack MONSTER_JERKY = new SlimefunItemStack("MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Вяленая плоть", "", "&a&oТеперь без голода");
	public static final ItemStack APPLE_JUICE = new SlimefunItemStack("APPLE_JUICE", new CustomPotion("&cЯблочный сок", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oВосстанавливает &b&o" + "3.0 единицы" + " &7&oголода"));
	public static final ItemStack MELON_JUICE = new SlimefunItemStack("MELON_JUICE", new CustomPotion("&cАрбузный сок", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oВосстанавливает &b&o" + "3.0 единицы" + " &7&oголода"));
	public static final ItemStack CARROT_JUICE = new SlimefunItemStack("CARROT_JUICE", new CustomPotion("&6Морковный сок", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oВосстанавливает &b&o" + "3.0 единицы" + " &7&oголода"));
	public static final ItemStack PUMPKIN_JUICE = new SlimefunItemStack("PUMPKIN_JUICE", new CustomPotion("&6Тыквенный сок", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oВосстанавливает &b&o" + "3.0 единицы" + " &7&oголода"));
	public static final ItemStack SWEET_BERRY_JUICE = new SlimefunItemStack("SWEET_BERRY_JUICE", new CustomPotion("&cСок из сладких ягод", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "", "&7&oВосстанавливает &b&o" + "3.0 единицы" + " &7&oголода"));
	public static final ItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack("GOLDEN_APPLE_JUICE", new CustomPotion("&bСок из золотого яблока", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0)));
	
	public static final ItemStack BEEF_JERKY = new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Вяленая говядина", "", "&rНасыщает до предела!");
	public static final ItemStack PORK_JERKY = new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Вяленая свинина", "", "&rНасыщает до предела!");
	public static final ItemStack CHICKEN_JERKY = new SlimefunItemStack("CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Вяленая курятина", "", "&rНасыщает до предела!");
	public static final ItemStack MUTTON_JERKY = new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "&6Вяленая баранина", "", "&rНасыщает до предела!");
	public static final ItemStack RABBIT_JERKY = new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "&6Вяленая крольчатина", "", "&rНасыщает до предела!");
	public static final ItemStack FISH_JERKY = new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Вяленая рыба", "", "&rНасыщает до предела!");
	
	/*		Christmas		*/
	public static final ItemStack CHRISTMAS_MILK = new CustomPotion("&6Стакан молока", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "", "&7&oВосстанавливает &b&o" + "2.5 единицы" + " &7&oголода");
	public static final ItemStack CHRISTMAS_CHOCOLATE_MILK = new CustomPotion("&6Шоколадное молоко", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 12, 0), "", "&7&oВосстанавливает &b&o" + "6.0 единиц" + " &7&oголода");
	public static final ItemStack CHRISTMAS_EGG_NOG = new CustomPotion("&aГоголь-моголь", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 7, 0), "", "&7&oВосстанавливает &b&o" + "3.5 единицы" + " &7&oголода");
	public static final ItemStack CHRISTMAS_APPLE_CIDER = new CustomPotion("&cЯблочный сидр", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&oВосстанавливает &b&o" + "7.0 единиц" + " &7&oголода");
	public static final ItemStack CHRISTMAS_COOKIE = new CustomItem(Material.COOKIE, Christmas.color("Рождественское печенье"));
	public static final ItemStack CHRISTMAS_FRUIT_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("Фруктовый торт"));
	public static final ItemStack CHRISTMAS_APPLE_PIE = new CustomItem(Material.PUMPKIN_PIE, "&rЯблочный пирог");
	public static final ItemStack CHRISTMAS_HOT_CHOCOLATE = new CustomPotion("&6Горячий шоколад", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 14, 0), "", "&7&oВосстанавливает &b&o" + "7.0 единиц" + " &7&oголода");
	public static final ItemStack CHRISTMAS_CAKE = new CustomItem(Material.PUMPKIN_PIE, Christmas.color("Рождественский торт"));
	public static final ItemStack CHRISTMAS_CARAMEL = new CustomItem(Material.BRICKS, "&6Карамель");
	public static final ItemStack CHRISTMAS_CARAMEL_APPLE = new CustomItem(Material.APPLE, "&6Карамельное яблоко");
	public static final ItemStack CHRISTMAS_CHOCOLATE_APPLE = new CustomItem(Material.APPLE, "&6Шоколадное яблоко");
	public static final ItemStack CHRISTMAS_PRESENT = new CustomItem(Material.CHEST, Christmas.color("Рождественский подарок"), "&7От &emrCookieSlime", "&7Для &eтебя :)", "", "&eПравый клик&7, чтобы открыть");
	
	/*		Easter			*/
	public static final ItemStack EASTER_EGG = new SlimefunItemStack("EASTER_EGG", Material.EGG, "&rПасхальное яйцо", "&bСюрприз! Сюрприз!");
	public static final ItemStack EASTER_CARROT_PIE = new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Морковный пирог");
	
	/*		 Weapons 		*/
	public static final ItemStack GRANDMAS_WALKING_STICK = new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Трость старой бабушки");
	public static final ItemStack GRANDPAS_WALKING_STICK = new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Трость старого дедушки");
	public static final ItemStack SWORD_OF_BEHEADING = new SlimefunItemStack("SWORD_OF_BEHEADING", Material.IRON_SWORD, "&6Меч обезглавливания", "&7Обезглавливание II", "", "&rШанс обезглавить мобов при убийстве", "&r(бонус: больше шансов для Визер-скелетов)");
	public static final ItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack("BLADE_OF_VAMPIRES", Material.GOLDEN_SWORD, "&cВампирский клинок", "&7Отбирание жизни I", "", "&r45% шанс восстановить 2 сердца при атаке");
	public static final ItemStack SEISMIC_AXE = new SlimefunItemStack("SEISMIC_AXE", Material.IRON_AXE, "&aСейсмический топор", "", "&7&oДля вызова землетрясений…", "", "&7&eПравый клик&7, чтобы использовать");
	
	static {
		GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
		BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
	}
	
	/*		Bows		*/
	public static final ItemStack EXPLOSIVE_BOW = new SlimefunItemStack("EXPLOSIVE_BOW", Material.BOW, "&cВзрывной лук", "&rЛюбые стрелы, выпущенные из этого лука,", "&rотправят противника в полёт");
	public static final ItemStack ICY_BOW = new SlimefunItemStack("ICY_BOW", Material.BOW, "&bЛедяной лук", "&rЛюбые стрелы, выпущенные из этого лука,", "&rзаморозят противника, запретив ему", "&rдвигаться на 2 секунды");
	
	/*		 Tools		*/
	public static final ItemStack AUTO_SMELT_PICKAXE = new SlimefunItemStack("SMELTERS_PICKAXE", Material.DIAMOND_PICKAXE, "&6Заводская кирка", "&c&lАвто-плавка", "", "&9Совместима с зачарованием «Удача»");
	public static final ItemStack LUMBER_AXE = new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Лесной топор", "&a&oПолностью срубает дерево за раз…");
	public static final ItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack("PICKAXE_OF_CONTAINMENT", Material.IRON_PICKAXE, "&cСдерживающая кирка", "", "&9Может подбирать спавнеры");
	public static final ItemStack HERCULES_PICKAXE = new SlimefunItemStack("HERCULES_PICKAXE", Material.IRON_PICKAXE, "&9Геркулесовая кирка", "", "&rНастолько мощная, что превращает все", "&rдобываемые руды в пыль и прах…");
	public static final ItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack("EXPLOSIVE_PICKAXE", Material.DIAMOND_PICKAXE, "&eВзрывная кирка", "", "&rДаёт возможность добывать хорошую", "&rчасть блоков одновременно…", "", "&9Совместима с зачарованием «Удача»");
	public static final ItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack("EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "&eВзрывная лопата", "", "&rДаёт возможность добывать хорошую", "&rчасть блоков одновременно…");
	public static final ItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack("PICKAXE_OF_THE_SEEKER", Material.DIAMOND_PICKAXE, "&aКирка искателя", "&rВсегда укажет Вам на ближайший источник руды, но", "&rможет получить повреждения при этом", "", "&7&eПравый клик&7 для поиска ближайшей залежи");
	public static final ItemStack COBALT_PICKAXE = new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Кобальтовая кирка");
	public static final ItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack("PICKAXE_OF_VEIN_MINING", Material.DIAMOND_PICKAXE, "&eКирка жильной добычи", "", "&rДобывает всю руду из жилы за раз…");
	
	static {
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 3);
		
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
	}
	
	/*		 Armor 		*/
	public static final ItemStack GLOWSTONE_HELMET = new SlimefunItemStack("GLOWSTONE_HELMET", Material.LEATHER_HELMET, Color.YELLOW, "&e&lСветокаменный шлем", "", "&a&oСияет ярче солнца!", "", "&9+ Ночное зрение");
	public static final ItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack("GLOWSTONE_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.YELLOW, "&e&lСветокаменный нагрудник", "", "&a&oСияет ярче солнца!", "", "&9+ Ночное зрение");
	public static final ItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack("GLOWSTONE_LEGGINGS", Material.LEATHER_LEGGINGS, Color.YELLOW, "&e&lСветокаменные штаны", "", "&a&oСияет ярче солнца!", "", "&9+ Ночное зрение");
	public static final ItemStack GLOWSTONE_BOOTS = new SlimefunItemStack("GLOWSTONE_BOOTS", Material.LEATHER_BOOTS, Color.YELLOW, "&e&lСветокаменные ботинки", "", "&a&oСияет ярче солнца!", "", "&9+ Ночное зрение");
	
	public static final ItemStack ENDER_HELMET = new SlimefunItemStack("ENDER_HELMET", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "&5&lЭндер-шлем", "", "&a&oИногда он тут, а иногда там! O_о");
	public static final ItemStack ENDER_CHESTPLATE = new SlimefunItemStack("ENDER_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "&5&lЭндер-нагрудник", "", "&a&oИногда он тут, а иногда там! O_о");
	public static final ItemStack ENDER_LEGGINGS = new SlimefunItemStack("ENDER_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "&5&lЭндер-штаны", "", "&a&oИногда они тут, а иногда там! O_о");
	public static final ItemStack ENDER_BOOTS = new SlimefunItemStack("ENDER_BOOTS", Material.LEATHER_BOOTS, Color.fromRGB(28, 25, 112), "&5&lЭндер-ботинки", "", "&a&oИногда они тут, а иногда там! O_о", "" , "&9+ Нет урона от эндер-жемчуга");
	
	public static final ItemStack SLIME_HELMET = new SlimefunItemStack("SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lСлизневый шлем", "", "&a&oНадаёт оживлённое чувство");
	public static final ItemStack SLIME_CHESTPLATE = new SlimefunItemStack("SLIME_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.LIME, "&a&lСлизневый нагрудник", "", "&a&oНадаёт оживлённое чувство");
	public static final ItemStack SLIME_LEGGINGS = new SlimefunItemStack("SLIME_LEGGINGS", Material.LEATHER_LEGGINGS, Color.LIME, "&a&lСлизневые штаны", "", "&a&oНадаёт оживлённое чувство", "", "&9+ Увеличение скорости");
	public static final ItemStack SLIME_BOOTS = new SlimefunItemStack("SLIME_BOOTS", Material.LEATHER_BOOTS, Color.LIME, "&a&lСлизневые ботинки", "", "&a&oНадаёт оживлённое чувство", "", "&9+ Увеличени высоты прыжка", "&9+ Нет урона от падения");
	
	public static final ItemStack CACTUS_HELMET = new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Кактусовый шлем", "", "&7М-м-м… Колючий!");
	public static final ItemStack CACTUS_CHESTPLATE = new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Кактусовый нагрудник", "", "&7М-м-м… Колючий!");
	public static final ItemStack CACTUS_LEGGINGS = new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Кактусовые штаны", "", "&7М-м-м… Колючие!");
	public static final ItemStack CACTUS_BOOTS = new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Кактусовые ботинки", "", "&7М-м-м… Колючие!");
	
	public static final ItemStack DAMASCUS_STEEL_HELMET = new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Шлем из дамасской стали");
	public static final ItemStack DAMASCUS_STEEL_CHESTPLATE = new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Нагрудник из дамасской стали");
	public static final ItemStack DAMASCUS_STEEL_LEGGINGS = new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Штаны из дамасской стали");
	public static final ItemStack DAMASCUS_STEEL_BOOTS = new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Ботинки из дамасской стали");
	
	public static final ItemStack REINFORCED_ALLOY_HELMET = new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bАрмированный шлем");
	public static final ItemStack REINFORCED_ALLOY_CHESTPLATE = new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bАрмированный нагрудник");
	public static final ItemStack REINFORCED_ALLOY_LEGGINGS = new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bАрмированные штаны");
	public static final ItemStack REINFORCED_ALLOY_BOOTS = new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bАрмированные ботинки");
	
	public static final ItemStack SCUBA_HELMET = new SlimefunItemStack("SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "&cШлем аквалангиста", "", "&bРазрешает дышать под водой", "&4&oЧасть химзащитного костюма");
	public static final ItemStack HAZMATSUIT_CHESTPLATE = new SlimefunItemStack("HAZMAT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.ORANGE, "&cКостюм химзащиты", "", "&bДаёт возможность ходить сквозь огонь", "&4&oЧасть химзащитного костюма");
	public static final ItemStack HAZMATSUIT_LEGGINGS = new SlimefunItemStack("HAZMAT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.ORANGE, "&cШтаны с химзащитой", "", "&4&oЧасть химзащитного костюма");
	public static final ItemStack RUBBER_BOOTS = new SlimefunItemStack("RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&cРезиновые ботинки", "", "&4&oЧасть химзащитного костюма");
	
	public static final ItemStack GILDED_IRON_HELMET = new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Позолоченный железный шлем");
	public static final ItemStack GILDED_IRON_CHESTPLATE = new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Позолоченный железный нагрудник");
	public static final ItemStack GILDED_IRON_LEGGINGS = new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Позолоченные железные штаны");
	public static final ItemStack GILDED_IRON_BOOTS = new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Позолоченные железные ботинки");
	
	public static final ItemStack GOLD_HELMET = new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Золотой шлем", "&9Из 12-каратного золота");
	public static final ItemStack GOLD_CHESTPLATE = new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Золотой нагрудник", "&9Из 12-каратного золота");
	public static final ItemStack GOLD_LEGGINGS = new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Золотые штаны", "&9Из 12-каратного золота");
	public static final ItemStack GOLD_BOOTS = new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Золотые ботинки", "&9Из 12-каратного золота");
	
	public static final ItemStack SLIME_HELMET_STEEL = new SlimefunItemStack("SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lСлизневый шлем", "&7&oУсиленный", "", "&a&oНадаёт оживлённое чувство");
	public static final ItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack("SLIME_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&a&lСлизневый нагрудник", "&7&oУсиленный", "", "&a&oНадаёт оживлённое чувство");
	public static final ItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack("SLIME_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&a&lСлизневые штаны", "&7&oУсиленные", "", "&a&oНадаёт оживлённое чувство", "", "&9+ Увеличение скорости");
	public static final ItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack("SLIME_STEEL_BOOTS", Material.IRON_BOOTS, "&a&lСлизневые ботинки", "&7&oУсиленные", "", "&a&oНадаёт оживлённое чувство", "", "&9+ Увеличени высоты прыжка", "&9+ Нет урона от падения");
	
	public static final ItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack("BOOTS_OF_THE_STOMPER", Material.LEATHER_BOOTS, Color.AQUA, "&bСапожки путешественника", "", "&9Весь урон от падения будет передан", "&9ближайшим мобам или игрокам", "", "&9+ Нет урона от падения");
	
	static {
		Map<Enchantment, Integer> cactus = new HashMap<>();
		cactus.put(Enchantment.THORNS, 3);
		cactus.put(Enchantment.DURABILITY, 6);
		
		CACTUS_HELMET.addUnsafeEnchantments(cactus);
		CACTUS_CHESTPLATE.addUnsafeEnchantments(cactus);
		CACTUS_LEGGINGS.addUnsafeEnchantments(cactus);
		CACTUS_BOOTS.addUnsafeEnchantments(cactus);
		
		Map<Enchantment, Integer> damascus = new HashMap<>();
		damascus.put(Enchantment.DURABILITY, 5);
		damascus.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		
		DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascus);
		DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascus);
		
		Map<Enchantment, Integer> reinforced = new HashMap<>();
		reinforced.put(Enchantment.DURABILITY, 9);
		reinforced.put(Enchantment.PROTECTION_ENVIRONMENTAL, 9);
		
		REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforced);
		REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforced);
		
		Map<Enchantment, Integer> gilded = new HashMap<>();
		gilded.put(Enchantment.DURABILITY, 6);
		gilded.put(Enchantment.PROTECTION_ENVIRONMENTAL, 8);
		
		GILDED_IRON_HELMET.addUnsafeEnchantments(gilded);
		GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gilded);
		GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gilded);
		GILDED_IRON_BOOTS.addUnsafeEnchantments(gilded);
		
		GOLD_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_CHESTPLATE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_LEGGINGS.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		GOLD_BOOTS.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		
		Map<Enchantment, Integer> slime = new HashMap<>();
		slime.put(Enchantment.DURABILITY, 4);
		slime.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
		
		SLIME_HELMET_STEEL.addUnsafeEnchantments(slime);
		SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slime);
		SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slime);
		SLIME_BOOTS_STEEL.addUnsafeEnchantments(slime);
	}
	
	/*		 Misc 		*/
	public static final ItemStack MAGIC_LUMP_1 = new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Осколок Незера &7– &eI", "", "&c&oПропитан энергией измерения Незер");
	public static final ItemStack MAGIC_LUMP_2 = new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Осколок Незера &7– &eII", "", "&c&oПропитан энергией измерения Незер");
	public static final ItemStack MAGIC_LUMP_3 = new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Осколок Незера &7– &eIII", "", "&c&oПропитан энергией измерения Незер");
	public static final ItemStack ENDER_LUMP_1 = new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Осколок Эндера &7– &eI", "", "&c&oНаполнен энергией измерения Энд");
	public static final ItemStack ENDER_LUMP_2 = new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Осколок Эндера &7– &eII", "", "&c&oНаполнен энергией измерения Энд");
	public static final ItemStack ENDER_LUMP_3 = new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Осколок Эндера &7– &eIII", "", "&c&oНаполнен энергией измерения Энд");
	public static final ItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack("MAGICAL_BOOK_COVER", Material.PAPER, "&6Обложка магической книги", "", "&a&oИспользуется для различных магических книг");
	public static final ItemStack BASIC_CIRCUIT_BOARD = new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bБазовая монтажная плата");
	public static final ItemStack ADVANCED_CIRCUIT_BOARD = new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bПродвинутая монтажная плата");
	public static final ItemStack WHEAT_FLOUR = new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&rПшеничная мука");
	public static final ItemStack STEEL_PLATE = new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lСтальная пластина");
	public static final ItemStack BATTERY = new SlimefunItemStack("BATTERY", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmUyZGRhNmVmNjE4NWQ0ZGQ2ZWE4Njg0ZTk3ZDM5YmE4YWIwMzdlMjVmNzVjZGVhNmJkMjlkZjhlYjM0ZWUifX19", "&6Батарея");
	public static final ItemStack CARBON = new SlimefunItemStack("CARBON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGIzYTA5NWI2YjgxZTZiOTg1M2ExOTMyNGVlZGYwYmI5MzQ5NDE3MjU4ZGQxNzNiOGVmZjg3YTA4N2FhIn19fQ==", "&eУглерод");
	public static final ItemStack COMPRESSED_CARBON = new SlimefunItemStack("COMPRESSED_CARBON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0=", "&cСжатый углерод");
	public static final ItemStack CARBON_CHUNK = new SlimefunItemStack("CARBON_CHUNK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzIxZDQ5NTE2NTc0OGQzMTE2Zjk5ZDZiNWJkNWQ0MmViOGJhNTkyYmNkZmFkMzdmZDk1ZjliNmMwNGEzYiJ9fX0=", "&4Кусочек углерода");
	public static final ItemStack STEEL_THRUSTER = new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lСтальной движитель");
	public static final ItemStack POWER_CRYSTAL = new SlimefunItemStack("POWER_CRYSTAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTNjMWIwMzZiNmUwMzUxN2IyODVhODExYmQ4NWU3M2Y1YWJmZGFjYzFkZGY5MGRmZjk2MmUxODA5MzRlMyJ9fX0=", "&c&lКристалл силы");
	public static final ItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bЦепь");
	public static final ItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bГак");
	public static final ItemStack SIFTED_ORE = new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Просеянная руда");
	public static final ItemStack STONE_CHUNK = new SlimefunItemStack("STONE_CHUNK", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U4ZjVhZGIxNGQ2YzlmNmI4MTBkMDI3NTQzZjFhOGMxZjQxN2UyZmVkOTkzYzk3YmNkODljNzRmNWUyZTgifX19", "&6Кусочек камня");
	public static final ItemStack LAVA_CRYSTAL = new SlimefunItemStack("LAVA_CRYSTAL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTNhZDhlZTg0OWVkZjA0ZWQ5YTI2Y2EzMzQxZjYwMzNiZDc2ZGNjNDIzMWVkMWVhNjNiNzU2NTc1MWIyN2FjIn19fQ==", "&4Лавовый кристалл");
	public static final ItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&rСоль");
	public static final ItemStack CHEESE = new SlimefunItemStack("CHEESE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzRmZWJiYzE1ZDFkNGNjNjJiZWRjNWQ3YTJiNmYwZjQ2Y2Q1YjA2OTZhODg0ZGU3NWUyODllMzVjYmI1M2EwIn19fQ==", "&rСыр");
	public static final ItemStack BUTTER = new SlimefunItemStack("BUTTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjY2YjE5ZjdkNjM1ZDAzNDczODkxZGYzMzAxN2M1NDkzNjMyMDlhOGY2MzI4YTg1NDJjMjEzZDA4NTI1ZSJ9fX0=", "&rМасло");
	public static final ItemStack DUCT_TAPE = new SlimefunItemStack("DUCT_TAPE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjJmYWFjZWFiNjM4NGZmZjVlZDI0YmI0NGE0YWYyZjU4NGViMTM4MjcyOWVjZDkzYTUzNjlhY2ZkNjY1NCJ9fX0=", "&8Скотч", "", "&rПозволяет чинить вещи в", "&rавтоматизированной наковальне");
	public static final ItemStack HEAVY_CREAM = new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&rЖирные сливки");
	public static final ItemStack CRUSHED_ORE = new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Дроблёная руда");
	public static final ItemStack PULVERIZED_ORE = new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Измельчённая руда");
	public static final ItemStack PURE_ORE_CLUSTER = new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Кластер чистой руды");
	public static final ItemStack SMALL_URANIUM = new SlimefunItemStack("SMALL_URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0=", "&cМаленький осколок урана", "", "&eУровень радиации: УМЕРЕННЫЙ", "&4&oНужен костюм химзащиты");
	public static final ItemStack TINY_URANIUM = new SlimefunItemStack("TINY_URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0=", "&cКрошечная кучка урана", "", "&cУровень радиации: НИЗКИЙ", "&4&oКостюм химзащиты не требуется");
	
	public static final ItemStack MAGNET = new SlimefunItemStack("MAGNET", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ==", "&cМагнит");
	public static final ItemStack NECROTIC_SKULL = new SlimefunItemStack("NECROTIC_SKULL", Material.WITHER_SKELETON_SKULL, "&cНекротический череп");
	public static final ItemStack ESSENCE_OF_AFTERLIFE = new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Эссенция загробной жизни");
	public static final ItemStack ELECTRO_MAGNET = new SlimefunItemStack("ELECTRO_MAGNET", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWJhOGViYzRjNmE4MTczMDk0NzQ5OWJmN2UxZDVlNzNmZWQ2YzFiYjJjMDUxZTk2ZDM1ZWIxNmQyNDYxMGU3In19fQ==", "&cЭлектромагнит");
	public static final ItemStack HEATING_COIL = new SlimefunItemStack("HEATING_COIL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2UzYmM0ODkzYmE0MWEzZjczZWUyODE3NGNkZjRmZWY2YjE0NWU0MWZlNmM4MmNiN2JlOGQ4ZTk3NzFhNSJ9fX0=", "&cНагревательный змеевик");
	public static final ItemStack COOLING_UNIT = new SlimefunItemStack("COOLING_UNIT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzU0YmFkODZjOTlkZjc4MGM4ODlhMTA5OGY3NzY0OGVhZDczODVjYzFkZGIwOTNkYTVhN2Q4YzRjMmFlNTRkIn19fQ==", "&bУстройство охлаждения");
	public static final ItemStack ELECTRIC_MOTOR = new SlimefunItemStack("ELECTRIC_MOTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ==", "&cЭлектродвигатель");
	public static final ItemStack CARGO_MOTOR = new SlimefunItemStack("CARGO_MOTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGNiY2EwMTJmNjdlNTRkZTlhZWU3MmZmNDI0ZTA1NmMyYWU1OGRlNWVhY2M5NDlhYjJiY2Q5NjgzY2VjIn19fQ==", "&3Грузовой двигатель");
	public static final ItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack("SCROLL_OF_DIMENSIONAL_TELEPOSITION", Material.PAPER, "&6Свиток пространственной телепозиции", "", "&cЭтот свиток способен создавать временную", "&cчёрную дыру, которая втянет близлежащие", "&cобъекты в себя и передаст их в другое", "&cизмерение, где всё обернулось вокруг", "", "&rКратко: заставляет всё сделать поворот на 180 градусов");
	public static final ItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack("TOME_OF_KNOWLEDGE_SHARING", Material.BOOK, "&6Том обмена знаниями", "&7Владелец: &b<отсутствует>", "", "&eПравый клик&7, чтобы закрепить свои исследования", "", "", "&eПравый клик&7 для получения всех исследований", "&7предыдущего владельца");
	public static final ItemStack HARDENED_GLASS = new SlimefunItemStack("HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Закалённое стекло", "", "&rВзрывоустойчивое");
	public static final ItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack("WITHER_PROOF_OBSIDIAN", Material.OBSIDIAN, "&5Всестойкий обсидиан", "", "&rВзрывоустойчивый", "&rВыдерживает Визеров");
	public static final ItemStack WITHER_PROOF_GLASS = new SlimefunItemStack("WITHER_PROOF_GLASS", Material.PURPLE_STAINED_GLASS, "&5Всестойкое стекло", "", "&rВыдерживает взрывы", "&rВыдерживает Визеров");
	public static final ItemStack REINFORCED_PLATE = new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Армированная плита");
	public static final ItemStack ANCIENT_PEDESTAL = new SlimefunItemStack("ANCIENT_PEDESTAL", Material.DISPENSER, "&dДревний пьедестал", "", "&5Часть древнего алтаря");
	public static final ItemStack ANCIENT_ALTAR = new SlimefunItemStack("ANCIENT_ALTAR", Material.ENCHANTING_TABLE, "&dДревний алтарь", "", "&5Основа волшебного крафта");
	public static final ItemStack COPPER_WIRE = new SlimefunItemStack("COPPER_WIRE", Material.STRING, "&6Медный провод", "", "&6Важный компонент электрических модулей");
	
	public static final ItemStack RAINBOW_WOOL = new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Радужная шерсть", "", "&dСодержит все цвета радуги!");
	public static final ItemStack RAINBOW_GLASS = new SlimefunItemStack("RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Радужное стекло", "", "&dСодержит все цвета радуги!");
	public static final ItemStack RAINBOW_CLAY = new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Радужная глина", "", "&dСодержит все цвета радуги!");
	public static final ItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack("RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Радужная стеклянная панель", "", "&dСодержит все цвета радуги!");
	
	public static final ItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack("RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Радужная шерсть &7(счастливого Рождества!)", "", Christmas.color("< Рождественская версия >"));
	public static final ItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack("RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Радужное стекло &7(счастливого Рождества!)", "", Christmas.color("< Рождественская версия >"));
	public static final ItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack("RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Радужная глина &7(счастливого Рождества!)", "", Christmas.color("< Рождественская версия >"));
	public static final ItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack("RAINBOW_GLASS_PANE_XMAS", Material.WHITE_STAINED_GLASS_PANE, "&5Радужная стеклянная панель &7(счастливого Рождества!)", "", Christmas.color("< Рождественская версия >"));
	
	public static final ItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack("RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "&5Радужная шерсть &7(романтичного Дня святого Валентина!)", "", "&d< Специально ко дню влюблённых! >");
	public static final ItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_VALENTINE", Material.PINK_STAINED_GLASS, "&5Радужное стекло &7(романтичного Дня святого Валентина!)", "", "&d< Специально ко дню влюблённых! >");
	public static final ItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack("RAINBOW_CLAY_VALENTINE", Material.PINK_TERRACOTTA, "&5Радужная глина &7(романтичного Дня святого Валентина!)", "", "&d< Специально ко дню влюблённых! >");
	public static final ItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_PANE_VALENTINE", Material.PINK_STAINED_GLASS_PANE, "&5Радужная стеклянная панель &7(романтичного Дня святого Валентина!)", "", "&d< Специально ко дню влюблённых! >");
    
	/*		 Ingots 		*/
	public static final ItemStack COPPER_INGOT = new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bМедный слиток");
	public static final ItemStack TIN_INGOT = new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bОловянный слиток");
	public static final ItemStack SILVER_INGOT = new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bСеребряный слиток");
	public static final ItemStack ALUMINUM_INGOT = new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bАлюминиевый слиток");
	public static final ItemStack LEAD_INGOT = new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bСвинцовый слиток");
	public static final ItemStack ZINC_INGOT = new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bЦинковый слиток");
	public static final ItemStack MAGNESIUM_INGOT = new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bМагниевый слиток");
	
	/*		Alloy (Carbon + Iron)	*/
	public static final ItemStack STEEL_INGOT = new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bСтальной слиток");
	/*		Alloy (Copper + Tin)	*/
	public static final ItemStack BRONZE_INGOT = new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bБронзовый слиток");
	/*		Alloy (Copper + Aluminum)	*/
	public static final ItemStack DURALUMIN_INGOT = new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bДюрасталевый слиток");
	/*		Alloy (Copper + Silver)	*/
	public static final ItemStack BILLON_INGOT = new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bБиллонный слиток");
	/*		Alloy (Copper + Zinc)	*/
	public static final ItemStack BRASS_INGOT = new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bЛатунный слиток");
	/*		Alloy (Aluminum + Brass)	*/
	public static final ItemStack ALUMINUM_BRASS_INGOT = new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bАлюминиево-латунный слиток");
	/*		Alloy (Aluminum + Bronze)	*/
	public static final ItemStack ALUMINUM_BRONZE_INGOT = new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bАлюминиево-бронзовый слиток");
	/*		Alloy (Gold + Silver + Copper)	*/
	public static final ItemStack CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bКоринфский бронзовый слиток");
	/*		Alloy (Lead + Tin)	*/
	public static final ItemStack SOLDER_INGOT = new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bПрипойный слиток");
	/*		Alloy (Steel + Iron + Carbon)	*/
	public static final ItemStack DAMASCUS_STEEL_INGOT = new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bСлиток дамасской стали");
	/*		Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze)	*/
	public static final ItemStack HARDENED_METAL_INGOT = new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lЗакалённый металл");
	/*		Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel)	*/
	public static final ItemStack REINFORCED_ALLOY_INGOT = new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lАрмированный слиток");
	/*		Alloy (Iron + Silicon)		*/
	public static final ItemStack FERROSILICON = new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bФерросилиций");
	/*		Alloy (Iron + Gold)			*/
	public static final ItemStack GILDED_IRON = new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lПозолоченное железо");
	/*		Alloy (Redston + Ferrosilicon)	*/
	public static final ItemStack REDSTONE_ALLOY = new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cРедстоуновый спав");
	/*		Alloy (Iron + Copper)		*/
	public static final ItemStack NICKEL_INGOT = new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bНикелевый слиток");
	/*		Alloy (Nickel + Iron + Copper)		*/
	public static final ItemStack COBALT_INGOT = new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Кобальтовый слиток");
	
	/*		Gold		*/
	public static final ItemStack GOLD_4K = new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&rЗолотой слиток &7(4 карата)");
	public static final ItemStack GOLD_6K = new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&rЗолотой слиток &7(6 карат)");
	public static final ItemStack GOLD_8K = new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&rЗолотой слиток &7(8 карат)");
	public static final ItemStack GOLD_10K = new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&rЗолотой слиток &7(10 карат)");
	public static final ItemStack GOLD_12K = new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&rЗолотой слиток &7(12 карат)");
	public static final ItemStack GOLD_14K = new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&rЗолотой слиток &7(14 карат)");
	public static final ItemStack GOLD_16K = new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&rЗолотой слиток &7(16 карат)");
	public static final ItemStack GOLD_18K = new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&rЗолотой слиток &7(18 карат)");
	public static final ItemStack GOLD_20K = new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&rЗолотой слиток &7(20 карат)");
	public static final ItemStack GOLD_22K = new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&rЗолотой слиток &7(22 карата)");
	public static final ItemStack GOLD_24K = new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&rЗолотой слиток &7(24 карата)");
	
	/*		 Dusts 		*/
	public static final ItemStack IRON_DUST = new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Железная пыль");
	public static final ItemStack GOLD_DUST = new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Золотая пыль");
	public static final ItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Оловянная пыль");
	public static final ItemStack COPPER_DUST = new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Медная пыль");
	public static final ItemStack SILVER_DUST = new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Серебряная пыль");
	public static final ItemStack ALUMINUM_DUST = new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Алюминиевая пыль");
	public static final ItemStack LEAD_DUST = new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Свинцовая пыль");
	public static final ItemStack SULFATE = new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Сульфат");
	public static final ItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Цинковая пыль");
	public static final ItemStack MAGNESIUM_DUST = new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Магниевая пыль");
	public static final ItemStack SILICON = new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Кремний");
	public static final ItemStack GOLD_24K_BLOCK = new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&rЗолотой блок &7(24 карата)");
	
	/*		 Gems 		*/
	public static final ItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack("SYNTHETIC_DIAMOND", Material.DIAMOND, "&bСинтетический алмаз");
	public static final ItemStack SYNTHETIC_EMERALD = new SlimefunItemStack("SYNTHETIC_EMERALD", Material.EMERALD, "&bСинтетический изумруд");
	public static final ItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack("SYNTHETIC_SAPPHIRE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM1MDMyZjRkN2QwMWRlOGVjOTlkODlmODcyMzAxMmQ0ZTc0ZmE3MzAyMmM0ZmFjZjFiNTdjN2ZmNmZmMCJ9fX0=", "&bСинтетический сапфир");
	public static final ItemStack CARBONADO = new SlimefunItemStack("CARBONADO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTJmNGIxNTc3ZjUxNjBjNjg5MzE3MjU3MWM0YTcxZDhiMzIxY2RjZWFhMDMyYzZlMGUzYjYwZTBiMzI4ZmEifX19", "&b&lКарбонадо", "", "&7&o\"Чёрный алмаз\"");
	public static final ItemStack RAW_CARBONADO = new SlimefunItemStack("RAW_CARBONADO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWI0OWU2ZWMxMDc3MWU4OTkyMjVhZWE3M2NkOGNmMDM2ODRmNDExZDE0MTVjNzMyM2M5M2NiOTQ3NjIzMCJ9fX0=", "&bСырой карбонадо");
	
	public static final ItemStack URANIUM = new SlimefunItemStack("URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzhiMjlhZmE2ZDZkYzkyM2UyZTEzMjRiZjgxOTI3NTBmN2JkYmRkYzY4OTYzMmEyYjZjMThkOWZlN2E1ZSJ9fX0=", "&4Уран", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oНужен костюм химзащиты");
	public static final ItemStack NEPTUNIUM = new SlimefunItemStack("NEPTUNIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGVkZWE2YmZkMzdlNDlkZTQzZjE1NGZlNmZjYTYxN2Q0MTI5ZTYxYjk1NzU5YTNkNDlhMTU5MzVhMWMyZGNmMCJ9fX0=", "&aНептуний", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oНужен костюм химзащиты");
	public static final ItemStack PLUTONIUM = new SlimefunItemStack("PLUTONIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjVjZjkxYjczODg2NjVhNmQ3YzFiNjAyNmJkYjIzMjJjNmQyNzg5OTdhNDQ0Nzg2NzdjYmNjMTVmNzYxMjRmIn19fQ==", "&7Плутоний", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oНужен костюм химзащиты");
	public static final ItemStack BOOSTED_URANIUM = new SlimefunItemStack("BOOSTED_URANIUM", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjgzN2NhMTJmMjIyZjQ3ODcxOTZhMTdiOGFiNjU2OTg1Zjg0MDRjNTA3NjdhZGJjYjZlN2YxNDI1NGZlZSJ9fX0=", "&2Форсированный уран", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oНужен костюм химзащиты");
	
	/*		Talisman		*/
	public static final ItemStack TALISMAN = new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Обычный талисман");
	public static final ItemStack TALISMAN_ANVIL = new SlimefunItemStack("ANVIL_TALISMAN", Material.EMERALD, "&aТалисман кузнеца", "", "&rТакой талисман может предотвратить", "&r1 инструмент от поломки, но при этом", "&rон &o(талисман, 1 шт.) &rпропадёт", "", "&4&lПРЕДУПРЕЖДНИЕ:", "&4Этот талисман не работает с", "&4инструментами, которые слишком", "&4мощные из-за их сложности");
	public static final ItemStack TALISMAN_MINER = new SlimefunItemStack("MINER_TALISMAN", Material.EMERALD, "&aТалисман шахтёра", "", "&rПока у Вас есть этот талисман, с шансом", "&rв 20% возможна дубликация всех", "&rруд, которые Вы добыли");
	public static final ItemStack TALISMAN_HUNTER = new SlimefunItemStack("HUNTER_TALISMAN", Material.EMERALD, "&aТалисман охотника", "", "&rПока у Вас есть этот талисман, с шансом", "&rв 20% возможна дубликация всего дропа", "&rс мобов, которых Вы убили");
	public static final ItemStack TALISMAN_LAVA = new SlimefunItemStack("LAVA_TALISMAN", Material.EMERALD, "&aТалисман покорителя лавы", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре, Вам", "&rбудет выдан эффект Огнестойкости,", "&rкак только Вы коснётесь лавы,", "&rно при этом он &o(талисман, 1 шт.) &rпропадёт");
	public static final ItemStack TALISMAN_WATER = new SlimefunItemStack("WATER_TALISMAN", Material.EMERALD, "&aТалисман покорителя воды", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре,", "&rу Вас будет возможность", "&rдышать под водой, как", "&rтолько Вы начнёте утопать,", "&rно при этом он &o(талисман, 1 шт.) &rпропадёт");
	public static final ItemStack TALISMAN_ANGEL = new SlimefunItemStack("ANGEL_TALISMAN", Material.EMERALD, "&aТалисман ангела", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре,", "&rу Вас будет 75% шанс,", "&rчто урон от падения", "&rне будет нанесён");
	public static final ItemStack TALISMAN_FIRE = new SlimefunItemStack("FIRE_TALISMAN", Material.EMERALD, "&aТалисман пожарного", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре,", "&rВам будет выдан эффект Огнестойкости,", "&rкак только Вы начнёте гореть,", "&rно при этом он &o(талисман, 1 шт.) &rпропадёт");
	public static final ItemStack TALISMAN_MAGICIAN = new SlimefunItemStack("MAGICIAN_TALISMAN", Material.EMERALD, "&aТалисман мага", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре, у Вас будет", "&r80% шанс получить дополнительное", "&rзачарование в столе зачарований");
	public static final ItemStack TALISMAN_TRAVELLER = new SlimefunItemStack("TRAVELLER_TALISMAN", Material.EMERALD, "&aТалисман путешественника", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре, у Вас будет", "&r60% шанс получить достойное увеличение", "&rскорости во время старта бега");
	public static final ItemStack TALISMAN_WARRIOR = new SlimefunItemStack("WARRIOR_TALISMAN", Material.EMERALD, "&aТалисман воина", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре, Вы будете получать", "&rСилу III всякий раз, когда Вас ударят,", "&rно при этом он &o(талисман, 1 шт.) &rпропадёт");
	public static final ItemStack TALISMAN_KNIGHT = new SlimefunItemStack("KNIGHT_TALISMAN", Material.EMERALD, "&aТалисман рыцаря", "", "&rПока у Вас есть этот талисман", "&rв Вашем инвентаре, будет 30% шанс", "&rзаполучить Регенерацию на 5 секунд,", "&rкогда Вас ударят,", "&rно при этом он &o(талисман, 1 шт.) &rпропадёт");
	public static final ItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack("WHIRLWIND_TALISMAN", Material.EMERALD, "&aТалисман вихря", "", "&rПока у Вас есть этот талисман,", "&rу Вас будет 60% шанс отразить", "&rснаряды, запущенные в Вас", "&0sf:talisman_whirlwind");
	public static final ItemStack TALISMAN_WIZARD = new SlimefunItemStack("WIZARD_TALISMAN", Material.EMERALD, "&aТалисман волшебника", "", "&rПока у Вас есть этот талисман,", "&rу Вас есть шанс заполучить при", "&rзачаровании уровень Удачи 4/5, однако", "&rон также может понизить уровень", "&rнекоторых других зачарований на предмете");
	
	/*		Staves		*/
	public static final ItemStack STAFF_ELEMENTAL = new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Элементальный посох");
	public static final ItemStack STAFF_WIND = new SlimefunItemStack("STAFF_ELEMENTAL_WIND", Material.STICK, "&6Элементальный посох &7– &b&oВетер", "", "&7Элемент: &b&oВетер", "", "&7&eПравый клик&7, чтобы запустить себя вперёд");
	public static final ItemStack STAFF_FIRE = new SlimefunItemStack("STAFF_ELEMENTAL_FIRE", Material.STICK, "&6Элементальный посох &7– &c&oОгонь", "", "&7Элемент: &c&oОгонь");
	public static final ItemStack STAFF_WATER = new SlimefunItemStack("STAFF_ELEMENTAL_WATER", Material.STICK, "&6Элементальный посох &7– &1&oВода", "", "&7Элемент: &1&oВода", "", "&7&eПравый клик&7, чтобы потушить себя");
	public static final ItemStack STAFF_STORM = new SlimefunItemStack("STAFF_ELEMENTAL_STORM", Material.STICK, "&6Элементальный посох &7– &8&oБуря", "", "&7Элемент: &8&oБуря", "", "&eПравый клик&7, чтобы выпустить молнию", "&7Осталось использований: &e" + StormStaff.MAX_USES);
	
	static {
		STAFF_WIND.addUnsafeEnchantment(Enchantment.LUCK, 1);
		STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
		STAFF_WATER.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
		STAFF_STORM.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
	}
	
	/*		 Machines 		*/
	public static final ItemStack GRIND_STONE = new SlimefunItemStack("GRIND_STONE", Material.DISPENSER, "&bИзмельчитель вещей", "", "&aВытачивает детали для большей эффективности");
	public static final ItemStack ARMOR_FORGE = new SlimefunItemStack("ARMOR_FORGE", Material.ANVIL, "&6Конструктор брони", "", "&aСоздавать мощные доспехи");
	public static final ItemStack SMELTERY = new SlimefunItemStack("SMELTERY", Material.FURNACE, "&6Плавильня", "", "&aВыступает в качестве высокотемпературной печи для металлов");
	public static final ItemStack IGNITION_CHAMBER = new SlimefunItemStack("IGNITION_CHAMBER", Material.HOPPER, "&4Автоматическая камера зажигания", "&rАвтоматически поджигает блок под Плавильней", "&rДолжна быть размещена около раздатчика плавильни", "&e&oТребует подпитки огнивом");
	public static final ItemStack ORE_CRUSHER = new SlimefunItemStack("ORE_CRUSHER", Material.DISPENSER, "&bРазрушитель руд", "", "&aДробит руды на мелкие кусочки");
	public static final ItemStack COMPRESSOR = new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bКомпрессор", "", "&aКомпрессирует предметы");
	public static final ItemStack PRESSURE_CHAMBER = new SlimefunItemStack("PRESSURE_CHAMBER", Material.GLASS, "&bБарокамера", "", "&aСильно компрессирует различные элементы");
	public static final ItemStack MAGIC_WORKBENCH = new SlimefunItemStack("MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "&6Магический верстак", "", "&dНаполняет предметы магической энергией");
	public static final ItemStack ORE_WASHER = new SlimefunItemStack("ORE_WASHER", Material.CAULDRON, "&6Очиститель руд", "", "&aФильтрирует руды, выдавая разные", "&aмелкие кусочки камней");
	public static final ItemStack TABLE_SAW = new SlimefunItemStack("TABLE_SAW", Material.STONECUTTER, "&6Лесопилка", "", "&aРубит древесину на 8 досок", "&a(работает со всеми видами древесины)");
	public static final ItemStack COMPOSTER = new SlimefunItemStack("COMPOSTER", Material.CAULDRON, "&aКомпостер", "", "&a&oСо временем может конвертировать различные материалы…");
	public static final ItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack("ENHANCED_CRAFTING_TABLE", Material.CRAFTING_TABLE, "&eУлучшенный верстак", "", "&aОбычный Верстак не может удержать", "&aтакое количество силы…");
	public static final ItemStack CRUCIBLE = new SlimefunItemStack("CRUCIBLE", Material.CAULDRON, "&cТигель", "", "&a&oИспользуется для переплавки предметов в жидкости");
	public static final ItemStack JUICER = new SlimefunItemStack("JUICER", Material.GLASS_BOTTLE, "&aСоковыжималка", "", "&aПозволяет создавать вкусные соки");
	
	public static final ItemStack SOLAR_PANEL = new SlimefunItemStack("SOLAR_PANEL", Material.DAYLIGHT_DETECTOR, "&bСолнечная панель", "", "&a&oИспользует лучи солнца", "&a&oдля выработки электричества");
	public static final ItemStack SOLAR_ARRAY = new SlimefunItemStack("SOLAR_ARRAY", Material.DAYLIGHT_DETECTOR, "&bСолнечная батарея", "", "&a&oИспользует лучи солнца", "&a&oдля выработки электричества");
	
	@Deprecated
	public static final ItemStack DIGITAL_MINER = new CustomItem(Material.IRON_PICKAXE, "&bЦифровой шахтёр", "", "&4УСТАРЕВШИЙ ПРЕДМЕТ", "&cЭта машина скоро будет удалена!");

	@Deprecated
	public static final ItemStack ADVANCED_DIGITAL_MINER = new CustomItem(Material.DIAMOND_PICKAXE, "&6Продвинутый цифровой шахтёр", "", "&4УСТАРЕВШИЙ ПРЕДМЕТ", "&cЭта машина скоро будет удалена!");
	
	public static final ItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack("AUTOMATED_PANNING_MACHINE", Material.BOWL, "&aРудопромывочная машина", "", "&aСтруктурная версия рудопромывочного лотка");
	public static final ItemStack OUTPUT_CHEST = new SlimefunItemStack("OUTPUT_CHEST", Material.CHEST, "&4Выходной сундук", "", "&c&oРезультат крафта (на ул./маг. верстаке…)", "&c&oбудет помещён в сундук, если", "&c&oон размещён рядом с раздатчиком");
	public static final ItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack("HOLOGRAM_PROJECTOR", Material.QUARTZ_SLAB, "&bГолограммный проектор", "", "&rПоказывает редактируемую голограмму");
	
	/*		 Enhanced Furnaces 		*/
	public static final ItemStack ENHANCED_FURNACE = new SlimefunItemStack("ENHANCED_FURNACE", Material.FURNACE, "&7Улучшенная печь – &eI", "", "&7Скорость обработки: &e1x", "&7Топливная производительность: &e1x", "&7Множитель удачи: &e1x");
	public static final ItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack("ENHANCED_FURNACE_2", Material.FURNACE, "&7Улучшенная печь – &eII", "", "&7Скорость обработки: &e2x", "&7Топливная производительность: &e1x", "&7Множитель удачи: &e1x");
	public static final ItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack("ENHANCED_FURNACE_3", Material.FURNACE, "&7Улучшенная печь – &eIII", "", "&7Скорость обработки: &e2x", "&7Топливная производительность: &e2x", "&7Множитель удачи: &e1x");
	public static final ItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack("ENHANCED_FURNACE_4", Material.FURNACE, "&7Улучшенная печь – &eIV", "", "&7Скорость обработки: &e3x", "&7Топливная производительность: &e2x", "&7Множитель удачи: &e1x");
	public static final ItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack("ENHANCED_FURNACE_5", Material.FURNACE, "&7Улучшенная печь – &eV", "", "&7Скорость обработки: &e3x", "&7Топливная производительность: &e2x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack("ENHANCED_FURNACE_6", Material.FURNACE, "&7Улучшенная печь – &eVI", "", "&7Скорость обработки: &e3x", "&7Топливная производительность: &e3x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack("ENHANCED_FURNACE_7", Material.FURNACE, "&7Улучшенная печь – &eVII", "", "&7Скорость обработки: &e4x", "&7Топливная производительность: &e3x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack("ENHANCED_FURNACE_8", Material.FURNACE, "&7Улучшенная печь – &eVIII", "", "&7Скорость обработки: &e4x", "&7Топливная производительность: &e4x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack("ENHANCED_FURNACE_9", Material.FURNACE, "&7Улучшенная печь – &eIX", "", "&7Скорость обработки: &e5x", "&7Топливная производительность: &e4x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack("ENHANCED_FURNACE_10", Material.FURNACE, "&7Улучшенная печь – &eX", "", "&7Скорость обработки: &e5x", "&7Топливная производительность: &e5x", "&7Множитель удачи: &e2x");
	public static final ItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack("ENHANCED_FURNACE_11", Material.FURNACE, "&7Улучшенная печь – &eXI", "", "&7Скорость обработки: &e5x", "&7Топливная производительность: &e5x", "&7Множитель удачи: &e3x");
	public static final ItemStack REINFORCED_FURNACE = new SlimefunItemStack("REINFORCED_FURNACE", Material.FURNACE, "&7Усиленная печь", "", "&7Скорость обработки: &e10x", "&7Топливная производительность: &e10x", "&7Множитель удачи: &e3x");
	public static final ItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack("CARBONADO_EDGED_FURNACE", Material.FURNACE, "&7Чёрноалмазная печь", "", "&7Скорость обработки: &e20x", "&7Топливная производительность: &e10x", "&7Множитель удачи: &e3x");
	
	public static final ItemStack BLOCK_PLACER = new SlimefunItemStack("BLOCK_PLACER", Material.DISPENSER, "&aРазмещатель блоков", "", "&rВсе блоки в этом раздатчике", "&rбудут автоматически поставлены", "&rперед ним при подаче сигнала редстоуна");
	
	/*		Soulbound Items		*/
	public static final ItemStack SOULBOUND_SWORD = new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cПерсональный меч", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_BOW = new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cПерсональный лук", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_PICKAXE = new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cПерсональная кирка", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_AXE = new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cПерсональный топор", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_SHOVEL = new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cПерсональная лопата", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_HOE = new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cПерсональная мотыга", "&7&oНе выпадает при смерти");
	
	public static final ItemStack SOULBOUND_HELMET = new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cПерсональный шлем", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_CHESTPLATE = new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cПерсональный нагрудник", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_LEGGINGS = new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cПерсональные штаны", "&7&oНе выпадает при смерти");
	public static final ItemStack SOULBOUND_BOOTS = new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cПерсональные ботинки", "&7&oНе выпадает при смерти");
	
	/*		Runes				*/
	public static final ItemStack BLANK_RUNE;
	public static final ItemStack RUNE_AIR;
	public static final ItemStack RUNE_WATER;
	public static final ItemStack RUNE_FIRE;
	public static final ItemStack RUNE_EARTH;
	public static final ItemStack RUNE_ENDER;
	public static final ItemStack RUNE_RAINBOW;
	public static final ItemStack RUNE_LIGHTNING;
	public static final ItemStack RUNE_SOULBOUND;
	
	static {
		ItemStack itemB = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imB = (FireworkEffectMeta) itemB.getItemMeta();
		imB.setEffect(FireworkEffect.builder().with(Type.BURST).with(Type.BURST).withColor(Color.BLACK).build());
		imB.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8Пустая древняя руна"));
		itemB.setItemMeta(imB);
		BLANK_RUNE = new SlimefunItemStack("BLANK_RUNE", itemB);
		
		ItemStack itemA = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imA = (FireworkEffectMeta) itemA.getItemMeta();
		imA.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.AQUA).build());
		imA.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&b&lВоздух&8&l]"));
		itemA.setItemMeta(imA);
		RUNE_AIR = new SlimefunItemStack("ANCIENT_RUNE_AIR", itemA);
		
		ItemStack itemW = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imW = (FireworkEffectMeta) itemW.getItemMeta();
		imW.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.BLUE).build());
		imW.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&1&lВода&8&l]"));
		itemW.setItemMeta(imW);
		RUNE_WATER = new SlimefunItemStack("ANCIENT_RUNE_WATER", itemW);
		
		ItemStack itemF = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imF = (FireworkEffectMeta) itemF.getItemMeta();
		imF.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.RED).build());
		imF.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&4&lОгонь&8&l]"));
		itemF.setItemMeta(imF);
		RUNE_FIRE = new SlimefunItemStack("ANCIENT_RUNE_FIRE", itemF);
		
		ItemStack itemE = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imE = (FireworkEffectMeta) itemE.getItemMeta();
		imE.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(112, 47, 7)).build());
		imE.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&c&lЗемля&8&l]"));
		itemE.setItemMeta(imE);
		RUNE_EARTH = new SlimefunItemStack("ANCIENT_RUNE_EARTH", itemE);
		
		ItemStack itemN = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imN = (FireworkEffectMeta) itemN.getItemMeta();
		imN.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.PURPLE).build());
		imN.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&5&lЭндер&8&l]"));
		itemN.setItemMeta(imN);
		RUNE_ENDER = new SlimefunItemStack("ANCIENT_RUNE_ENDER", itemN);
		
		ItemStack itemR = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imR = (FireworkEffectMeta) itemR.getItemMeta();
		imR.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.FUCHSIA).build());
		imR.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&d&lРадуга&8&l]"));
		itemR.setItemMeta(imR);
		RUNE_RAINBOW = new SlimefunItemStack("ANCIENT_RUNE_RAINBOW", itemR);
		
		ItemStack itemL = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imL = (FireworkEffectMeta) itemL.getItemMeta();
		imL.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(255, 255, 95)).build());
		imL.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&e&lМолния&8&l]"));
		itemL.setItemMeta(imL);
		RUNE_LIGHTNING = new SlimefunItemStack("ANCIENT_RUNE_LIGHTNING", itemL);

		ItemStack itemS = new ItemStack(Material.FIREWORK_STAR);
		FireworkEffectMeta imS = (FireworkEffectMeta) itemS.getItemMeta();
		imS.setEffect(FireworkEffect.builder().with(Type.BURST).withColor(Color.fromRGB(47, 0, 117)).build());
		imS.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Древняя руна &8&l[&5&lС частицей души&8&l]"));
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.YELLOW + "Бросьте эту руну на брошенный предмет,");
		lore.add(ChatColor.DARK_PURPLE + "чтобы присвоить " + ChatColor.YELLOW + "этот предмет себе.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "Рекомендуется использовать эту руну только");
		lore.add(ChatColor.YELLOW + "на " + ChatColor.GOLD + "важных для Вас " + ChatColor.YELLOW + "предметах.");
		lore.add(" ");
		lore.add(ChatColor.YELLOW + "Предметы, присвоенные Вами, не будут");
		lore.add(ChatColor.YELLOW + "выпадать при смерти.");
		imS.setLore(lore);
		itemS.setItemMeta(imS);
		RUNE_SOULBOUND = new SlimefunItemStack("ANCIENT_RUNE_SOULBOUND", itemS);
	}
	
	/*		Electricity			*/
	public static final ItemStack SOLAR_GENERATOR = new SlimefunItemStack("SOLAR_GENERATOR", Material.DAYLIGHT_DETECTOR, "&bСолнечный генератор", "", MachineTier.BASIC.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &70 Дж", "&8\u21E8 &e\u26A1 &74 Дж/с");
	public static final ItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack("SOLAR_GENERATOR_2", Material.DAYLIGHT_DETECTOR, "&cПродвинутый солнечный генератор", "", MachineTier.MEDIUM.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &70 Дж", "&8\u21E8 &e\u26A1 &716 Дж/с");
	public static final ItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack("SOLAR_GENERATOR_3", Material.DAYLIGHT_DETECTOR, "&4Чёрноалмазный солнечный генератор", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &70 Дж", "&8\u21E8 &e\u26A1 &764 Дж/с");
	public static final ItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack("SOLAR_GENERATOR_4", Material.DAYLIGHT_DETECTOR, "&eЭлектрический солнечный генератор", "", "&9Работает ночью", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &70 Дж", "&8\u21E8 &e\u26A1 &7256 Дж/с (днём)", "&8\u21E8 &e\u26A1 &7128 Дж/с (ночью)");
	
	public static final ItemStack COAL_GENERATOR = new SlimefunItemStack("COAL_GENERATOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&cУгольный генератор", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &764 Дж", "&8\u21E8 &e\u26A1 &716 Дж/с");
	public static final ItemStack COAL_GENERATOR_2 = new SlimefunItemStack("COAL_GENERATOR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&cУгольный генератор &7(&eII&7)", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &730 Дж/с");
	
	public static final ItemStack LAVA_GENERATOR = new SlimefunItemStack("LAVA_GENERATOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&4Лавовый генератор", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &7512 Дж", "&8\u21E8 &e\u26A1 &720 Дж/с");
	public static final ItemStack LAVA_GENERATOR_2 = new SlimefunItemStack("LAVA_GENERATOR_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&4Лавовый генератор &7(&eII&7)", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &740 Дж/с");
	
	public static final ItemStack ELECTRIC_FURNACE = new SlimefunItemStack("ELECTRIC_FURNACE", Material.FURNACE, "&cЭлектрическая печь", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &74 Дж/с");
	public static final ItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack("ELECTRIC_FURNACE_2", Material.FURNACE, "&cЭлектрическая печь &7– &eII", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 2x", "&8\u21E8 &e\u26A1 &76 Дж/с");
	public static final ItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack("ELECTRIC_FURNACE_3", Material.FURNACE, "&cЭлектрическая печь &7– &eIII", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 4x", "&8\u21E8 &e\u26A1 &710 Дж/с");
	
	public static final ItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack("ELECTRIC_ORE_GRINDER", Material.FURNACE, "&cЭлектрическая дробилка руд", "","&rРаботает как измельчитель вещей и разрушитель руд", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &712 Дж/с");
	public static final ItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack("ELECTRIC_ORE_GRINDER_2", Material.FURNACE, "&cЭлектрическая дробилка руд &7(&eII&7)", "","&rРаботает как измельчитель вещей и разрушитель руд", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 4x", "&8\u21E8 &e\u26A1 &730 Дж/с");
	public static final ItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack("ELECTRIC_INGOT_PULVERIZER", Material.FURNACE, "&cЭлектрический распылитель слитков", "", "&rРаспыляет слитки в пыль", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &714 Дж/с");
	public static final ItemStack AUTO_DRIER = new SlimefunItemStack("AUTO_DRIER", Material.SMOKER, "&eАвтоматизированный высушиватель", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &710 Дж/с");
	public static final ItemStack AUTO_ENCHANTER = new SlimefunItemStack("AUTO_ENCHANTER", Material.ENCHANTING_TABLE, "&5Автоматизированный зачаровыватель", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &718 Дж/с");
	public static final ItemStack AUTO_DISENCHANTER = new SlimefunItemStack("AUTO_DISENCHANTER", Material.ENCHANTING_TABLE, "&5Автоматизированный разачаровыватель", "", MachineTier.MEDIUM.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &718 Дж/с");
	public static final ItemStack AUTO_ANVIL = new SlimefunItemStack("AUTO_ANVIL", Material.IRON_BLOCK, "&7Автоматизированная наковальня", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Ремонтный фактор: 10%", "&8\u21E8 &e\u26A1 &724 Дж/с");
	public static final ItemStack AUTO_ANVIL_2 = new SlimefunItemStack("AUTO_ANVIL_2", Material.IRON_BLOCK, "&7Автоматизированная наковальня &7(&eII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Ремонтный фактор: 25%", "&8\u21E8 &e\u26A1 &732 Дж/с");
	
	public static final ItemStack BIO_REACTOR = new SlimefunItemStack("BIO_REACTOR", Material.LIME_TERRACOTTA, "&2Биореактор", "", MachineTier.AVERAGE.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &7128 Дж", "&8\u21E8 &e\u26A1 &78 Дж/с");
	public static final ItemStack MULTIMETER = new SlimefunItemStack("MULTIMETER", Material.CLOCK, "&eМультиметр", "", "&rИзмеряет количество электричества в блоке");
	
	public static final ItemStack SMALL_CAPACITOR = new SlimefunItemStack("SMALL_CAPACITOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ==", "&aМаленький электрический конденсатор", "", MachineTier.BASIC.and(MachineType.CAPACITOR), "&8\u21E8 &7Вместимость: &e\u26A1 &7128 Дж");
	public static final ItemStack MEDIUM_CAPACITOR = new SlimefunItemStack("MEDIUM_CAPACITOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ==", "&aСредний электрический конденсатор", "", MachineTier.AVERAGE.and(MachineType.CAPACITOR), "&8\u21E8 &7Вместимость: &e\u26A1 &7512 Дж");
	public static final ItemStack BIG_CAPACITOR = new SlimefunItemStack("BIG_CAPACITOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ==", "&aБольшой электрический конденсатор", "", MachineTier.MEDIUM.and(MachineType.CAPACITOR), "&8\u21E8 &7Вместимость: &e\u26A1 &71024 Дж");
	public static final ItemStack LARGE_CAPACITOR = new SlimefunItemStack("LARGE_CAPACITOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ==", "&aОгромный электрический конденсатор", "", MachineTier.GOOD.and(MachineType.CAPACITOR), "&8\u21E8 &7Вместимость: &e\u26A1 &78192 Дж");
	public static final ItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack("CARBONADO_EDGED_CAPACITOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTEzNjFlNTc2YjQ5M2NiZmRmYWUzMjg2NjFjZWRkMWFkZDU1ZmFiNGU1ZWI0MThiOTJjZWJmNjI3NWY4YmI0In19fQ==", "&aЧёрноалмазный электрический конденсатор", "", MachineTier.END_GAME.and(MachineType.CAPACITOR), "&8\u21E8 &7Вместимость: &e\u26A1 &765536 Дж");
	
	/*		Robots				*/
	public static final ItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack("PROGRAMMABLE_ANDROID", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0=", "&cПрограммируемый Андроид &7(обычный)", "", "&8\u21E8 &7Функция: ОТСУТСТВУЕТ", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FARMER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19", "&cПрограммируемый Андроид &7(фермер)", "", "&8\u21E8 &7Функция: ФЕРМЕРСТВО", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_MINER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTYzOGEyODU0MWFiM2FlMGE3MjNkNTU3ODczOGUwODc1ODM4OGVjNGMzMzI0N2JkNGNhMTM0ODJhZWYzMzQifX19", "&cПрограммируемый Андроид &7(шахтёр)", "", "&8\u21E8 &7Функция: КОПАНИЕ", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_WOODCUTTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDMyYTgxNDUxMDE0MjIwNTE2OWExYWQzMmYwYTc0NWYxOGU5Y2I2YzY2ZWU2NGVjYTJlNjViYWJkZWY5ZmYifX19", "&cПрограммируемый Андроид &7(лесоруб)", "", "&8\u21E8 &7Функция: РУБКА ДЕРЕВА", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_BUTCHER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0=", "&cПрограммируемый Андроид &7(мясник)", "", "&8\u21E8 &7Функция: ОХОТА", "&8\u21E8 &7Урон: 4", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FISHERMAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0=", "&cПрограммируемый Андроид &7(рыбак)", "", "&8\u21E8 &7Функция: РЫБОЛОВСТВО", "&8\u21E8 &7Шанс успеха: 10%", "&8\u21E8 &7Продуктивность топлива: 1.0x");
	
	public static final ItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0=", "&cПродвинутый программируемый Андроид &7(обычный)", "", "&8\u21E8 &7Function: ОТСУТСТВУЕТ", "&8\u21E8 &7Продуктивность топлива: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FISHERMAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0=", "&cПродвинутый программируемый Андроид &7(рыбак)", "", "&8\u21E8 &7Функция: РЫБОЛОВСТВО", "&8\u21E8 &7Шанс успеха: 20%", "&8\u21E8 &7Продуктивность топлива: 1.5x");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FARMER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlkMzMzNTdlODQxODgyM2JmNzgzZGU5MmRlODAyOTFiNGViZDM5MmFlYzg3MDY2OThlMDY4OTZkNDk4ZjYifX19", "&cПродвинутый программируемый Андроид &7(фермер)", "", "&8\u21E8 &7Функция: ФЕРМЕРСТВО", "&8\u21E8 &7Продуктивность топлива: 1.5x", "&8\u21E8 &7Can also harvest Plants from ExoticGarden");
	public static final ItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_BUTCHER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0=", "&cПродвинутый программируемый Андроид &7(мясник)", "", "&8\u21E8 &7Функция: ОХОТА", "&8\u21E8 &7Урон: 8", "&8\u21E8 &7Продуктивность топлива: 1.5x");

	public static final ItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzUwM2NiN2VkODQ1ZTdhNTA3ZjU2OWFmYzY0N2M0N2FjNDgzNzcxNDY1YzlhNjc5YTU0NTk0Yzc2YWZiYSJ9fX0=", "&eУсиленный программируемый Андроид &7(обычный)", "", "&8\u21E8 &7Function: ОТСУТСТВУЕТ", "&8\u21E8 &7Продуктивность топлива: 3.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_FISHERMAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzQ1ZTg3MzNhNzMxMTQzMzNiOThiMzYwMTc1MTI0MTcyMmY0NzEzZTFhMWE1ZDM2ZmJiMTMyNDkzZjFjNyJ9fX0=", "&eУсиленный программируемый Андроид &7(рыбак)", "", "&8\u21E8 &7Функция: РЫБОЛОВСТВО", "&8\u21E8 &7Шанс успеха: 30%", "&8\u21E8 &7Продуктивность топлива: 8.0x");
	public static final ItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_BUTCHER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2I0NzJkZjBhZDlhM2JlODhmMmU1ZDVkNDIyZDAyYjExNmQ2NGQ4ZGYxNDc1ZWQzMmU1NDZhZmM4NGIzMSJ9fX0=", "&eУсиленный программируемый Андроид &7(мясник)", "", "&8\u21E8 &7Функция: ОХОТА", "&8\u21E8 &7Урон: 20", "&8\u21E8 &7Продуктивность топлива: 8.0x");
	
	/*		GPS					*/
	public static final ItemStack GPS_TRANSMITTER = new SlimefunItemStack("GPS_TRANSMITTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0=", "&bGPS-трекер", "", "&8\u21E8 &e\u26A1 &7Резервный запас: &716 Дж", "&8\u21E8 &e\u26A1 &72 Дж/с");
	public static final ItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack("GPS_TRANSMITTER_2", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0=", "&cПродвинутый GPS-трекер", "", "&8\u21E8 &e\u26A1 &7Резервный запас: &764 Дж", "&8\u21E8 &e\u26A1 &76 Дж/с");
	public static final ItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack("GPS_TRANSMITTER_3", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0=", "&4Чёрноалмазный GPS-трекер", "", "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &722 Дж/с");
	public static final ItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack("GPS_TRANSMITTER_4", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0=", "&eЗаряженный GPS-трекер", "", "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &792 Дж/с");
	
	public static final ItemStack GPS_MARKER_TOOL = new SlimefunItemStack("GPS_MARKER_TOOL", Material.REDSTONE_TORCH, "&bGPS-маркер", "", "&rПозволяет устанавливать", "&rконтрольные точки");
	public static final ItemStack GPS_CONTROL_PANEL = new SlimefunItemStack("GPS_CONTROL_PANEL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGRjZmJhNThmYWYxZjY0ODQ3ODg0MTExODIyYjY0YWZhMjFkN2ZjNjJkNDQ4MWYxNGYzZjNiY2I2MzMwIn19fQ==", "&bGPS панель управления", "", "&rРазрешает Вам запустить свой спутник", "&rи управлять контрольными точками");
	public static final ItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack("GPS_EMERGENCY_TRANSMITTER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjBjOWMxYTAyMmY0MGI3M2YxNGI0Y2JhMzdjNzE4YzZhNTMzZjNhMjg2NGI2NTM2ZDVmNDU2OTM0Y2MxZiJ9fX0=", "&cGPS аварийный передатчик", "", "&rПри хранении в инвентаре автоматически", "&rставится контрольная точка на месте смерти");
	
	public static final ItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack("ANDROID_INTERFACE_FUEL", Material.DISPENSER, "&7Андроид-интерфейс &c(топливо)", "", "&rПредметы, хранящиеся в этом интерфейсе,", "&rбудут вставлены в топливный слот Андроида,", "&rкогда его скрипт попросит");
	public static final ItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack("ANDROID_INTERFACE_ITEMS", Material.DISPENSER, "&7Андроид-интерфейс &9(предметы)", "", "&rПредметы, хранящиеся в инвентаре Андроида,", "&rбудут направлены в этот интерфейс,", "&rкогда скрипт Андроида попросит");
	
	public static final ItemStack GPS_GEO_SCANNER = new SlimefunItemStack("GPS_GEO_SCANNER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmFkOGNmZWIzODdhNTZlM2U1YmNmODUzNDVkNmE0MTdiMjQyMjkzODg3ZGIzY2UzYmE5MWZhNDA5YjI1NGI4NiJ9fX0=", "&bGPS-геосканер", "", "&rСканирует природные ресурсы чанка", "&rна подобии &8нефти");
	public static final ItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack("PORTABLE_GEO_SCANNER", Material.CLOCK, "&bПортативный геосканер", "", "&rСканирует чанк на наличие природных ресурсов", "", "&eПравый клик &7для сканирования");
	public static final ItemStack GEO_MINER = new SlimefunItemStack("GEO_MINER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTM3NzQxZjc2NGRkM2RkN2FkYWViNDNiNjNkMzk1OWViNzBlNWViMjhmMTVkNmIzNGNhYjM0YTFkMWY2MDM4NyJ9fX0=", "&6Геокопатель", "", "&eДобывает ресурсы из чанка", "&eЭти ресурсы не могут быть добыты киркой", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &748 Дж/с", "", "&c&l! &cУбедитесь, что Вы просканировали", "&cчанк при помощи геосканера");
	public static final ItemStack OIL_PUMP = new SlimefunItemStack("OIL_PUMP", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWZlMWEwNDBhNDI1ZTMxYTQ2ZDRmOWE5Yjk4MDZmYTJmMGM0N2VlODQ3MTFjYzE5MzJmZDhhYjMyYjJkMDM4In19fQ==", "&rНефтяной насос", "", "&7Добывает нефть и заполняет ею вёдра", "", "&c&l! &cУбедитесь, что Вы просканировали", "&cчанк при помощи геосканера");
	public static final ItemStack BUCKET_OF_OIL = new SlimefunItemStack("BUCKET_OF_OIL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNlMDRiNDFkMTllYzc5MjdmOTgyYTYzYTk0YTNkNzlmNzhlY2VjMzMzNjMwNTFmZGUwODMxYmZhYmRiZCJ9fX0=", "&rВедро нефти");
	public static final ItemStack BUCKET_OF_FUEL = new SlimefunItemStack("BUCKET_OF_FUEL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTg0ZGRjYTc2NjcyNWI4Yjk3NDEzZjI1OWMzZjc2NjgwNzBmNmFlNTU0ODNhOTBjOGU1NTI1Mzk0ZjljMDk5In19fQ==", "&rВедро топлива");

	public static final ItemStack REFINERY = new SlimefunItemStack("REFINERY", Material.PISTON, "&cОчистительный завод", "", "&rПерерабатывает ведро нефти для создания топлива");
	public static final ItemStack COMBUSTION_REACTOR = new SlimefunItemStack("COMBUSTION_REACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&cРеактор горения", "", MachineTier.ADVANCED.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &724 Дж/с");
	public static final ItemStack ANDROID_MEMORY_CORE = new SlimefunItemStack("ANDROID_MEMORY_CORE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19", "&bОперативная память Андроида");
	
	public static final ItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack("GPS_TELEPORTER_PYLON", Material.PURPLE_STAINED_GLASS, "&5GPS телепортационный пилон", "", "&7Компонент телепортера", "&7Должен быть установлен вокруг матрицы");
	public static final ItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack("GPS_TELEPORTATION_MATRIX", Material.IRON_BLOCK, "&bGPS телепортационная матрица", "", "&rОсновной компонент телепортера", "", "&rПозволяет игрокам выбирать из всех", "&rконтрольных точек, сделанных игроками", "&rэтим устройством");
	public static final ItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_SHARED", Material.STONE_PRESSURE_PLATE, "&rGPS активационный девайс &3(общий)", "", "&rРазместите на телепортационную матрицу и", "&rстаньте на эту пластину, чтобы активировать", "&rпроцесс телепортации");
	public static final ItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_PERSONAL", Material.STONE_PRESSURE_PLATE, "&rGPS активационный девайс &a(персональный)", "", "&rРазместите на телепортационную матрицу и", "&rстаньте на эту пластину, чтобы активировать", "&rпроцесс телепортации", "", "&rПерсональная версия доступна только", "&rтому, кто её разместил");

	public static final ItemStack ELEVATOR = new SlimefunItemStack("ELEVATOR_PLATE", Material.STONE_PRESSURE_PLATE, "&bЛифтяная плита", "", "&rРазместите эту плиту на каждом этаже, затем", "&rВы сможете телепортироваться между ними", "", "&eПравый клик по плите&7, чтобы переименовать этаж");
	
	public static final ItemStack INFUSED_HOPPER = new SlimefunItemStack("INFUSED_HOPPER", Material.HOPPER, "&5Заряженная воронка", "", "&rАвтоматически подбирает выброшенные вещи", "&rв радиусе 7x7x7, когда установлена");

	public static final ItemStack PLASTIC_SHEET = new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&rПластиковый лист");
	
	public static final ItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER", Material.LIGHT_GRAY_STAINED_GLASS, "&cОбогреваемая барокамера", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &710 Дж/с");
	public static final ItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER_2", Material.LIGHT_GRAY_STAINED_GLASS, "&cОбогреваемая барокамера &7– &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 5x", "&8\u21E8 &e\u26A1 &744 Дж/с");
	
	public static final ItemStack ELECTRIC_SMELTERY = new SlimefunItemStack("ELECTRIC_SMELTERY", Material.FURNACE, "&cЭлектрическая плавильня", "", "&4Только сплавы, не переплавляет пыль в слитки", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &720 Дж/с");
	public static final ItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack("ELECTRIC_SMELTERY_2", Material.FURNACE, "&cЭлектрическая плавильня &7– &eII", "", "&4Только сплавы, не переплавляет пыль в слитки", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 3x", "&8\u21E8 &e\u26A1 &740 Дж/с");
	
	public static final ItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE", Material.RED_TERRACOTTA, "&cЭлектрический тигель", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &748 Дж/с");
	public static final ItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_2", Material.RED_TERRACOTTA, "&cЭлектрический тигель &7– &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 2x", "&8\u21E8 &e\u26A1 &780 Дж/с");
	public static final ItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_3", Material.RED_TERRACOTTA, "&cЭлектрический тигель &7– &eIII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 4x", "&8\u21E8 &e\u26A1 &7120 Дж/с");

	public static final ItemStack CARBON_PRESS = new SlimefunItemStack("CARBON_PRESS", Material.BLACK_STAINED_GLASS, "&cУглеродный пресс", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &720 Дж/с");
	public static final ItemStack CARBON_PRESS_2 = new SlimefunItemStack("CARBON_PRESS_2", Material.BLACK_STAINED_GLASS, "&cУглеродный пресс &7– &eII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 3x", "&8\u21E8 &e\u26A1 &750 Дж/с");
	public static final ItemStack CARBON_PRESS_3 = new SlimefunItemStack("CARBON_PRESS_3", Material.BLACK_STAINED_GLASS, "&cУглеродный пресс &7– &eIII", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 15x", "&8\u21E8 &e\u26A1 &7180 Дж/с");
	
	public static final ItemStack BLISTERING_INGOT = new SlimefunItemStack("BLISTERING_INGOT", Material.GOLD_INGOT, "&6Раскалённый слиток &7(33%)", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oТребуется костюм химзащиты");
	public static final ItemStack BLISTERING_INGOT_2 = new SlimefunItemStack("BLISTERING_INGOT_2", Material.GOLD_INGOT, "&6Раскалённый слиток &7(66%)", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oТребуется костюм химзащиты");
	public static final ItemStack BLISTERING_INGOT_3 = new SlimefunItemStack("BLISTERING_INGOT_3", Material.GOLD_INGOT, "&6Раскалённый слиток", "", "&2Уровень радиации: ВЫСОКИЙ", "&4&oТребуется костюм химзащиты");
	
	public static final ItemStack ENERGY_REGULATOR = new SlimefunItemStack("ENERGY_REGULATOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDc4ZjJiN2U1ZTc1NjM5ZWE3ZmI3OTZjMzVkMzY0YzRkZjI4YjQyNDNlNjZiNzYyNzdhYWRjZDYyNjEzMzcifX19", "&6Регулятор электричества", "", "&rКлючевой компонент электрической сети");
	public static final ItemStack DEBUG_FISH = new CustomItem(Material.SALMON, "&3Диагностический инструмент", "", "&eПравый клик &rпо любому блоку, чтобы просмотреть его данные", "&eЛевый клик&r, чтобы сломать блок", "&eShift + левый клик &rпо любому блоку, чтобы стереть его данные", "&eShift + правый клик &rдля установки контрольного блока");
	
	public static final ItemStack NETHER_ICE = new SlimefunItemStack("NETHER_ICE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NlMmRhZDliYWY3ZWFiYTdlODBkNGQwZjlmYWMwYWFiMDFhNzZiMTJmYjcxYzNkMmFmMmExNmZkZDRjNzM4MyJ9fX0=", "&eНезеритовый лёд", "", "&eУровень радиации: УМЕРЕННЫЙ", "&4&oТребуется костюм химзащиты");
	public static final ItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack("ENRICHED_NETHER_ICE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2M4MThhYTEzYWFiYzcyOTQ4MzhkMjFjYWFjMDU3ZTk3YmQ4Yzg5NjQxYTBjMGY4YTU1NDQyZmY0ZTI3In19fQ==", "&eНезеритовый обогащённый лёд", "", "&2Уровень радиации: ЭКСТРЕМАЛЬНО ВЫСОКИЙ", "&4&oТребуется костюм химзащиты");
	public static final ItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack("NETHER_ICE_COOLANT_CELL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQzY2Q0MTI1NTVmODk3MDE2MjEzZTVkNmM3NDMxYjQ0OGI5ZTU2NDRlMWIxOWVjNTFiNTMxNmYzNTg0MGUwIn19fQ==", "&6Незеритовая ячейка охлаждающей жидкости");
	
	@Deprecated
	public static final ItemStack NETHER_DRILL = new CustomItem(Material.RED_TERRACOTTA, "&4Незеритовый бур", "", "&rПозволяет добывать незеритовый лёд", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &7102 Дж/с", "", "&c&l! &cМожет быть использован только в Незере!", "&c&l! &cУбедитесь, что Вы просканировали", "&cчанк при помощи геосканера");
	
	// Cargo
	public static final ItemStack CARGO_MANAGER = new SlimefunItemStack("CARGO_MANAGER", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTUxMGJjODUzNjJhMTMwYTZmZjlkOTFmZjExZDZmYTQ2ZDdkMTkxMmEzNDMxZjc1MTU1OGVmM2M0ZDljMiJ9fX0=", "&6Грузовой регулятор", "", "&rКлючевой компонент грузовой сети");
	public static final ItemStack CARGO_NODE = new SlimefunItemStack("CARGO_NODE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDdiN2VmNmZkNzg2NDg2NWMzMWMxZGM4N2JlZDI0YWI1OTczNTc5ZjVjNjYzOGZlY2I4ZGVkZWI0NDNmZjAifX19", "&7Грузовой порт &c(соединительный)", "", "&rСоединяет участки грузовой сети");
	public static final ItemStack CARGO_INPUT = new SlimefunItemStack("CARGO_NODE_INPUT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTZkMWMxYTY5YTNkZTlmZWM5NjJhNzdiZjNiMmUzNzZkZDI1Yzg3M2EzZDhmMTRmMWRkMzQ1ZGFlNGM0In19fQ==", "&7Грузовой порт &c(извлекающий)", "", "&rИзвлекает предметы из сундуков/механизмов");
	public static final ItemStack CARGO_OUTPUT = new SlimefunItemStack("CARGO_NODE_OUTPUT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19", "&7Грузовой порт &c(принимающий)", "", "&rПеремещает предметы в сундуки/механизмы");
	public static final ItemStack CARGO_OUTPUT_ADVANCED = new SlimefunItemStack("CARGO_NODE_OUTPUT_ADVANCED", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTViMjFmZDQ4MGMxYzQzYmYzYjlmODQyYzg2OWJkYzNiYzVhY2MyNTk5YmYyZWI2YjhhMWM5NWRjZTk3OGYifX19", "&6Калибрируемый грузовой порт &c(принимающий)", "", "&rПеремещает предметы в сундуки/механизмы", "&aМожет быть настроен");

	public static final ItemStack AUTO_BREEDER = new SlimefunItemStack("AUTO_BREEDER", Material.HAY_BLOCK, "&eАвтоматизированный размножитель", "", "&rРаботает на &aорганической пище", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &760 Дж/животное");
	
	public static final ItemStack ORGANIC_FOOD = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aОрганическая пища", "&7Содержит: &9X");
	public static final ItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_WHEAT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9пшеница");
	public static final ItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_CARROT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9морковь");
	public static final ItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_POTATO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9картофель");
	public static final ItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SEEDS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9семена");
	public static final ItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_BEETROOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9свёкла");
	public static final ItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_MELON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9арбуз");
	public static final ItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_APPLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9яблоко");
	public static final ItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SWEET_BERRIES", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганическая пища", "&7Содержит: &9сладкие ягоды");
	
	public static final ItemStack FERTILIZER = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ=="), "&aОрганические удобрения", "&7Содержит: &9X");
	public static final ItemStack WHEAT_FERTILIZER = new SlimefunItemStack("FERTILIZER_WHEAT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9пшеница");
	public static final ItemStack CARROT_FERTILIZER = new SlimefunItemStack("FERTILIZER_CARROT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9морковь");
	public static final ItemStack POTATO_FERTILIZER = new SlimefunItemStack("FERTILIZER_POTATO", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9картофель");
	public static final ItemStack SEEDS_FERTILIZER = new SlimefunItemStack("FERTILIZER_SEEDS", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9семена");
	public static final ItemStack BEETROOT_FERTILIZER = new SlimefunItemStack("FERTILIZER_BEETROOT", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9свёкла");
	public static final ItemStack MELON_FERTILIZER = new SlimefunItemStack("FERTILIZER_MELON", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9арбуз");
	public static final ItemStack APPLE_FERTILIZER = new SlimefunItemStack("FERTILIZER_APPLE", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9яблоко");
	public static final ItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack("FERTILIZER_SWEET_BERRIES", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQzOWUzZjVhY2JlZTliZTRjNDI1OTI4OWQ2ZDlmMzVjNjM1ZmZhNjYxMTE0Njg3YjNlYTZkZGE4Yzc5In19fQ==", "&aОрганические удобрения", "&7Содержит: &9сладкие ягоды");
	
	public static final ItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack("ANIMAL_GROWTH_ACCELERATOR", Material.HAY_BLOCK, "&bУскоритель роста животных", "", "&rРаботает на &aорганической пище", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &728 Дж/с");
	public static final ItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR", Material.LIME_TERRACOTTA, "&aУскоритель роста растений", "", "&rРаботает на &aорганических удобрениях", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Радиус: 7x7", "&8\u21E8 &7Скорость: &a3/(время роста)", "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &750 Дж/с");
	public static final ItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR_2", Material.LIME_TERRACOTTA, "&aУскоритель роста растений &7(&eII&7)", "", "&rРаботает на &aорганических удобрениях", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Радиус: 9x9", "&8\u21E8 &7Скорость: &a4/(время роста)", "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &760 Дж/с");

	public static final ItemStack FOOD_FABRICATOR = new SlimefunItemStack("FOOD_FABRICATOR", Material.GREEN_STAINED_GLASS, "&cПищевая фабрика", "", "&rПроизводит &aорганическую пищу", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &714 Дж/с");
	public static final ItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack("FOOD_FABRICATOR_2", Material.GREEN_STAINED_GLASS, "&cПищевая фабрика &7(&eII&7)", "", "&rПроизводит &aорганическую пищу", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 6x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7512 Дж", "&8\u21E8 &e\u26A1 &748 Дж/с");
	
	public static final ItemStack FOOD_COMPOSTER = new SlimefunItemStack("FOOD_COMPOSTER", Material.GREEN_TERRACOTTA, "&cПищевой компостер", "", "&rПроизводит &aорганические удобрения", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &716 Дж/с");
	public static final ItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack("FOOD_COMPOSTER_2", Material.GREEN_TERRACOTTA, "&cПищевой компостер &7(&eII&7)", "", "&rПроизводит &aорганические удобрения", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 10x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7512 Дж", "&8\u21E8 &e\u26A1 &752 Дж/с");

	public static final ItemStack XP_COLLECTOR = new SlimefunItemStack("XP_COLLECTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTc2MmExNWIwNDY5MmEyZTRiM2ZiMzY2M2JkNGI3ODQzNGRjZTE3MzJiOGViMWM3YTlmN2MwZmJmNmYifX19", "&aХранитель опыта", "", "&rСобирает и хранит опыт поблизости", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &71024 Дж", "&8\u21E8 &e\u26A1 &720 Дж/с");
	public static final ItemStack REACTOR_COOLANT_CELL = new SlimefunItemStack("REACTOR_COLLANT_CELL", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGU0MDczYmU0MGNiM2RlYjMxMGEwYmU5NTliNGNhYzY4ZTgyNTM3MjcyOGZhZmI2YzI5NzNlNGU3YzMzIn19fQ==", "&bЯчейка охлаждающей жидкости");

	public static final ItemStack NUCLEAR_REACTOR = new SlimefunItemStack("NUCLEAR_REACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&2Ядерный реактор", "", "&rТребует охлаждения!", "&8\u21E8 &bДолжен быть окружён водой", "&8\u21E8 &bДолжен быть поставлен с", "&bячейками охлаждающей жидкости", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &716384 Дж", "&8\u21E8 &e\u26A1 &7500 Дж/с");
	public static final ItemStack NETHERSTAR_REACTOR = new SlimefunItemStack("NETHERSTAR_REACTOR", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTM0M2NlNThkYTU0Yzc5OTI0YTJjOTMzMWNmYzQxN2ZlOGNjYmJlYTliZTQ1YTdhYzg1ODYwYTZjNzMwIn19fQ==", "&fНезеритовый звёздный реактор", "", "&fРаботает на звёздах из Незера", "&8\u21E8 &bДолжен быть окружён водой", "&8\u21E8 &bДолжен быть поставлен с", "&bячейками охлаждающей жидкости", "", MachineTier.END_GAME.and(MachineType.GENERATOR), "&8\u21E8 &e\u26A1 &7Резервный запас: &732768 Дж", "&8\u21E8 &e\u26A1 &71024 Дж/с", "&8\u21E8 &4Вызывает иссушение у сущностей вокруг");
	public static final ItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack("REACTOR_ACCESS_PORT", Material.CYAN_TERRACOTTA, "&2Порт доступа к реактору", "", "&rПозволяет взаимодействовать с реактором", "&rпри помощи грузовых узлов, а также", "&rможет быть использован в качестве", "&rрезервного запаса", "", "&8\u21E8 &eДолжен быть помещён &a3 блоками &eвыше реактора");
	
	public static final ItemStack FREEZER = new SlimefunItemStack("FREEZER", Material.LIGHT_BLUE_STAINED_GLASS, "&bМорозилка", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &718 Дж/с");
	public static final ItemStack FREEZER_2 = new SlimefunItemStack("FREEZER_2", Material.LIGHT_BLUE_STAINED_GLASS, "&bМорозилка &7(&eII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 2x", "&8\u21E8 &e\u26A1 &7Резервный запас: &7256 Дж", "&8\u21E8 &e\u26A1 &730 Дж/с");
	
	public static final ItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack("ELECTRIC_GOLD_PAN", Material.BROWN_TERRACOTTA, "&6Электрическая рудопромывочная машина", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &72 Дж/с");
	public static final ItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_2", Material.BROWN_TERRACOTTA, "&6Электрическая рудопромывочная машина &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 3x", "&8\u21E8 &e\u26A1 &74 Дж/с");
	public static final ItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_3", Material.BROWN_TERRACOTTA, "&6Электрическая рудопромывочная машина &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 10x", "&8\u21E8 &e\u26A1 &714 Дж/с");

	public static final ItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack("ELECTRIC_DUST_WASHER", Material.BLUE_STAINED_GLASS, "&3Электрический очиститель пыли", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &76 Дж/с");
	public static final ItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_2", Material.BLUE_STAINED_GLASS, "&3Электрический очиститель пыли &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 2x", "&8\u21E8 &e\u26A1 &710 Дж/с");
	public static final ItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_3", Material.BLUE_STAINED_GLASS, "&3Электрический очиститель пыли &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 10x", "&8\u21E8 &e\u26A1 &730 Дж/с");

	public static final ItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY", Material.RED_TERRACOTTA, "&cЭлектрический завод слитков", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 1x", "&8\u21E8 &e\u26A1 &78 Дж/с");
	public static final ItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_2", Material.RED_TERRACOTTA, "&cЭлектрический завод слитков &7(&eII&7)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 2x", "&8\u21E8 &e\u26A1 &714 Дж/с");
	public static final ItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_3", Material.RED_TERRACOTTA, "&cЭлектрический завод слитков &7(&eIII&7)", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Скорость: 8x", "&8\u21E8 &e\u26A1 &740 Дж/с");

	public static final ItemStack AUTOMATED_CRAFTING_CHAMBER = new SlimefunItemStack("AUTOMATED_CRAFTING_CHAMBER", Material.CRAFTING_TABLE, "&6Автоматизированная камера крафта", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &710 Дж/предмет");
	public static final ItemStack FLUID_PUMP = new SlimefunItemStack("FLUID_PUMP", Material.BLUE_TERRACOTTA, "&9Жидкостный насос", "", MachineTier.ADVANCED.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &732 Дж/блок");
	public static final ItemStack CHARGING_BENCH = new SlimefunItemStack("CHARGING_BENCH", Material.CRAFTING_TABLE, "&6Зарядное устройство-верстак", "", "&rЗаряжает предметы (например, реактивный ранец)", "", MachineTier.BASIC.and(MachineType.MACHINE), "&8\u21E8 &e\u26A1 &7Резервный запас: &7128 Дж", "&8\u21E8 &e\u26A1 &7Потери электричества: &c50%");

	public static final ItemStack WITHER_ASSEMBLER = new SlimefunItemStack("WITHER_ASSEMBLER", Material.OBSIDIAN, "&5Иссушающий ассемблер", "", MachineTier.END_GAME.and(MachineType.MACHINE), "&8\u21E8 &7Задержка: &b30 секунд", "&8\u21E8 &e\u26A1 &7Резервный запас: &74096 Дж", "&8\u21E8 &e\u26A1 &74096 Дж/Визер");
	
	public static final ItemStack TRASH_CAN = new SlimefunItemStack("TRASH_CAN", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMzJkNDEwNDJjZTk5MTQ3Y2MzOGNhYzllNDY3NDE1NzZlN2VlNzkxMjgzZTZmYWM4ZDMyOTJjYWUyOTM1ZjFmIn19fQ==", "&3Мусорное ведро", "", "&rУничтожает все вещи, помещённые в него");
	
	public static final ItemStack ELYTRA = new CustomItem(Material.ELYTRA, "&rЭлитры");
	public static final ItemStack ELYTRA_SCALE = new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bЧешуя элитр");
	public static final ItemStack INFUSED_ELYTRA = new SlimefunItemStack("INFUSED_ELYTRA", ELYTRA, "&5Заряженные элитры");
	public static final ItemStack SOULBOUND_ELYTRA = new SlimefunItemStack("SOULBOUND_ELYTRA", ELYTRA, "&cПерсональные элитры", "&7&oНе выпадают при смерти");

	public static final ItemStack TOTEM_OF_UNDYING = new CustomItem(Material.TOTEM_OF_UNDYING, "&rТотем бессмертия");
	
	static {
		INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
	}

	public static final ItemStack CHAINMAIL_HELMET = new CustomItem(Material.CHAINMAIL_HELMET, "&rКольчужный шлем");
	public static final ItemStack CHAINMAIL_CHESTPLATE = new CustomItem(Material.CHAINMAIL_CHESTPLATE, "&rКольчужный нагрудник");
	public static final ItemStack CHAINMAIL_LEGGINGS = new CustomItem(Material.CHAINMAIL_LEGGINGS, "&rКольчужные поножи");
	public static final ItemStack CHAINMAIL_BOOTS = new CustomItem(Material.CHAINMAIL_BOOTS, "&rКольчужные ботинки");
	
	// ChestTerminal Addon
	
	public static final ItemStack CHEST_TERMINAL = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvN2E0NGZmM2E1ZjQ5YzY5Y2FiNjc2YmFkOGQ5OGEwNjNmYTc4Y2ZhNjE5MTZmZGVmM2UyNjc1NTdmZWMxODI4MyJ9fX0="), "&3Терминал доступа", "&7Если этот блок подключен к", "&7грузовой сети, это позволит Вам удалённо", "&7взаимодействовать с любыми вещами, поставляемыми", "&7трубами в сетевой канал");
	public static final ItemStack CT_IMPORT_BUS = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3Импортёр", "&7Если этот блок подключен к", "&7грузовой сети, то он будет брать вещи из", "&7инвентаря и ложить их в сетевой канал");
	public static final ItemStack CT_EXPORT_BUS = new CustomItem(getSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTEzZGIyZTdlNzJlYTQ0MzJlZWZiZDZlNThhODVlYWEyNDIzZjgzZTY0MmNhNDFhYmM2YTkzMTc3NTdiODg5In19fQ=="), "&3Экспортёр", "&7Если этот блок подключен к", "&7грузовой сети, то он будет брать вещи из", "&7сетевого канала и ложить их в Ваш инвентарь");
	
	private static ItemStack getSkull(String texture) {
		try {
			return CustomSkull.getItem(texture);
		}
		catch(Exception x) {
			Slimefun.getLogger().log(Level.SEVERE, "An Error occured while initializing the Items for Slimefun " + Slimefun.getVersion(), x);
			
			return new ItemStack(Material.PLAYER_HEAD);
		}
	}

}
