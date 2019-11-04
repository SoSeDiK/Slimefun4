package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.recipes.MinecraftRecipe;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

public class RecipeType {
	
	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICKS, "&bПостройка", "", "&a&oСтроится в мире из блоков", "&a&oОгниво означает, что блок нужно поджечь"));
	public static final RecipeType ARMOR_FORGE = new RecipeType(new CustomItem(Material.ANVIL, "&bКонструктор брони", "", "&a&oКрафтится в конструкторе брони"), "ARMOR_FORGE");
	public static final RecipeType GRIND_STONE = new RecipeType(new CustomItem(Material.DISPENSER, "&bИзмельчитель вещей", "", "&a&oИзмельчите, используя измельчитель вещей"), "GRIND_STONE");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.IRON_SWORD, "&bДроп из моба", "", "&a&oУбейте указанного моба, чтобы получить этот предмет"));
	public static final RecipeType SMELTERY = new RecipeType(new CustomItem(Material.FURNACE, "&6Плавильня", "", "&a&oРасплавьте, используя плавильню"), "SMELTERY");
	public static final RecipeType ORE_CRUSHER = new RecipeType(new CustomItem(Material.DISPENSER, "&bРазрушитель руд", "", "&a&oРазрушьте, используя разрушитель руд"), "ORE_CRUSHER");
	public static final RecipeType GOLD_PAN = new RecipeType(new CustomItem(Material.BOWL, "&bАвтоматизированный просеиватель", "", "&a&oПросейте гравий, чтобы заполучить этот предмет"));
	public static final RecipeType COMPRESSOR = new RecipeType(new CustomItem(Material.PISTON, "&bКомпрессор", "", "&a&oСожмите, используя компрессор"), "COMPRESSOR");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType(new CustomItem(Material.GLASS, "&bБарокамера", "", "&a&oСожмите, используя барокамеру"), "PRESSURE_CHAMBER");
	public static final RecipeType OVEN = new RecipeType(new CustomItem(Material.FURNACE, "&bПродвинутая печь", "", "&a&oРасплавьте, используя продвинутую печь"), "OVEN");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType(new CustomItem(Material.BOOKSHELF, "&6Магический верстак", "", "&a&oКрафтится на магическом верстаке"), "MAGIC_WORKBENCH");
	public static final RecipeType ORE_WASHER = new RecipeType(new CustomItem(Material.CAULDRON, "&6Очиститель руд", "", "&a&oОчистите, используя очиститель руд"), "ORE_WASHER");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eУлучшенный верстак", "", "&a&oКрафтится на улучшенном верстаке"), "ENHANCED_CRAFTING_TABLE");
	public static final RecipeType JUICER = new RecipeType(new CustomItem(Material.GLASS_BOTTLE, "&eСоковыжималка", "", "&a&oВыжмите все соки из предмета"), "JUICER");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType(new CustomItem(Material.ENCHANTING_TABLE, "&4Древний алтарь", "", "&dСоздайте предмет, выполнив", "&dритуал на древнем алтаре"));
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType(new CustomItem(new ItemStack(Material.GRAY_STAINED_GLASS), "&cОбогреваемая барокамера", "", "&a&oСожмите, используя обогреваемую барокамеру"), "HEATED_PRESSURE_CHAMBER");

	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eОбычный рецепт", "", "&a&oПростой рецепт на верстаке…"));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eБесформенный рецепт", "", "&a&oПростой рецепт на верстаке…"));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&eПлавится в печке", "", "&a&oПереплавка в обычной печи"));
	public static final RecipeType NULL = new RecipeType((ItemStack) null);
	
	private ItemStack item;
	private String machine;
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}

	public RecipeType(ItemStack item) {
		this(item, "");
	}

	public RecipeType(MinecraftRecipe<?> recipe) {
		this(new ItemStack(recipe.getMachine()));
	}

	public RecipeType(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
		this.machine = machine;
		this.item = getMachine().getItem();
		
		SlimefunRecipes.registerMachineRecipe(machine, seconds, input, output);
	}
	
	public ItemStack toItem() {
		return this.item;
	}
	
	public SlimefunItem getMachine() {
		return SlimefunItem.getByID(machine);
	}
	
	public static List<ItemStack> getRecipeInputs(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i)[0]);
		}
		return convertible;
	}
	
	public static List<ItemStack[]> getRecipeInputList(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack[]> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i));
		}
		return convertible;
	}
	
	public static ItemStack getRecipeOutput(SlimefunItem machine, ItemStack input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0];
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
